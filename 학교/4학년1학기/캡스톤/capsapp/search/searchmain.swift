//
//  SearchMain.swift
//  capsapp
//
//  Created by 임채주 on 9/11/24.
//

import SwiftUI

struct SearchMain: View {
    @State private var showDetailView = false
    @State private var showCart = false
    @State private var showJobdetail = false
    @State private var selectedOption = "추천순"
    var sortOptions = ["추천순", "거리순", "급여 높은순"]

    var body: some View {
        VStack {
            HStack {
                VStack(alignment: .leading) {
                    Text("일자리 둘러보기")
                        .font(.system(size: 24, weight: .bold))
                        .padding(.bottom, 2)
                    
                    Button(action: {
                        showDetailView.toggle()
                    }) {
                        HStack {
                            Text("위치: 상세 주소...")
                            Image(systemName: "chevron.right")
                        }
                        .foregroundColor(.blue)
                    }
                    .sheet(isPresented: $showDetailView) {
                        DetailView()
                    }
                }
                
                Spacer()
                
                Button(action: {
                    showCart.toggle()
                }) {
                    Image(systemName: "heart.fill")
                        .resizable()
                        .scaledToFit()
                        .frame(width: 24, height: 24)
                        .padding()
                        .background(Color.gray.opacity(0.2))
                        .clipShape(RoundedRectangle(cornerRadius: 8))
                }
                .buttonStyle(PlainButtonStyle())
                .sheet(isPresented: $showCart) {
                    cart() // This will now reference Cart.swift
                }
            }
            .padding()
            
            HStack {
                Spacer()
                
                // Dropdown menu
                Menu {
                    ForEach(sortOptions, id: \.self) { option in
                        Button(action: {
                            selectedOption = option
                        }) {
                            Text(option)
                        }
                    }
                } label: {
                    HStack {
                        Text(selectedOption)
                        Image(systemName: "chevron.down")
                            .font(.system(size: 16))
                    }
                    .padding()
                    .background(Color.gray.opacity(0.2))
                    .cornerRadius(8)
                }
            }
            .padding()
            
            VStack{
                VStack{
                    HStack{Text("업무 분야").frame(maxWidth: .infinity, alignment: .leading)  }
                    HStack{Text("일정").frame(maxWidth: .infinity, alignment: .leading) }
                    HStack{Text("급여").frame(maxWidth: .infinity, alignment: .leading) }
                    HStack{Text("위치").frame(maxWidth: .infinity, alignment: .leading) }
                    HStack{
                        Button(action: {
                            showCart.toggle()
                        }) {
                            Image(systemName: "heart.fill")
                                .resizable()
                                .scaledToFit()
                                .frame(width: 24, height: 24)
                                .padding()
                                .background(Color.gray.opacity(0.2))
                                .clipShape(RoundedRectangle(cornerRadius: 8))
                        }
                        .buttonStyle(PlainButtonStyle())
                        .sheet(isPresented: $showCart) {
                            cart() // This will now reference Cart.swift
                        }

                        Button(action: {
                            // Action for "자세히 보기" button
                            showJobdetail.toggle()
                        }) {
                            Text("자세히 보기")
                                .font(.headline)
                                .foregroundColor(.white)
                                .padding()
                                .frame(maxWidth: .infinity) // Make the button stretch horizontally
                                .background(Color.blue)
                                .cornerRadius(10)
                        }
                        .buttonStyle(PlainButtonStyle())
                        .sheet(isPresented: $showJobdetail) {
                            jobdetail() // This will now reference Cart.swift
                        }
                        .padding()
                    }
                }
                
                
            }
            .padding()
            .background(Color.gray.opacity(0.2))
            .cornerRadius(10)
            Spacer() // Add additional views or content here
        }
        .padding()
        
        
        
        

    }
}

struct DetailView: View {
    var body: some View {
        VStack {
            Text("주소 변경 화면")
        }
        .padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        SearchMain()
    }
}

#Preview {
    SearchMain()
}
