import com.google.gson.annotations.SerializedName

class Query (
    @SerializedName("searchinfo")
    val Info: Inform,
    val search: List<Search>
)