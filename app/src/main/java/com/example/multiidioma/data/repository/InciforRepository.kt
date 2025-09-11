package com.example.multiidioma.data.repository


import com.example.multiidioma.R
import com.example.multiidioma.data.MiniScreenData

class InciforRepository {

    fun getMiniScreens(): List<MiniScreenData> {
        return listOf(
            MiniScreenData(
                id = 0,

                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_0_paragraph0
                ),
            ),
            MiniScreenData(
                id = 1,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_1_paragraph0,
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 2,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_2_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 3,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_3_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_4_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 5,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_5_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 6,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_6_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 7,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_7_paragraph0
                ),
                imageRes =
                    R.drawable.noimagen
            ),
            MiniScreenData(
                id = 8,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_8_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),
            MiniScreenData(
                id = 9,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_9_paragraph0
                ),
                imageRes = R.drawable.noimagen
            ),

            MiniScreenData(
                id = 10,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_10_paragraph0,
                    R.string.II_INCIFOR_miniscreen_10_paragraph1,
                    R.string.II_INCIFOR_miniscreen_10_paragraph2
                ),
            ),
            MiniScreenData(
                id = 11,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_11_paragraph0,
                ),
                imageRes = R.drawable.noimagen
            ),

            MiniScreenData(
                id = 12,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_12_paragraph0,
                ),
                imageRes = R.drawable.noimagen
            )


        )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}
