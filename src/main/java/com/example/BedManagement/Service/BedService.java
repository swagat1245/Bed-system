package com.example.BedManagement.Service;

import com.example.BedManagement.Model.Bed;
import com.example.BedManagement.Model.Patient;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BedService {

    List<Bed> getAllBed();

    Bed getById(int id);

    void bedSaveBed(Bed bed);

    void bedUpdateBed(Bed bed);

    void DeleteBed(int id);
    List<Bed> getBed( boolean status);
    void setBedPatient(int id);
    /*void bedUpdate(int id );*/


}
