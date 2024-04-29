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
public String saveMedicine(Medicine medicine) throws InterruptedException, ExecutionException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("medicines").document(medicine.getID()).set(medicine);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }
    private final Firestore dbFirestore = FirestoreClient.getFirestore();
    private final CollectionReference medicineCollection = dbFirestore.collection("medicines");

    public List<Medicine> getAllMedicines() throws ExecutionException, InterruptedException {
        ApiFuture<QuerySnapshot> query = medicineCollection.get();
        QuerySnapshot querySnapshot = query.get();
        List<Medicine> medicines = querySnapshot.toObjects(Medicine.class);
        return medicines;
    }

    public Medicine getMedicineByID(String ID) throws ExecutionException, InterruptedException {
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
        ApiFuture<WriteResult> result = medicineCollection.document(medicine.getID()).set(medicine);
        return medicine;
    }

    public Medicine updateMedicine(String ID) throws ExecutionException, InterruptedException {
        DocumentReference documentReference = medicineCollection.document(ID);
         ApiFuture<WriteResult> collectionsApiFuture = dbFirestore.collection("medicines").document(doctor.getID()).set(medicine);
        return collectionsApiFuture.get().getUpdateTime().toString();
    }

    public String deleteMedicine(String ID) {
        ApiFuture<WriteResult> writeResult = medicineCollection.document(ID).delete();
        return "Medicine with ID " + ID + " has been deleted";
    }
}
