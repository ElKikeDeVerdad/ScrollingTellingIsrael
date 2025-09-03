package com.example.multiidioma.utils

import android.content.Context
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.text.SpanStyle


import androidx.compose.ui.text.font.FontWeight

import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.TextosBuscadosData

fun xmlToAnnotatedString(
    parrafo: String,
    context: Context,
    textosBuscados: TextosBuscadosData
): AnnotatedString {


    return buildAnnotatedString {

        textosBuscados.listaTextosBuscados.forEach{ textoBuscado ->
            val highlightWord = context.getString(textoBuscado)
            val startIndex = parrafo.indexOf(highlightWord)

            if (startIndex != -1) {
                append(parrafo.substring(0, startIndex)) // antes de la palabra

                withStyle(
                    style = SpanStyle(
                        color = Color(0xFFF59127),
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append(highlightWord)
                }

                append(parrafo.substring(startIndex + highlightWord.length)) // resto del texto
            } else {
                append(parrafo) // si no existe la palabra, se imprime normal
            }
        }
    }


}
