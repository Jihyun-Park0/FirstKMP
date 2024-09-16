package com.example.jihyun.firstkmp.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

/** タイポグラフィ */
val Typography = Typography()

/**
 * タイポグラフィ Preview
 */
@Preview
@Composable
private fun TypographyPreview() {
    FirstKMPTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(4.dp)
        ) {
            // Display
            Text(
                text = "displayLarge",
                style = MaterialTheme.typography.displayLarge,
            )
            Text(
                text = "displayMedium",
                style = MaterialTheme.typography.displayMedium,
            )
            Text(
                text = "displaySmall",
                style = MaterialTheme.typography.displaySmall,
            )

            // HeadLine
            Text(
                text = "headlineLarge",
                style = MaterialTheme.typography.headlineLarge,
            )
            Text(
                text = "headlineMedium",
                style = MaterialTheme.typography.headlineMedium,
            )
            Text(
                text = "headlineSmall",
                style = MaterialTheme.typography.headlineSmall,
            )

            // Title
            Text(
                text = "titleLarge",
                style = MaterialTheme.typography.titleLarge,
            )
            Text(
                text = "titleLarge",
                style = MaterialTheme.typography.titleMedium,
            )
            Text(
                text = "titleLarge",
                style = MaterialTheme.typography.titleSmall,
            )

            // Body
            Text(
                text = "bodyLarge",
                style = MaterialTheme.typography.bodyLarge,
            )
            Text(
                text = "bodyLarge",
                style = MaterialTheme.typography.bodyMedium,
            )
            Text(
                text = "bodyLarge",
                style = MaterialTheme.typography.bodySmall,
            )

            // Label
            Text(
                text = "labelLarge",
                style = MaterialTheme.typography.labelLarge,
            )
            Text(
                text = "labelMedium",
                style = MaterialTheme.typography.labelMedium,
            )
            Text(
                text = "labelSmall",
                style = MaterialTheme.typography.labelSmall,
            )
        }
    }
}
