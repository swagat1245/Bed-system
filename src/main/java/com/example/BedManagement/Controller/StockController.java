package com.example.BedManagement.Controller;

import com.example.BedManagement.Model.Stock;
import com.example.BedManagement.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping()
    public List<Stock> getAllStock() {
        return stockService.getAllStock();
    }

    @GetMapping("{id}")
    Stock getById(@PathVariable(value = "id") int id) {
        return stockService.getById(id);
    }

    @PostMapping()
    public void saveStock(@RequestBody Stock stock) {
        stockService.saveStock(stock);
    }

    @PutMapping()
    public void updateStock(@RequestBody Stock stock) {
        stockService.updateStock(stock);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable int id) {
        stockService.deleteById(id);
    }
    @GetMapping("/available/{id}")
    public Integer getAvailableStock(@PathVariable(value = "id") int id) {
        return stockService.getAvailableStock(id);
    }
}
