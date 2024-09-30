//
//  cart.swift
//  capsapp
//
//  Created by 임채주 on 9/11/24.
//

import SwiftUI

struct cart: View {
    var body: some View {
        VStack {
            Text("장바구니 페이지")
                .font(.largeTitle)
                .padding()
            // 장바구니 페이지의 내용을 추가하세요
        }
    }
}

struct Cart_Previews: PreviewProvider {
    static var previews: some View {
        cart()
    }
}

#Preview {
    cart()
}
