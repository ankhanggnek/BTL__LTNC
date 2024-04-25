package com.example.demo.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlanTreatment {
    private String date;
    private Doctor planeOfDoctor;
    private String content;
}
