package com.example.BedManagement.Model;

import javax.persistence.*;

@Entity
public class Bed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bedName;
    private boolean status;
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBedName() {
        return bedName;
    }
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
