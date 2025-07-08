package problem7

fun main() {
    val mockApiService = MockApiService
    val data = mockApiService.sendData("data")
    val fetchedData = mockApiService.fetchData(2)
    println(data)
    println(fetchedData)
}