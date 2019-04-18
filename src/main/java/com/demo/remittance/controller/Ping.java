/**
 * 
 */
package com.demo.remittance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.remittance.dao.RemitterDao;

/**
 * @author dhaval
 * 
 *         Test Controller
 */
@RestController /* (value = "/v1/test/") */
public class Ping {

	@Value("${datasource.name}")
	private String datasourceName;

	@Autowired
	private RemitterDao remitterDao;

	@GetMapping(value = "/ping")
	public ResponseEntity<String> ping() {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"msg\": \"Working Fine: " + datasourceName + "  "
				+ remitterDao.getRemitterNameByMobileNumber("1234567890") + "\"}", headers, HttpStatus.OK);
	}
}
