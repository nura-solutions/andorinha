package group.nura.andorinha.utils.mask;

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

abstract class MaskTransformation(
    private val mask: String
) : VisualTransformation {
    abstract val offsetTranslator: OffsetMapping

    val maxLength: Int = mask.length
    val unmaskedMaxLength = mask.count { it == '#' }

    override fun filter(text: AnnotatedString): TransformedText {
        return mask(text)
    }

    private fun mask(unmasked: AnnotatedString): TransformedText {
        var masked = AnnotatedString.Builder()
        if (unmasked.length >= unmaskedMaxLength) {
            TransformedText(unmasked.subSequence(0, unmaskedMaxLength), offsetTranslator)
        }

        var maskPos = 0
        unmasked.forEach { num ->
            for (i in maskPos until mask.length) {
                maskPos++
                if (mask[i] != '#') {
                    masked.append(mask[i])
                } else break
            }
            masked.append(num)
        }

        return TransformedText(masked.toAnnotatedString(), offsetTranslator)
    }
}
