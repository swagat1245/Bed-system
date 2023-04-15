package com.example.BedManagement.ServiceImpl;

import com.example.BedManagement.ExceptionHandling.CoustomException;
import com.example.BedManagement.Model.Bed;
import com.example.BedManagement.Model.Patient;
import com.example.BedManagement.Repository.BedRepository;
import com.example.BedManagement.Repository.PatientRepository;
import com.example.BedManagement.Service.PatientService;
import com.example.BedManagement.exception.ResourceNotFoundException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private BedRepository bedRepository;

    @Override
    public List<Patient> patientGetAll() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getById(int id) {
        Optional<Patient> patient = patientRepository.findById(id);
        if (patient.isPresent()) {
            return patient.get();
        } else {
            return null;
        }
    }
    @Override
    public void savePatient(String patient) throws CoustomException {
        try{

            Patient patient1=new ObjectMapper().readValue(patient,Patient.class);
                 bedRepository.save(patient1.getBed());
                  patientRepository.save(patient1);

        }
        catch (Exception ex){
                   throw new CoustomException("Failure in saving patient");
        }
    }
    @Override
    public void updatedPatient(Patient patient) {
        patientRepository.save(patient);
    }

    @Override
    public void deletePatient(int id) {
        patientRepository.deleteById(id);
    }


}
