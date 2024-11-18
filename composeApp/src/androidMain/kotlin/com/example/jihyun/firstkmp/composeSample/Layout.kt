package com.example.jihyun.firstkmp.composeSample

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/**
 * サンプル Column
 */
@Composable
fun SampleColumn() {
    Column {
        Text("Text")
        Text("Text")
    }
}

/**
 * サンプル Column Preview
 */
@Preview
@Composable
fun SampleColumn_Preview() {
    SampleColumn()
}

/**
 * サンプル Row
 */
@Composable
fun SampleRow() {
    Row {
        Text("Text")
        Text("Text")
    }
}

/**
 * サンプル Row Preview
 */
@Preview
@Composable
fun SampleRow_Preview() {
    SampleRow()
}

/**
 * サンプル Box
 */
@Composable
fun SampleBox() {
    Box {
        Text("Text")
        Text("Text")
    }
}

/**
 * サンプル Box Preview
 */
@Preview
@Composable
fun SampleBox_Preview() {
    SampleBox()
}

/**
 * サンプル LazyColumn
 */
@Composable
fun SampleLazyColumn() {
    LazyColumn {
        item { Text("Start") }

        items(50) { num ->
            Text("$num Text")
        }

        item { Text("End") }
    }
}

/**
 * サンプル LazyColumn Preview
 */
@Preview
@Composable
fun SampleLazyColumn_Preview() {
    SampleLazyColumn()
}

/**
 * サンプル LazyRow
 */
@Composable
fun SampleLazyRow() {
    LazyRow {
        item { Text("Start") }

        items(50) { num ->
            Text("$num Text")
        }

        item { Text("End") }
    }
}

/**
 * サンプル LazyRow Preview
 */
@Preview
@Composable
fun SampleLazyRow_Preview() {
    SampleLazyRow()
}

/**
 * サンプル LazyVerticalGrid
 */
@Composable
fun SampleLazyVerticalGrid() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        item { Text("Start") }

        items(50) { num ->
            Text("$num Text")
        }

        item { Text("End") }
    }
}

/**
 * サンプル LazyVerticalGrid Preview
 */
@Preview
@Composable
fun SampleLazyVerticalGrid_Preview() {
    SampleLazyVerticalGrid()
}

/**
 * サンプル LazyHorizontalGrid
 */
@Composable
fun SampleLazyHorizontalGrid() {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(2)
    ) {
        item { Text("Start") }

        items(50) { num ->
            Text("$num Text")
        }

        item { Text("End") }
    }
}

/**
 * サンプル LazyHorizontalGrid Preview
 */
@Preview
@Composable
fun SampleLazyHorizontalGrid_Preview() {
    SampleLazyHorizontalGrid()
}
