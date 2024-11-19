//
//  ImageApiFetcher.swift
//  iosApp
//
//  Created by Jihyun Park on 2024/11/19.
//  Copyright © 2024 orgName. All rights reserved.
//

import SwiftUI

struct BirdImage: Hashable, Decodable {
    let category: String
    let path: String
    let author: String
}

func fetchData() async throws -> [BirdImage] {
    guard let url = URL(string: "https://sebi.io/demo-image-api/pictures.json") else {return []}
    
    let (data, response) = try await URLSession.shared.data(from: url)
    
    guard let httpResponse = response as? HTTPURLResponse,
          httpResponse.statusCode == 200 else {return []}
    
    do {
        let decodedData = try JSONDecoder().decode([BirdImage].self, from: data)
        return decodedData
    } catch {
        return []
    }
}

struct ImageApiFetcher: View {
    @State var data: [BirdImage] = []
    
    var body: some View {
        List {
            Section(
                header:
                    HStack {
                        Text("Category").frame(maxWidth: .infinity, alignment: .leading)
                        Text("Image").frame(maxWidth: .infinity, alignment: .leading)
                        Text("Author").frame(maxWidth: .infinity, alignment: .leading)
                    }
            ) {
                ForEach(data, id: \.self) { item in
                    HStack {
                        Text(item.category)
                            .frame(maxWidth: .infinity, alignment: .leading)
                        
                        AsyncImage(
                            url: URL(string: "https://sebi.io/demo-image-api/\(item.path)")
                        ) { image in
                            image.resizable()
                                .aspectRatio(1,contentMode: .fit)
                        } placeholder: {
                            ProgressView()
                        }
                        .frame(width: 150, height: 150)
                        
                        Text(item.author)
                            .frame(maxWidth: .infinity, alignment: .leading)
                    }
                }
            }
        }
        .onAppear {
            Task.detached {
                data = try await fetchData()
            }
        }
    }
}

#Preview {
    ImageApiFetcher()
}
