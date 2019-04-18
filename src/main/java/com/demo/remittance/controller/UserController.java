/**
 * 
 */
package com.demo.remittance.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.remittance.model.User;
import com.demo.remittance.service.UserService;

/**
 * @author DELL
 *
 */
@RestController /* (value = "/v1/user/") */
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping(path = "/create", consumes = "application/json", produces = "application/json")
	public ResponseEntity<User> save(HttpServletRequest request, @RequestBody User user) {
		userService.save(user);		
		return new ResponseEntity<User>(userService.getUserById(user.getId()), HttpStatus.OK);
	}
	
	@GetMapping(value = "/ping1")
	public ResponseEntity<String> ping() {
		final HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<String>("{\"msg\": \"Working Fine:", headers, HttpStatus.OK);
	}

}
