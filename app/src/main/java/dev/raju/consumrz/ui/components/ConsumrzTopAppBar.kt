package dev.raju.consumrz.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.theme.ConsumrzUITheme
import dev.raju.consumrz.ui.theme.Purple40

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConsumrzTopAppBar(
    text: String = stringResource(id = R.string.app_name),
    onNavigationIconClick: () -> Unit
) {
    TopAppBar(
        title = {
            Box(
                modifier = Modifier.fillMaxWidth(),
            ) {
                Text(
                    text = text,
                    modifier = Modifier
                        .align(Alignment.Center),
                    textAlign = TextAlign.Center,
                    color = Purple40
                )
            }
        },
        navigationIcon = {
            IconButton(onClick = {
                onNavigationIconClick.invoke()
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_discounts),
                    contentDescription = stringResource(id = R.string.app_name),
                    tint = Purple40
                )
            }
        },
        actions = {
            ConsumrzActionIconButton(
                onClick = {
                    // do thing as of now
                }
            )
        },
    )
}

@Preview(showBackground = true)
@Composable
fun ConsumrzTopAppBarPreview() {
    ConsumrzUITheme {
        ConsumrzTopAppBar(onNavigationIconClick = {

        })
    }
}