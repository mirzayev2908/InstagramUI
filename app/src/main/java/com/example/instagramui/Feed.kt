package com.example.instagramui

class Feed {
    var post: Post? = null
    var stories: ArrayList<Story> = ArrayList<Story>()

    constructor(post: Post) {
        this.post = post
    }

    constructor(stories: ArrayList<Story>) {
        this.stories = stories
    }
}