package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	public void add(Product product) {
		//sadece db erisim kodlari buraya yazilir...SQL
		System.out.println("added to DB through Hibernate!");
	}
}