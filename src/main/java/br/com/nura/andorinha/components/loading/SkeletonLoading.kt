package br.com.nura.andorinha.components.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.com.nura.andorinha.utils.shimmerLoading

@Composable
fun SkeletonLoading(
    modifier: Modifier = Modifier,
    itemsCount: Int = 1
) {
    repeat(itemsCount) {
        Box(
            modifier = modifier
                .shimmerLoading()
        )
    }
}