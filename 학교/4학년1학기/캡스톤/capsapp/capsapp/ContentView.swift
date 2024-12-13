//
//  ContentView.swift
//  capsapp
//
//  Created by 임채주 on 9/11/24.
//

import SwiftUI

struct ContentView: View {
    @State private var selectedTab = 0
    var body: some View {
        TabView(selection: $selectedTab) {
            homemain()
                .tabItem {
                    Image(systemName: "house")
                    Text("Home")
                }
                .tag(0)
            
            category()
                .tabItem {
                    Image(systemName: "line.3.horizontal")
                    Text("Category")
                }
                .tag(1)

            SearchMain()
                .tabItem {
                    Image(systemName: "magnifyingglass")
                    Text("Search")
                }
                .tag(2)


            mypage()
                .tabItem {
                    Image(systemName: "person")
                    Text("My Page")
                }
                .tag(3)
        }
        .accentColor(.blue) // Customize color if needed
    }
}


#Preview {
    ContentView()
}
