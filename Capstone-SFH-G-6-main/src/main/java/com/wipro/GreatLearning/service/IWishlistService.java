package com.wipro.GreatLearning.service;

import java.util.List;

import com.wipro.GreatLearning.dto.WishlistDTO;
import com.wipro.GreatLearning.entity.Wishlist;

public interface IWishlistService {
	
	public Wishlist addToWishList(WishlistDTO dto);
	
	public List<Wishlist> getAllwishlist();
	
	public List<Wishlist> getAllDataWithSameUserId(long uid);
	
	public String deleteByUserIdAndProdId(long uid,long pid);
		
	}


