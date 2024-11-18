//
//  Basic.swift
//  iosApp
//
//  Created by Jihyun Park on 2024/11/11.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

/// サンプル Text
struct SampleText: View {
    var body: some View {
        Text("Text")
    }
}

/// サンプル Text Preview
#Preview {
    SampleText()
}

/// サンプル TextField
struct SampleTextField: View {
    @State private var user: String = ""
    
    var body: some View {
        TextField("User", text: $user)
    }
}

/// サンプル TextField Preview
#Preview {
    SampleTextField()
}

/// サンプル Image
struct SampleImage: View {
    var body: some View {
        Image("icon/compose_multiplatform")
    }
}

/// サンプル Image Preview
#Preview {
    SampleImage()
}

/// サンプル Icon
struct SampleIcon: View {
    var body: some View {
        Image(systemName: "arrow.backward")
    }
}

/// サンプル Icon Preview
#Preview {
    SampleIcon()
}

/// サンプル Button
struct SampleButton: View {
    var body: some View {
        Button {} label: {
            Text("Button")
        }
    }
}

/// サンプル Button Preview
#Preview {
    SampleButton()
}

/// サンプル Canvas
struct SampleCanvas: View {
    var body: some View {
        Circle()
            .fill(Color.green)
    }
}

/// サンプル Canvas Preview
#Preview {
    SampleCanvas()
}
