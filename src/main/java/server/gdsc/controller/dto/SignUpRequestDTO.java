package server.gdsc.controller.dto;

import lombok.Getter;
import server.gdsc.domain.entity.Account;

@Getter
public class SignUpRequestDTO {
    private String email;
    private String name;
    private String password;

    public Account toEntity(){
        return Account.builder()
                .email(email)
                .name(name)
                .password(password)
                .build();
    }
}
