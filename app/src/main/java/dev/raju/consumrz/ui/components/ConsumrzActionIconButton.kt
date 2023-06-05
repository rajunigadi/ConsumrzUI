package dev.raju.consumrz.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.theme.Purple40

@Composable
fun ConsumrzActionIconButton(
    imageVector: ImageVector = Icons.Filled.Logout,
    contentDescription: String = stringResource(R.string.logout),
    onClick: () -> Unit
) {
    IconButton(
        onClick = {
            onClick.invoke()
        }
    ) {
        Icon(
            imageVector = imageVector,
            contentDescription = contentDescription,
            tint = Purple40
        )
    }
}