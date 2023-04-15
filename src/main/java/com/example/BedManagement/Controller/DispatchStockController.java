package com.example.BedManagement.Controller;

import com.example.BedManagement.ExceptionHandling.CoustomException;
import com.example.BedManagement.Model.DispatchStock;
import com.example.BedManagement.Service.DispatchStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dispatch")
public class DispatchStockController {
    @Autowired
    private DispatchStockService dispatchStockService;

    @GetMapping()
    public List<DispatchStock> getAllDispatchStock() {
        return dispatchStockService.getAllDispatchStock();
    }

    @GetMapping("{id}")
    public DispatchStock getById(@PathVariable(value = "id") int id) {
        return dispatchStockService.getById(id);
    }

    @PostMapping("/post/{id}")
    public void saveDispatchStock(@RequestBody DispatchStock dispatchStock ,@PathVariable(value = "id") int id) throws CoustomException {
        dispatchStockService.saveDispatchStock(dispatchStock,id);
    }

    @PutMapping()
    public void updateDispatchStock(@RequestBody DispatchStock dispatchStock) {
        dispatchStockService.updateDispatchStock(dispatchStock);
    }

    @GetMapping("/total/{id}")
    public Integer sumDispatchStock(@PathVariable(value = "id") int id) {
        return dispatchStockService.sumDispatchStock(id);
    }

}
