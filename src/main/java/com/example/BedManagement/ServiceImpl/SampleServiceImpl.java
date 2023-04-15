package com.example.BedManagement.ServiceImpl;

import com.example.BedManagement.Model.Sample;
import com.example.BedManagement.Repository.SampleRepository;
import com.example.BedManagement.Service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SampleServiceImpl implements SampleService {
    @Autowired
    private SampleRepository sampleRepository;

    @Override
    public List<Sample> getAllSample() {
        return sampleRepository.findAll();
    }

    @Override
    public Sample getById(int id) {
        Optional<Sample> sample = sampleRepository.findById(id);
        if (sample.isPresent()) {
            return sample.get();
        } else {
            return null;
        }
    }

    @Override
    public void saveSample(Sample sample) {
        sampleRepository.save(sample);
    }

    @Override
    public void updateSample(Sample sample) {
        sampleRepository.save(sample);
    }

    @Override
    public void deleteById(int id) {
        sampleRepository.deleteById(id);
    }
}
