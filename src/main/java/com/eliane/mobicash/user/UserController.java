package com.eliane.mobicash.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/userInfo")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping("userInfo/{email}")
	public User getUser(@PathVariable String email) {
		return userService.getUser(email);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/userInfo")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
}
