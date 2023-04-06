package server.gdsc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.gdsc.controller.dto.SignUpDTO;
import server.gdsc.domain.entity.Account;
import server.gdsc.domain.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account accountSignUp(SignUpDTO requestDTO) {
        Account account = accountRepository.save(
                Account.builder()
                        .email(requestDTO.getEmail())
                        .password(requestDTO.getPassword())
                        .name(requestDTO.getName())
                        .build()
        );
        return account;
    }
}
