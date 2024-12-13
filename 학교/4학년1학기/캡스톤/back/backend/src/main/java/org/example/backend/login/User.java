package org.example.backend.login;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")  // 실제 테이블명과 매핑
@Getter // 모든 필드에 대한 getter 메서드 자동 생성
@Setter
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role;
    private String nickname;
    private String phone;
}
