//
//  ListViewItem.swift
//  iosApp
//
//  Created by Daniel Llewellyn on 09/01/2021.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI

struct ListViewItem: View {
    
    var title : String
    var subtitle : String
    var imageUrl : String
    
    var body: some View {
        HStack(alignment: .center, spacing: nil) {
            VStack(alignment: .leading, spacing: nil) {
                Text(title)
                    .font(.title)
                Text(subtitle)
                    .font(.subheadline)
            }
            Spacer()
            Image(imageUrl)
                .resizable()
                .frame(width: 50, height: 50, alignment: .center)
        }
        .padding()
    }
}

struct ListViewItem_Previews: PreviewProvider {
    static var previews: some View {
        ListViewItem(title: "Test title", subtitle: "Test subtitle", imageUrl: "SampleImage")
    }
}
