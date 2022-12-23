import com.google.gson.annotations.SerializedName

data class Search (
    val ns: Int,
    val title: String,
    @SerializedName("pageid")
    val pageId: Int,
    val size: Int,
    @SerializedName("wordcount")
    val wordCount: Int,
    val snippet: String,
    val timestamp: String
)