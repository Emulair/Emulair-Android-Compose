package com.bigbratan.emulair.ui.components.immersive

import androidx.compose.foundation.gestures.Orientation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun ImmersiveColumn(
    modifier: Modifier = Modifier,
    state: ImmersiveListState = rememberImmersiveListState(),
    visibleItems: Int,
    selectedItemOffset: Dp,
    itemSpacing: Dp,
    content: @Composable () -> Unit,
) {
    ImmersiveList(
        modifier = modifier,
        state = state,
        orientation = Orientation.Vertical,
        visibleItems = visibleItems,
        selectedItemOffset = selectedItemOffset,
        itemSpacing = itemSpacing,
        content = content,
    )
}