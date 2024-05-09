package com.sv.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sv.service.XmlService;

@RestController
@RequestMapping("/api")
public class XmlController {

	@Autowired
	XmlService service;

	@GetMapping("/consultar-documentacion")
	public ResponseEntity<String> buscarDocumentacion() {

		try {

			String resultado = service.getAll();
			return ResponseEntity.status(200).body(resultado.toString());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return ResponseEntity.status(500).body(e.getMessage());
		}

	}

}
