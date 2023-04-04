package server.gdsc.controller.dto;

import lombok.Getter;

@Getter
public class SignUpRequestDTO {
    private String email;
    private String name;
    private String password;
}
