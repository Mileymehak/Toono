package com.example

import com.lagradost.cloudstream3.TvType
import com.lagradost.cloudstream3.MainAPI
import com.lagradost.cloudstream3.SearchResponse

class ExampleProvider : MainAPI() { // all providers must be an instance of MainAPI
    override var mainUrl = "https://toono.in/" 
    override var name = "Toono"
    override val supportedTypes = setOf(TvType.Cartoon)

    override var lang = "hi"

    // enable this when your provider has a main page
    override val hasMainPage = true

    // this function gets called when you search for something
    override suspend fun search(query: String): List<SearchResponse> {
        return listOf<SearchResponse>()
    }
}
