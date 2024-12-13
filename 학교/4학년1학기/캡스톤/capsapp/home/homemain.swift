//
//  homemain.swift
//  capsapp
//
//  Created by 임채주 on 9/13/24.
//
import SwiftUI

struct homemain: View {
    @State private var currentIndex = 0
    private let images = ["Image", "Image", "Image"] // Image Set 이름 사용
    private let timer = Timer.publish(every: 5, on: .main, in: .common).autoconnect()
    @State private var searchText: String = "" // 검색값 저장
    
    let items = [
        ("image1", "첫 번째 아이템", "첫 번째 설명입니다. 이 설명은 두 줄로 보이게 됩니다."),
        ("image2", "두 번째 아이템", "두 번째 설명입니다. 이 설명도 두 줄로 보일 것입니다."),
        ("image3", "세 번째 아이템", "세 번째 설명입니다. 두 줄로 적절히 보입니다."),
        ("image4", "네 번째 아이템", "네 번째 설명이 두 줄로 표시됩니다."),
        ("image5", "다섯 번째 아이템", "다섯 번째 설명입니다. 두 줄로 표시될 겁니다."),
        ("image6", "여섯 번째 아이템", "여섯 번째 설명을 두 줄로 볼 수 있습니다.")
    ]
    
    let rows = [
        GridItem(.fixed(200), spacing: 23), // 첫 번째 열 높이 설정
        GridItem(.fixed(200), spacing: 23)  // 두 번째 열 높이 설정
    ]
    
    var body: some View {
        ScrollView {
            VStack(spacing: 10) { // 전체 VStack의 spacing을 10으로 설정
                // Top bar with logo, notification, and heart buttons
                HStack {
                    // 왼쪽에 로고 이미지
                    Image(systemName: "leaf.fill") // 로고 이미지
                        .resizable()
                        .scaledToFit()
                        .frame(width: 40, height: 40) // 로고 사이즈 조정
                        .padding(.leading, 16)
                        .padding(.top, 5)
                    
                    Spacer()
                    
                    // 오른쪽에 알림 버튼과 하트 버튼
                    HStack(spacing: 20) {
                        Button(action: {
                            // 알림 버튼 액션
                            print("알림 버튼 클릭")
                        }) {
                            Image(systemName: "bell.fill")
                                .font(.title)
                                .foregroundColor(.black)
                        }
                        
                        Button(action: {
                            // 하트 버튼 액션
                            print("하트 버튼 클릭")
                        }) {
                            Image(systemName: "heart.fill")
                                .font(.title)
                                .foregroundColor(.red)
                        }
                    }
                    .padding(.trailing, 16)
                }
                .padding(.vertical, 5) // Top bar의 vertical padding 줄임
                .background(Color.white)
                
                // 검색 입력란 + 검색 버튼을 내부에 넣음
                HStack {
                    ZStack {
                        RoundedRectangle(cornerRadius: 8)
                            .fill(Color(.systemGray6))
                        
                        HStack {
                            TextField("검색어를 입력하세요...", text: $searchText)
                                .padding(10)
                            
                            // 검색 버튼을 입력란 안에 추가
                            Button(action: {
                                // 검색 버튼 액션
                                print("검색 버튼 클릭: \(searchText)")
                            }) {
                                Image(systemName: "magnifyingglass")
                                    .foregroundColor(.gray)
                            }
                            .padding(.trailing, 10)
                        }
                        .padding(.horizontal, 16)
                    }
                    .frame(height: 40) // 검색 필드 높이 설정
                }
                .padding(.horizontal, 16)
                .padding(.bottom, 20)
                
                // Carousel for images
                TabView(selection: $currentIndex) {
                    ForEach(images.indices, id: \.self) { index in
                        NavigationLink(destination: destinationView(for: index)) {
                            Image(images[index]) // Image Set 이름을 사용
                                .resizable()
                                .scaledToFill() // 비율을 유지하면서 이미지를 고정된 크기에 채움
                                .frame(width: UIScreen.main.bounds.width, height: 300) // 화면 너비에 맞추고 높이는 300으로 고정
                                .clipped() // 이미지가 공간을 넘지 않도록 자름
                        }
                    }
                }
                .frame(height: 300) // Carousel의 고정 높이 설정
                .tabViewStyle(PageTabViewStyle())
                .onReceive(timer) { _ in
                    withAnimation {
                        currentIndex = (currentIndex + 1) % images.count // 자동 넘김
                    }
                }
                
                HStack {
                    Text("요즘 핫한 상품")
                        .font(.title2) // 글씨 크기를 키움
                        .bold() // 볼드 처리
                        .padding(.leading, 16) // 왼쪽에 약간의 패딩 추가
                    
                    Spacer() // 오른쪽에 공간을 추가하여 왼쪽 정렬 유지
                    
                    NavigationLink(destination: SearchMain()) {
                        Text("더보기 >")
                            .font(.custom("Arial", size: 15)) // 원하는 폰트 설정
                            .foregroundColor(.blue) // 텍스트 색상 설정 (원하는 색으로 변경 가능)
                            .padding(.trailing, 16) // 오른쪽에 약간의 패딩 추가
                    }
                }
                .padding(.vertical, 10) // HStack의 위아래 패딩 설정
                .background(Color.white) // 배경 색 설정


                
                
                ScrollView(.horizontal, showsIndicators: false) {
                    LazyHGrid(rows: rows, spacing: 20) {
                        ForEach(items, id: \.0) { item in
                            VStack(spacing: 10) { // 각 아이템을 VStack으로 감쌈
                                Image(item.0) // 이미지 이름
                                    .resizable()
                                    .scaledToFit()
                                    .frame(width: 150, height: 150) // 이미지 크기 조정
                                    .cornerRadius(10)
                                    .clipped()

                                Text(item.1) // 첫 번째 줄 텍스트 (아이템 이름)
                                    .font(.headline)
                                    .lineLimit(1) // 한 줄로 제한

                                Text(item.2) // 두 번째 줄 텍스트 (설명)
                                    .font(.subheadline)
                                    .foregroundColor(.gray)
                                    .lineLimit(2) // 두 줄로 제한
                                    .multilineTextAlignment(.center)
                            }
                            .frame(width: 180, height: 180) // 아이템 전체 크기 고정
                            .padding()
                            .background(Color.white) // 배경색
                            .cornerRadius(10) // 모서리 둥글게
                            .shadow(radius: 5) // 그림자 효과

                        }
                    }
                    .padding(.horizontal, 16) // 좌우 패딩 추가
                }
                .padding(.top, 10)
                .padding(.bottom, 20)
                
                
                
                // Footer 추가
                footer() // FooterView를 여기 추가
                    .padding(.top, 20)
                
                
                
                //
            }
            .padding(.bottom, 10) // 전체 VStack의 아래쪽 패딩 설정
        }
    }
    
    @ViewBuilder
    func destinationView(for index: Int) -> some View {
        switch index {
        case 0:
            mainHome()
        case 1:
            SearchMain()
        case 2:
            category()
        default:
            Text("No View")
        }
    }
}

#Preview {
    homemain()
}
