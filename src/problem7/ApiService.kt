package problem7

interface ApiService {
    fun fetchData(id: Int): String
    fun sendData(data: String): Boolean
}