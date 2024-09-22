package com.example.jihyun.firstkmp.screen

import androidx.compose.foundation.Image
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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import firstkmp.composeapp.generated.resources.Res
import firstkmp.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

/**
 * 詳細画面
 *
 * @param modifier 装飾
 * @param navController 画面操作
 * @param id 識別子
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    id: Int = 1
) {
    Scaffold(
        topBar = {
            // ヘッダー
            CenterAlignedTopAppBar(
                navigationIcon = {
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
                    Image(
                        painter = painterResource(Res.drawable.compose_multiplatform),
                        contentDescription = "item $id",
                        modifier = Modifier
                            .fillMaxSize()
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
                    DetailListItem(title = "ID", description = id.toString())
                    HorizontalDivider()
                    DetailListItem(title = "title1", description = "description1")
                    HorizontalDivider()
                    DetailListItem(title = "title2", description = "description2")
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
