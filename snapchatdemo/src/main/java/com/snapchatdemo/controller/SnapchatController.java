package com.snapchatdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnapchatController {
	
	@GetMapping("/Login")
	public String getLogin(@RequestParam String username,@RequestParam String password)
	{
		if(username.equals("admin")&& password.equals("1234"))
		{
			return "Login successfully";
		}
		else
		{
			return "Login failed";
		}
	}
}