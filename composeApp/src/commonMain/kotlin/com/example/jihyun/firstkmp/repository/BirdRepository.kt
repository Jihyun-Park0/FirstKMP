package com.example.jihyun.firstkmp.repository

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.serialization.Serializable

class BirdRepository(private val httpClient: HttpClient) {

    suspend fun getImages(): List<BirdImage> =
        httpClient
            .get("https://sebi.io/demo-image-api/pictures.json")
            .body<List<BirdImage>>()

    fun close() {
        httpClient.close()
    }
}

@Serializable
data class BirdImage(
    val category: String,
    val path: String,
    val author: String,
)
