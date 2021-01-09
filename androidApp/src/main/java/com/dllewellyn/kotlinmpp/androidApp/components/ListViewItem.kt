package com.dllewellyn.kotlinmpp.androidApp.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dllewellyn.kotlinmpp.androidApp.R


@Composable
fun ListViewItem(title: String, subtitle: String, @DrawableRes imageUrl: Int) {
    Row(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(text = title, style = MaterialTheme.typography.h6)
            Text(text = subtitle, style = MaterialTheme.typography.subtitle1)
        }

        Image(
            bitmap = imageResource(imageUrl),
            modifier = Modifier.size(100.dp)
        )
    }

}

@Composable
@Preview
fun PreviewListViewItem() {
    Surface {
        ListViewItem(
            title = "Sample title",
            subtitle = "Subtitle",
            imageUrl = R.drawable.sample_image
        )
    }
}

