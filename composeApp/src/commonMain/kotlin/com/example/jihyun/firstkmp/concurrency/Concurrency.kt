package com.example.jihyun.firstkmp.concurrency

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.example.jihyun.firstkmp.repository.BirdImage
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.get
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.launch


val httpClient = HttpClient {
    install(ContentNegotiation) {
        json()
    }
}

suspend fun fetchData(): List<BirdImage> =
    httpClient
        .get("https://sebi.io/demo-image-api/pictures.json")
        .body<List<BirdImage>>()


@Composable
fun ImageApiFetcher() {
    var data by remember { mutableStateOf<List<BirdImage>>(emptyList()) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        scope.launch {
            data = fetchData()
        }
    }

    LazyColumn {
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Category",
                    modifier = Modifier
                        .weight(1f)
                )
                Text(
                    text = "Image",
                    modifier = Modifier
                        .weight(1f)
                )
                Text(
                    text = "Author",
                    modifier = Modifier
                        .weight(1f)
                )
            }
        }

        items(data) { item ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = item.category,
                    modifier = Modifier
                        .weight(1f)
                )

                AsyncImage(
                    model = "https://sebi.io/demo-image-api/${item.path}",
                    contentDescription = "Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .size(150.dp)
                )

                Text(
                    text = item.author,
                    modifier = Modifier
                        .weight(1f)
                )
            }
        }
    }
}
