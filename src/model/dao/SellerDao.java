package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {

	
	void insert(Seller obj);
	void updade(Seller obj);
	void deletebyId(Integer id);
	Seller findById(Integer id);
	List<Seller> finAll();
}
