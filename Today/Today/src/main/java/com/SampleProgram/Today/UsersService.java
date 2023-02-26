package com.SampleProgram.Today;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UsersService {
@Autowired UsersDao ud;
	public Users post(List<Users> u) {
		// TODO Auto-generated method stub
		return ud.post(u);
	}

}
