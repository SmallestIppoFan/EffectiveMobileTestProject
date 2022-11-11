package com.example.testproject.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.testproject.R

// Set of Material typography styles to start with
val MarkPro = FontFamily(
    Font(R.font.markregular),
    Font(R.font.marklight, FontWeight.Light),
    Font(R.font.markmedium, FontWeight.Medium),
    Font(R.font.markbold, FontWeight.Bold)

)
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 =TextStyle(
        fontFamily = MarkPro,
        fontWeight = FontWeight.Light
    ),
    h1 =TextStyle(
        fontFamily = MarkPro,
        fontWeight = FontWeight.Light
    )














    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)