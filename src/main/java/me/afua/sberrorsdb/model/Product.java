package me.afua.sberrorsdb.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


public class Product {
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;

    private String itemName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Product(String itemName) {
        this.itemName = itemName;
    }

}
