package dev.raju.consumrz.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.theme.ColorBg
import dev.raju.consumrz.ui.theme.ConsumrzUITheme
import dev.raju.consumrz.ui.theme.Purple40

@Composable
fun ConsumrzIconCard(
    icon: Painter = painterResource(id = R.drawable.ic_consumrz),
    cardBgColor: Color = Color.Transparent
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = cardBgColor),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Icon(
            painter = icon,
            contentDescription = "",
            tint = Purple40,
            modifier = Modifier
                .padding(8.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ConsumrzIconCardPreview() {
    ConsumrzUITheme {
        ConsumrzIconCard(
            cardBgColor = Color.White
        )
    }
}