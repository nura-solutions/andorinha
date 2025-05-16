# Andorinha Design System

This is, or yet to become, a design system for Android using Jetpack compose.

## Assets

### Illustrations
https://pixels.market/illustrations/funkyways

# Handling screen states

This module introduces a standardized way to manage UI states in Jetpack Compose apps.
It helps simplify rendering of asynchronous data by handling loading, error, and success states declaratively.

---

## ✅ Components

### 1. `ResourceState<T>`
A sealed class to model the state of an asynchronous resource:
- `Loading`: the resource is loading.
- `Success`: the data has been loaded successfully.
- `Error`: an error occurred while loading.

### 2. `ScreenState`
An `enum` representing the overall screen state:
- `Idle`: screen is stable and content is ready.
- `Loading`: screen is globally loading (e.g., on startup).
- `Error`: an unrecoverable error occurred (e.g., no internet).

### 3. `StatefulContent<T>`
A reusable composable function that automatically decides what to render based on the current `ResourceState<T>`.

```kotlin
@Composable
fun StatefulContent(
    uiState: ScreenState,
    onLoading: @Composable () -> Unit = {
        CircularLoading()
    },
    onError: @Composable () -> Unit = {
        GenericErrorScreen()
    },
    content: @Composable () -> Unit
)
```

---

## 💡 Usage Example

```kotlin
val state = viewModel.state

StatefulContent(
    uiState = state.uiState
) {
    Content(
        profileState = state.profileState,
        coursesState = state.coursesState,
        streakState = state.streakState,
        categoriesState = state.categoriesState,
        onEvent = viewModel::onEvent
    )
}
```

---

## ✅ Benefits
- Reduces boilerplate code across screens
- Encourages separation of concerns
- Improves UI consistency for loading and error handling
- Easily testable and previewable

---

## 📚 Related Patterns
- MVI (Model-View-Intent)
- Unidirectional Data Flow (UDF)
- Clean Architecture (layered state separation)