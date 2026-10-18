package com.example.preguntas.ui.Screens.Quizz

data class Pregunta (//aqui le dices que vas a guardar datos es un data, y esa es lo que ordena eso
    val texto: String,
    val opcion: List<String>,//las cosas que se van a guardar
    val correcta: Int
)

val listaPreguntas = listOf(//es lo mismo que el data, es como una funcion que pasa info
    Pregunta(
        ("¿Cuál es el río más largo del mundo?"),//pregunta
        listOf("El río Nilo","El río Yangtsé","El Río Amazonas"),//respuiestas disponibles
        2//le dices en que pocision esta la correcta (recuerda que empieza en cero y se sigue)
    ),//que no se te olvide la coma
    Pregunta(
       texto = ("¿Quién escribió la obra teatral Romeo y Julieta?"),
       opcion = listOf("Miguel de Cervantes","William Shakespeare", "Victor Hugo"),
       correcta = 1
    ),
    Pregunta(
        texto = ("¿Cuál es el elemento químico más abundante en el universo?"),
        opcion = listOf("El Hidrógeno (H)", "El Oxígeno (O)", "El Carbono (C)"),
        correcta = 0
    ),
    Pregunta(
        texto = ("¿Quién es considerado el padre de la informática moderna gracias a sus aportes al modelo conceptual de las computadoras y la prueba de IA que lleva su nombre?"),
        opcion = listOf("Albert Einstein","Alan Turing","Thomas Edison"),
        1
    ),
    Pregunta(
        texto = ("¿Cuántos huesos tiene el cuerpo humano adulto?"),
        opcion = listOf("180 huesos","250 huesos","206 huesos"),
        correcta = 2
    )


)

