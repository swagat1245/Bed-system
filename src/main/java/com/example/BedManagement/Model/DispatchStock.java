package com.example.BedManagement.Model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.persistence.*;
@AllArgsConstructor
@Entity
public class DispatchStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int disPatchStock;
    @ManyToOne
    @JoinColumn(name ="stock_id")
    private Stock stock;
    public Stock getStock() {
        return stock;
    }
    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDisPatchStock() {
        return disPatchStock;
    }

    public void setDisPatchStock(int disPatchStock) {
        this.disPatchStock = disPatchStock;
    }

    public DispatchStock(int id, int disPatchStock) {
        this.id = id;
        this.disPatchStock = disPatchStock;
    }

    public DispatchStock() {
    }
}
