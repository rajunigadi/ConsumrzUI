package dev.raju.consumrz.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.theme.ConsumrzUITheme

@Composable
fun ConsumrzIconCard(
    icon: Painter = painterResource(id = R.drawable.ic_new_logo),
    cardBgColor: Color = Color.White
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = cardBgColor),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Image(
            painter = icon,
            contentDescription = "",
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