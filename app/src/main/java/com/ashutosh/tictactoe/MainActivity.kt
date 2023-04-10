package com.Ashutosh.tictactoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.Ashutosh.tictactoe.ui.theme.TicTacToeTheme
import com.ashutosh.tictactoe.GameScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TicTacToeTheme {
                val ViewModel= viewModels<GameViewModel>()
                GameScreen(viewModel = GameViewModel())

            }
        }
    }
}