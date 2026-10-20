# Analisis Komparatif Platform (Web, Desktop, dan Mobile)

Tabel berikut menyajikan analisis perbandingan karakteristik antara platform Web, Desktop, dan Mobile berdasarkan aspek teknis, distribusi, serta keunggulan dan keterbatasannya:

| Aspek | Web | Desktop | Mobile |
| :--- | :--- | :--- | :--- |
| **Bahasa Utama** | HTML, CSS, JavaScript, TypeScript (Sisi server: PHP, Python, Java, Node.js) | C++, C#, Java, Python, Rust, Swift, Dart | Kotlin, Java (Android); Swift, Objective-C (iOS); Dart (Flutter); JavaScript/TypeScript (React Native) |
| **Arsitektur** | Client-Server (Frontend berjalan di browser, Backend di server web; komunikasi via REST API / GraphQL) | Standalone / Thick-Client (Berjalan langsung di atas OS native; arsitektur MVC, MVVM) | Client-Server terisolasi (Sandbox OS mobile; arsitektur MVVM, MVI, Clean Architecture) |
| **Cara Distribusi** | Hosting di web server / cloud; diakses melalui URL di web browser tanpa proses instalasi | Berkas installer (.exe, .msi, .dmg, .deb) atau melalui application store resmi OS (Microsoft Store) | Toko aplikasi digital resmi (Google Play Store, Apple App Store) atau instalasi paket manual (.apk) |
| **Keunggulan** | Bersifat lintas platform (*cross-platform*), pembaruan sistem instan di sisi server, tidak memakan ruang penyimpanan lokal | Performa komputasi sangat tinggi, akses penuh ke hardware dan sistem berkas lokal, dapat berjalan luring (*offline*) secara penuh | Sangat portabel, akses kaya ke sensor perangkat keras (GPS, kamera, biometrik, akselerometer), mendukung push notification |
| **Keterbatasan** | Akses ke hardware lokal sangat terbatas karena aturan sandbox browser, ketergantungan tinggi pada koneksi internet | Pembaruan aplikasi (*updates*) harus diunduh dan dipasang manual oleh pengguna, proses deployment berbeda untuk setiap OS | Keterbatasan daya baterai dan memori (RAM), ukuran layar terbatas, serta proses kurasi rilis aplikasi yang ketat di store |
| **Contoh Aplikasi** | Google Docs, Figma Web, GitHub Web, Trello | Visual Studio Code, Adobe Photoshop, Blender, Microsoft Office Desktop | WhatsApp, Gojek, Instagram Mobile, Tokopedia |

---

## Sumber Referensi

1. **MDN Web Docs (Mozilla).** (2024). *Web technology for developers*. Mozilla Developer Network. https://developer.mozilla.org/
2. **Android Developers.** (2024). *Platform Architecture*. Google Developers. https://developer.android.com/guide/platform
3. **Microsoft Learn.** (2024). *Windows App Development Documentation*. Microsoft Corporation. https://learn.microsoft.com/en-us/windows/apps/

---

## Bagian 3: Refleksi

1. **Platform yang paling menarik untuk dipelajari:**
   Platform Mobile dan Web merupakan platform yang paling menarik bagi saya. Platform Web memiliki keunggulan aksesibilitas tinggi karena pengguna tidak perlu mengunduh aplikasi terlebih dahulu. Sementara itu, platform Mobile sangat menarik karena dapat memanfaatkan sensor perangkat secara langsung, seperti kamera, GPS, dan biometrik, yang membuka banyak peluang dalam menciptakan solusi aplikasi yang interaktif dan relevan dengan kebutuhan harian pengguna.

2. **Tantangan terbesar saat setup environment:**
   Tantangan terbesar adalah konfigurasi awal di terminal PowerShell, terutama penyesuaian aturan keamanan *execution policy* saat menjalankan skrip Node.js (npm), penanganan variabel path sistem, serta memastikan compiler Java JDK dan Git terdeteksi dengan tepat di environment Windows tanpa kendala izin akses.

3. **Rencana mengatasi tantangan tersebut:**
   Rencana saya adalah mempelajari lebih dalam dasar-dasar manajemen *Environment Variables* di Windows dan perintah baris PowerShell. Selain itu, saya akan selalu membaca dokumentasi resmi atau pesan error di terminal secara teliti sebelum mengambil tindakan perbaikan, serta memanfaatkan version manager seperti NVM jika nanti membutuhkan pengelolaan beberapa versi runtime secara bersamaan.