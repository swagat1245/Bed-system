package com.example.BedManagement.ServiceImpl;

import com.example.BedManagement.Model.Hospital;
import com.example.BedManagement.Repository.HospitalRepository;
import com.example.BedManagement.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalRepository hospitalRepository;
    @Override
    public List<Hospital> getAllHospital() {
        return hospitalRepository.findAll();
    }

    @Override
    public Hospital getById(int id) {
        Optional<Hospital>hospital=hospitalRepository.findById(id);
        if(hospital.isPresent()){
            return hospital.get();
        }else{
            return null;
        }
    }

    @Override
    public void saveHospital(Hospital hospital) {
     hospitalRepository.save(hospital);
    }

    @Override
    public void updateHospital(Hospital hospital) {
        hospitalRepository.save(hospital);
    }

    @Override
    public void deleteById(int id) {
         hospitalRepository.deleteById(id);
    }
}
