package dev.raju.consumrz.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.raju.consumrz.ui.data.DealsComponentItem
import dev.raju.consumrz.ui.data.DealsItem
import dev.raju.consumrz.ui.data.deals
import dev.raju.consumrz.ui.data.dealsComponentItem
import dev.raju.consumrz.ui.theme.CardBg
import dev.raju.consumrz.ui.theme.ConsumrzUITheme
import dev.raju.consumrz.ui.theme.SecondaryTextColor

@Composable
fun DealsComponent(
    dealsComponentItem: DealsComponentItem
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = CardBg),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            dealsComponentItem.titles.forEach { title ->
                Text(
                    text = title,
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.labelMedium,
                    color = SecondaryTextColor
                )
            }
            /*Text(
                text = "Achievements",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.labelMedium,
                color = SecondaryTextColor
            )
            Text(
                text = "Available deals",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.labelMedium,
                color = SecondaryTextColor
            )*/
        }

        DealsCard(deals =  deals)
    }
}

@Composable
fun DealsCard(
    deals: List<DealsItem>
) {
    LazyRow {
        items(deals) { dealsItem ->
            DealsItem(dealsItem)
        }
    }
}

@Composable
fun DealsItem(dealsItem: DealsItem) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(8.dp)
            .clickable {

            }
    ) {
        Image(
            painter = painterResource(id = dealsItem.imageResource),
            contentDescription = "",
            modifier = Modifier
                .size(48.dp)
                .padding(horizontal = 4.dp)
        )
        Text(
            text = dealsItem.text,
            style = MaterialTheme.typography.labelMedium,
            modifier = Modifier
                .padding(vertical = 4.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DealsCardPreview() {
    ConsumrzUITheme {
        DealsComponent(dealsComponentItem = dealsComponentItem)
    }
}