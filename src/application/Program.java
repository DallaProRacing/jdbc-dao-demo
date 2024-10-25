package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	
	public static void main(String[] args) {
		
		SellerDao sellerdao = DaoFactory.createSellerDao();
		System.out.println("========= TESTE 1: FindByID");
		Seller seller = sellerdao.findById(3);
		
		System.out.println(seller);
	}
}
