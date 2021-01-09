package com.dllewellyn.kotlinmpp.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.ui.platform.setContent
import com.dllewellyn.kotlinmpp.androidApp.components.ListViewItem
import com.dllewellyn.kotlinmpp.androidApp.ui.MyApplicationTheme
import com.dllewellyn.kotlinmpp.shared.repository.DefaultListItemRepository
import com.dllewellyn.kotlinmpp.shared.repository.ListItemRepository

class MainActivity : AppCompatActivity() {

    private val listRepository: ListItemRepository = DefaultListItemRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                LazyColumnFor(items = listRepository.listItems()) {
                    ListViewItem(
                        title = it.title,
                        subtitle = it.subtitle,
                        imageUrl = R.drawable.sample_image
                    )
                }
            }
        }
    }
}
