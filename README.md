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


- detailbook.kt

  <img width="866" height="643" alt="image" src="https://github.com/user-attachments/assets/9bde233e-54fa-478b-a6fc-7b2ae1c71d80" />

  Berikutnya terdapat DetailBook.kt, yaitu halaman yang digunakan untuk menampilkan detail dari buku yang dipilih. Data buku dikirim dari MainActivity menggunakan Intent, kemudian diterima pada DetailBook melalui getStringExtra dan getIntExtra. Data tersebut kemudian ditampilkan ke komponen layout activity_detailbook.xml, sehingga pengguna dapat melihat detail buku berupa judul, penulis, dan gambar yang lebih lengkap.


- splashcreen.kt

  <img width="858" height="536" alt="image" src="https://github.com/user-attachments/assets/fcd6004b-9d07-4d7d-bf3b-04f36d030932" />

  Selanjutnya, ada SplashScreen.kt yang berfungsi menampilkan layar pembuka aplikasi. Pada file ini menggunakan Handler dengan postDelayed untuk menunda perpindahan ke halaman utama (MainActivity) selama beberapa detik. Dengan begitu, pengguna akan melihat logo terlebih dahulu sebelum masuk ke aplikasi utama.

-activity_detailboox.xml
<img width="993" height="837" alt="image" src="https://github.com/user-attachments/assets/cc00c0bf-6d81-4077-8bfa-56987bfd7460" />

<img width="784" height="786" alt="image" src="https://github.com/user-attachments/assets/2353c8cd-c242-48a1-b6b3-344ffeca414e" />

<img width="784" height="688" alt="image" src="https://github.com/user-attachments/assets/fdba2085-4b7a-4ce4-8914-140a29916e16" />

  Kode XML di atas adalah layout untuk halaman Detail Buku. Root-nya memakai LinearLayout dengan orientasi vertical, sehingga semua elemen ditumpuk dari atas ke bawah. LinearLayout ini berukuran penuh layar (match_parent) dan punya tools:context agar Android Studio tahu kelas pemilik layout ketika di-preview.
Bagian pertama adalah TextView dengan teks “Detail Buku” yang diformat besar (40sp), bold, berwarna hitam, dan diposisikan di tengah. TextView ini berfungsi sebagai judul halaman. Di bawahnya ada ImageView berukuran 80dp x 80dp yang ditaruh di tengah, menampilkan gambar dari resource @drawable/bukubumi. Gambar ini punya contentDescription untuk aksesibilitas dan diberi margin bawah agar tidak menempel pada elemen berikutnya.

  Selanjutnya ada CardView yang berfungsi sebagai wadah informasi detail buku. CardView diberi cardElevation untuk efek bayangan dan cardCornerRadius agar sudutnya melengkung. Di dalamnya terdapat LinearLayout vertikal dengan padding 15dp, berisi tiga TextView:
-tvtitle_det → menampilkan judul buku, lebih besar (20sp) dan bold.
-tvpenulis_det → menampilkan nama penulis, ukuran 18sp.
-tvtahun_det → menampilkan tahun terbit, ukuran 18sp.

  Ketiga TextView tersebut tidak diisi langsung di XML, tapi disiapkan ID-nya supaya bisa diakses dan diisi nilai dinamis lewat kode Java/Kotlin menggunakan findViewById atau ViewBinding.
Secara keseluruhan, layout ini akan menampilkan halaman detail dengan struktur: judul besar di atas, ikon buku di tengah, lalu kartu berisi informasi detail buku (judul, penulis, tahun). Elemen visual seperti warna (@color/black) dan gambar (@drawable/bukubumi) diambil dari resource project.

-activity_main.xml

<img width="1173" height="900" alt="Screenshot 2025-08-20 091414" src="https://github.com/user-attachments/assets/1fca7253-4911-4fa8-b41a-07907b84f582" />

Kode activity_main.xml merupakan rancangan antarmuka utama pada aplikasi. Struktur layout menggunakan LinearLayout dengan orientasi vertikal, sehingga setiap elemen di dalamnya ditampilkan secara berurutan dari atas ke bawah. Ukuran LinearLayout diatur penuh sesuai lebar dan tinggi layar perangkat (match_parent). Atribut tools:context menunjuk pada kelas MainActivity, sehingga Android Studio mengetahui konteks kelas yang menggunakan layout ini saat dilakukan pratinjau.

  Di dalamnya terdapat dua komponen utama. Komponen pertama adalah sebuah TextView yang menampilkan judul halaman “Daftar Buku”. Teks ini diformat dengan ukuran 20dp, berwarna hitam, dan bergaya tebal (bold). Posisi teks ditempatkan di bagian tengah, sehingga tampil sebagai judul utama halaman dengan tampilan yang jelas dan mudah dikenali oleh pengguna.
 
  Komponen berikutnya adalah RecyclerView. Elemen ini berfungsi untuk menampilkan daftar data dalam jumlah banyak secara efisien. RecyclerView memungkinkan pengguna menelusuri koleksi buku dalam bentuk daftar yang dapat diisi secara dinamis melalui kode Java atau Kotlin. ID rv_data diberikan agar komponen ini dapat dihubungkan dengan logika pemrograman pada kelas terkait.
 
  Secara keseluruhan, layout ini dirancang untuk menyajikan halaman utama aplikasi yang terdiri atas judul “Daftar Buku” di bagian atas serta daftar koleksi buku yang ditampilkan menggunakan RecyclerView. Struktur sederhana ini memberikan pengalaman pengguna yang terorganisir dan informatif, di mana judul halaman berfungsi sebagai identitas utama dan daftar buku menjadi konten inti yang ditampilkan.

-acitvity_splashscreen.xml

<img width="1092" height="654" alt="image" src="https://github.com/user-attachments/assets/50274454-9ab8-43a0-b889-b3b71ad46da9" />

  Kode XML tersebut mendefinisikan sebuah tampilan antarmuka yang digunakan sebagai halaman splash screen dalam aplikasi Android. Elemen root menggunakan LinearLayout dengan lebar dan tinggi yang disesuaikan penuh terhadap layar perangkat (match_parent). Atribut android:orientation="vertical" menentukan bahwa apabila terdapat lebih dari satu elemen, susunannya akan ditampilkan secara vertikal. Selanjutnya, atribut android:gravity="center" berfungsi untuk menempatkan seluruh komponen di dalam layout agar berada tepat di bagian tengah layar, baik secara horizontal maupun vertikal. Selain itu, deklarasi tools:context=".splashscreen" menunjukkan bahwa layout ini dikaitkan dengan kelas Splashscreen, sehingga Android Studio dapat memberikan pratinjau yang sesuai.
  
  Di dalam LinearLayout ini terdapat sebuah elemen ImageView yang berfungsi menampilkan gambar. Ukuran gambar diatur secara eksplisit sebesar 300dp untuk lebar maupun tinggi. Atribut android:src="@drawable/splashlogo" menunjukkan bahwa sumber gambar yang ditampilkan diambil dari resource drawable dengan nama splashlogo. Karena layout induk telah menggunakan pengaturan gravitasi tengah, maka gambar tersebut secara otomatis ditempatkan tepat di tengah layar.
  
  Secara keseluruhan, rancangan layout ini dirancang untuk menampilkan sebuah logo pada saat aplikasi pertama kali dijalankan. Tampilan tersebut berfungsi sebagai splash screen, yaitu halaman pembuka yang biasanya digunakan untuk menampilkan identitas aplikasi berupa logo atau animasi singkat sebelum pengguna diarahkan menuju halaman utama. Dengan demikian, kode ini tidak hanya memberikan pengalaman visual yang lebih profesional, tetapi juga berperan sebagai pengenal awal identitas aplikasi kepada pengguna.

- item_post.xml

<img width="945" height="758" alt="image" src="https://github.com/user-attachments/assets/e2a90b36-9052-479d-b4f2-fe05ded8ccd1" />

<img width="948" height="739" alt="image" src="https://github.com/user-attachments/assets/5a4d61d3-49e4-4242-b1ab-f5c14becbe3e" />

<img width="949" height="642" alt="image" src="https://github.com/user-attachments/assets/df37f823-8427-4ca1-bebb-9e67d0f2f3c6" />

Kode XML tersebut adalah rancangan sebuah layout item yang biasanya dipakai untuk menampilkan informasi buku dalam bentuk kartu (card). Root layout menggunakan LinearLayout dengan orientasi vertikal dan tinggi yang mengikuti konten (wrap_content), sehingga ukurannya akan menyesuaikan isi di dalamnya.
Di dalamnya terdapat CardView yang berfungsi sebagai wadah utama. CardView diberi atribut cardCornerRadius="8dp" agar sudutnya membulat, cardElevation="8dp" untuk memberikan efek bayangan sehingga terlihat menonjol, dan cardUseCompatPadding="true" supaya tampilan padding konsisten di berbagai versi Android.

  Isi dari CardView adalah sebuah LinearLayout horizontal yang menampung dua elemen utama. Pertama, sebuah ImageView dengan ukuran 70dp x 70dp yang menampilkan gambar buku dari resource @drawable/bukubumi. ImageView ini diberi id img_buku sehingga bisa diakses dari kode Java/Kotlin.
Kedua, terdapat LinearLayout vertikal dengan padding 15dp yang berfungsi untuk menampilkan teks deskriptif terkait buku. Di dalamnya ada TextView untuk judul buku (tv_judulbuku) yang ditampilkan dengan gaya tebal dan warna hitam agar lebih menonjol.

  Selanjutnya terdapat LinearLayout tambahan yang bersifat horizontal. Di dalam layout ini ditampilkan dua informasi, yaitu nama penulis (tv_penulis) dengan warna abu-abu di sebelah kiri, serta tahun terbit (tv_tahunterbit) dengan warna abu-abu yang ditempatkan di sebelah kanan menggunakan atribut android:gravity="end". Dengan susunan ini, penulis dan tahun terbit dapat dilihat dalam satu baris namun tetap rapi dengan posisi yang berlawanan.

  Secara keseluruhan, kode tersebut membentuk satu komponen tampilan berbentuk kartu yang menampilkan gambar buku di sisi kiri, judul buku di bagian atas kanan, serta informasi penulis dan tahun terbit di bawahnya. Struktur ini sangat cocok digunakan pada daftar (list) atau grid yang menampilkan banyak data buku dalam aplikasi perpustakaan atau katalog bacaan.


## 📸 Screenshoot Hasil
