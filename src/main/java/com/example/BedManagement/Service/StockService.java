package com.example.BedManagement.Service;

import com.example.BedManagement.Model.Stock;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StockService {

    List<Stock> getAllStock();

    Stock getById(int id);

    void saveStock(Stock stock);

    void updateStock(Stock stock);

    void deleteById(int id);

    Integer getAvailableStock(int id);

}
