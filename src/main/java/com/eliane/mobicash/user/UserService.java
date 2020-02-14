package com.eliane.mobicash.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	private List<User> users = new ArrayList<>( Arrays.asList(
			new User("Eliane Irankunda","irankunda@gmail.com","123456","07865432","female"),
			new User("Elvis Ishimwe","ishimwe@gmail.com","123456","07865432","male"),
			new User("Edgard Ikuzwe","ikuzwe@gmail.com","123456","07865432","male"),
			new User("Grace Umutesi","umutesi@gmail.com","123456","07865432","female")
			));
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getUser(String email) {
		return users.stream().filter(u-> u.getEmail().equals(email)).findFirst().get();
	}
	public void addUser(User user) {
		 users.add(user);
	}
	
}
