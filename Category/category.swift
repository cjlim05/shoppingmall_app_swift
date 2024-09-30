//
//  category.swift
//  capsapp
//
//  Created by 임채주 on 9/26/24.
//
//
//  category.swift
//  capsapp
//
//  Created by 임채주 on 9/26/24.
//

import SwiftUI

struct category: View {
    @State private var isRotating = false // 애니메이션 상태 변수
    @State private var navigateToHome = false // 네비게이션 상태 변수

    var body: some View {
        NavigationView {
            VStack {
                // Top bar
                HStack {
                    // 왼쪽에 로고 이미지
                    Image(systemName: "leaf.fill")
                        .resizable()
                        .scaledToFit()
                        .frame(width: 40, height: 40)
                        .padding(.leading, 16)
                        .padding(.top, 5)
                    
                    Spacer()
                    
                    // 오른쪽에 알림 버튼과 하트 버튼
                    HStack(spacing: 20) {
                        Button(action: {
                            print("알림 버튼 클릭")
                        }) {
                            Image(systemName: "bell.fill")
                                .font(.title)
                                .foregroundColor(.black)
                        }
                        
                        Button(action: {
                            print("하트 버튼 클릭")
                        }) {
                            Image(systemName: "heart.fill")
                                .font(.title)
                                .foregroundColor(.red)
                        }
                    }
                    .padding(.trailing, 16)
                }
                .padding(.bottom, 20)
                .padding(.vertical, 5)

                VStack {
                    // 뒤로가기 버튼 "< Back"
                    // 예시: fullScreenCover를 사용하는 방법
                    Button(action: {
                        navigateToHome = true
                    }) {
                        HStack {
                            Image(systemName: "chevron.left")
                            Text("Back")
                        }
                        .foregroundColor(.blue)
                        .padding(.leading, 16)
                        .padding(.top, 5)
                        Spacer()
                    }
                    .fullScreenCover(isPresented: $navigateToHome) {
                        ContentView()
                    }

                }

                // 카테고리
                VStack {
                    // 첫 번째 행
                    HStack(spacing: 10) {
                        createCategoryView(image: "Image", text: "축구", destination: AnyView(cart()))
                        createCategoryView(image: "Image", text: "농구", destination: AnyView(cart()))
                        createCategoryView(image: "Image", text: "야구", destination: AnyView(cart()))
                        createCategoryView(image: "Image", text: "테니스", destination: AnyView(cart()))
                    }

                    // 두 번째 행
                    HStack(spacing: 10) {
                        createCategoryView(image: "Image", text: "러닝(육상)", destination: AnyView(cart()))
                        createCategoryView(image: "Image", text: "격투기", destination: AnyView(cart()))
                        createCategoryView(image: "Image", text: "NFL", destination: AnyView(cart()))
                        createCategoryView(image: "Image", text: "기타", destination: AnyView(cart()))
                    }
                }
                .padding(.bottom) // 아래쪽 여백 추가
                Spacer() // 스페이서를 추가하여 하단 여백을 조정
            }
        }
    }

    // 카테고리 항목 생성하는 함수
    private func createCategoryView(image: String, text: String, destination: AnyView) -> some View {
        VStack {
            NavigationLink(destination: destination) {
                Image(image) // 각 카테고리마다 다르게 설정된 이미지
                    .resizable()
                    .frame(width: 80, height: 80)
                    .aspectRatio(contentMode: .fit)
                    .background(Color.white) // 배경 색상
                    .cornerRadius(10) // 모서리 둥글게
            }
            .buttonStyle(PlainButtonStyle())

            Text(text) // 이미지 아래에 텍스트 추가
                .font(.caption) // 폰트 크기 조절
                .foregroundColor(.black)
        }
    }
}

struct category_Previews: PreviewProvider {
    static var previews: some View {
        category()
    }
}

#Preview {
    category() // Category 이름 수정
}
