package com.mybatis.main;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mybatis.domain.Product;
import com.mybatis.persistance.ProductMapper;
import com.mybatis.service.ProductService;
import com.mybatis.service.ProductServiceImpl;

public class TestProduct {

	private static Log log = LogFactory.getLog(TestProduct.class);

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:applicationContext.xml");

		log.info("Running App...");

		ProductService pm = (ProductService) ctx.getBean("productService");

		// coding for insert
		// pm.insert(new Product(5, "pen", "20", "500"));
		//
		// coding for update
		// pm.update(new Product(3, "pendrive", "40", "500"));

		// coding for delete data
		//pm.delete(new Product(3));

		// get product by id
		// Product p =pm.getProductById(3);
		// System.out.println(p.getPid()+" "+p.getPname()+" "+p.getQty()+" "+p.getPrice());

		// show all data
//		List<Product> l = pm.getAllProduct();
		for (Product p : pm.getAllProduct()) {
			System.out.println(p.getPid() + " " + p.getPname() + " "
					+ p.getQty() + " " + p.getPrice());

		}

	}

}
