package com.cg.App.Tata.Service;

import java.rmi.ServerException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.App.Tata.Module.User;
import com.cg.App.Tata.Repository.IUserRepository;
@Service
public class IUserServiceImpl implements IUserService {
	@Autowired
	IUserRepository iuserrepository;
	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		
		User newuser= iuserrepository.save(user);
	    return newuser;
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		Optional<User> updateuser =iuserrepository.findById(user.getId());
		if(updateuser.isPresent()) {
			iuserrepository.saveAndFlush(user);
			
		}
		return user;
	}

	public User findById(Long id) {
		// TODO Auto-generated method stub
		Optional<User> userbyid= iuserrepository.findById(id);
		User uid= userbyid.get();
		return uid;
	}

	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		Optional<User> userbyname= iuserrepository.findByUsername(username);
		User usern= userbyname.get();
		return usern;
		
	}

	@Override
	public String deleteByUserId(Long id) {
		iuserrepository.deleteById(id);
		return "Record deleted";
		// TODO Auto-generated method stub*/
		//return null;
	}

}
