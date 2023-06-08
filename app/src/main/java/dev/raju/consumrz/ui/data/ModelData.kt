package dev.raju.consumrz.ui.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import dev.raju.consumrz.ui.R
import dev.raju.consumrz.ui.components.DealsItem
import dev.raju.consumrz.ui.theme.PremiumCardBg
import dev.raju.consumrz.ui.theme.RegularCardBg

data class LoyaltyItem(
    val type: String,
    val typeColor: Color,
    val benefits: List<LoyaltyBenefits>,
    val subTitle: String,
    val title: String,
    val cardBg: Color,
)

data class LoyaltyBenefits(
    val image: Int,
    val text: String
)

data class CommunicationData(
    val imageResources: List<Int> = emptyList(),
    val texts: List<String> = emptyList(),
    val arrowIcon: ImageVector?
)

data class DealsComponentItem(
    val titles: List<String>,
    val deals: List<DealsItem>
)

data class DealsItem(val imageResource: Int, val text: String)


// dummy data
val contacts = CommunicationData(
    imageResources = listOf(R.drawable.ic_telegram, R.drawable.ic_whatsapp),
    texts = listOf("Contacts"),
    arrowIcon = Icons.Filled.ArrowForward
)

val location = CommunicationData(
    imageResources = listOf(R.drawable.ic_location),
    texts = listOf("Aviv, Israel +2 more"),
    arrowIcon = Icons.Filled.ArrowForward
)

val sport = CommunicationData(
    imageResources = listOf(R.drawable.ic_all),
    texts = listOf("Sports +2 more"),
    arrowIcon = Icons.Filled.ArrowForward
)

val communications = listOf(contacts, location, sport)

val points = LoyaltyBenefits(
    image = R.drawable.ic_free_points,
    text = "Points\nyou get\nto start"
)

val pointsPercent = LoyaltyBenefits(
    image = R.drawable.ic_free_points_percent,
    text = "Regular\nPoints\nProgram"
)

val card = LoyaltyBenefits(
    image = R.drawable.ic_free_card,
    text = "Free\nLoyalty\nCard"
)

val benefits = listOf(points, pointsPercent, card)

val regularLoyaltyItem = LoyaltyItem(
    type = "Regular",
    typeColor = Color.Black,
    benefits = benefits,
    subTitle = "and 3 tulips for free",
    title = "FREE",
    cardBg = RegularCardBg
)

val premiumLoyaltyItem = LoyaltyItem(
    type = "Premium",
    typeColor = Color.White,
    benefits = benefits,
    subTitle = "and 3 tulips for free",
    title = "FREE",
    cardBg = PremiumCardBg
)

val loyaltyItems = listOf(regularLoyaltyItem, premiumLoyaltyItem)

val greetings = listOf("We work everyday from 7AM to 8PM", "We look forward to seeing you!")

val deals = mutableListOf(
    DealsItem(imageResource = R.drawable.ic_members, text = "Members"),
    DealsItem(imageResource = R.drawable.ic_ratings, text = "Deals Rating"),
    DealsItem(imageResource = R.drawable.ic_buy_get, text = "Buy & Get"),
    DealsItem(imageResource = R.drawable.ic_gifts, text = "Gifts"),
    DealsItem(imageResource = R.drawable.ic_discounts, text = "Discounts"),
    DealsItem(imageResource = R.drawable.ic_sales, text = "Sales")
)

val dealsComponentItem = DealsComponentItem(
    titles = listOf("Achievements", "Available deals"),
    deals = deals
)
