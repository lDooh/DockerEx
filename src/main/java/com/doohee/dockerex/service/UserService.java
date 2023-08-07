package com.doohee.dockerex.service;

import com.doohee.dockerex.dto.UserDto;
import com.doohee.dockerex.entity.User;
import com.doohee.dockerex.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(String username, String password) {
        User user = new User();

        user.setUsername(username);
        user.setPassword(password);

        return userRepository.save(user);
    }

    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<UserDto> userDtoList = new ArrayList<>();

        for (User user : userList) {
            userDtoList.add(UserDto.of(user));
        }

        return userDtoList;
    }
}
