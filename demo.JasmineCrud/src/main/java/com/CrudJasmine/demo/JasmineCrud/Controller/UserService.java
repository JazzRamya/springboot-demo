package com.CrudJasmine.demo.JasmineCrud.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CrudJasmine.demo.JasmineCrud.Entity.User;
import com.CrudJasmine.demo.JasmineCrud.Repo.UserRepo;
@Service
public class UserService 
{
	@Autowired
	UserRepo repo;
	
	public User createUser(User user)
	{
		return repo.save(user);
	}
	public List<User> getAllUsers() {
        return repo.findAll();
    }
	 public Optional<User> getUserById(Long id) {
	        return repo.findById(id);
	    }
	 public User updateUser(Long id, User userDetails) {
	        return repo.findById(id)
	                   .map(emp -> {
	                       emp.setId(userDetails.getId());
	                       emp.setName(userDetails.getName());
	                       emp.setDept(userDetails.getDept());
	                       return repo.save(emp);
	                   })
	                   .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
	    }
	 public void deleteUser(Long id) {
	        repo.deleteById(id);
	    }
}
