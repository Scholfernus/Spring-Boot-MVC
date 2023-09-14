package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shop")
public class ShopController {



    @GetMapping("/win")
    public String getWindows(){
        return "shop/windows";
    }

    @GetMapping("/dat")
    public String getDatatables(){
        return "shop/datatables";
    }



}
