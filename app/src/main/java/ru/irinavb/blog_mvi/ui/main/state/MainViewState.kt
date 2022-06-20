package ru.irinavb.blog_mvi.ui.main.state

import ru.irinavb.blog_mvi.model.BlogPost
import ru.irinavb.blog_mvi.model.User

data class MainViewState(
    var blogPosts: List<BlogPost>? = null,
    var user: User? = null
)