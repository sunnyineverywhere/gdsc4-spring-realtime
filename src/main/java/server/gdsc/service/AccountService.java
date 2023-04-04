package server.gdsc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import server.gdsc.controller.dto.PasswordRequestDTO;
import server.gdsc.controller.dto.SignUpRequestDTO;
import server.gdsc.domain.entity.Account;
import server.gdsc.domain.repository.AccountRepository;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account registerAccount(SignUpRequestDTO requestDTO) {
        if (accountRepository.findByEmail(requestDTO.getEmail()).isPresent()){
            throw new IllegalArgumentException("이미 존재하는 계정입니다.");
        }
        return accountRepository.save(
                requestDTO.toEntity()
        );
    }

    public Account findAccount(Long accountId) {
        return accountRepository.findById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 계정입니다."));
    }

    public Account modifyPassword(PasswordRequestDTO requestDTO) {
        Account account = accountRepository.findById(requestDTO.getAccountId())
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 계정입니다."));
        account.setPassword(requestDTO.getPassword());
        account = accountRepository.save(account);
        return account;
    }
}
