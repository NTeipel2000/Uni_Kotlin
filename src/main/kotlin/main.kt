fun main(){
    val song1 = Song("Song1", "Artist1")
    val song2 = Song("Song2", "Artist2")
    val song3 = Song("Song3", "Artist3")
    val song4 = Song("Song4", "Artist4")
    val song5 = Song("Song5", "Artist5")

    val songs = LinkedPlayList()
    songs.addSong(song1, true)
    songs.addSong(song2, true)
    songs.addSong(song3, false)
    songs.addSong(song4, false)
    songs.addSong(song5, true)

    println(songs.songsInPlaylist())
    songs.playSong("Song1")
    println(songs.songsInPlaylist())
    songs.playSong("Song5")
    println(songs.songsInPlaylist())
    songs.playSong("Song4")
    println(songs.songsInPlaylist())
}