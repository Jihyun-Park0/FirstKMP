//
//  Layout.swift
//  iosApp
//
//  Created by Jihyun Park on 2024/11/11.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

/// サンプル VStack
struct SampleVStack: View {
    var body: some View {
        VStack {
            Text("Text")
            Text("Text")
        }
    }
}

/// サンプル VStack Preview
#Preview {
    SampleVStack()
}

/// サンプル HStack
struct SampleHStack: View {
    var body: some View {
        HStack {
            Text("Text")
            Text("Text")
        }
    }
}
/// サンプル HStack Preview
#Preview {
    SampleHStack()
}

/// サンプル ZStack
struct SampleZStack: View {
    var body: some View {
        ZStack {
            Text("Text")
            Text("Text")
        }
    }
}

/// サンプル ZStack Preview
#Preview {
    SampleZStack()
}

/// サンプル ScrollView（Vertical）
struct SampleScrollViewVertical: View {
    var body: some View {
        ScrollView(.vertical) {
            VStack {
                Text("Start")
                
                ForEach(1..<50) { num in
                    Text("\(num) Text")
                }
                
                Text("End")
            }
        }
    }
}

/// サンプル ScrollView（Vertical） Preview
#Preview {
    SampleScrollViewVertical()
}

/// サンプル ScrollView（Horizontal）
struct SampleScrollViewHorizontal: View {
    var body: some View {
        ScrollView(.horizontal) {
            HStack {
                Text("Start")
                
                ForEach(0..<50) { num in
                    Text("\(num) Text")
                }
                
                Text("End")
            }
        }
    }
}

/// サンプル ScrollView（Horizontal） Preview
#Preview {
    SampleScrollViewHorizontal()
}

/// サンプル LazyVGrid
struct SampleLazyVGrid: View {
    var body: some View {
        ScrollView {
            LazyVGrid(
                columns: [GridItem(), GridItem()]
            ) {
                Text("Start")
                
                ForEach(0..<50) { num in
                    Text("\(num) Text")
                }
                
                Text("End")
            }
        }
    }
}

/// サンプル LazyVGrid Preview
#Preview {
    SampleLazyVGrid()
}

/// サンプル LazyHGrid
struct SampleLazyHGrid: View {
    var body: some View {
        ScrollView {
            LazyHGrid(
                rows: [GridItem(), GridItem()]
            ) {
                Text("Start")
                
                ForEach(0..<50) { num in
                    Text("\(num) Text")
                }
                
                Text("End")
            }
        }
    }
}

/// サンプル LazyHGrid Preview
#Preview {
    SampleLazyHGrid()
}

