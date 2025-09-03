package com.example.multiidioma.data.repository

import com.example.multiidioma.R
import com.example.multiidioma.data.MiniScreenData

class CimusRepository {

    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.paragraph_1,
                    R.string.paragraph_2,
                    R.string.paragraph_3
                ),

            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.paragraph_1,
                    R.string.paragraph_2,
                    R.string.paragraph_3
                ),

            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs =listOf(
                    R.string.paragraph_1,
                    R.string.paragraph_2,
                    R.string.paragraph_3
                ),

            )
        )
    }

    fun getParrafos(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}

