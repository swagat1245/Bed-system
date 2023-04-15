package com.example.BedManagement.ServiceImpl;

import com.example.BedManagement.Model.Patient;
import com.example.BedManagement.Model.PurchaseStock;
import com.example.BedManagement.Model.Stock;
import com.example.BedManagement.Repository.PurchaseStockRepository;
import com.example.BedManagement.Repository.StockRepository;
import com.example.BedManagement.Service.PurchaseStockService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PurchaseStockServiceImpl implements PurchaseStockService {
    @Autowired
    private PurchaseStockRepository purchaseStockRepository;
    @Autowired
    private StockRepository stockRepository;

    @Override
    public List<PurchaseStock> getAllPurchaseStock() {
        return purchaseStockRepository.findAll();
    }

    @Override
    public PurchaseStock getById(int id) {
        Optional<PurchaseStock> purchaseStock = purchaseStockRepository.findById(id);
        if (purchaseStock.isPresent()) {
            return purchaseStock.get();
        } else {
            return null;
        }
    }

    @Override
    public void savePurchaseStock(PurchaseStock purchaseStock) {
        purchaseStock.setPurchaseStockInGram(purchaseStock.getPurchaseStock() * 1000);
        purchaseStockRepository.save(purchaseStock);
    }

    @Override
    public void updatePurchaseStock(PurchaseStock purchaseStock) {
        purchaseStockRepository.save(purchaseStock);
    }

    @Override
    public Integer sumPurchaseStock(int id) {
        return purchaseStockRepository.sumPurchaseStock(id);
    }
}
