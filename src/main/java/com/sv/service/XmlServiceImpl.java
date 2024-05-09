package com.sv.service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class XmlServiceImpl implements XmlService {

	@Override
	public String getAll() throws Exception {

		// se conecta a url
		Document doc = Jsoup.connect("https://www.w3.org/2001/XMLSchema").get();

		// busca elementos <xs:documentation>
		Elements documentacion = doc.select("xs|documentation");
		StringBuilder resultado = new StringBuilder();

		// recorre los elementos y obtiene el texto
		for (Element elemento : documentacion) {
			resultado.append(elemento.text()).append("\n");
		}
		// throw new Exception("Error de ejecucion");
		// devuelve el resultado

		return resultado.toString();
	}

}
