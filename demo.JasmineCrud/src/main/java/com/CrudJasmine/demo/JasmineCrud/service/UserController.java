package com.CrudJasmine.demo.JasmineCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CrudJasmine.demo.JasmineCrud.Controller.UserService;
import com.CrudJasmine.demo.JasmineCrud.Entity.User;

@RestController
@RequestMapping("/user")
public class UserController 
{
    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<User> createEmployee(@RequestBody 	User user) {
        User created = service.createUser(user);
        return ResponseEntity.status(201).body(created);
    }

    @GetMapping
    public List<User> getAllEmployees() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getEmployeeById(@PathVariable Long id) {
        return service.getUserById(id)
                      .map(ResponseEntity::ok)
                      .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateEmployee(@PathVariable Long id,
                                                   @RequestBody User user) {
        try {
            User updated = service.updateUser(id, user);
            return ResponseEntity.ok(updated);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        }
        if (!service.getUserById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        service.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
