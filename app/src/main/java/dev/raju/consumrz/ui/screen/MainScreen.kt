package dev.raju.consumrz.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.components.ConsumrzTopAppBar
import dev.raju.consumrz.ui.components.CommunicationComponent
import dev.raju.consumrz.ui.components.DealsComponent
import dev.raju.consumrz.ui.components.GreetingComponent
import dev.raju.consumrz.ui.components.ItemComponent
import dev.raju.consumrz.ui.components.LoyaltyComponent
import dev.raju.consumrz.ui.components.PostComponent
import dev.raju.consumrz.ui.data.communications
import dev.raju.consumrz.ui.data.dealsComponentItem
import dev.raju.consumrz.ui.data.greetings
import dev.raju.consumrz.ui.theme.ConsumrzUITheme

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
                    .padding(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                ItemComponent()

                CommunicationComponent(communications)

                GreetingComponent(greetings = greetings)

                Spacer(modifier = Modifier.padding(vertical = 4.dp))

                DealsComponent(dealsComponentItem = dealsComponentItem)

                Spacer(modifier = Modifier.padding(vertical = 8.dp))

                LoyaltyComponent()

                Spacer(modifier = Modifier.padding(vertical = 8.dp))

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