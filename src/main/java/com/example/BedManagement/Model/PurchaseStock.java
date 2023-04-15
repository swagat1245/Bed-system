package com.example.BedManagement.Model;

import javax.persistence.*;

@Entity
public class PurchaseStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int purchaseStock;

    private int purchaseStockInGram;

    public int getPurchaseStockInGram() {
        return purchaseStockInGram;
    }

    public void setPurchaseStockInGram(int purchaseStockInGram) {
        this.purchaseStockInGram = purchaseStockInGram;
    }

    @OneToOne
    @JoinColumn(name="stock_id")
    private Stock stock;

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
    /*private int availableStocks;*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPurchaseStock() {
        return purchaseStock;
    }

    public void setPurchaseStock(int purchaseStock) {
        this.purchaseStock = purchaseStock;
    }

  /*  public int getAvailableStocks() {
        return availableStocks;
    }

    public void setAvailableStocks(int availableStocks) {
        this.availableStocks = availableStocks;
    }*/

    public PurchaseStock(int id, int purchaseStock) {
        this.id = id;
        this.purchaseStock = purchaseStock;
    }

    public PurchaseStock() {
    }

}
