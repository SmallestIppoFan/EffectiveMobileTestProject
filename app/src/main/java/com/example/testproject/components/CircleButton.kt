package com.example.testproject.components

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testproject.components.CustomIcons.PhoneImage
import com.example.testproject.ui.theme.MarkPro

@Composable
fun CircleButton(icon: Painter,  text:String, backgroundColor:Color) {
    val isSelected = remember {
        mutableStateOf(false)
    }
    val selectedBg=if(isSelected.value) CustomColors.Red else Color.White
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        OutlinedButton(
            onClick = { isSelected.value=!isSelected.value },
            colors = ButtonDefaults.buttonColors(backgroundColor=selectedBg),
            modifier = Modifier
                .size(60.dp),
            shape = CircleShape,
            contentPadding = PaddingValues(0.dp)
        ) {
            Icon(painter = icon, contentDescription ="Icon in circle", modifier = Modifier.size(20.dp))

        }
        Text(text = text)
    }
}

