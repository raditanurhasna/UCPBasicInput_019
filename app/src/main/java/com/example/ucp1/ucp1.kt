package com.example.ucp1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun PlayActivity(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize()
    ){
        SectionHeader()
        Spacer(modifier = Modifier.padding(8.dp))
        Text(text = "Yuk lengkapi data dirimu !")
    }
}

@Composable
fun SectionHeader(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .background(color = Color.Blue)){

        Row (modifier = Modifier.padding(15.dp)
        ){
            Box(contentAlignment = Alignment.BottomEnd){
                Image(painter = painterResource(id = R.drawable.img),
                    contentDescription = " ",
                    Modifier.size(70.dp).clip(shape = CircleShape)
                )

            }
            Column (Modifier.padding(15.dp)){
                Text(text = "Hallo,",
                    color = Color.White
                )
                Spacer(Modifier.padding(3.dp))
                Text(text = "Muhammad Ikhsan",
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun ucp1(modifier: Modifier = Modifier) {
    var nama by remember { mutableStateOf("") }
    var nohandphone by remember { mutableStateOf("") }
    var memilihjk by remember { mutableStateOf("") }

    var namasv by remember { mutableStateOf("") }
    var nohandphonesv by remember { mutableStateOf("") }
    var memilihjksv by remember { mutableStateOf("") }

    val listJk = listOf("laki-laki", "Perempuan")
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            listJk.forEach { item ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = memilihjk == item,
                        onClick = {
                            memilihjk = item
                        }
                    )
                    Text(item)
                }
            }
        }
        TextField(
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            value = nama,
            onValueChange = { nama = it },
            label = { Text("nama") },
            placeholder = { Text("Masukan nama") }
        )
        TextField(
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            value = nohandphone,
            onValueChange = { nama = it },
            label = { Text("nohanphone") },
            placeholder = { Text("Masukan nohandphone") }
        )

        Button(onClick = {
            namasv = nama
            nohandphonesv = nohandphone
        }) {
            Text("Submit")
        }
    }
}

























