package com.example.redis.spring.controller;

import java.util.List;

import com.example.redis.spring.entity.Product;
import com.example.redis.spring.repository.ProductDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class RestCcontroller {
	 @Autowired
	    private ProductDao dao;

	    @PostMapping
	    public Product save(@RequestBody Product product) {
	        return dao.save(product);
	    }

	    @GetMapping
	    public List<Product> getAllProducts() {
	        return dao.findAll();
	    }

	    @GetMapping("/{id}")
	    public Product findProduct(@PathVariable int id) {
	        return dao.findProductById(id);
	    }
	    @DeleteMapping("/{id}")
	    public String remove(@PathVariable int id)   {
	    	return dao.deleteProduct(id);
		}

}
