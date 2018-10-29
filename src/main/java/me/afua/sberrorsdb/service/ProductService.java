package me.afua.sberrorsdb.service;

import me.afua.sberrorsdb.model.Product;
import me.afua.sberrorsdb.model.ProductRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {

    @Autowired
    ProductRepository products;

    public Iterable<Product> show()
    {
        return products.findAll();
    }

    public String addProduct() {

//      Adds a new product to the database
        Product aProduct = new Product("Product " + RandomStringUtils.randomAlphabetic(5));
        if ((products.save(aProduct) != null))
            return "Product added";
        else return "Unable to add product";
    }

}
