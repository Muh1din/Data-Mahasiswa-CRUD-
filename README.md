# Data-Mahasiswa-CRUD-
Aplikasi ini dibuat sangat sederhana, Hanya ada fitur add, Update, Hapus, dan Cari

-- Gunakan event windowOpened jika ingin menampilkan output di monitor external

-- Kemudian masukan code ini

    // Mendapatkan daftar monitor
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] screens = ge.getScreenDevices();

    if (screens.length > 1) { // Cek apakah ada lebih dari satu monitor
        GraphicsDevice secondMonitor = screens[1]; // Ambil monitor kedua
        Rectangle bounds = secondMonitor.getDefaultConfiguration().getBounds();

        // Hitung posisi tengah pada monitor kedua
        int x = bounds.x + (bounds.width - this.getWidth()) / 2;
        int y = bounds.y + (bounds.height - this.getHeight()) / 2;

        // Atur lokasi JFrame
        this.setLocation(x, y);
    } else {
        System.out.println("Monitor kedua tidak ditemukan!");
        this.setLocationRelativeTo(null); // Tampilkan di tengah monitor utama jika hanya satu monitor
    }
