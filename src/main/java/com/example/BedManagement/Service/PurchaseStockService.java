package com.example.BedManagement.Service;

import com.example.BedManagement.Model.PurchaseStock;
import com.example.BedManagement.Model.Stock;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PurchaseStockService {

    List<PurchaseStock> getAllPurchaseStock();

    PurchaseStock getById(int id);

    void savePurchaseStock(PurchaseStock purchaseStock);

    void updatePurchaseStock(PurchaseStock purchaseStock);

    Integer sumPurchaseStock(@Param(value = "id") int id);


}
