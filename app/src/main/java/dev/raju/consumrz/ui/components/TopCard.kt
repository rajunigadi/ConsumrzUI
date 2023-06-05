package dev.raju.consumrz.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.theme.ColorBg
import dev.raju.consumrz.ui.theme.ConsumrzUITheme

/**
 * Created by Rajashekhar Vanahalli on 05 June, 2023
 */
@Composable
fun TopCard() {
    Card(
        colors = CardDefaults.cardColors(containerColor = ColorBg),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ConsumrzIconCard(
                    cardBgColor = Color.White
                )
            }

            Column(
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    text = "Valentine's Flower Shop",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(vertical = 8.dp),
                    style = MaterialTheme.typography.titleLarge
                )

                ConsumrzSimpleCard(
                    text = "Join & Get 10/",
                    styledText = "25",
                    icon = painterResource(id = R.drawable.ic_star),
                    cardBgColor = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    ConsumrzUITheme {
        TopCard()
    }
}