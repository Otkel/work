package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.MessMapperDAO;

 @Controller
public class MainController {
    @Autowired
    MessMapperDAO messMapperDAO;

    @RequestMapping("/")
    public String getMess() {
        return messMapperDAO.getMessage("1") + "<h1> sdfsdfsdfsdg</h1>";
    }
    
    @RequestMapping("/hello1")
    public String hello(Model model) throws Exception {
       
        	model.addAttribute("greeting", messMapperDAO.getMessage("1"));
        	return "helloworld";
        
    }
    
}
