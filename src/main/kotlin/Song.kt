class Song(val title: String, val artist: String, val duration: Int) {

    override fun toString(): String {
        return "$title, $artist, $duration "
    }

}