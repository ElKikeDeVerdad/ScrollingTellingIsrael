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
                imageRes = R.drawable.incifor_img_01_c
            ),
            MiniScreenData(
                id = 4,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_4_paragraph0
                ),
                imageRes = R.drawable.incifor_img_01_d
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
                imageRes = R.drawable.incifor_img_02
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
                imageRes = R.drawable.incifor_img_03
            ),
            MiniScreenData(
                id = 13,
            ),
            MiniScreenData(
                id = 14,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_14_title0,
                    R.string.II_INCIFOR_miniscreen_14_title1,
                    R.string.II_INCIFOR_miniscreen_14_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_04
            ),
            MiniScreenData(
                id = 15,
                bodyParagraphs = listOf(
                    R.string.II_INCIFOR_miniscreen_15_title0,
                    R.string.II_INCIFOR_miniscreen_15_title1,
                    R.string.II_INCIFOR_miniscreen_15_paragraph0,
                ),
                imageRes = R.drawable.incifor_img_05
            )


        )
    }

    fun getData(i: Int): MiniScreenData {
        return getMiniScreens()[i]
    }
}
