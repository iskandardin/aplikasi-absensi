# Aplikasi Pendeteksi Kehadiran Mahasiswa Menggunakan QR Code Berbasis Android

## Deskripsi Proyek
Aplikasi mobile berbasis Android untuk melacak kehadiran mahasiswa menggunakan QR code. Aplikasi ini memungkinkan:
- Pemindaian QR code untuk check-in kehadiran
- Manajemen data kehadiran
- Laporan kehadiran per mahasiswa
- Penyimpanan data lokal dan sinkronisasi cloud

## Fitur Utama
- ✅ QR Code Scanning
- ✅ Database Lokal (SQLite/Room)
- ✅ Autentikasi Pengguna
- ✅ Manajemen Daftar Kehadiran
- ✅ Export Laporan

## Tech Stack
- **Language:** Kotlin
- **Database:** Room (SQLite)
- **QR Code Library:** ZXing
- **API Communication:** Retrofit
- **Minimum SDK:** Android 8.0 (API 26)
- **Target SDK:** Android 13+ (API 33+)

## Struktur Proyek
```
aplikasi-absensi/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── AndroidManifest.xml
│   │   │   ├── java/com/example/absensi/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── ui/
│   │   │   │   ├── data/
│   │   │   │   ├── domain/
│   │   │   │   └── utils/
│   │   │   └── res/
│   │   ├── test/
│   │   └── androidTest/
│   └── build.gradle.kts
├── build.gradle.kts
├── settings.gradle.kts
└── README.md
```

## Instalasi & Setup

### Prerequisites
- Android Studio (Flamingo atau lebih baru)
- JDK 11+
- SDK Android 26+

### Langkah-langkah
1. Clone repository
   ```bash
   git clone https://github.com/iskandardin/aplikasi-absensi.git
   cd aplikasi-absensi
   ```

2. Buka di Android Studio
   - File → Open → Pilih folder `aplikasi-absensi`

3. Jalankan build
   ```bash
   ./gradlew build
   ```

4. Jalankan di emulator atau device
   ```bash
   ./gradlew installDebug
   ```

## Development

### Build Variants
- **debug:** Untuk development
- **release:** Untuk production

### Testing
```bash
./gradlew test
./gradlew androidTest
```

## Kontribusi
Silakan buat issue atau pull request untuk berkontribusi.

## Lisensi
MIT License
