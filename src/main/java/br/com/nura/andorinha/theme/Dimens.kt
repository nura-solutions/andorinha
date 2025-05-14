package br.com.nura.andorinha.theme

import androidx.compose.ui.unit.dp

object Dimens {
    /** Grid defaults to 8dp **/
    val Grid = 8.dp

    object Spacing {

        /**
         * [Grid] / 2 = 4dp (Default)
         **/
        val XSmall = Grid / 2

        /**
         * [Grid] = 8dp (Default)
         **/
        val Small = Grid

        /**
         * [Grid] * 2 = 16dp (Default)
         **/
        val Medium = Small * 2

        /**
         * [Grid] * 3 = 24dp (Default)
         **/
        val XMedium = Grid * 3

        /**
         * [Grid] * 4 = 32dp (Default)
         **/
        val Large = Grid * 4

        /**
         * [Grid] * 6 = 48dp (Default)
         **/
        val XLarge = Grid * 6
    }

    object Icon {
        /**
         * [Grid] * 2 = 16.dp
         * Ícones muito pequenos: chips, campos de texto, indicadores sutis
         */
        val xs = Grid * 2

        /**
         * [Grid] * 2.5 = 20.dp
         * Ícones menores: menus compactos, elementos auxiliares
         */
        val sm = Grid * 2.5f

        /**
         * [Grid] * 3 = 24.dp
         * ✅ Tamanho padrão: botões, AppBar, listas
         */
        val md = Grid * 3

        /**
         * [Grid] * 4 = 32.dp
         * Ícones maiores em cards, destaques visuais
         */
        val lg = Grid * 4

        /**
         * [Grid] * 5 = 40.dp
         * Ícones grandes: AppBars expandidas, áreas proeminentes
         */
        val xl = Grid * 5

        /**
         * [Grid] * 6 = 48.dp
         * Ícones em botões grandes: FAB, navegação, ações principais
         */
        val xxl = Grid * 6
    }

    object Image {
        /**
         * [Grid] * 4 = 32.dp
         * Ícones muito pequenos: chips, campos de texto, indicadores sutis
         */
        val xs = Grid * 4

        /**
         * [Grid] * 8 = 64.dp
         * Ícones menores: menus compactos, elementos auxiliares
         */
        val sm = Grid * 8

        /**
         * [Grid] * 12 = 96.dp
         * ✅ Tamanho padrão: botões, AppBar, listas
         */
        val md = Grid * 12

        /**
         * [Grid] * 16 = 128.dp
         * Ícones maiores em cards, destaques visuais
         */
        val lg = Grid * 16

        /**
         * [Grid] * 24 = 192.dp
         * Ícones grandes: AppBars expandidas, áreas proeminentes
         */
        val xl = Grid * 24

        /**
         * [Grid] * 32 = 256.dp
         * Ícones em botões grandes: FAB, navegação, ações principais
         */
        val xxl = Grid * 32
    }

    object CornerRadius {
        val none = 0.dp

        /**
         * [Grid] / 2 = 4.dp
         */
        val sm = Grid / 2

        /**
         * [Grid] = 8.dp
         */
        val md = Grid

        /**
         * [Grid] * 2 = 16.dp
         */
        val lg = Grid * 2

        /**
         * [Grid] * 3 = 24.dp
         */
        val xlg = Grid * 3

        /**
         * [Grid] * 6 = 48.dp
         * Circular
         */
        val full = Grid * 6
    }

    object Stroke {
        val hairline = 0.5.dp
        val thin = 1.dp
        val regular = 2.dp
        val thick = 4.dp
    }

    object Elevation {
        val none = 0.dp
        val sm = 1.dp
        val md = 4.dp
        val lg = 8.dp
        val xl = 16.dp
    }

    object Inset {
        /**
         * [Grid] * 2 = 16.dp
         */
        val horizontal = Grid * 2

        /**
         * [Grid] * 2 = 16.dp
         */
        val vertical = Grid * 2

        /**
         * [Grid] * 3 = 24.dp
         */
        val screenPadding = Grid * 3
    }

    object Divider {
        val thickness = 1.dp

        /**
         * [Grid]
         */
        val spacing = Grid
    }

    object AvatarSize {

        /**
         * [Grid] * 3 = 24.dp
         */
        val sm = Grid * 3

        /**
         * [Grid] * 5 = 40.dp
         */
        val md = Grid * 5

        /**
         * [Grid] * 8 = 64.dp
         */
        val lg = Grid * 8
    }
}