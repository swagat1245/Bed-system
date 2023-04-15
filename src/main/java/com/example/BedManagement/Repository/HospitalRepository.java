package com.example.BedManagement.Repository;

import com.example.BedManagement.Model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {
}
