package com.cts.product.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl {

	@Autowired
	private Environment env;

	public void testProductDao() {
		System.out.println("Dao: ProductDaoImpl testProductDao method..");
		System.out.println("Name: " + env.getProperty("name"));
	}
}
