package server.gdsc.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import server.gdsc.controller.dto.AccountRemoveRequestDTO;
import server.gdsc.controller.dto.PasswordRequestDTO;
import server.gdsc.controller.dto.SignUpRequestDTO;
import server.gdsc.domain.entity.Account;
import server.gdsc.service.AccountService;

@RestController
@RequestMapping("/accounts")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<?> accountRegister(@RequestBody SignUpRequestDTO requestDTO){
        Account account = accountService.registerAccount(requestDTO);
        return new ResponseEntity<>(account.fromEntity("계정이 생성되었습니다."), HttpStatus.OK);
    }

    @GetMapping("/{accountId}")
    public ResponseEntity<?> accountFind(@PathVariable Long accountId){
        Account account = accountService.findAccount(accountId);
        return new ResponseEntity<>(account.fromEntity("계정 조회 성공"), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> passwordModify(@RequestBody PasswordRequestDTO requestDTO){
        Account account = accountService.modifyPassword(requestDTO);
        return new ResponseEntity<>(account.fromEntity("패스워드 변경 성공"), HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<?> accountRemove(@RequestBody AccountRemoveRequestDTO requestDTO){
        accountService.removeAccount(requestDTO);
        return new ResponseEntity<>("계정이 삭제되었습니다.", HttpStatus.OK);
    }
}
