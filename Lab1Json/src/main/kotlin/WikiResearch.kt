import com.google.gson.Gson
import java.awt.Desktop
import java.net.URI

class WikiResearch (private val answer: String)
{
        private var searchResults: List<Search> = listOf()
        fun createListSearch() {
            searchResults = Gson().fromJson(answer, JSON::class.java).query.search
            println("List of possible requests:")
            for (current in searchResults.indices) {
                println("${current + 1}: ${searchResults[current].title}")
            }
        }

        fun browse(answer: String?) {
            println("Input the number of request, you want to open in browser...")
            val userAnswer: Int = answer?.toInt()!!
            if (userAnswer > 0 && userAnswer <= searchResults.size) {
                Desktop.getDesktop()
                    .browse(URI("https://ru.wikipedia.org/w/index.php?curid=${searchResults[
                            userAnswer - 1].pageId}"))
            } else {
                println("Incorrect input.")
                browse(answer)
            }
        }

    }