package com.example.restwithdatabase.repositries;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.restwithdatabase.model.User;

@Repository
public class UserRepository {
private static int userId=10;
private static ArrayList<User> users =  new ArrayList<User>();
static {
	users.add(new User(++userId,"Rahul","IIT Bombay"));
	users.add(new User(++userId,"Piyush","IIT Chennai"));
	users.add(new User(++userId,"swati","IIT Delhi"));
	users.add(new User(++userId,"Shakshi","NIT Surat"));
}
public List <User> getUsers() {
	return users;
}
public void save(User user) {
	// TODO Auto-generated method stub
	user.setId(++userId);
	users.add(user);
}
}
