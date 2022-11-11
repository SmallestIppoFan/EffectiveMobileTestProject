package com.example.testproject.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testproject.ui.theme.MarkPro

@Preview
@Composable
fun HotSellsItem(
//    imageBitmap: ImageBitmap,
//    phoneName:String,
//    phoneDesk:String,
//    isNew:Boolean
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(20.dp, 20.dp, 20.dp, 20.dp))
            .padding(start = 15.dp, top = 15.dp)
    ) {
        Image(painter = painterResource(CustomIcons.PhoneImage),
            contentDescription ="Phone Background",
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.padding(start = 20.dp,top = 10.dp))
        {
            Surface(shape = CircleShape, modifier = Modifier.size(20.dp), color = CustomColors.Red) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
                    Text(text = "New",
                        color = Color.White,
                        fontSize = 8.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(13.dp))
            Text(text = "Iphone 12", fontFamily = MarkPro, fontWeight = FontWeight.Bold, fontSize = 22.sp, color = Color.White)

            Text(text = "Super.Mega.Rapido", fontFamily = MarkPro, fontSize = 11.sp, color = Color.White, modifier = Modifier.padding(top = 4.dp))
            Spacer(modifier = Modifier.height(20.dp))
            OutlinedButton(onClick = {}, modifier = Modifier
                .height(20.dp)
                .width(75.dp)
                .clip(RoundedCornerShape(4.dp)),
                contentPadding = PaddingValues(0.dp)
            ) {
                Row() {
                    Text(
                        text = "Byu now!",
                        color = Color.Black,
                        fontFamily = MarkPro,
                        fontWeight = FontWeight.Bold,
                        fontSize = 8.sp
                    )
                }
            }
        }
    }
}

@Composable
fun BestSellerItem() {
    Surface(){

    }
    
}