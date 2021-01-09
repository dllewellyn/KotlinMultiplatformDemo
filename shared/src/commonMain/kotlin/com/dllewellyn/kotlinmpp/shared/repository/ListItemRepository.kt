package com.dllewellyn.kotlinmpp.shared.repository

import com.dllewellyn.kotlinmpp.shared.models.ListEntry


interface ListItemRepository {
    fun listItems(): List<ListEntry>
}

class DefaultListItemRepository : ListItemRepository {
    override fun listItems() = listOf(
        ListEntry("Title", "This is a subtitle", "https://picsum.photos/100/100"),
        ListEntry("Another title", "This is another subtitle", "https://picsum.photos/100/100"),
        ListEntry("Third one", "And this is the third subtitle", "https://picsum.photos/100/100"),
    )
}