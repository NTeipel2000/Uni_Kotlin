fun main(){
    val bh = Song("Bohemian Rhapsody", "Queen", 359)
    val ho = Song("Holiday", "Green Day", 235)
    val te = Song("Teenagers", "My Chemical Romance", 172)
    val mop = Song("Master of Puppets", "Metallica", 515)
    val af = Song("Africa", "Toto", 295)
    val fi = Song("Fiasko", "Die Ärzte", 164)

    val tree = TreeNode(bh,
        TreeNode(ho,
            TreeNode(mop),
            TreeNode(af)),
        TreeNode(te,
            TreeNode(fi))
    )

    println("Größe: ${tree.size()}")
    println("Anzahl Songs über 3 min: ${tree.amountOfLongSongs()}")

}