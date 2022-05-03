package com.malachi.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("home")
public class HomeController {

    @GetMapping("/getAllCompanyList")
    public List<String> getAllCompanyList(){
        List<String> companyList = new ArrayList<>();
        companyList.add("Law of Luxury Group");
        companyList.add("Law of Luxury Consultancy");
        companyList.add("Law of Luxury Capital");
        companyList.add("Malachi Traders");
        companyList.add("Tux & Lux");
        return companyList;
    }
}
