package com.example.demo.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RecordsPatient {
    private String date;
    private Doctor bacSiChiDinh;
    private Doctor bacSiThucHien;
    private String phuongPhap;
    private String state;
    private String result;
}
