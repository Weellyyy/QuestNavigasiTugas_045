package com.example.questnavigasitugas_045.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas_045.R
import com.example.questnavigasitugas_045.ui.theme.QuestNavigasiTugas_045Theme

@Composable
fun HomeScreen(onLoginClicked: () -> Unit = {}) {

    fun Modifier.glassmorphism(
        shape: Shape = RoundedCornerShape(20.dp),
        color: Color = Color.White.copy(alpha = 0.2f),
        borderWidth: Dp = 1.dp,
        borderColor: Color = Color.White.copy(alpha = 0.5f)
    ): Modifier = composed {
        this
            .clip(shape)
            .background(color)
            .border(
                width = borderWidth,
                color = borderColor,
                shape = shape
            )
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.uibg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(32.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Spacer(modifier = Modifier.height(32.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .glassmorphism(shape = RoundedCornerShape(32.dp)),
                contentAlignment = Alignment.Center
            ) {

                Text(
                    text = stringResource(R.string.welkam),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.height(64.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .glassmorphism(shape = RoundedCornerShape(32.dp)),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(vertical = 48.dp, horizontal = 24.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.onik),
                        contentDescription = null,
                        modifier = Modifier
                            .size(180.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )


        }
    }
}


