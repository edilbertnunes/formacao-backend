package br.com.edilbert.userserviceapi.controller;

import br.com.edilbert.userserviceapi.entity.User;
import models.responses.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public interface UserControler {

    @GetMapping("/{id}")
    ResponseEntity<UserResponse> findById(@PathVariable(name = "id") final String id);
}
