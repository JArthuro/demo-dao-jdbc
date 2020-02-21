package model.dao;

import java.util.List;

import model.entities.Seller;

//Interface que cria os contratos das operações que serão realizadas no DB.
public interface SellerDao {
	
	void insert (Seller obj);	
	void update(Seller obj);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();
}
