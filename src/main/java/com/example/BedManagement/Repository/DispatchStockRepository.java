package com.example.BedManagement.Repository;

import com.example.BedManagement.Model.DispatchStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DispatchStockRepository extends JpaRepository<DispatchStock,Integer> {

    @Query(value = "SELECT SUM(dis_patch_stock) FROM dispatch_stock where stock_id=:id",nativeQuery = true)
    public Integer sumDispatchStock(@Param(value = "id") int id);
}
