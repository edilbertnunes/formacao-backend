package br.com.edilbert.userserviceapi.service;

import br.com.edilbert.userserviceapi.entity.User;
import br.com.edilbert.userserviceapi.mapper.UserMapper;
import br.com.edilbert.userserviceapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import models.responses.UserResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResponse findById(final String id) {
        return userMapper.fromEntity(
                userRepository.findById(id).orElse(null));
        //return userRepository.findById(id).orElse(null);
    }
}
