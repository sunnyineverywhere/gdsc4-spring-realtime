package server.gdsc.controller.dto;

import lombok.Builder;
import lombok.Getter;
import server.gdsc.domain.entity.Account;

@Getter
@Builder
public class AccountResponseDTO {
    private String message;
    private Long accountId;
    private String email;
    private String name;


    public AccountResponseDTO fromEntity(String message, Account account) {
        return AccountResponseDTO.builder()
                .message(message)
                .accountId(account.getAccountId())
                .email(account.getEmail())
                .name(account.getName())
                .build();
    }
}
