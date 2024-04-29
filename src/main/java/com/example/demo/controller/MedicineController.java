package com.example.demo.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.FirebaseService;
import com.example.demo.object.Medicine;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    // API để lấy tất cả các Medicine
    @GetMapping("/")
    public List<Medicine> getAllMedicines() throws ExecutionException, InterruptedException {
        return medicineService.getAllMedicines();
    }

    // API để lấy thông tin của một Medicine dựa trên ID
    @GetMapping("/{id}")
    public ResponseEntity<Medicine> getMedicineByID(@PathVariable String id) throws ExecutionException, InterruptedException {
        Medicine medicine = medicineService.getMedicineByID(id);
        if (medicine != null) {
            return ResponseEntity.ok().body(medicine);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // API để thêm một Medicine mới
    @PostMapping("/")
    public ResponseEntity<Medicine> addMedicine(@RequestBody Medicine medicine) throws ExecutionException, InterruptedException {
        Medicine addedMedicine = medicineService.addMedicine(medicine);
        return ResponseEntity.ok().body(addedMedicine);
    }

    // API để cập nhật thông tin của một Medicine
    @PutMapping("/")
    public ResponseEntity<Medicine> updateMedicine(@RequestBody Medicine medicine) throws ExecutionException, InterruptedException {
        Medicine updatedMedicine = medicineService.updateMedicine(medicine);
        return ResponseEntity.ok().body(updatedMedicine);
    }

    // API để xóa một Medicine dựa trên ID
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMedicine(@PathVariable String id) {
        String result = medicineService.deleteMedicine(id);
        return ResponseEntity.ok().body(result);
    }
}
