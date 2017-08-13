package com.samir.spring.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.samir.spring.data.ProductRepo.ProductRepository;
import com.samir.spring.data.entities.Product;

import ch.qos.logback.classic.net.SyslogAppender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJpaApplicationTests {
	
	@Autowired
	ApplicationContext context;

	@Test
	public void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		Product product = new Product();
		product.setId(1L);
		product.setName("MAC");
		product.setDescription("Awesome Product");
		product.setPrice(100d);
		//Saving data to the DB
		repository.save(product);
		//Reading data from DB
		Product result = repository.findOne(1L);
		
		System.out.println(result);
		
		//updating a result
		result.setPrice(1500d);
		Product save = repository.save(result);
		repository.findAll().forEach(p->{System.out.println(p.getPrice());});
	
	}

}
