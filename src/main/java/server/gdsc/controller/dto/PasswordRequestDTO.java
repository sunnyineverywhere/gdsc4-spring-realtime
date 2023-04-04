package server.gdsc.controller.dto;

import lombok.Getter;

@Getter
public class PasswordRequestDTO {
    private Long accountId;
    private String password;
}
