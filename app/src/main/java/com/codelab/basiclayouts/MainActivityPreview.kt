package com.codelab.basiclayouts

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.codelab.basiclayouts.ui.theme.MySootheTheme

@Preview//(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnboardingPreview() {
    val context = LocalContext.current
    MySootheTheme{
        SearchBar(/*onClick = {
            showToast(context, "Yay!")
        }*/)
    }
}