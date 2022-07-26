package com.example.redis.spring.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product")
public class Product implements Serializable{
	
	
	private static final long serialVersionUID = -8219784492383079182L;
    
	 
	 
	
	 @Id
	private int id;
	private String name;
	private int quantity;
	private long price;
	
	
	
	
	
	
	
	
}
