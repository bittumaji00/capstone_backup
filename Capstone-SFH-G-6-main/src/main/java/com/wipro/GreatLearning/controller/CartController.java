package com.wipro.GreatLearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.GreatLearning.entity.Cart;
import com.wipro.GreatLearning.service.ICartService;

@RestController
@RequestMapping("/cart")
public class CartController {
	@Autowired
	private ICartService service;
	
	@PostMapping("/add")
	public Cart addToCart(@RequestBody Cart cart) {
		return service.addToCart(cart);
	}
	
	@GetMapping("/get-user/{uid}")
	public List<Cart> getUserList(@PathVariable long uid){
		return service.getAllByUser(uid);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCart(@PathVariable long id) {
		service.deleteCart(id);
		
	}

}
