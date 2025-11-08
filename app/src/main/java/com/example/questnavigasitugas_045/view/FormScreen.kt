package com.example.questnavigasitugas_045.view

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigasitugas_045.R
import com.example.questnavigasitugas_045.ui.theme.QuestNavigasiTugas_045Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormScreen(onBackToListClicked: () -> Unit = {}) {

    var nama by remember { mutableStateOf("") }
    var tanggalLahir by remember { mutableStateOf("") }
    var asal by remember { mutableStateOf("") }
    val roleOptions = listOf("Gold Laner", "EXP Laner", "Jungler", "Midlaner", "Roamer")
    var role by remember { mutableStateOf("") }

    var showSuccessDialog by remember { mutableStateOf(false) }
    val context = LocalContext.current

    // State untuk Dropdown Role
    var expanded by remember { mutableStateOf(false) }

    // --- Fungsi Lokal untuk Glassmorphism ---
    fun Modifier.glassmorphismForm(
        shape: Shape = RoundedCornerShape(24.dp),
        color: Color = Color.White.copy(alpha = 0.2f),
        borderWidth: Dp = 1.dp,
        borderColor: Color = Color.White.copy(alpha = 0.4f)
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
