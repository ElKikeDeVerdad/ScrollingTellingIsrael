import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.multiidioma.data.MiniScreenState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.collectAsState
import com.example.multiidioma.ui.screens.incifor.InciforViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.getValue
import androidx.compose.foundation.lazy.items
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen0.InciforMiniScreen0
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen1.InciforMiniScreen1
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen10.InciforMiniScreen10
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen2.InciforMiniScreen2
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen3.InciforMiniScreen3
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen4.InciforMiniScreen4
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen5.InciforMiniScreen5
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen6.InciforMiniScreen6
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen7.InciforMiniScreen7
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen8.InciforMiniScreen8
import com.example.multiidioma.ui.screens.incifor.inciforMiniScreens.inciforMiniScreen9.InciforMiniScreen9

@Composable
fun InciforScreen(listState: LazyListState) {
    val viewModel: InciforViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    when (uiState) {
        is MiniScreenState.Loading -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }

        is MiniScreenState.Success -> {
            val screens = (uiState as MiniScreenState.Success).screens
            LazyColumn(
                state = listState,
                modifier = Modifier.fillMaxSize()
            ) {
                items(screens) { data ->
                    when (data.id) {
                        0 -> InciforMiniScreen0(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        1 -> InciforMiniScreen1(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        2 -> InciforMiniScreen2(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        3 -> InciforMiniScreen3(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        4 -> InciforMiniScreen4(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        5 -> InciforMiniScreen5(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        6 -> InciforMiniScreen6(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()

                        )

                        7 -> InciforMiniScreen7(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )

                        8 -> InciforMiniScreen8(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        9 -> InciforMiniScreen9(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )
                        10 -> InciforMiniScreen10(
                            data,
                            Modifier
                                .fillMaxWidth()
                                .fillParentMaxHeight()
                        )


                        else -> Text("MiniScreen desconocida")
                    }
                }
            }
        }

        is MiniScreenState.Error -> {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = (uiState as MiniScreenState.Error).message,
                    color = Color.Red
                )
            }
        }
    }
}
