package dev.raju.consumrz.ui.components

import androidx.compose.foundation.layout.Column
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
import dev.raju.consumrz.ui.data.greetings
import dev.raju.consumrz.ui.theme.CardBg
import dev.raju.consumrz.ui.theme.ConsumrzUITheme

@Composable
fun GreetingComponent(
    greetings: List<String>
) {
    Column(
    ) {
        greetings.forEach { greeting ->
            Text(
                text = greeting,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(vertical = 4.dp),
                style = MaterialTheme.typography.labelLarge,
            )
        }
        /*Text(
            text = "We work everyday from 7AM to 8PM",
            textAlign = TextAlign.Start,
            modifier = Modifier.padding(vertical = 8.dp),
            style = MaterialTheme.typography.labelLarge,
        )

        Text(
            text = "We look forward to seeing you!",
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 8.dp),
            style = MaterialTheme.typography.labelLarge
        )*/
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingComponentPreview() {
    ConsumrzUITheme {
        GreetingComponent(greetings = greetings)
    }
}