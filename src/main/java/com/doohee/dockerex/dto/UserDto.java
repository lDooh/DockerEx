package com.doohee.dockerex.dto;

import com.doohee.dockerex.entity.User;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
public class UserDto {

    private Long id;

    private String username;

    private String password;

    private static ModelMapper modelMapper = new ModelMapper();

    public static UserDto of(User user) {
        return modelMapper.map(user, UserDto.class);
    }
}
