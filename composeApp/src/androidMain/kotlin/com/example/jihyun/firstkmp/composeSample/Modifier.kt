package com.example.jihyun.firstkmp.composeSample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * サンプル Background
 */
@Composable
fun SampleBackground() {
    Text(
        text = "Text",
        modifier = Modifier
            .background(color = Color.Green)
    )
}

/**
 * サンプル Background Preview
 */
@Preview
@Composable
fun SampleBackground_Preview() {
    SampleBackground()
}

/**
 * サンプル Size
 */
@Composable
fun SampleSize() {
    Text(
        text = "Text",
        modifier = Modifier
            .size(100.dp)
            .background(color = Color.Green)
    )
}

/**
 * サンプル Size Preview
 */
@Preview
@Composable
fun SampleSize_Preview() {
    SampleSize()
}

/**
 * サンプル Padding
 */
@Composable
fun SamplePadding() {
    Text(
        text = "Text",
        modifier = Modifier
            .background(color = Color.Red)
            .padding(16.dp)
            .background(color = Color.Green)
    )
}

/**
 * サンプル Padding Preview
 */
@Preview
@Composable
fun SamplePadding_Preview() {
    SamplePadding()
}

/**
 * サンプル AspectRatio
 */
@Composable
fun SampleAspectRatio() {
    Text(
        text = "Text",
        modifier = Modifier
            .aspectRatio(1f)
            .background(color = Color.Green)
    )
}

/**
 * サンプル AspectRatio Preview
 */
@Preview
@Composable
fun SampleAspectRatio_Preview() {
    SampleAspectRatio()
}

/**
 * サンプル CornerRadius
 */
@Composable
fun SampleCornerRadius() {
    Text(
        text = "Text",
        modifier = Modifier
            .background(color = Color.Red)
            .clip(RoundedCornerShape(16.dp))
            .background(color = Color.Green)
    )
}

/**
 * サンプル CornerRadius Preview
 */
@Preview
@Composable
fun SampleCornerRadius_Preview() {
    SampleCornerRadius()
}
