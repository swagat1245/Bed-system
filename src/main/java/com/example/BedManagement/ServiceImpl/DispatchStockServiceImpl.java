package com.example.BedManagement.ServiceImpl;

import com.example.BedManagement.ExceptionHandling.CoustomException;
import com.example.BedManagement.Model.DispatchStock;
import com.example.BedManagement.Repository.DispatchStockRepository;
import com.example.BedManagement.Repository.PurchaseStockRepository;
import com.example.BedManagement.Service.DispatchStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DispatchStockServiceImpl implements DispatchStockService {
    @Autowired
    private DispatchStockRepository dispatchStockRepository;
    @Autowired
    private PurchaseStockRepository purchaseStockRepository;
    @Override
    public List<DispatchStock> getAllDispatchStock() {
        return dispatchStockRepository.findAll();
    }

    @Override
    public DispatchStock getById(int id) {
        Optional<DispatchStock> dispatchStock = dispatchStockRepository.findById(id);
        if (dispatchStock.isPresent()){
            return dispatchStock.get();
        } else {
            return null;
        }
    }

    @Override
    public void saveDispatchStock(DispatchStock dispatchStock,int id) throws CoustomException {
        if (dispatchStock.getDisPatchStock()<=purchaseStockRepository.sumPurchaseStock(id)) {
           dispatchStockRepository.save(dispatchStock);
        } else{
            throw new CoustomException("Stock Not Available");
        }
    }
    @Override
    public void updateDispatchStock(DispatchStock dispatchStock) {
        dispatchStockRepository.save(dispatchStock);
    }

    @Override
    public Integer sumDispatchStock(int id) {
        return dispatchStockRepository.sumDispatchStock(id);
    }
}
