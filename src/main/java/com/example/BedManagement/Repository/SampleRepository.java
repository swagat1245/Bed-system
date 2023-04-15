package com.example.BedManagement.Repository;

import com.example.BedManagement.Model.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample ,Integer> {
}
