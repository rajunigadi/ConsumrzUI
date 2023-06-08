package dev.raju.consumrz.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
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
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.data.LoyaltyItem
import dev.raju.consumrz.ui.data.loyaltyItems
import dev.raju.consumrz.ui.data.regularLoyaltyItem
import dev.raju.consumrz.ui.theme.CardBg
import dev.raju.consumrz.ui.theme.ConsumrzUITheme

@Composable
fun LoyaltyComponent() {
    Card(
        colors = CardDefaults.cardColors(containerColor = CardBg),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Column {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Loyalty Programs",
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(vertical = 8.dp),
                    style = MaterialTheme.typography.titleLarge
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_question),
                    contentDescription = ""
                )
            }

            LazyRow {
                items(loyaltyItems) {
                    LoyaltyCard(
                        loyaltyItem = it,
                    )
                }
            }
        }
    }
}

@Composable
fun LoyaltyCard(
    loyaltyItem: LoyaltyItem,
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = loyaltyItem.cardBg),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
        modifier = Modifier
            .padding(end = 16.dp)
            .wrapContentSize()
    ) {
        Column(
            Modifier
                .wrapContentSize()
                .padding(8.dp)
        ) {
            Text(
                text = loyaltyItem.type,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .wrapContentSize()
                    .padding(vertical = 8.dp, horizontal = 4.dp),
                style = MaterialTheme.typography.titleLarge,
                color = loyaltyItem.typeColor
            )
            Row(
                modifier = Modifier
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                loyaltyItem.benefits.forEach { benefit ->
                    Column(
                        modifier = Modifier
                            .padding(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = benefit.image),
                            contentDescription = "",
                            modifier = Modifier
                                .padding(horizontal = 4.dp),
                        )

                        Text(
                            text = benefit.text,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(vertical = 8.dp),
                            style = MaterialTheme.typography.labelMedium,
                            color = loyaltyItem.typeColor
                        )
                    }
                }
            }

            Text(
                text = loyaltyItem.subTitle,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 4.dp)
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
                style = MaterialTheme.typography.labelMedium,
                color = loyaltyItem.typeColor
            )

            Text(
                text = loyaltyItem.title,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 8.dp)
                    .align(Alignment.CenterHorizontally)
                    .wrapContentSize(),
                style = MaterialTheme.typography.titleLarge,
                color = loyaltyItem.typeColor
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .wrapContentSize()
            ) {
                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(2.dp),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                ) {
                    Text(
                        text = "Join",
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(8.dp)
                            .align(Alignment.CenterHorizontally)
                            .wrapContentSize(),
                        style = MaterialTheme.typography.labelMedium
                    )
                }

                Card(
                    colors = CardDefaults.cardColors(containerColor = Color.White),
                    elevation = CardDefaults.cardElevation(2.dp),
                    shape = RoundedCornerShape(8.dp),
                    modifier = Modifier
                        .padding(end = 8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = "",
                        modifier = Modifier.padding(4.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoyaltyCardPreview() {
    ConsumrzUITheme {
        LoyaltyComponent()
    }
}