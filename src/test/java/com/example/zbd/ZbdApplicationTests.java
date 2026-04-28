package com.example.zbd;

import com.example.zbd.entities.Order;
import com.example.zbd.repositories.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZbdApplicationTests {
	@Autowired
	private OrderRepository orderRepository;


	@Test
	void contextLoads() {

	}

	@Test
	void testJoin(){
		long start = System.nanoTime();
		orderRepository.findOrdersByCustomerId(1L);
		long end = System.nanoTime();
		long time = end - start;
	}

}
