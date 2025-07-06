package problem5

sealed class ApiResponseItem {
    data object Success
    data object Error
}