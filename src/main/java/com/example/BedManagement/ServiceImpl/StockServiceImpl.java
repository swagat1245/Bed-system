package com.example.BedManagement.ServiceImpl;

import com.example.BedManagement.Model.Stock;
import com.example.BedManagement.Repository.DispatchStockRepository;
import com.example.BedManagement.Repository.PurchaseStockRepository;
import com.example.BedManagement.Repository.StockRepository;
import com.example.BedManagement.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    private StockRepository stockRepository;
    @Autowired
    private PurchaseStockRepository purchaseStockRepository;

    @Autowired
    private DispatchStockRepository dispatchStockRepository;

    @Override
    public List<Stock> getAllStock() {
        return stockRepository.findAll();
    }

    @Override
    public Stock getById(int id) {
        Optional<Stock> stock = stockRepository.findById(id);
        if (stock.isPresent()) {
            return stock.get();
        } else {
            return null;
        }
    }

    @Override
    public void saveStock(Stock stock) {
        stockRepository.save(stock);
    }

    @Override
    public void updateStock(Stock stock) {
        stockRepository.save(stock);
    }

    @Override
    public void deleteById(int id) {
        stockRepository.deleteById(id);
    }

    @Override
    public Integer getAvailableStock(int id) {
        return  purchaseStockRepository.sumPurchaseStock(id)-dispatchStockRepository.sumDispatchStock(id) ;
    }
}
