package dev.raju.consumrz.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.theme.CardBg
import dev.raju.consumrz.ui.theme.CoinGradient
import dev.raju.consumrz.ui.theme.ConsumrzUITheme
import dev.raju.consumrz.ui.theme.PrimaryTextColor

@Composable
fun ItemComponent() {
    Card(
        colors = CardDefaults.cardColors(containerColor = CardBg),
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

                JoinCard(
                    text = "Join & Get 10/",
                    styledText = "25",
                    icon = painterResource(id = R.drawable.ic_coin_frame),
                    cardBgColor = Color.White
                )
            }
        }
    }
}

@Composable
fun ConsumrzIconCard(
    icon: Painter = painterResource(id = R.drawable.image),
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
            modifier = Modifier
                .size(64.dp)
        )
    }
}

@Composable
fun JoinCard(
    text: String = stringResource(id = R.string.app_name),
    styledText: String? = stringResource(id = R.string.app_name),
    icon: Painter = painterResource(id = R.drawable.ic_coin_frame),
    cardBgColor: Color = Color.Transparent
) {
    Card(
        colors = CardDefaults.cardColors(containerColor = cardBgColor),
        elevation = CardDefaults.cardElevation(2.dp),
        shape = RoundedCornerShape(8.dp),
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            TextButton(
                onClick = {

                }
            ) {
                Text(
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = PrimaryTextColor,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.W500
                            )
                        ) {
                            append(text)
                        }
                        append(" ")
                        if (styledText.isNullOrEmpty()) {
                            // don't add
                        } else {
                            withStyle(
                                style = SpanStyle(
                                    color = CoinGradient,
                                    fontWeight = FontWeight.W700,
                                    fontSize = 16.sp
                                )
                            ) {
                                append(styledText)
                            }
                        }
                    },
                )
            }

            Image(
                painter = icon,
                contentDescription = "",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemComponentPreview() {
    ConsumrzUITheme {
        ItemComponent()
    }
}