//
//  Modifier.swift
//  iosApp
//
//  Created by Jihyun Park on 2024/11/11.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

/// サンプル Background
struct SampleBackground: View {
    var body: some View {
        Text("Text")
            .background(Color.green)
    }
}

/// サンプル Background Preview
#Preview {
    SampleBackground()
}

/// サンプル Frame
struct SampleFrame: View {
    var body: some View {
        Text("Text")
            .frame(width: 100, height: 100)
            .background(Color.green)
    }
}

/// サンプル Frame Preview
#Preview {
    SampleFrame()
}

/// サンプル Padding
struct SamplePadding: View {
    var body: some View {
        Text("Text")
            .background(Color.green)
            .padding(16)
            .background(Color.red)
    }
}

/// サンプル Padding
#Preview {
    SamplePadding()
}

/// サンプル AspectRatio
struct SampleAspectRatio: View {
    var body: some View {
        Text("Text")
            .aspectRatio(1, contentMode: .fit)
            .background(Color.green)
    }
}

/// サンプル AspectRatio Preview
#Preview {
    SampleAspectRatio()
}

/// サンプル CornerRadius
struct SampleCornerRadius: View {
    var body: some View {
        Text("Text")
            .background(Color.green)
            .cornerRadius(16)
            .background(Color.red)
    }
}

/// サンプル CornerRadius Preview
#Preview {
    SampleCornerRadius()
}
