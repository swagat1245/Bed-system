package com.example.BedManagement.Service;

import com.example.BedManagement.ExceptionHandling.CoustomException;
import com.example.BedManagement.Model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService {
    List<Patient> patientGetAll();

    Patient getById(int id);

    void savePatient(String patient) throws CoustomException;

    void updatedPatient(Patient patient);

    void deletePatient(int id);


}
