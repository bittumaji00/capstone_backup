package com.wipro.GreatLearning.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.GreatLearning.entity.Cart;
import com.wipro.GreatLearning.repository.CartRepository;
import com.wipro.GreatLearning.service.ICartService;
@Service
public class CartServiceImp implements ICartService {
	
	@Autowired
	private CartRepository repo;

	@Override
	public Cart addToCart(Cart cart) {
		// TODO Auto-generated method stub
		
		return repo.save(cart) ;
	}

	

	@Override
	public void deleteCart(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}



	@Override
	public List<Cart> getAllByUser(long id) {
		// TODO Auto-generated method stub
		return repo.findAllByUserId(id);
	}

}
