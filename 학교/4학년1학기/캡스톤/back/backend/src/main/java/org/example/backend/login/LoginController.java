package org.example.backend.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody UserSignupRequest signupRequest) {
        loginService.signupUser(signupRequest);
        return ResponseEntity.ok("회원가입이 완료되었습니다.");
    }
}
