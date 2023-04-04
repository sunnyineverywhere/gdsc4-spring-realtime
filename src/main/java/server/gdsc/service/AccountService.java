package server.gdsc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.gdsc.controller.dto.SignUpRequestDTO;
import server.gdsc.domain.entity.Account;
import server.gdsc.domain.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account registerAccount(SignUpRequestDTO requestDTO) {
        Account account = accountRepository.findByEmail(requestDTO.getEmail())
                .orElseThrow(() -> new IllegalArgumentException("이미 존재하는 계정입니다!"));
        return accountRepository.save(
                Account.builder()
                        .email(requestDTO.getEmail())
                        .name(requestDTO.getName())
                        .password(requestDTO.getPassword())
                        .build()
        );
    }
}
