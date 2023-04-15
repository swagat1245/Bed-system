package com.example.BedManagement.Repository;

import com.example.BedManagement.Model.PurchaseStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseStockRepository extends JpaRepository<PurchaseStock ,Integer> {
    @Query(value = "SELECT SUM(purchase_stock_in_gram) FROM purchase_stock where stock_id=:id",nativeQuery = true)
    public Integer sumPurchaseStock(@Param(value = "id") int id);
}
