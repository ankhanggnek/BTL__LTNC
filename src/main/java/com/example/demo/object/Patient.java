package com.example.demo.object;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Patient extends Person {
    private String bloodType;
    private List<RecordsPatient> records;
}
