package com.example.preguntas.ui.Screens.Quizz

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.preguntas.ui.theme.PreguntasTheme

@SuppressLint("UnrememberedMutableState")
@Composable
fun QuizzScreen(){
    var indice by (mutableStateOf(0))
    var puntos by (mutableStateOf(0))
    var seleccionada by remember { mutableStateOf<Int?>(null) }
    
    val pregunta = listaPreguntas[indice]
    Column() {
        Text("QUIZZ DE CULTURA GENERAL")
    }
}
@Preview(showBackground = true)//hace que podaamos hacerlo
@Composable
fun QuizzScreenPreview (){
    PreguntasTheme() {
        QuizzScreen()
    }
}
