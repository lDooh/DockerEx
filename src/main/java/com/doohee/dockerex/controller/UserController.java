package com.doohee.dockerex.controller;

import com.doohee.dockerex.dto.UserDto;
import com.doohee.dockerex.entity.User;
import com.doohee.dockerex.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping(value = "/new")
    public String createUser(String username, String password) {
        userService.createUser(username, password);

        return "redirect:/";
    }
}
