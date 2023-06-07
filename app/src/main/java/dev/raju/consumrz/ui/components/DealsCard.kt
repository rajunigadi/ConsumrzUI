package dev.raju.consumrz.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.screen.MainScreen
import dev.raju.consumrz.ui.theme.ConsumrzUITheme

@Composable
fun DealsCard() {
    val deals = mutableListOf<DealsItem>()
    deals.add(DealsItem(imageResource = R.drawable.ic_members, text = "Members"))
    deals.add(DealsItem(imageResource = R.drawable.ic_ratings, text = "Deals Rating"))
    deals.add(DealsItem(imageResource = R.drawable.ic_buy_get, text = "Buy & Get"))
    deals.add(DealsItem(imageResource = R.drawable.ic_gifts, text = "Gifts"))
    deals.add(DealsItem(imageResource = R.drawable.ic_discounts, text = "Discounts"))
    deals.add(DealsItem(imageResource = R.drawable.ic_sales, text = "Sales"))

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
        DealsCard()
    }
}


data class DealsItem(val imageResource: Int, val text: String)