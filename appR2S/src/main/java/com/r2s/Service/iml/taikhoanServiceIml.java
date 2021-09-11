package com.r2s.Service.iml;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2s.Entity.taikhoan;
import com.r2s.Service.taikhoanService;
import com.r2s.dao.taikhoanDao;

@Service
public class taikhoanServiceIml implements taikhoanService{

	@Autowired
	taikhoanDao dao;
	
	@Override
	public List<taikhoan> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
