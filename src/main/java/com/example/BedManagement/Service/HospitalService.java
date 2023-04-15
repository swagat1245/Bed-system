package com.example.BedManagement.Service;

import com.example.BedManagement.Model.Hospital;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HospitalService {

    List<Hospital> getAllHospital();

    Hospital getById(int id);

    void saveHospital(Hospital hospital);

    void updateHospital(Hospital hospital);

    void deleteById(int id);
}
