package com.example.multiidioma.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.example.multiidioma.R

// Define el proveedor de la fuente
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

// Define las fuentes que usarás
val bodyMediumFontFamily = GoogleFont(name = "Roboto")
val titleMediumFontFamily = GoogleFont(name = "Montserrat")

val AppTypography = Typography(
    // Usa la familia de fuentes para el cuerpo del texto
    bodyMedium = TextStyle(
        fontFamily = FontFamily(
            Font(
                googleFont = bodyMediumFontFamily,
                fontProvider = provider,
                weight = FontWeight.Normal
            )
        ),
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal
    ),
    // Y para los títulos o display text
    titleMedium = TextStyle(
        fontFamily = FontFamily(
            Font(
                googleFont = titleMediumFontFamily,
                fontProvider = provider,
                weight = FontWeight.Bold,
                )
            //Font(resId = R.font.roboto_bold)
        ),
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )
    // ... y los demás estilos de Typography
)


private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

@Composable
fun MultiidiomaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography, //
        content = content
    )
}