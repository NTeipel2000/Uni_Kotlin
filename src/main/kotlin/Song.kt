class Song(val title: String, val artist: String, override val length: Int): Playable {

    override fun play() {
        println("Titel: $title")
    }

}