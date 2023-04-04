package server.gdsc.controller.dto;

import lombok.Builder;
import lombok.Getter;
import server.gdsc.domain.entity.Account;

@Getter
public class AccountResponseDTO {
    private String message;
    private Long accountId;
    private String email;
    private String name;

    @Builder
    public AccountResponseDTO(String message, Account account) {
        this.message = message;
        this.accountId = account.getAccountId();
        this.email = account.getEmail();
        this.name = account.getName();
    }
}
