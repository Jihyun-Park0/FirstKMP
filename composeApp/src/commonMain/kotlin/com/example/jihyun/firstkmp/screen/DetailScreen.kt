package com.example.jihyun.firstkmp.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil3.compose.AsyncImage
import com.example.jihyun.firstkmp.repository.BirdImage

/**
 * 詳細画面
 *
 * @param modifier 装飾
 * @param navController 画面操作
 * @param birdImage 鳥の画像
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    birdImage: BirdImage = BirdImage("", "", "")
) {
    ComposableLifecycle { _, event ->
        println("event = $event")
    }
    Scaffold(
        topBar = {
            // ヘッダー
            CenterAlignedTopAppBar(
                navigationIcon = {
                    // TODO ①: 一覧画面に戻る
                    // 戻るボタン
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                        )
                    }
                },
                title = {
                    // タイトル
                    Text(
                        text = "Detail",
                        style = MaterialTheme.typography.displayMedium
                    )
                }
            )
        },
        modifier = modifier
    ) { paddingValues ->

        // ボディ
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .padding(paddingValues)
        ) {

            item {
                // 画像
                Card(
                    colors = CardDefaults.cardColors(
                        MaterialTheme.colorScheme.surface
                    ),
                    modifier = Modifier
                        .aspectRatio(1f)
                        .fillMaxWidth()
                ) {
                    AsyncImage(
                        model = "https://sebi.io/demo-image-api/${birdImage.path}",
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = modifier
                            .fillMaxWidth()
                    )
                }
            }

            item {
                // 詳細
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier
                        .background(
                            color = MaterialTheme.colorScheme.surface,
                            shape = MaterialTheme.shapes.small
                        )
                        .fillMaxWidth()
                        .padding(16.dp)
                ) {
                    DetailListItem(title = "Category", description = birdImage.category)
                    HorizontalDivider()
                    DetailListItem(title = "Path", description = birdImage.path)
                    HorizontalDivider()
                    DetailListItem(title = "Author", description = birdImage.author)
                }
            }
        }

    }
}

/**
 * 詳細画面一覧アイテム
 *
 * @param modifier 装飾
 * @param title タイトル
 * @param description 説明
 */
@Composable
fun DetailListItem(
    modifier: Modifier = Modifier,
    title: String,
    description: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
    ) {
        // タイトル
        Text(
            text = title,
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier
                .weight(0.3f)
        )

        // 説明
        Text(
            text = description,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .weight(0.7f)
        )
    }
}
