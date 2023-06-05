package dev.raju.consumrz.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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

@Composable
fun ContactDataCard() {
    val scrollState = rememberScrollState()
    Row(
        modifier = Modifier
            .horizontalScroll(scrollState)
    ) {
        ContactCard()
        DataCard(
            text = "Aviv, Israel +2 more",
            icon = R.drawable.ic_star
        )
        DataCard(
            text = "Sport +2 more",
            icon = R.drawable.ic_star
        )
    }
}

@Composable
fun ContactCard() {
    Card(
        colors = CardDefaults.cardColors(containerColor = ColorBg),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(vertical = 16.dp, horizontal = 4.dp)
            .clickable {
                // i am clicking
            }
    ) {
        Row(
            Modifier
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_star),
                contentDescription = "",
                modifier = Modifier
                    .padding(horizontal = 4.dp)
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_star),
                contentDescription = "",
                modifier = Modifier
                    .padding(horizontal = 4.dp)
            )
            Text(
                text = "Contacts",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 8.dp),
            )
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "",
                tint = Color.Black,
                modifier = Modifier
                    .padding(horizontal = 4.dp)
            )
        }
    }
}

@Composable
fun DataCard(
    text: String = "Aviv, Israel +2 more",
    icon: Int = R.drawable.ic_star
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = ColorBg),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(vertical = 16.dp, horizontal = 4.dp)
            .clickable {
                // i am clicking
            }
    ) {
        Row(
            Modifier
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = icon),
                contentDescription = "",
                modifier = Modifier
                    .padding(horizontal = 4.dp)
            )
            Text(
                text = text,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(vertical = 8.dp),
            )
            Icon(
                imageVector = Icons.Filled.ArrowForward,
                contentDescription = "",
                tint = Color.Black,
                modifier = Modifier
                    .padding(horizontal = 4.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContactCardPreview() {
    ConsumrzUITheme {
        ContactDataCard()
    }
}