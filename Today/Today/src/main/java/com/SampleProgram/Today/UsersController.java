package com.SampleProgram.Today;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Hello")
public class UsersController{
	@Autowired UsersService us;
	@PostMapping(value="/post")
	public Users  post(@RequestBody List<Users>u) {
		return us.post(u);
	}

}
