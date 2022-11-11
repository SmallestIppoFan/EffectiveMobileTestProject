package com.example.testproject.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testproject.components.CircleButton
import com.example.testproject.components.CustomColors
import com.example.testproject.components.CustomIcons.BookIcon
import com.example.testproject.components.CustomIcons.ComputerIcon
import com.example.testproject.components.CustomIcons.FilterIcon
import com.example.testproject.components.CustomIcons.HeartIcon
import com.example.testproject.components.CustomIcons.PhoneIcon
import com.example.testproject.components.HotSellsItem
import com.example.testproject.ui.theme.MarkPro


@Preview
@Composable
fun HomePage() {
    Surface() {
        Column {
            Header()
            SelectCategoryArea()
            HotSalesRow()
        }
    }

}

@Composable
fun Header() {
    Surface {
        TopAppBar(backgroundColor = Color.White, elevation = 0.dp) {
            Spacer(modifier = Modifier.weight(0.5f))
            Icon(
                imageVector = Icons.Default.Place,
                contentDescription = "Show place",
                tint = CustomColors.Red
            )
            Text(text = "Zihuatanejo, Gro")
            Icon(
                imageVector = Icons.Default.ArrowDropDown,
                contentDescription = "Arrow Drop Down Icon"
            )
            Spacer(modifier = Modifier.weight(0.5f))
            Icon(
                painter = painterResource(id = FilterIcon),
                contentDescription = "Filter Icon",
                tint = CustomColors.Blue,
                modifier = Modifier.size(15.dp)
            )
        }
    }
}


@Composable
fun SelectCategoryArea() {
    val isSelected = remember {
        mutableStateOf(false)
    }
    val selectedBg=if(isSelected.value) Color.Red else Color.White
    Surface(modifier = Modifier
        .fillMaxWidth()) {
        Column() {
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "Select Category", fontFamily = MarkPro, fontWeight = FontWeight.Bold, fontSize = 25.sp )
                Spacer(modifier = Modifier.weight(0.8f))
                Text(text = "view all", modifier = Modifier.padding(end = 5.dp), color = CustomColors.Red)
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)) {
                Spacer(modifier = Modifier.weight(0.3f))
                CircleButton(icon = painterResource(id = PhoneIcon),
                    //onClick={isSelected.value = !isSelected.value Log.d("SomeShit", "${isSelected.value} askdmasd") }
                    backgroundColor = selectedBg, text = "Phone")
                Spacer(modifier = Modifier.weight(0.3f))
                CircleButton(icon = painterResource(id = ComputerIcon), text = "Computer",backgroundColor = selectedBg)
                Spacer(modifier = Modifier.weight(0.3f))
                CircleButton(icon = painterResource(id = HeartIcon),  text = "Health", backgroundColor = selectedBg)
                Spacer(modifier = Modifier.weight(0.3f))
                CircleButton(icon = painterResource(id = BookIcon), text = "Books", backgroundColor = selectedBg)
                Spacer(modifier = Modifier.weight(0.3f))
            }

        }

    }

}

@Composable
fun HotSalesRow() {
    LazyRow{
        items(3){
            HotSellsItem()
        }
    }
}


@Composable
fun BestSellerArea() {
    Surface() {
        Column() {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
                Text(text = "Best Seller", color=CustomColors.Blue, fontFamily = MarkPro, fontWeight = FontWeight.Bold, fontSize = 23.sp)
                Spacer(modifier = Modifier.weight(0.9f))
                Text(text = "view all", modifier = Modifier.padding(end = 5.dp), color = CustomColors.Red)
            }
        }
        
    }

}

