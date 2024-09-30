//import SwiftUI
//
//import SwiftUI
//
//struct BottomBar: View {
//    @State private var selectedTab = 0
//
//    var body: some View {
//        TabView(selection: $selectedTab) {
//            mainHome()
//                .tabItem {
//                    Image(systemName: "house")
//                    Text("Home")
//                }
//                .tag(0)
//
//            SearchMain()
//                .tabItem {
//                    Image(systemName: "magnifyingglass")
//                    Text("Search")
//                }
//                .tag(1)
//
//            chatmain()
//                .tabItem {
//                    Image(systemName: "bubble.left.and.bubble.right")
//                    Text("Chat")
//                }
//                .tag(2)
//
//            mypage()
//                .tabItem {
//                    Image(systemName: "person")
//                    Text("My Page")
//                }
//                .tag(3)
//        }
//        .accentColor(.blue) // Customize color if needed
//    }
//}
//
//
//#Preview {
//    BottomBar()
//}
