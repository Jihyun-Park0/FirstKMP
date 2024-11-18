package com.example.jihyun.firstkmp.composeSample

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.jihyun.firstkmp.R

/**
 * サンプル Text
 */
@Composable
fun SampleText() {
    Text("Text")
}

/**
 * サンプル Text Preview
 */
@Preview
@Composable
fun SampleText_Preview() {
    SampleText()
}

/**
 * サンプル TextField
 */
@Composable
fun SampleTextField() {
    var user by remember { mutableStateOf("") }

    TextField(
        value = user,
        onValueChange = { user = it },
        label = { Text(text = "User") }
    )
}

/**
 * サンプル TextField Preview
 */
@Preview
@Composable
fun SampleTextField_Preview() {
    SampleTextField()
}

/**
 * サンプル Image
 */
@Composable
fun SampleImage() {
    Image(
        painter = painterResource(
            id = R.drawable.compose_multiplatform
        ),
        contentDescription = null
    )
}

/**
 * サンプル Image Preview
 */
@Preview
@Composable
fun SampleImage_Preview() {
    SampleImage()
}

/**
 * サンプル Icon
 */
@Composable
fun SampleIcon() {
    Icon(
        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
        contentDescription = "",
    )
}

/**
 * サンプル Icon Preview
 */
@Preview
@Composable
fun SampleIcon_Preview() {
    SampleIcon()
}

/**
 * サンプル Button
 */
@Composable
fun SampleButton() {
    Button(onClick = {}) {
        Text("Button")
    }
}

/**
 * サンプル Button Preview
 */
@Preview
@Composable
fun SampleButton_Preview() {
    SampleButton()
}

/**
 * サンプル Canvas
 */
@Composable
fun SampleCanvas() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(
            color = Color.Green,
        )
    }
}

/**
 * サンプル Canvas Preview
 */
@Preview
@Composable
fun SampleCanvas_Preview() {
    SampleCanvas()
}

