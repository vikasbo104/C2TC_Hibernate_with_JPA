package com.cg.jpastart.entities;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		// Have some products
		Product elecProduct = new Product();
		elecProduct.setId(1);
		elecProduct.setName("One+ LED TV");
		elecProduct.setPrice(45000);
		
		Product officeProduct = new Product();
		officeProduct.setId(2);
		officeProduct.setName("MayFair Chairs");
		officeProduct.setPrice(15000);
		
		Product accProduct = new Product();
		accProduct.setId(3);
		accProduct.setName("Dell WL Mouse");
		accProduct.setPrice(890);
		
		// One order from Bhavesh
		Order firstOrder = new Order();
		firstOrder.setId(1);
		firstOrder.setPurchaseDate(new Date());
		firstOrder.addProduct(elecProduct);
		
		// Second from Rupesh
		
		Order secondOrder = new Order();
		secondOrder.setId(2);
		secondOrder.setPurchaseDate(new Date());
		secondOrder.addProduct(officeProduct);
		
		
		// Third from Akshay 
		
		Order thirdOrder = new Order();
		thirdOrder.setId(3);
		thirdOrder.setPurchaseDate(new Date());
		thirdOrder.addProduct(accProduct);
		
		
		
		em.persist(firstOrder);
		em.persist(secondOrder);
		em.persist(thirdOrder);
		
		em.getTransaction().commit();
		
		System.out.println("Added 3 orders along with products to the database.");
		em.close();
		factory.close();
	}
}
