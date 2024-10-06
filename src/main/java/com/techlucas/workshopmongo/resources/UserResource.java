package com.techlucas.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techlucas.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity <List<User>> findAll() {
		User dona = new User("1", "Dona benta", "donab@gmail.com");
		User ruan = new User("2", "don ruan", "ruan122@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(dona, ruan));
		return ResponseEntity.ok().body(list);
		
	}
}
