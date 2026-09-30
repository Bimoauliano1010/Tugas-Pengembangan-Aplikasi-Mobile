package com.example.myprofileapss

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        // State untuk menampilkan detail menu profile saat header dipilih
        var isMenuExpanded by remember { mutableStateOf(true) }

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .safeContentPadding()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Title Top Bar
                Text(
                    text = "My Profile App",
                    style = MaterialTheme.typography.headlineMedium.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp
                    ),
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )

                // 1. Profile Header (Layout terinspirasi Telegram dengan Circular Avatar di kiri atas)
                ProfileHeader(
                    name = "Bimo Auliano",
                    briefInfo = "Informatics Engineering Student at ITERA",
                    onClickHeader = {
                        isMenuExpanded = !isMenuExpanded
                    }
                )

                // 2. Bio / Deskripsi Singkat
                ProfileCard(title = "Bio") {
                    Text(
                        text = "Informatics Engineering student at Institut Teknologi Sumatera, passionate about mobile application development and data scraping, with a keen interest in building technology-driven solutions and exploring data.",
                        style = MaterialTheme.typography.bodyMedium,
                        color = MaterialTheme.colorScheme.onSurface,
                        lineHeight = 20.sp
                    )
                }

                // Tampilkan menu informasi lengkap & contact me (dapat di-toggle dengan memilih header)
                AnimatedVisibility(visible = isMenuExpanded) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        // 3. List Informasi Profile
                        ProfileCard(title = "Informasi Profile") {
                            InfoItem(
                                icon = EmailIcon,
                                label = "Email",
                                value = "bimo.124140198@student.itera.ac.id"
                            )
                            InfoItem(
                                icon = PhoneIcon,
                                label = "Phone",
                                value = "+62 812-3456-7890"
                            )
                            InfoItem(
                                icon = LocationIcon,
                                label = "Based / Location",
                                value = "Bandar Lampung"
                            )
                        }

                        // 4. Contact Me Menu
                        ProfileCard(title = "Contact Me") {
                            ContactMeItem(
                                platform = "Instagram",
                                handle = "@auliano_",
                                icon = InstagramIcon,
                                onClick = { /* Akses Instagram */ }
                            )
                            ContactMeItem(
                                platform = "LinkedIn",
                                handle = "Bimo Auliano",
                                icon = LinkedInIcon,
                                onClick = { /* Akses LinkedIn */ }
                            )
                            ContactMeItem(
                                platform = "Email",
                                handle = "bimo.124140198@student.itera.ac.id",
                                icon = EmailIcon,
                                onClick = { /* Akses Email */ }
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }
}
