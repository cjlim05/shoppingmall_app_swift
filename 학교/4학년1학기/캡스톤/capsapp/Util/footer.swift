//
//  footer.swift
//  capsapp
//
//  Created by 임채주 on 9/26/24.
//

import SwiftUI

struct footer: View {
    var body: some View {
        VStack(spacing: 20) {
            // 저작권 및 사업자 정보
            VStack(spacing: 5) {
                Text("© 2024 CHAEJU ALL RIGHTS RESERVED")
                    .font(.footnote)
                    .foregroundColor(.gray)
                
                Text("사업자등록번호 123-45-67890")
                    .font(.footnote)
                    .foregroundColor(.gray)
                
                HStack(spacing: 15) {
                    Text("개인정보처리방침")
                    Text("|")
                    Text("이용약관")
                }
                .font(.footnote)
                .foregroundColor(.gray)
            }
            
            // 연락처 정보
            VStack(spacing: 5) {
                Text("전화: 1234-5678")
                    .font(.footnote)
                    .foregroundColor(.gray)
                
                Text("이메일: chaeju@email.com")
                    .font(.footnote)
                    .foregroundColor(.gray)
            }
            
            // 푸터 설명
            Text("푸터 내용 푸터 내용 푸터 내용 푸터 내용 푸터 내용 푸터 내용 푸터 내용 푸터 내용 푸터 내용 푸터 내용 푸터 내용 푸터 내용")
                .multilineTextAlignment(.center)
                .font(.footnote)
                .foregroundColor(.gray)
                .padding(.horizontal, 10)
            
            // 소셜 미디어 아이콘
            HStack(spacing: 20) {
                Image(systemName: "camera") // 인스타그램 아이콘
                Image(systemName: "video")  // 유튜브 아이콘
                Image(systemName: "xmark")  // x 아이콘
                Image(systemName: "link")   // 페이스북 아이콘
            }
            .font(.title)
            .foregroundColor(.gray)
        }
        .padding()
    }
}

#Preview {
    footer()
}
