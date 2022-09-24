package com.cm.gdscjetpackcompose.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccessTime
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(
    showSystemUi = true
)
@Composable
fun NoteCard() {
    Card(
        shape = RoundedCornerShape(16.dp),
        elevation = 2.dp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.height(IntrinsicSize.Min)
                .padding(12.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(start = 5.dp, top = 10.dp, end = 10.dp)
            ) {
                Text(text = "Thu", fontSize = 18.sp, modifier = Modifier.alpha(.5f))
                Text(text = "14", fontSize = 24.sp)
                Text(text = "Jul", fontSize = 18.sp, modifier = Modifier.alpha(.5f))
            }

            Divider(
                color = Color.Black,
                modifier = Modifier
                    .fillMaxHeight()
                    .width(.5.dp)
                    .alpha(.5f)
            )

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.fillMaxWidth()
                    .padding(start = 10.dp, end = 10.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Text(
                        text = "KLAKAMKLkklklklKLAKAMKLkklklklKLAKAMKLkklklkl",
                        softWrap = true,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        modifier = Modifier.fillMaxWidth(.9f),
                        fontSize = 20.sp
                    )
                    Icon(
                        imageVector = Icons.Default.AccessTime,
                        contentDescription = null,
                        modifier = Modifier.size(32.dp)
                    )
                }

                Text(
                    text = "DIOJOAIOAJDOIANONCONAsoftWrap = true DIOJOAIOAJDOIANONCONAsoftWrap,\n" +
                        "overflow = TextOverflow.Ellipsis,DIOJOAIOAJDOIANONCONAsoftWrap\n" +
                        "maxLines = 1,DIOJOAIOAJDOIANONCONAsoftWrap",
                    softWrap = true,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 2,
                    modifier = Modifier.fillMaxWidth(.9f)
                        .alpha(.5f),
                    fontSize = 14.sp

                )

                Text(
                    text = "16:15",
                    textAlign = TextAlign.End,
                    modifier = Modifier.fillMaxWidth()
                        .alpha(.5f),
                    fontSize = 14.sp
                )
            }

        }
    }
}