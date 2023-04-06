package server.gdsc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import server.gdsc.controller.dto.SignUpDTO;
import server.gdsc.domain.entity.Account;
import server.gdsc.service.AccountService;

@RequestMapping("/accounts")
@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<?> signUpAccount(@RequestBody SignUpDTO requestDTO){
        Account account = accountService.accountSignUp(requestDTO);
        return new ResponseEntity<>(account, HttpStatus.OK);
    }
}
