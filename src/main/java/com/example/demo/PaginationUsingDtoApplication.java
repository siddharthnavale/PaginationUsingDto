package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Entity.Mobile;
import com.example.demo.Repositoty.MobileRepository;

@SpringBootApplication
public class PaginationUsingDtoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PaginationUsingDtoApplication.class, args);
	}
    
	@Autowired
	private MobileRepository mobileRepository;
	@Override
	public void run(String... args) throws Exception {
		
		ArrayList<Mobile> mobiles = new ArrayList<Mobile>();
		mobiles.add(Mobile.builder().mobileModel("Galaxy F13").hardDisk(64).price(10999).ram(4).build());
		mobiles.add(Mobile.builder().mobileModel("realme C55").hardDisk(128).price(13999).ram(8).build());
		mobiles.add(Mobile.builder().mobileModel("OPPO A17k").hardDisk(64).price(9499).ram(3).build());
		 
		mobileRepository.saveAll(mobiles);
		
	}

}
