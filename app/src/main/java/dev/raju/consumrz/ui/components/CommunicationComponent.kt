package dev.raju.consumrz.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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
import dev.raju.consumrz.ui.data.CommunicationData
import dev.raju.consumrz.ui.data.communications
import dev.raju.consumrz.ui.theme.CardBg
import dev.raju.consumrz.ui.theme.ConsumrzUITheme

@Composable
fun CommunicationComponent(
    communications: List<CommunicationData>
) {
    LazyRow {
        items(communications) { data ->
            CommunicationCard(data = data)
        }
    }
}

@Composable
fun CommunicationCard(
    data: CommunicationData
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = CardBg),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(vertical = 16.dp)
            .clickable {

            }
    ) {
        Row(
            Modifier
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            data.imageResources.forEach { iconRes ->
                Image(
                    painter = painterResource(id = iconRes),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(horizontal = 4.dp),
                )
            }
            data.texts.forEach { text ->
                Text(
                    text = text,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(horizontal = 8.dp),
                    style = MaterialTheme.typography.labelLarge
                )
            }
            data.arrowIcon?.let { imageVector ->
                Icon(
                    imageVector = imageVector,
                    contentDescription = "",
                    tint = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContactCardPreview() {
    ConsumrzUITheme {
        CommunicationComponent(communications)
    }
}