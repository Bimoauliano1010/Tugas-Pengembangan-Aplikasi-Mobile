# My Profile App

## 1. Nama Project
**My Profile App** — Tugas Praktikum Pengembangan Aplikasi Mobile ITERA.

## 2. Deskripsi
Aplikasi "My Profile App" adalah aplikasi mobile berbasis Biodata (Bimo Auliano) yang dibangun menggunakan teknologi **Kotlin Multiplatform (KMP)** dan **Compose Multiplatform**. Aplikasi ini menampilkan informasi profil pengguna secara bersih, modern, dan terstruktur sesuai dengan rubrik dan modul praktikum.

## 3. Requirement
- Kotlin Multiplatform
- Compose Multiplatform
- Android Studio

## 4. Fitur
- **Profile Header:** Header profil dengan foto circular di kiri atas, nama pengguna, dan informasi singkat (terinspirasi dari layout Telegram).
- **Bio / Deskripsi Singkat:** Penjelasan latar belakang mahasiswa Teknik Informatika ITERA.
- **Informasi Profile:** Menampilkan informasi Email, Phone, dan Location (Bandar Lampung).
- **Contact Me:** Menyediakan opsi tautan/tombol interaktif untuk menghubungi melalui Instagram, LinkedIn, dan Email.
- **Interactive Menu & Animasi:** Fitur toggle detail informasi menggunakan `AnimatedVisibility`.

## 5. Komponen Compose yang Digunakan
- `Column`
- `Row`
- `Box`
- `Card`
- `Text`
- `Button`
- `Image` / `Icon`

## 6. Reusable Composables
Project ini mengimplementasikan minimal 3 custom reusable composable functions:
1. **`ProfileHeader`**: Menampilkan foto profil circular, nama, dan info singkat dalam satu card Telegram-style.
2. **`ProfileCard`**: Container Card reusable untuk mengelompokkan bagian Bio, Informasi, dan Contact Me.
3. **`InfoItem`**: Menampilkan baris detail informasi (Email, Phone, Location) dengan ikon dan label.
4. **`ContactMeItem`**: Tombol interaktif untuk opsi kontak (Instagram, LinkedIn, Email).

## 7. Cara Menjalankan Project
1. **Membuka Project:** Buka Android Studio, pilih *Open*, lalu arahkan ke folder root project `MyProfileApss`.
2. **Sync Gradle:** Tunggu proses *Gradle Sync* selesai hingga seluruh dependency ter-load dengan benar.
3. **Memilih Target:** Pilih konfigurasi run `androidApp` pada toolbar bagian atas Android Studio.
4. **Menjalankan Aplikasi:** Hubungkan emulator atau perangkat fisik Android, lalu klik tombol **Run** (ikon segitiga hijau / Shift + F10) untuk menjalankan aplikasi.

## 8. Struktur Implementasi
- **Layout:** Menggunakan `Column` untuk susunan utama halaman secara vertikal, `Row` untuk penataan elemen horizontal (seperti header & item baris info), serta `Box` untuk positioning avatar circular dan kontainer ikon.
- **UI Components:** Memanfaatkan `Text` untuk judul & informasi teks, `Button` untuk tombol kontak, `Card` sebagai pembungkus konten, serta `Image` & `Icon` untuk menampilkan foto profil dan ikon penjelas.
- **Modifiers:** Menggunakan `Modifier` untuk mengatur ukuran (`size`, `fillMaxWidth`, `fillMaxSize`), jarak (`padding`), bentuk (`clip(CircleShape)`), latar belakang (`background`), serta pengguliran layar (`verticalScroll`).
- **Reusable Composable Functions:** Memisahkan komponen modular ke dalam file terpisah agar kode bersih, mudah dibaca, dan dapat digunakan kembali.
