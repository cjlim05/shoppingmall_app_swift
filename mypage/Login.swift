//
//  Login.swift
//  capsapp
//
//  Created by 임채주 on 10/3/24.
//
import SwiftUI

struct Login: View {
    @State private var username: String = ""
    @State private var password: String = ""
    
    var body: some View {
        VStack {
            Spacer() // 상단 여백
            
            ScrollView {
                VStack(spacing: 20) {
                    // 아이디 입력 필드
                    TextField("아이디", text: $username)
                        .textFieldStyle(RoundedBorderTextFieldStyle())
                        .padding(.horizontal, 40)
                    
                    // 비밀번호 입력 필드
                    SecureField("비밀번호", text: $password)
                        .textFieldStyle(RoundedBorderTextFieldStyle())
                        .padding(.horizontal, 40)
                    
                    // 비밀번호 찾기 & 회원가입 링크
                    HStack {
                        Spacer()
                        Button(action: {
                            // 비밀번호 찾기 로직 추가
                        }) {
                            Text("비밀번호 찾기")
                                .font(.footnote)
                                .foregroundColor(.blue)
                        }
                        
                        Spacer()
                        
                        Button(action: {
                            // 회원가입 로직 추가
                        }) {
                            Text("회원가입")
                                .font(.footnote)
                                .foregroundColor(.blue)
                        }
                        Spacer()
                    }
                    .padding(.horizontal, 40)
                    
                    // 로그인 버튼
                    Button(action: {
                        login() // 로그인 로직
                    }) {
                        Text("로그인")
                            .font(.headline)
                            .foregroundColor(.white)
                            .frame(maxWidth: .infinity)
                            .padding()
                            .background(Color.blue)
                            .cornerRadius(10)
                            .padding(.horizontal, 40)
                    }
                }
                .frame(minHeight: UIScreen.main.bounds.height * 0.6) // 로그인 부분을 화면 상단 60% 차지하게
                .padding(.top, UIScreen.main.bounds.height * 0.15) // 화면 중앙으로 이동
                
                Spacer() // 푸터를 아래로 밀기 위해 Spacer 사용
                
                footer()
                    .padding(.top, 200) // 푸터와 상단 콘텐츠 간 간격
            }
        }
    }
    
    
    func login() {
        guard let url = URL(string: "http://localhost:8080/login") else { return }
        
        let body: [String: Any] = ["username": username, "password": password]
        let finalBody = try? JSONSerialization.data(withJSONObject: body)
        
        var request = URLRequest(url: url)
        request.httpMethod = "POST"
        request.setValue("application/json", forHTTPHeaderField: "Content-Type")
        request.httpBody = finalBody
        
        URLSession.shared.dataTask(with: request) { data, response, error in
            guard let _ = data, error == nil else {
                print("네트워크 오류 발생: \(error?.localizedDescription ?? "")")
                return
            }
            
            if let httpResponse = response as? HTTPURLResponse {
                if httpResponse.statusCode != 200 {
                    print("로그인 실패: 상태 코드 \(httpResponse.statusCode)")
                    // 백엔드에서 리다이렉트 처리하면 자동으로 페이지 전환됨
                }
            }
        }.resume()
    }
    
    
    
    
    
}

#Preview {
    Login()
}
