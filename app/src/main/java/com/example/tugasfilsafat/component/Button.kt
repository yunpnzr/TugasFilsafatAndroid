package com.example.tugasfilsafat.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tugasfilsafat.ui.theme.TugasFilsafatTheme

@Composable
fun AddButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
){
    FilledTonalButton(
        onClick = onClick,
        modifier = modifier.fillMaxWidth().height(50.dp)
    ) {
        Text(
            text = text,
            modifier = modifier.align(Alignment.CenterVertically)
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun AddButtonPreview(){
    TugasFilsafatTheme {
        AddButton(
            text = "Add",
            onClick = {}
        )
    }
}