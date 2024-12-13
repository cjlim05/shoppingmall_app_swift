package org.example.backend.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    public void signupUser(UserSignupRequest signupRequest) {
        User user = new User();
        user.setDb_username(signupRequest.getUsername());
        user.setDb_password(signupRequest.getPassword());
        user.setBirthdate(signupRequest.getBirthdate());
        userRepository.save(user); // 사용자 정보를 DB에 저장
    }
}
