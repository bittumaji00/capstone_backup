package com.wipro.GreatLearning.service;

import java.util.List;

import com.wipro.GreatLearning.entity.Cart;

public interface ICartService {
	
	public Cart addToCart(Cart cart);

	public List<Cart> getAllByUser(long id);

	public void deleteCart(long id);

}
