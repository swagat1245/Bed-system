package com.example.BedManagement.Controller;

import com.example.BedManagement.Model.PurchaseStock;
import com.example.BedManagement.Model.Stock;
import com.example.BedManagement.Service.PurchaseStockService;
import com.example.BedManagement.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseStockController {
    @Autowired
    private PurchaseStockService purchaseStockService;
    @Autowired
    private StockService stockService;

    @GetMapping()
    public List<PurchaseStock> getAllPurchaseStock() {
        return purchaseStockService.getAllPurchaseStock();
    }

    @GetMapping("/{id}")
    public PurchaseStock getById(@PathVariable(value = "id") int id) {
        return purchaseStockService.getById(id);
    }

    @PostMapping()
    public void savePurchaseStock(@RequestBody PurchaseStock purchaseStock){
        purchaseStockService.savePurchaseStock(purchaseStock);
    }

    @PutMapping()
    public void updatePurchaseStock(PurchaseStock purchaseStock) {
        purchaseStockService.updatePurchaseStock(purchaseStock);
    }

    @GetMapping("/total/{id}")
    public Integer sumPurchaseStock(@PathVariable(value = "id") int id) {
        return purchaseStockService.sumPurchaseStock(id);
    }
}
