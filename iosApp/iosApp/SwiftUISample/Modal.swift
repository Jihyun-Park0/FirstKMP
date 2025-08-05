//
//  Modal.swift
//  iosApp
//
//  Created by Park Jihyun on 2025/08/05.
//  Copyright © 2025 orgName. All rights reserved.
//

import SwiftUI

/// サンプル Dialog
struct SampleDialog: View {
    @State private var showDialog = false
    
    var body: some View {
        VStack {
            Button("Button") {
                showDialog = true
            }
        }
        .frame(
            width: .infinity,
            height: .infinity,
        )
        .overlay {
            if showDialog {
                Text("Dialog")
                    .frame(width: 100, height: 100)
                    .background(Color.green)
            }
        }
    }
}

/// サンプル Dialog Preview
#Preview {
    SampleDialog()
}

/// サンプル AlertDialog
struct SampleAlertDialog: View {
    @State private var showDialog = false
    
    var body: some View {
        Button("Button") {
            showDialog = true
        }
        .alert("Alert Dialog", isPresented: $showDialog) {
            Button("OK") {}
            Button("Cancel", role: .cancel) {}
        } message: {
            Text("This is an alert dialog.")
        }
    }
}

/// サンプル AlertDialog Preview
#Preview {
    SampleAlertDialog()
}

/// サンプル BottomeSheet
struct SampleBottomeSheet: View {
    @State private var showSheet = false
    
    var body: some View {
        Button("Button") {
            showSheet = true
        }
        .sheet(isPresented: $showSheet){
            Text("Bottome Sheet")
                .frame(width: 100, height: 100)
                .background(Color.green)
        }
    }
}

/// サンプル BottomeSheet Preview
#Preview {
    SampleBottomeSheet()
}
