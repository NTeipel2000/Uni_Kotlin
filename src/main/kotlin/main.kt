fun main(){
    val hurray: Playable = Song("Hurray", "Artist1", 3)

    val song1 = Song("Song1", "Artist1", 3)
    val song2 = Song("Song2", "Artist2", 4)

    val playlist = Playlist()
    playlist.addMedia(song1)
    playlist.addMedia(song2)
    playlist.addMedia(hurray)

    val dj = Dj("Dj1", playlist)

    println("Total time: ${dj.playlist.totalTime}")
    dj.playlist.playRandom(4)

}