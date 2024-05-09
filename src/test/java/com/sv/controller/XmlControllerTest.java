package com.sv.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.sv.service.XmlService;


@WebMvcTest(XmlController.class)
public class XmlControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private XmlService service;
	
	@Test
	public void testConsultarDocumentacion() throws Exception {
		
		when(service.getAll()).thenReturn("123456789");
		
		
		mockMvc.perform(get("/api/consultar-documentacion"))
		.andExpect(status().isOk());
	}
	
	@Test
	public void testConsultarDocumentacionError() throws Exception {
		
		when(service.getAll()).thenThrow(new Exception("Error de ejecucion"));
		
		
		mockMvc.perform(get("/api/consultar-documentacion"))
		.andExpect(status().is(500));
	}
	
	

}
