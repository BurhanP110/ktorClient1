package com.example.ktorclient1.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest


@Composable
fun ImageFromUrl(imageUrl: String) {
    val painter = rememberAsyncImagePainter(
        ImageRequest.Builder(LocalContext.current).data(data = imageUrl).apply(block = fun ImageRequest.Builder.() {
            crossfade(true)
        }).build()
    )
    Image(
        painter = painter,
        contentDescription = null,
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .clip(RoundedCornerShape(4.dp)),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun imageCard(headlineString: String, SubLineString: String , imgUrl: String ){
    OutlinedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
        ),
        modifier = Modifier
            .width(240.dp)
            .padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Placeholder for the image, replace "R.drawable.your_image" with your actual image resource
            ImageFromUrl(imgUrl)

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = headlineString,
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = SubLineString,
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            Button(
                onClick = { /* Do something when button is clicked */ },
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text("View")
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
