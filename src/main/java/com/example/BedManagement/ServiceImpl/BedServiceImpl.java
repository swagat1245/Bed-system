package com.example.BedManagement.ServiceImpl;
import com.example.BedManagement.Model.Bed;
import com.example.BedManagement.Repository.BedRepository;
import com.example.BedManagement.Repository.PatientRepository;
import com.example.BedManagement.Service.BedService;
import com.example.BedManagement.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class BedServiceImpl implements BedService{
    @Autowired
    private BedRepository bedRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Override
    public List<Bed> getAllBed() {
        return bedRepository.findAll();
    }
    @Override
    public Bed getById(int id) {
        Optional<Bed> bed = bedRepository.findById(id);
        if (bed.isPresent()) {
            return bed.get();
        } else {
            return null;
        }
    }
    @Override
    public void bedSaveBed(Bed bed) {
        bedRepository.save(bed);
    }
    @Override
    public void bedUpdateBed(Bed bed) {
        bedRepository.save(bed);
    }

    @Override
    public void DeleteBed(int id) {
        bedRepository.deleteById(id);
    }

    @Override
    public List<Bed> getBed(boolean status) {
        return bedRepository.getBed(status);
    }

    @Override
    public void setBedPatient(int id) {
        Bed newBed = bedRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Bed not exist by id" + id));
        if (newBed.isStatus())
            newBed.setStatus(true);
           bedRepository.save(newBed);
    }
   /* @Override
    public void bedUpdate(int id) {
       bedRepository.bedUpdate(id);
    }*/
}
