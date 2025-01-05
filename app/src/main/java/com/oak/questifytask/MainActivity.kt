package com.oak.questifytask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.oak.questifytask.components.navbar.BottomNavBar
import com.oak.questifytask.components.navbar.BottomNavItem

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Main()
        }
    }
}

@Composable
fun Main() {
    var selectedItem by remember { mutableStateOf(BottomNavItem.Home) }

    Scaffold(
        bottomBar = {
            BottomNavBar(
                selectedItem = selectedItem,
                onItemSelected = { item -> selectedItem = item }
            )
        }
    ) { paddingValues ->
        // Main content for each selected screen
        when (selectedItem) {
//            BottomNavItem.Home -> HomeScreen(paddingValues)
//            BottomNavItem.Habits -> HabitsScreen(paddingValues)
//            BottomNavItem.Profile -> ProfileScreen(paddingValues)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    Main()
}