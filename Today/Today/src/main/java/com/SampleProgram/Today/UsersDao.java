package com.SampleProgram.Today;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UsersDao {
@Autowired UsersRepository ur;
	public Users post(List<Users> u) {
		// TODO Auto-generated method stub
		
	ur.saveAll(u);
	return null;
	}

}
