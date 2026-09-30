package com.example.myprofileapss

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import myprofileapss.shared.generated.resources.Res
import myprofileapss.shared.generated.resources.profile_photo
import org.jetbrains.compose.resources.painterResource

// ============================================================================
// VECTOR ICONS (Pure KMP Vector Definitions)
// ============================================================================

val PersonIcon: ImageVector = ImageVector.Builder(
    name = "Person", defaultWidth = 24.dp, defaultHeight = 24.dp,
    viewportWidth = 24f, viewportHeight = 24f
).apply {
    path(fill = SolidColor(Color.White)) {
        moveTo(12f, 12f)
        curveTo(14.21f, 12f, 16f, 10.21f, 16f, 8f)
        curveTo(16f, 5.79f, 14.21f, 4f, 12f, 4f)
        curveTo(9.79f, 4f, 8f, 5.79f, 8f, 8f)
        curveTo(8f, 10.21f, 9.79f, 12f, 12f, 12f)
        close()
        moveTo(12f, 14f)
        curveTo(9.33f, 14f, 4f, 15.34f, 4f, 18f)
        lineTo(4f, 20f)
        lineTo(20f, 20f)
        lineTo(20f, 18f)
        curveTo(20f, 15.34f, 14.67f, 14f, 12f, 14f)
        close()
    }
}.build()

val EmailIcon: ImageVector = ImageVector.Builder(
    name = "Email", defaultWidth = 24.dp, defaultHeight = 24.dp,
    viewportWidth = 24f, viewportHeight = 24f
).apply {
    path(fill = SolidColor(Color.White)) {
        moveTo(20f, 4f)
        lineTo(4f, 4f)
        curveTo(2.9f, 4f, 2.01f, 4.9f, 2.01f, 6f)
        lineTo(2f, 18f)
        curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
        lineTo(20f, 20f)
        curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
        lineTo(22f, 6f)
        curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
        close()
        moveTo(20f, 8f)
        lineTo(12f, 13f)
        lineTo(4f, 8f)
        lineTo(4f, 6f)
        lineTo(12f, 11f)
        lineTo(20f, 6f)
        lineTo(20f, 8f)
        close()
    }
}.build()

val PhoneIcon: ImageVector = ImageVector.Builder(
    name = "Phone", defaultWidth = 24.dp, defaultHeight = 24.dp,
    viewportWidth = 24f, viewportHeight = 24f
).apply {
    path(fill = SolidColor(Color.White)) {
        moveTo(6.62f, 10.79f)
        curveTo(8.06f, 13.62f, 10.38f, 15.94f, 13.21f, 17.38f)
        lineTo(15.41f, 15.18f)
        curveTo(15.69f, 14.9f, 16.08f, 14.82f, 16.43f, 14.93f)
        curveTo(17.55f, 15.3f, 18.75f, 15.5f, 20f, 15.5f)
        curveTo(20.55f, 15.5f, 21f, 15.95f, 21f, 16.5f)
        lineTo(21f, 20f)
        curveTo(21f, 20.55f, 20.55f, 21f, 20f, 21f)
        curveTo(10.61f, 21f, 3f, 13.39f, 3f, 4f)
        curveTo(3f, 3.45f, 3.45f, 3f, 4f, 3f)
        lineTo(7.5f, 3f)
        curveTo(8.05f, 3f, 8.5f, 3.45f, 8.5f, 4f)
        curveTo(8.5f, 5.25f, 8.7f, 6.45f, 9.07f, 7.57f)
        curveTo(9.18f, 7.92f, 9.1f, 8.31f, 8.82f, 8.59f)
        lineTo(6.62f, 10.79f)
        close()
    }
}.build()

val LocationIcon: ImageVector = ImageVector.Builder(
    name = "Location", defaultWidth = 24.dp, defaultHeight = 24.dp,
    viewportWidth = 24f, viewportHeight = 24f
).apply {
    path(fill = SolidColor(Color.White)) {
        moveTo(12f, 2f)
        curveTo(8.13f, 2f, 5f, 5.13f, 5f, 9f)
        curveTo(5f, 14.25f, 12f, 22f, 12f, 22f)
        curveTo(12f, 22f, 19f, 14.25f, 19f, 9f)
        curveTo(19f, 5.13f, 15.87f, 2f, 12f, 2f)
        close()
        moveTo(12f, 11.5f)
        curveTo(10.62f, 11.5f, 9.5f, 10.38f, 9.5f, 9f)
        curveTo(9.5f, 7.62f, 10.62f, 6.5f, 12f, 6.5f)
        curveTo(13.38f, 6.5f, 14.5f, 7.62f, 14.5f, 9f)
        curveTo(14.5f, 10.38f, 13.38f, 11.5f, 12f, 11.5f)
        close()
    }
}.build()

val InstagramIcon: ImageVector = ImageVector.Builder(
    name = "Instagram", defaultWidth = 24.dp, defaultHeight = 24.dp,
    viewportWidth = 24f, viewportHeight = 24f
).apply {
    path(fill = SolidColor(Color.White)) {
        moveTo(12f, 2.163f)
        curveTo(15.204f, 2.163f, 15.584f, 2.175f, 16.85f, 2.233f)
        curveTo(20.102f, 2.381f, 21.621f, 3.924f, 21.769f, 7.152f)
        curveTo(21.827f, 8.417f, 21.839f, 8.796f, 21.839f, 12f)
        curveTo(21.839f, 15.204f, 21.827f, 15.584f, 21.769f, 16.85f)
        curveTo(21.62f, 20.076f, 20.102f, 21.621f, 16.85f, 21.769f)
        curveTo(15.584f, 21.827f, 15.204f, 21.839f, 12f, 21.839f)
        curveTo(8.796f, 21.839f, 8.417f, 21.827f, 7.151f, 21.769f)
        curveTo(3.891f, 21.62f, 2.38f, 20.07f, 2.232f, 16.849f)
        curveTo(2.175f, 15.584f, 2.163f, 15.204f, 2.163f, 12f)
        curveTo(2.163f, 8.796f, 2.175f, 8.417f, 2.232f, 7.151f)
        curveTo(2.381f, 3.924f, 3.896f, 2.38f, 7.151f, 2.232f)
        curveTo(8.417f, 2.175f, 8.796f, 2.163f, 12f, 2.163f)
        close()
        moveTo(12f, 7f)
        curveTo(9.239f, 7f, 7f, 9.239f, 7f, 12f)
        curveTo(7f, 14.761f, 9.239f, 17f, 12f, 17f)
        curveTo(14.761f, 17f, 17f, 14.761f, 17f, 12f)
        curveTo(17f, 9.239f, 14.761f, 7f, 12f, 7f)
        close()
        moveTo(12f, 15f)
        curveTo(10.343f, 15f, 9f, 13.657f, 9f, 12f)
        curveTo(9f, 10.343f, 10.343f, 9f, 12f, 9f)
        curveTo(13.657f, 9f, 15f, 10.343f, 15f, 12f)
        curveTo(15f, 13.657f, 13.657f, 15f, 12f, 15f)
        close()
    }
}.build()

val LinkedInIcon: ImageVector = ImageVector.Builder(
    name = "LinkedIn", defaultWidth = 24.dp, defaultHeight = 24.dp,
    viewportWidth = 24f, viewportHeight = 24f
).apply {
    path(fill = SolidColor(Color.White)) {
        moveTo(19f, 3f)
        lineTo(5f, 3f)
        curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
        lineTo(3f, 19f)
        curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
        lineTo(19f, 21f)
        curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
        lineTo(21f, 5f)
        curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
        close()
        moveTo(8.339f, 18.338f)
        lineTo(5.667f, 18.338f)
        lineTo(5.667f, 9.747f)
        lineTo(8.339f, 9.747f)
        lineTo(8.339f, 18.338f)
        close()
        moveTo(7.003f, 8.574f)
        curveTo(6.148f, 8.574f, 5.456f, 7.88f, 5.456f, 7.026f)
        curveTo(5.456f, 6.171f, 6.148f, 5.477f, 7.003f, 5.477f)
        curveTo(7.858f, 5.477f, 8.551f, 6.171f, 8.551f, 7.026f)
        curveTo(8.551f, 7.88f, 7.858f, 8.574f, 7.003f, 8.574f)
        close()
        moveTo(18.338f, 18.338f)
        lineTo(15.667f, 18.338f)
        lineTo(15.667f, 14.15f)
        curveTo(15.667f, 13.151f, 15.648f, 11.868f, 14.277f, 11.868f)
        curveTo(12.887f, 11.868f, 12.674f, 12.953f, 12.674f, 14.078f)
        lineTo(12.674f, 18.338f)
        lineTo(10.002f, 18.338f)
        lineTo(10.002f, 9.747f)
        lineTo(12.568f, 9.747f)
        lineTo(12.568f, 10.92f)
        curveTo(12.925f, 10.244f, 13.8f, 9.53f, 15.103f, 9.53f)
        curveTo(17.817f, 9.53f, 18.338f, 11.317f, 18.338f, 13.647f)
        lineTo(18.338f, 18.338f)
        close()
    }
}.build()

// ============================================================================
// REUSABLE COMPOSABLE FUNCTIONS
// ============================================================================

/**
 * Reusable Composable 1: ProfileHeader
 * Layout terinspirasi Telegram: Foto profil circular di kiri atas, nama & info di sebelahnya.
 */
@Composable
fun ProfileHeader(
    name: String,
    briefInfo: String,
    modifier: Modifier = Modifier,
    onClickHeader: () -> Unit = {}
) {
    Card(
        onClick = onClickHeader,
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Box dengan clip CircleShape untuk foto profil berbentuk circular di kiri atas
            Box(
                modifier = Modifier
                    .size(72.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colorScheme.primary)
                    .border(2.dp, MaterialTheme.colorScheme.onPrimary, CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(Res.drawable.profile_photo),
                    contentDescription = "Profile Photo",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
            }

            Spacer(modifier = Modifier.width(16.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = name,
                    style = MaterialTheme.typography.titleLarge.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    ),
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = briefInfo,
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f)
                )
            }
        }
    }
}

/**
 * Reusable Composable 2: ProfileCard
 * Container Card untuk Bio, Info, dan Contact Me.
 */
@Composable
fun ProfileCard(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                ),
                color = MaterialTheme.colorScheme.primary
            )
            Spacer(modifier = Modifier.height(12.dp))
            content()
        }
    }
}

/**
 * Reusable Composable 3: InfoItem
 * Menampilkan baris informasi (Email, Phone, Location) dengan Icon dan Text.
 */
@Composable
fun InfoItem(
    icon: ImageVector,
    label: String,
    value: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primaryContainer),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = MaterialTheme.colorScheme.onPrimaryContainer,
                modifier = Modifier.size(20.dp)
            )
        }

        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Text(
                text = label,
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.outline
            )
            Text(
                text = value,
                style = MaterialTheme.typography.bodyMedium.copy(
                    fontWeight = FontWeight.Medium
                ),
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

/**
 * Reusable Composable 4: ContactMeItem
 * Tombol pilihan kontak (Instagram, LinkedIn, Email).
 */
@Composable
fun ContactMeItem(
    platform: String,
    handle: String,
    icon: ImageVector,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = onClick,
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer
        )
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = platform,
                    modifier = Modifier.size(20.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(
                    text = platform,
                    fontWeight = FontWeight.SemiBold
                )
            }
            Text(
                text = handle,
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSecondaryContainer.copy(alpha = 0.8f)
            )
        }
    }
}
