package com.example.aichatbot.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aichatbot.ChatData
import com.example.aichatbot.ChatRoleEnum
import com.example.aichatbot.ui.theme.Recieve
import com.example.aichatbot.ui.theme.Send

@Composable
fun ChatList(
    list: MutableList<ChatData>
) {

    LazyColumn(modifier = Modifier.fillMaxSize()){

        items(list){
            if(it.role==ChatRoleEnum.USER.role){

                Text(
                    text=it.message,
                    modifier=Modifier.fillMaxWidth()
                        .padding(top = 10.dp, bottom = 10.dp, start = 30.dp, end = 10.dp)
                        .clip(RoundedCornerShape(8.dp))
                    .background(Send)
                        .padding(12.dp),
                    color= Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal
                )

            }else{
                Text(
                    text=it.message,
                    modifier=Modifier.fillMaxWidth()
                        .padding(top = 10.dp, bottom = 10.dp, start = 10.dp, end = 30.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Recieve)
                        .padding(12.dp),
                    color= Color.White,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal
                )

            }
        }
    }
}
