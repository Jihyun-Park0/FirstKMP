package com.example.jihyun.firstkmp.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * カスタムテーマ
 *
 * @param darkTheme タークモード判定
 * @param dynamicColor ダイナミックカラー（Android 12+）
 * @param content コンテンツ
 */
@Composable
fun FirstKMPTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // TODO: Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor -> lightColorScheme
        darkTheme -> darkColorScheme
        else -> lightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = Shapes,
        typography = Typography,
        content = content
    )
}

/**
 * テーマ Preview
 */
@Preview
@Composable
private fun ThemePreview() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        FirstKMPTheme(darkTheme = false) {
            ThemeSample(
                modifier = Modifier
                    .weight(1f)
            )
        }

        FirstKMPTheme(darkTheme = true) {
            ThemeSample(
                modifier = Modifier
                    .weight(1f)
            )
        }
    }
}

/**
 * テーマ確認用ダミーコンテンツ
 */
@Composable
private fun ThemeSample(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(30.dp)
        ) {
            Button(onClick = {}) {
                Text(
                    text = "Button",
                    fontSize = 20.sp
                )
            }

            FloatingActionButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = null
                )
            }

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = MaterialTheme.colorScheme.background,
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
            ) {
                Text(
                    text = "Text on background",
                    fontSize = 30.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )
            }

            Text(
                text = "Text on Surface",
                fontSize = 30.sp
            )

            Text(
                text = "Text on SurfaceVariant",
                color = MaterialTheme.colorScheme.onSurfaceVariant,
                fontSize = 30.sp
            )

            Text(
                text = "Error Color Text",
                fontSize = 30.sp,
                color = MaterialTheme.colorScheme.error
            )
        }
    }
}
