package server.gdsc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.gdsc.controller.dto.AccountResponseDTO;
import server.gdsc.controller.dto.SignUpRequestDTO;
import server.gdsc.domain.entity.Account;
import server.gdsc.service.AccountService;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<?> AccountRegister(@RequestBody SignUpRequestDTO requestDTO){
        Account account = accountService.registerAccount(requestDTO);
        return new ResponseEntity<>(new AccountResponseDTO("계정이 생성되었습니다.", account), HttpStatus.OK);
    }
}
