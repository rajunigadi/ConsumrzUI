package dev.raju.consumrz.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalProvider
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.components.ConsumrzIconCard
import dev.raju.consumrz.ui.components.ConsumrzSimpleCard
import dev.raju.consumrz.ui.components.ConsumrzTopAppBar
import dev.raju.consumrz.ui.components.ContactCard
import dev.raju.consumrz.ui.components.ContactDataCard
import dev.raju.consumrz.ui.components.TopCard
import dev.raju.consumrz.ui.theme.ColorBg
import dev.raju.consumrz.ui.theme.ConsumrzUITheme
import dev.raju.consumrz.ui.theme.Purple40

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

                ContactDataCard()

                Text(
                    text = "We work everyday from 7AM to 8PM",
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(vertical = 8.dp),
                    style = MaterialTheme.typography.titleMedium,
                )

                Text(
                    text = "We look forward to seeing you!",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(bottom = 8.dp),
                    style = MaterialTheme.typography.titleMedium
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Achievements",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium
                    )

                    Text(
                        text = "Available deals",
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium
                    )
                }
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