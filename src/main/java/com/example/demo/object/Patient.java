package com.example.demo.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Patient extends Person {
    private int Serial;
    private String id;
    private String bloodType;
    private List<RecordsPatient> records;
    private PlanTreatment plane;
    private String date;
    private String roomCode;
}
