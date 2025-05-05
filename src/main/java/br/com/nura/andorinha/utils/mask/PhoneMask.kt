package br.com.nura.andorinha.utils.mask

import androidx.compose.ui.text.input.OffsetMapping

class PhoneMask : MaskTransformation("(##) # ####-####") {
    override val offsetTranslator: OffsetMapping
        get() = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                if (offset == 0) return 0
                if (offset <= 2) return offset + 1
                if (offset <= 3) return offset + 3
                if (offset <= 7) return offset + 4
                if (offset <= 11) return offset + 5
                return 16
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