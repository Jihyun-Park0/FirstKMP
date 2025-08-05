package com.example.jihyun.firstkmp.composeSample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

/**
 * サンプル Dialog
 */
@Composable
fun SampleDialog() {
    var showDialog by remember { mutableStateOf(false) }
    Button(
        onClick = { showDialog = true }
    ) {
        Text("Button")
    }
    if (showDialog) {
        Dialog(
            onDismissRequest = { showDialog = false },
        ) {
            Text(
                text = "Dialog",
                modifier = Modifier
                    .background(color = Color.Green)
                    .size(100.dp)
            )
        }
    }
}

/**
 * サンプル Dialog Preview
 */
@Preview
@Composable
fun SampleDialog_Preview() {
    SampleDialog()
}

/**
 * サンプル AlertDialog
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleAlertDialog() {
    var showDialog by remember { mutableStateOf(false) }
    Button(
        onClick = { showDialog = true }
    ) {
        Text("Button")
    }
    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = { Text("Alert Dialog") },
            text = { Text("This is an alert dialog.") },
            confirmButton = {
                Button(onClick = { showDialog = false }) {
                    Text("OK")
                }
            },
            dismissButton = {
                Button(onClick = { showDialog = false }) {
                    Text("Cancel")
                }
            }
        )
    }
}

/**
 * サンプル AlertDialog Preview
 */
@Preview
@Composable
fun SampleAlertDialog_Preview() {
    SampleAlertDialog()
}

/**
 * サンプル BottomSheet
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SampleBottomSheet() {
    var showSheet by remember { mutableStateOf(false) }
    val sheetState = rememberModalBottomSheetState()
    Button(onClick = { showSheet = true }) {
        Text("Button")
    }
    if (showSheet) {
        ModalBottomSheet(
            onDismissRequest = {
                showSheet = false
            },
            sheetState = sheetState
        ) {
            Text(
                text = "Bottom Sheet",
                modifier = Modifier
                    .background(color = Color.Green)
                    .size(100.dp)
            )
        }
    }
}

/**
 * サンプル BottomSheet Preview
 */
@Preview
@Composable
fun SampleBottomSheet_Preview() {
    SampleBottomSheet()
}
