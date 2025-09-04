package com.CrudJasmine.demo.JasmineCrud.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CrudJasmine.demo.JasmineCrud.Entity.User;
@Repository
public interface UserRepo extends JpaRepository<User, Long>
{
	
}
