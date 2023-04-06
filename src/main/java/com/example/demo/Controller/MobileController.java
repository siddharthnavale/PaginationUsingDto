package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.PageRequestDto;
import com.example.demo.Entity.Mobile;
import com.example.demo.Repositoty.MobileRepository;

@RestController
public class MobileController{
	
	
	@Autowired
	private MobileRepository mobileRepository;
	
	@PostMapping("/mobiles")
	public Page<Mobile> getAllMobiles(@RequestBody PageRequestDto dto) {
		
		Pageable pagable = dto.getPagable(dto);
		Page<Mobile> pageMobile = mobileRepository.findAll(pagable);
		return pageMobile;
		
		
	}
	
	
	
	
	
	
	
	

}
