package com.example.meditationui

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Path
import kotlin.math.abs


fun Path.standardQuadFromTo(from: Offset, to: Offset){
    quadraticBezierTo(          // hàm dùng để vẽ các đường cong
        from.x,
        from.y,
        abs(from.x + to.x) / 2f,    // tham số làm cho đường cong mượt hơn (kinh nghiệm cứ lấy trung bình 2 điểm)
        abs(from.y + to.y) / 2f
    )
}