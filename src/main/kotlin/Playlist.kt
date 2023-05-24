class Playlist {
    private val media: MutableList<Playable> = mutableListOf()

    var totalTime = 0
        get() = media.sumOf { it.length }
        private set

    fun addMedia(media: Playable) = this.media.add(media)

    fun playRandom(n: Int){
        for(i in 1..n) media.random().play()
    }
}