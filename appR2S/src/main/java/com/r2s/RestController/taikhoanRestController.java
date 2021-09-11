package com.r2s.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.r2s.Entity.taikhoan;
import com.r2s.Service.taikhoanService;

@CrossOrigin("*")
@RestController
public class taikhoanRestController {
	
	@Autowired
	taikhoanService service;
	
	@GetMapping
	public List<taikhoan> all(){
		return service.findAll();
	}
	
}
