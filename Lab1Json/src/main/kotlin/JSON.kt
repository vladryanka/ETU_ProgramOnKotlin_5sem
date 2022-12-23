import com.google.gson.annotations.SerializedName

class JSON(
    @SerializedName("batchcomplete")
    val batchComplete: String,
    @SerializedName("continue")
    val cContinue: Continue,
    val query: Query
)