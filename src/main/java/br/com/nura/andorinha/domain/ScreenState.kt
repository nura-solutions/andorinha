package br.com.nura.andorinha.domain

/**
 * Represents the overall state of a screen.
 *
 * Useful for handling high-level behaviors such as full-screen loading or fatal errors.
 */
sealed class ScreenState {
    /** The screen is idle and ready to show content. */
    data object Idle : ScreenState()
    /** The screen is loading global content. */
    data object Loading : ScreenState()
    /** A global error occurred and should be shown to the user. */
    data class Error(val message: String?) : ScreenState()
}

/**
 * Represents the loading state of an asynchronous resource, such as data from an API or database.
 *
 * @param T The type of data held by this state.
 */
sealed class ResourceState<out T> {
    /**
     * Indicates that the resource is currently loading.
     */
    data object Loading : ResourceState<Nothing>()
    /**
     * Indicates that there was an error while loading the resource.
     *
     * @property message Optional error message.
     */
    data class Error(val message: String?) : ResourceState<Nothing>()
    /**
     * Indicates that the resource is read to show the data.
     *
     * @property data The data to be shown.
     */
    data class Content<T>(val data: T) : ResourceState<T>()
}