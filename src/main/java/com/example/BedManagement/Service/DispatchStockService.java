package com.example.BedManagement.Service;

import com.example.BedManagement.ExceptionHandling.CoustomException;
import com.example.BedManagement.Model.DispatchStock;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DispatchStockService {

    List<DispatchStock> getAllDispatchStock();

    DispatchStock getById(int id);

    void saveDispatchStock(DispatchStock dispatchStock,int id)throws CoustomException;

    void updateDispatchStock(DispatchStock dispatchStock);
     Integer sumDispatchStock(@Param(value = "id") int id);

}
