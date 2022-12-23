import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

class Reader {
    private var answer: String = ""
    fun getAnswer(): String{
        println("Search..")
        answer = readLine().toString()
        while (answer == " ") {
            System.out.println("Incorrect search")
            answer = readLine().toString()
        }
        val connect =
            URL(
                "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=${
                    URLEncoder.encode(
                        answer,
                        "UTF-8"
                    )
                }"
            ).openConnection() as HttpURLConnection
        return connect.inputStream.bufferedReader().readText()
    }

}