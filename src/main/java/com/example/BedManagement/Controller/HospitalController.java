package com.example.BedManagement.Controller;

import com.example.BedManagement.Model.Hospital;
import com.example.BedManagement.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
    @Autowired
    private HospitalService hospitalService;

    @GetMapping()
    public List<Hospital> getAllHospital() {
        return hospitalService.getAllHospital();
    }

    @GetMapping("{id}")
    public Hospital getById(@PathVariable(value = "id") int id) {
        return hospitalService.getById(id);
    }

    @PostMapping()
    public void saveHospital(@RequestBody Hospital hospital) {
        hospitalService.saveHospital(hospital);
    }

    @PutMapping()
    public void updateHospital(@RequestBody Hospital hospital) {
        hospitalService.updateHospital(hospital);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable(value = "id") int id) {
        hospitalService.deleteById(id);
    }
}
