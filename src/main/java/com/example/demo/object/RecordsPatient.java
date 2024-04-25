package com.example.demo.object;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class RecordsPatient {
    private Date date;
    private Doctor bacSiChiDinh;
    private Doctor bacSiThucHien;
    private String phuongPhap;
    private String state;
    private String result;
}
