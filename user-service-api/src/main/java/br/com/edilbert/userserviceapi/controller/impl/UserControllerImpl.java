package br.com.edilbert.userserviceapi.controller.impl;

import br.com.edilbert.userserviceapi.controller.UserControler;
import br.com.edilbert.userserviceapi.entity.User;
import br.com.edilbert.userserviceapi.service.UserService;
import lombok.RequiredArgsConstructor;
import models.responses.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserControler {

    private final UserService userService;

    @Override
    public ResponseEntity<UserResponse> findById(String id) {
        return ResponseEntity.ok(userService.findById(id));
    }
}
