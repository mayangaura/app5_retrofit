## Tujuan 

Project RecyclerView Ini adalah proyek sederhana untuk belajar RecyclerView menggunakan Git & Android Studio

##  👥Tim 
- Mayang Aura Chandra (24)
- Raditiya Yuga Pratama (32)
- Salsa Billa Brilliana (35)
- Sri Dheva A.W.N (36)

## 📲fitur
- Menampilkan Daftar Buku
- Melihat Detail Buku

🔧 Teknologi Kotlin Android Studio Git + GitHub

## 📸 Penjelasan code penting
- model
  <img width="382" height="195" alt="image" src="https://github.com/user-attachments/assets/00a5dd04-a66d-4dce-98d5-c4f02b22f2a3" />
  Bagian pertama ini adalah Model pada file Book.kt. Menggunakan data class untuk merepresentasikan data buku yang memiliki tiga properti, yaitu judul (title), penulis (author), dan gambar (imageResId). Model ini berfungsi sebagai kerangka data yang nantinya ditampilkan di aplikasi. Dengan adanya model, struktur data ini menjadi lebih jelas dan konsisten di seluruh bagian program.

- dummydata
  <img width="653" height="441" alt="image" src="https://github.com/user-attachments/assets/3a1b2410-a646-46ac-9d46-7605d7114f79" />
  Selanjutnya, pada file DummyData.kt berisi data sementara yang berbentuk list dari objek Book tadi. Data ini berisi beberapa buku yang memiliki judul, penulis, serta gambar yang diambil dari folder drawable. Karena bersifat dummy, data ini digunakan hanya untuk kebutuhan uji coba aplikasi agar daftar buku dapat ditampilkan meskipun belum terhubung dengan database asli.

- adapter
  <img width="992" height="654" alt="image" src="https://github.com/user-attachments/assets/a6a78bef-90a4-47ba-8ae4-23a2c3d44495" />
  <img width="844" height="588" alt="image" src="https://github.com/user-attachments/assets/6e4ed6f5-c091-4c3f-9e30-929162a6b46d" />
  Bagian berikutnya adalah Adapter yang terdapat pada file BookAdapter.kt. Adapter berfungsi sebagai penghubung antara data dengan tampilan di RecyclerView. Di dalamnya terdapat BookViewHolder yang menyimpan referensi komponen tampilan gambar buku, judul, dan penulis. Kemudian pada fungsi onCreateViewHolder, layout item (item_post.xml) di-inflate menjadi tampilan untuk RecyclerView. Selanjutnya, fungsi onBindViewHolder bertugas mengisi data buku ke dalam tampilan, seperti menampilkan gambar, judul, dan penulis sesuai posisi data. Selain itu, pada bagian ini juga ada event klik pada item, sehingga ketika salah satu buku ditekan, aplikasi akan menampilkan halaman detail buku.

- mainactivity.kt
  <img width="832" height="634" alt="image" src="https://github.com/user-attachments/assets/0d82aa85-d474-412b-bb00-04fb74dba1c5" />
  Pada file MainActivity.kt ini, aplikasi mengatur tampilan utama menggunakan activity_main.xml yang berisi sebuah RecyclerView. RecyclerView kemudian dihubungkan dengan LinearLayoutManager agar data ditampilkan secara vertikal seperti daftar. Adapter yang sudah dibuat kemudian dipanggil dengan menggunakan data dari DummyData. Di dalam adapter ini juga terdapat intent yang mengirim data buku ke DetailBook ketika item ditekan. Dengan demikian, MainActivity berfungsi sebagai halaman utama aplikasi untuk menampilkan daftar semua buku.




## 📸 Screenshoot Hasil
