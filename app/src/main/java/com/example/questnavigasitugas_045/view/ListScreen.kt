package com.example.questnavigasitugas_045.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.semantics.role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas_045.DataProvider
import com.example.questnavigasitugas_045.R
import com.example.questnavigasitugas_045.ui.theme.QuestNavigasiTugas_045Theme

@Composable
fun ListScreen(
    onBerandaClicked: () -> Unit = {},
    onFormulirClicked: () -> Unit = {}
) {
    fun Modifier.glassmorphismCard(
        shape: Shape = RoundedCornerShape(16.dp),
        color: Color = Color.White.copy(alpha = 0.25f),
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

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.uibg),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
    }
}


