package group.nura.andorinha.utils.mask;

import androidx.compose.ui.text.input.OffsetMapping

class CpfMask : MaskTransformation("###.###.###-##") {
    override val offsetTranslator: OffsetMapping
        get() =  object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                if (offset <= 3) return offset
                if (offset <= 6) return offset + 1
                if (offset <= 9) return offset + 2
                if (offset <= 11) return offset + 3
                return 14
            }

            override fun transformedToOriginal(offset: Int): Int {
                if (offset == 0) return 0
                if (offset <= 3) return offset - 1
                if (offset <= 6) return offset - 3
                if (offset <= 11) return offset - 4
                if (offset <= 15) return offset - 5
                return 11
            }
        }
}