package me.black9p.webclientplayground.post

/**
 * @author black9p
 */
class Post (val id : Int, val title: String, val body: String, val userId: Int){
    override fun toString() = "Post(id=$id, title=$title, body=$body, userId=$userId)"
}