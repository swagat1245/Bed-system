package com.example.BedManagement.Controller;

import com.example.BedManagement.ExceptionHandling.CoustomException;
import com.example.BedManagement.Model.Patient;
import com.example.BedManagement.Service.BedService;
import com.example.BedManagement.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private BedService bedService;

    @GetMapping()
    public List<Patient> patientGetAll() {
        return patientService.patientGetAll();
    }

    @GetMapping("{id}")
    public Patient getById(@PathVariable int id) {
        return patientService.getById(id);
    }

    @PostMapping()
    public void savePatient(@RequestBody String patient) throws CoustomException {
        patientService.savePatient(patient);
    }

    @PutMapping()
    public void updatedPatient(@RequestBody Patient patient) {
        patientService.updatedPatient(patient);
    }

    @DeleteMapping("{id}")
    void deletePatient(@PathVariable int id) {
        patientService.deletePatient(id);
    }
}
