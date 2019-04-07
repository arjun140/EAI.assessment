package com.my_test;
import static spark.Spark.*;

import java.io.IOException;

import spark.Route;
public class Main {

	public static void main(String[] args) {
		int  counter= 1;
		
		
		
		// TODO Auto-generated method stub
		System.out.println("Working!!!\n");
		staticFileLocation("/public");
		//get("/", (req, res) -> {res.redirect("index.html");return"";});
		get("hello", (req, res) -> "Hello World!!!!");

		
		post("contact", (request, response) -> {
			
    		Person person = new Person();
    		person.setId(counter);
    		person.setName(request.queryParams("name"));
    		person.setPersonNum(request.queryParams("number"));
    		System.out.println(person.getName());
    		System.out.println(person.getId());
        	return App.insertPerson(person);	
		});
	}

	


}
