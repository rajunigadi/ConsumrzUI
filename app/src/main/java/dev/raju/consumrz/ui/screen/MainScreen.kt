package dev.raju.consumrz.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.pluralStringResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.components.ConsumrzTopAppBar
import dev.raju.consumrz.ui.components.ContactDataCard
import dev.raju.consumrz.ui.components.DealsCard
import dev.raju.consumrz.ui.components.LoyaltyCard
import dev.raju.consumrz.ui.components.PostComponent
import dev.raju.consumrz.ui.components.TopCard
import dev.raju.consumrz.ui.data.communications
import dev.raju.consumrz.ui.data.loyaltyItems
import dev.raju.consumrz.ui.theme.CardBg
import dev.raju.consumrz.ui.theme.ConsumrzUITheme
import dev.raju.consumrz.ui.theme.SecondaryTextColor
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun MainScreen() {
    val snackbarHostState = remember { SnackbarHostState() }
    Scaffold(
        topBar = {
            ConsumrzTopAppBar(
                text = stringResource(id = R.string.app_name),
                onNavigationIconClick = {

                }
            )
        },
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .verticalScroll(rememberScrollState()),
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                TopCard()

                ContactDataCard(communications)

                Text(
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
                )

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
                        Text(
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
                        )
                    }

                    DealsCard()
                }
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

                Spacer(modifier = Modifier.padding(vertical = 16.dp))

                PostComponent()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    ConsumrzUITheme {
        MainScreen()
    }
}