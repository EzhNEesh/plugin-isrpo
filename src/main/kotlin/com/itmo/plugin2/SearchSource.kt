package com.itmo.plugin2

import com.intellij.ide.BrowserUtil

enum class RESOURCE {
    YOUTUBE,
    YANDEX
}

class SearchSource(resource: RESOURCE, searchQuery: String) {
    private var searchQuery: String
    private var resource: RESOURCE = RESOURCE.YANDEX

    init {
        this.resource = resource
        this.searchQuery = searchQuery
    }

    fun openInWeb(){
        var url = ""
        if (this.resource == RESOURCE.YOUTUBE) {
            url = "https://www.youtube.com/results?search_query="
        }
        else if (this.resource == RESOURCE.YANDEX) {
            url = "https://ya.ru/search/?text="
        }
        url += this.searchQuery
        BrowserUtil.open(url)
    }
}