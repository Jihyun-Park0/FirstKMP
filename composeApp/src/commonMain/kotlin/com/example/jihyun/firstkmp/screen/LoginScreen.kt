package com.example.jihyun.firstkmp.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jihyun.firstkmp.loadString
import com.example.jihyun.firstkmp.router.ListRoute
import com.example.jihyun.firstkmp.saveString
import firstkmp.composeapp.generated.resources.Res
import firstkmp.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * ログイン画面
 *
 * @param modifier 装飾
 * @param navController 画面操作
 */
@Preview
@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    var restore by remember { mutableStateOf(false) }

    var user by remember { mutableStateOf(loadString("user")) }
    var password by remember { mutableStateOf(loadString("password")) }

    Surface(
        modifier = modifier
            .fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(16.dp)
                .wrapContentHeight()
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
            ) {
                // TODO ③: Res.drawable.compose_multiplatform の画像追加（サイズは 40.dp）
                // 画像
                Image(
                    painter = painterResource(Res.drawable.compose_multiplatform),
                    contentDescription = "compose",
                    modifier = Modifier
                        .size(40.dp)
                )

                // タイトル
                Text(
                    text = "Login",
                    style = MaterialTheme.typography.headlineLarge
                )
            }


            // ユーザー
            OutlinedTextField(
                value = user,
                onValueChange = { user = it },
                label = { Text(text = "User") }
            )

            // パスワード
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "Password") },
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password,
                    imeAction = ImeAction.Done,
                ),
            )

            // ログイン情報保存用チェックボックス
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .defaultMinSize(
                        minWidth = 280.dp,
                        minHeight = 32.dp
                    )
                    .toggleable(
                        value = restore,
                        onValueChange = { restore = it },
                        role = Role.Checkbox
                    )
            ) {
                Checkbox(
                    checked = restore,
                    onCheckedChange = null
                )

                Text(
                    text = "Remember Me",
                    style = MaterialTheme.typography.bodyLarge,
                )
            }

            // ログインボタン
            Button(
                shape = MaterialTheme.shapes.extraSmall,
                onClick = {
                    if (user == "abcd" && password == "1234") {
                        if (restore) {
                            saveString("user", user)
                            saveString("password", password)
                        } else {
                            saveString("user", "")
                            saveString("password", "")
                        }
                        // TODO ①: 一覧画面に移動
                        navController.navigate(ListRoute)
                    }
                },
                modifier = Modifier
                    .defaultMinSize(
                        minWidth = 280.dp,
                        minHeight = 56.dp
                    )
            ) {
                Text(text = "Login")
            }
        }
    }
}
