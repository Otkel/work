package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.MessMapperDAO;

@RestController
public class RestWebController {
	@Autowired
    MessMapperDAO messMapperDAO;

	@RequestMapping(value = "/newString", method = RequestMethod.GET)
	public String getString() {
		return "<h1>"+messMapperDAO.getMessage("1")+"</h1>";
	}

}
