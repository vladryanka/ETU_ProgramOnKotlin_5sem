import com.google.gson.annotations.SerializedName

class Continue(
    @SerializedName("sroffset")
    val srOffset: Int,
    @SerializedName("continue")
    val cContinue: String
)