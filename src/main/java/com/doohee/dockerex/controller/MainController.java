package com.doohee.dockerex.controller;

import com.doohee.dockerex.dto.UserDto;
import com.doohee.dockerex.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final UserService userService;

    @GetMapping(value = "/")
    public String home(Model model) {

        List<UserDto> userDtoList = userService.getAllUsers();

        model.addAttribute("userDtoList", userDtoList);

        return "home";
    }
}
