package com.example.aichatbot.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aichatbot.ui.theme.PurpleGrey40
import com.example.aichatbot.ui.theme.TOPBARDARK
import com.example.aichatbot.ui.theme.TOPBARLIGHT

@Composable
fun ChatHeader() {
    Row (
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .background(if(isSystemInDarkTheme()) TOPBARDARK else TOPBARLIGHT)
            .fillMaxWidth()
            .height(50.dp)
    ){
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu",
                modifier = Modifier
                    .padding(10.dp)
                    .size(30.dp),
                tint = if(isSystemInDarkTheme()) Color.White else Color.Black
                )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "EduQuest",
            fontSize = 20.sp,
            color = if(isSystemInDarkTheme()) Color.White else Color.Black,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
        )
        Spacer(modifier = Modifier.fillMaxWidth(.7f))
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Filled.Settings, contentDescription = "Settings",
                modifier = Modifier
                    .padding(10.dp)
                    .size(30.dp),
                tint = if(isSystemInDarkTheme()) Color.White else Color.Black
            )
        }
    }
}