package com.example.multiidioma.utils

import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.snapshotFlow

@Composable
fun DetectScroll(
    listState: LazyListState,
    topBarVisible: (Boolean) -> Unit,
    bottomBarVisible: (Boolean) -> Unit
) {
    LaunchedEffect(listState) {
        var lastScrollOffset = 0
        snapshotFlow { listState.firstVisibleItemScrollOffset }
            .collect { offset ->
                if (offset > lastScrollOffset) {
                    bottomBarVisible(false)
                    topBarVisible(false)
                } else if (offset < lastScrollOffset) {
                    bottomBarVisible(true)
                    topBarVisible(true)
                }
                lastScrollOffset = offset
            }
    }
}


