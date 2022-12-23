fun main(args: Array<String>) {

    val search = Reader()
    val wikiReq = WikiResearch(search.getAnswer())
    wikiReq.createListSearch()
    val answer = readLine()
    wikiReq.browse(answer)
}