package com.example.jihyun.firstkmp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jihyun.firstkmp.router.DetailRoute
import firstkmp.composeapp.generated.resources.Res
import firstkmp.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource

/**
 * 一覧画面
 *
 * @param modifier 装飾
 * @param navController 画面操作
 * @param list 一覧
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListScreen(
    modifier: Modifier = Modifier,
    navController: NavController,
    list: List<Int> = List(10) { it }
) {
    Scaffold(
        topBar = {
            // ヘッダー
            CenterAlignedTopAppBar(
                title = {
                    // タイトル
                    Text(
                        text = "List",
                        style = MaterialTheme.typography.displayMedium
                    )
                }
            )
        },
        modifier = modifier
    ) { paddingValues ->

        // ボディ
        LazyVerticalGrid(
            columns = GridCells.Adaptive(180.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(8.dp),
        ) {
            // アイテム
            items(list) {
                CardItem(
                    item = it,
                    onClick = { navController.navigate(DetailRoute(it)) }
                )
            }
        }

    }
}

/**
 * カードアイテム
 *
 * @param modifier 装飾
 * @param item アイテム
 * @param onClick クリック時の操作
 */
@Composable
fun CardItem(
    modifier: Modifier = Modifier,
    item: Int,
    onClick: () -> Unit = {}
) {
    OutlinedCard(
        onClick = onClick,
        colors = CardDefaults.outlinedCardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        modifier = modifier
            .aspectRatio(1f)
            .fillMaxWidth()
    ) {
        // 画像
        Image(
            painter = painterResource(Res.drawable.compose_multiplatform),
            contentDescription = "item $item",
            modifier = Modifier
        )
    }
}
