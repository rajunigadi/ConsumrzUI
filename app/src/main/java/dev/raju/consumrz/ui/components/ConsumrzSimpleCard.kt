package dev.raju.consumrz.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.theme.ColorBg
import dev.raju.consumrz.ui.theme.ConsumrzUITheme
import dev.raju.consumrz.ui.theme.Purple40
import dev.raju.consumrz.ui.theme.PurpleBg

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ConsumrzSimpleCard(
    text: String = stringResource(id = R.string.app_name),
    styledText: String? = stringResource(id = R.string.app_name),
    icon: Painter = painterResource(id = R.drawable.ic_star),
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
                            style = SpanStyle(color = Color.Black)
                        ) {
                            append(text)
                        }
                        append(" ")
                        if (styledText.isNullOrEmpty()) {
                            // don't add
                        } else {
                            withStyle(
                                style = SpanStyle(
                                    color = PurpleBg,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                            ) {
                                append(styledText)
                            }
                        }
                    },
                    fontFamily = FontFamily.SansSerif,
                )
            }

            Icon(
                painter = icon,
                contentDescription = "",
                tint = Purple40
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ConsumrzSimpleCardPreview() {
    ConsumrzUITheme {
        ConsumrzSimpleCard(
            text = "Join & Get 10/",
            styledText = "25",
            icon = painterResource(id = R.drawable.ic_star)
        )
    }
}