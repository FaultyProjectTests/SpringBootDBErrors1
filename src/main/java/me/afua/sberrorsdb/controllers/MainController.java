package me.afua.sberrorsdb.controllers;

import me.afua.sberrorsdb.model.Product;
import me.afua.sberrorsdb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @Autowired
    ProductService myItems;

    @RequestMapping("/")
    public @ResponseBody  Iterable <Product> showItems()
    {
//      Return a list of items from the database (all available items)
        return myItems.show();
    }

    @RequestMapping("/add")
    public @ResponseBody String addService()
    {
       return myItems.addProduct();

    }


}
