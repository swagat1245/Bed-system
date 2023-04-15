package com.example.BedManagement.Controller;

import com.example.BedManagement.Model.Sample;
import com.example.BedManagement.Service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sample")
public class SampleController {
    @Autowired
    private SampleService sampleService;

    @GetMapping()
    public List<Sample> getAllSample() {
        return sampleService.getAllSample();
    }

    @GetMapping("{id}")
    public Sample getById(@PathVariable(value = "id") int id) {
        return sampleService.getById(id);
    }

    @PostMapping()
    public void saveSample(@RequestBody Sample sample) {
        sampleService.saveSample(sample);
    }

    @PutMapping()
    public void updateSample(@RequestBody Sample sample) {
        sampleService.saveSample(sample);
    }

    @DeleteMapping()
    public void deleteById(@PathVariable(value = "id") int id) {
        sampleService.deleteById(id);
    }
}
