package com.sv.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;


@SpringBootTest
public class XmlServiceTest {
	
	@Autowired
	XmlService service;
	
	@Test
	public void testGetAll() throws Exception  {
		
		String str;
		try {
			str = service.getAll();
			assertEquals(false, str.isEmpty());
		} catch (HttpStatusException e) {
			// TODO Auto-generated catch block
			assertEquals(404, e.getStatusCode());
		}
		
		
		
	}

}
