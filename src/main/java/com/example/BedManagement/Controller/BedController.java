package com.example.BedManagement.Controller;

import com.example.BedManagement.Model.Bed;
import com.example.BedManagement.Model.Patient;
import com.example.BedManagement.Service.BedService;
import com.example.BedManagement.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/bed")
public class BedController {
    @Autowired
    private BedService bedService;

    @GetMapping()
    public List<Bed> getAllBed() {
        return bedService.getAllBed();
    }

    @GetMapping("/id/{id}")
    public Bed getById(@PathVariable int id) {
        return bedService.getById(id);
    }

    @PostMapping()
    public void bedSaveBed(@RequestBody Bed bed) {
        bedService.bedSaveBed(bed);
    }

    @PutMapping()
    public void bedUpdateBed(@RequestBody Bed bed) {
        bedService.bedUpdateBed(bed);
    }

    @DeleteMapping("/id/{id}")
    public void DeleteBed(@PathVariable int id) {
        bedService.DeleteBed(id);
    }

    @GetMapping("/status/{status}")
    public List<Bed> getBed(@PathVariable(value = "status") boolean status) {
        return bedService.getBed(status);
    }

}
