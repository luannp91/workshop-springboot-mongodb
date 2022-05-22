package com.luannp.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.luannp.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> findAList() {
		User Jay = new User("1", "Jay Kyle", "jay@email.com");
		User Johnny = new User("2", "Johnny B.", "johnny@email.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(Jay, Johnny));
		return ResponseEntity.ok().body(list);
	}
}
