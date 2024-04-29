import java.util.List;
import java.util.concurrent.ExecutionException;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

@Service
public class MedicineService {

    private final Firestore dbFirestore = FirestoreClient.getFirestore();
    private final CollectionReference medicineCollection = dbFirestore.collection("medicines");

    public String saveMedicine(Medicine medicine) throws InterruptedException, ExecutionException {
        // Lưu đối tượng Medicine vào Firestore, sử dụng ID của Medicine làm khóa
        ApiFuture<WriteResult> collectionsApiFuture = medicineCollection.document(medicine.getID()).set(medicine);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public List<Medicine> getAllMedicines() throws ExecutionException, InterruptedException {
        // Lấy tất cả đối tượng Medicine từ Firestore
        ApiFuture<QuerySnapshot> query = medicineCollection.get();
        QuerySnapshot querySnapshot = query.get();
        List<Medicine> medicines = querySnapshot.toObjects(Medicine.class);
        return medicines;
    }

    public Medicine getMedicineByID(String ID) throws ExecutionException, InterruptedException {
        // Lấy thông tin của một Medicine dựa trên ID
        DocumentReference documentReference = medicineCollection.document(ID);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();
        if (document.exists()) {
            return document.toObject(Medicine.class);
        } else {
            return null;
        }
    }

    public Medicine addMedicine(Medicine medicine) throws ExecutionException, InterruptedException {
        // Thêm một Medicine mới vào Firestore
        ApiFuture<WriteResult> result = medicineCollection.document(medicine.getID()).set(medicine);
        return medicine;
    }

    public Medicine updateMedicine(Medicine medicine) throws ExecutionException, InterruptedException {
        // Cập nhật thông tin của một Medicine
        DocumentReference documentReference = medicineCollection.document(medicine.getID());
        ApiFuture<WriteResult> result = documentReference.set(medicine);
        return medicine;
    }

    public String deleteMedicine(String ID) {
        // Xóa một Medicine dựa trên ID
        ApiFuture<WriteResult> writeResult = medicineCollection.document(ID).delete();
        return "Medicine with ID " + ID + " has been deleted";
    }
}
