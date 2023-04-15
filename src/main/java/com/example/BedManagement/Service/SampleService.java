package com.example.BedManagement.Service;

import com.example.BedManagement.Model.Sample;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SampleService {
    List<Sample> getAllSample();
    Sample getById(int id);
    void saveSample(Sample sample);
    void updateSample(Sample sample);
    void deleteById(int id);
}
