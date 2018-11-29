package com.meteergin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.meteergin.service.CommonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneralBackendApplicationTests {
	
	@Autowired
	CommonService commonService; 
	
	@Test
	public void sumWith2Numbers() {
		System.out.println("Test1");
		assertEquals(6, commonService.sum(2,4));
	}
	
	@Test
	public void sumWith3Numbers() {
		System.out.println("Test2");
		assertEquals(9, commonService.sum(1,3,5));
	}

}
