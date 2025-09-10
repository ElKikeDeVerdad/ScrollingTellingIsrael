package com.example.multiidioma.data.repository


import com.example.multiidioma.R
import com.example.multiidioma.data.MiniScreenData

class InciforRepository {

    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_0_paragraph_0
                ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_1_paragraph_0,
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_2_paragraph_0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_3_paragraph_0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_4_paragraph_0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_5_paragraph_0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_6_paragraph_0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_7_paragraph_0
                ),
                imageRes =
                    R.drawable.noimagen
            )



        )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}
