package problem7

object MockApiService: ApiService {
    override fun fetchData(id: Int): String {
        return if(id == 1) {
            "Fetched data for ID 1"
        } else {
             "Data not found"
        }
    }

    override fun sendData(data: String): Boolean {
        return true
    }
}