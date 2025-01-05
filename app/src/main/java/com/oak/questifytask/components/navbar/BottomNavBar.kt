package com.oak.questifytask.components.navbar

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.material3.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavBar(
    onItemSelected: (BottomNavItem) -> Unit,
    selectedItem: BottomNavItem
) {
    BottomNavigation(
        containerColor = MaterialTheme.colorScheme.primary,
        tonalElevation = 8.dp
    ) {
        BottomNavItem.values().forEach { item ->
            BottomNavigationItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = selectedItem == item,
                onClick = { onItemSelected(item) },
                selectedContentColor = MaterialTheme.colorScheme.secondary,
                unselectedContentColor = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

enum class BottomNavItem(val label: String, val icon: ImageVector) {
    Home("Home", Icons.Default.Home),
    Habits("Habits", Icons.Default.List),
    Profile("Profile", Icons.Default.Person)
}