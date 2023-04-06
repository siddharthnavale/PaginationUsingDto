package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Mobile {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int mobileId;
	private String mobileModel;
	private int price;
	private int hardDisk;
	private int ram;

	

}
