class LinkedPlayList() {
    data class SongNode(val song: Song, var nextSong: SongNode?)

    var first: SongNode? = null

    fun addSong(song: Song, bool: Boolean){
        if(first == null){
            first = SongNode(song, null)
            return
        }
        if(bool){
            first =  SongNode(song, first)
        }else{
            var runPointer = first
            while(runPointer?.nextSong != null){
                runPointer = runPointer.nextSong
            }
            runPointer?.nextSong = SongNode(song, null)
        }
    }

    fun songsInPlaylist(): String{
        var names: String = ""
        var runPointer = first
        while(runPointer != null){
            names += runPointer.song.name + ", "
            runPointer = runPointer.nextSong
        }
        return names
    }

    fun playSong(name: String){
        var runPointer = first

        if(runPointer?.song?.name == name){
            runPointer.song.play()
            first = runPointer.nextSong
            return
        }

        while(runPointer != null){
            if(runPointer.nextSong?.song?.name == name){
                if(runPointer.nextSong?.nextSong == null){
                    runPointer.nextSong!!.song.play()
                    runPointer.nextSong = null
                    return
                }
                runPointer.nextSong!!.song.play()
                runPointer.nextSong = runPointer.nextSong!!.nextSong
                return
            }
            runPointer = runPointer.nextSong
        }
    }
}