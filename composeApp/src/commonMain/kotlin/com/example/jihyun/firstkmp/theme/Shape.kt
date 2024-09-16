package com.example.jihyun.firstkmp.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

/** 形状 */
val Shapes = Shapes()

/**
 * 形状 Preview
 */
@Preview
@Composable
private fun ShapesPreview() {
    FirstKMPTheme {
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(4.dp)
        ) {
            Button(
                onClick = {},
                shape = MaterialTheme.shapes.extraLarge
            ) {
                Text(text = "extraLarge")
            }

            Button(
                onClick = {},
                shape = MaterialTheme.shapes.large
            ) {
                Text(text = "large")
            }

            Button(
                onClick = {},
                shape = MaterialTheme.shapes.medium
            ) {
                Text(text = "medium")
            }

            Button(
                onClick = {},
                shape = MaterialTheme.shapes.small
            ) {
                Text(text = "small")
            }

            Button(
                onClick = {},
                shape = MaterialTheme.shapes.extraSmall
            ) {
                Text(text = "extraSmall")
            }
        }
    }
}
