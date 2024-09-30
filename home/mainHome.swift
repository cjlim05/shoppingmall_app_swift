import SwiftUI

struct mainHome: View {
    var body: some View {
        VStack(spacing: 40) { // 스택 간의 간격 조정
            HStack {
                Image(systemName: "rectangle.fill") // 로고 이미지를 여기에 추가하세요.
                    .resizable()
                    .aspectRatio(contentMode: .fit)
                    .frame(width: 40, height: 40) // 이미지 크기 조정
                    .padding() // 이미지 주변에 패딩 추가
                
                Spacer() // 이미지를 왼쪽으로 정렬
            }
            

            VStack(spacing: 20) { // VStack 내부의 간격 조정
                VStack {
                    Text("XXX님에게")
                        .font(.title)
                        .padding(.bottom, 10) // 텍스트 아래쪽 패딩 조정
                    Text("알맞는 일자리를 찾아보세요!")
                        .font(.title)
                        .padding(.bottom, 20)
                    
                    Button(action: {
                        // 버튼 클릭 시 동작을 추가하세요.
                    }) {
                        Text("버튼")
                            .fontWeight(.bold)
                            .frame(maxWidth: .infinity)
                            .padding()
                            .background(Color.blue)
                            .foregroundColor(.white)
                            .cornerRadius(10)
                    }
                    .padding(.top, 10) // 텍스트와 버튼 사이의 패딩 조정
                }
                .padding() // 배경 상자 내부의 패딩
                .background(Color.white) // 배경 상자의 배경색
                .cornerRadius(10) // 배경 상자의 둥근 모서리
                .shadow(radius: 5) // 배경 상자에 그림자 추가
                .padding(.horizontal, 20) // 배경 상자 주변의 수평 패딩
            }

            VStack(alignment: .leading, spacing: 15) { // 항목 간의 간격 조정
                Text("가정 방문전 확인해야할 사항")
                    .font(.title2) // 제목의 글꼴 크기 조정
                
                VStack(alignment: .leading, spacing: 10) { // 각 항목 간의 간격 조정
                    HStack {
                        // 이미지
                        Image(systemName: "star") // "star"를 실제 이미지 이름이나 자산으로 교체
                            .resizable()
                            .frame(width: 40, height: 40) // 이미지 크기 조정
                        VStack(alignment: .leading) {
                            // 제목
                            Text("Title Here")
                                .font(.headline) // 제목의 글꼴 조정
                                .padding(.bottom, 2) // 제목과 내용 사이의 공간
                            // 내용
                            Text("Content goes here. This is the detail or description.")
                                .font(.body) // 내용의 글꼴 조정
                        }
                    }
                    
                    HStack {
                        // 이미지
                        Image(systemName: "star") // "star"를 실제 이미지 이름이나 자산으로 교체
                            .resizable()
                            .frame(width: 40, height: 40) // 이미지 크기 조정
                        VStack(alignment: .leading) {
                            // 제목
                            Text("Title Here")
                                .font(.headline) // 제목의 글꼴 조정
                                .padding(.bottom, 2) // 제목과 내용 사이의 공간
                            // 내용
                            Text("Content goes here. This is the detail or description.")
                                .font(.body) // 내용의 글꼴 조정
                        }
                    }
                }
                .padding(.horizontal) // 리스트 주변의 패딩 (선택 사항)
            }
            
            Spacer() // 화면의 상단으로 콘텐츠를 밀어내기
        }
        .padding() // 전체적인 패딩 추가 (선택 사항)
        
 
    }
}

#Preview {
    mainHome()
}
