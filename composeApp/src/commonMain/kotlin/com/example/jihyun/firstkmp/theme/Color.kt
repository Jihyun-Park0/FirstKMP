package com.example.jihyun.firstkmp.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

val Primary = Color(0xFF4F7BF4)
val Secondary = Color(0xFF8A90E7)
val Tertiary = Color(0xFFD2DEFF)
val Error = Color(0xFFFF3D3D)


/** ライトカラー */
val lightColorScheme = lightColorScheme(
    primary = Primary,
    primaryContainer = Tertiary,
    onPrimaryContainer = Color.White,
    background = Tertiary,
    error = Error,
)

/** ダークカラー */
val darkColorScheme = darkColorScheme(
    primary = Primary,
    onPrimary = Color.White,
    primaryContainer = Secondary,
    onPrimaryContainer = Color.White,
    background = Tertiary,
    error = Error,
)

/**
 * カラー Preview
 */
@Preview
@Composable
private fun ColorPreview() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        FirstKMPTheme(darkTheme = false) {
            ColorSample(
                modifier = Modifier
                    .weight(1f)
            )
        }

        FirstKMPTheme(darkTheme = true) {
            ColorSample(
                modifier = Modifier
                    .weight(1f)
            )
        }
    }
}

/**
 * カラー確認用ダミーコンテンツ
 */
@Composable
private fun ColorSample(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
    ) {
        // Primary
        Column(
            modifier = Modifier
                .padding(4.dp)
                .border(width = 1.dp, color = Color.Gray)
        ) {
            Text(
                text = "primary",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.primary)
            )
            Text(
                text = "onPrimary",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onPrimary)
            )
            Text(
                text = "primaryContainer",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.primaryContainer)
            )
            Text(
                text = "onPrimaryContainer",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onPrimaryContainer)
            )
            Text(
                text = "inversePrimary",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.inversePrimary)
            )
        }

        // Secondary
        Column(
            modifier = Modifier
                .padding(4.dp)
                .border(width = 1.dp, color = Color.Gray)
        ) {
            Text(
                text = "secondary",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondary)
            )
            Text(
                text = "onSecondary",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSecondary)
            )
            Text(
                text = "secondaryContainer",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.secondaryContainer)
            )
            Text(
                text = "onSecondaryContainer",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSecondaryContainer)
            )
        }

        // Tertiary
        Column(
            modifier = Modifier
                .padding(4.dp)
                .border(width = 1.dp, color = Color.Gray)
        ) {
            Text(
                text = "tertiary",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.tertiary)
            )
            Text(
                text = "onTertiary",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onTertiary)
            )
            Text(
                text = "tertiaryContainer",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.tertiaryContainer)
            )
            Text(
                text = "onTertiaryContainer",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onTertiaryContainer)
            )
        }

        // Background
        Column(
            modifier = Modifier
                .padding(4.dp)
                .border(width = 1.dp, color = Color.Gray)
        ) {
            Text(
                text = "background",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.background)
            )
            Text(
                text = "onBackground",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onBackground)
            )
        }

        // Surface
        Column(
            modifier = Modifier
                .padding(4.dp)
                .border(width = 1.dp, color = Color.Gray)
        ) {
            Text(
                text = "surface",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.surface)
            )
            Text(
                text = "onSurface",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSurface)
            )
            Text(
                text = "surfaceVariant",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.surfaceVariant)
            )
            Text(
                text = "onSurfaceVariant",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onSurfaceVariant)
            )
            Text(
                text = "inverseSurface",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.inverseSurface)
            )
            Text(
                text = "inverseOnSurface",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.inverseOnSurface)
            )
        }

        // Error
        Column(
            modifier = Modifier
                .padding(4.dp)
                .border(width = 1.dp, color = Color.Gray)
        ) {
            Text(
                text = "error",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.error)
            )
            Text(
                text = "onError",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onError)
            )
            Text(
                text = "errorContainer",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.errorContainer)
            )
            Text(
                text = "onErrorContainer",
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.onErrorContainer)
            )
        }
    }
}
