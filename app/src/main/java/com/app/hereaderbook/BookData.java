package com.app.hereaderbook;

import java.util.ArrayList;

public class BookData {
    private static String[] judulBuku = {
            "5 CM",
            "Assalamu Alaikum Beijing",
            "Dilan",
            "Dear Nathan",
            "Laskar Pelangi",
            "London Love Story 2",
            "Negeri 5 Menara",
            "Sang Pemimpi",
            "Surat Kecil Untuk Tuhan",
            "Tenggelamnya Kapal Van Der Wijck"
    };

    private static String[] detailBuku = {
            "Novel ini berceritakan mengenai kisah 5 orang pemuda dan pemudi yang menjalin persahabatan dan memiliki kepribadian yang berbeda. Tokoh-tokoh dalam novel ini yang pertama adalah Riani sosok gadis cantik yang berkacamata dan memiliki otak yang cerdas. Ia memiliki cita-cita yang tinggi ingin menjadi seorang presenter di salah satu stasiun TV.\n" +
                    "\n" +
                    "Tokoh selanjutnya ialah Zafran, gayanya sangat menampakkan bahwa dirinya adalah anak band, berbadan kurus, dan sosok Zafran ini selalu menjadi pelebur suasana dalam kisah 5 sahabat dalam novel 5 CM, kemudian adalah sosok Arial yang memiliki badan sporty dan selalu tampak rapi dalam acara apapun. Genta adalah sosok yang paling dewasa dan memiliki jiwa kepemimpinan, rambutnya agar lurus dan berjambul, memakai kacamata dan seorang aktifis kampus. Sosok terakhir adalah Ian, laki-laki bertubuh besar yang sangat mengidolakan Happy Salma.\n" +
                    "\n" +
                    "Kisah ini dimulai dari kejenuhan mereka yang selalu berkumpul bersama setiap harinya, akhirnya mereka memiliki ambisi untuk tidak bertemu selama beberapa tahun sampai apa yang mereka cita-citakan terwujud maka mereka akan berkumpul semacam reuni. Akhirnya waktu itu pun tiba, mereka berhasil meraih cita-cita yang diinginkan dan merka berkumpul untuk menanjak gunung yang sangat fenomenal di Indonesia, Gunung Mahameru. Kisah persahabatan 5 CM dalam perjalanan menuju puncak Mahameru pun diuji, kuatnya persahabatan mereka akhirnya berhasil menaklukan jalan yang penuh dengan perjuangan hingga akhirnya mereka dapat sampai di puncak gunung Mahameru.",

            "Novel Assalamualaikum Beijing ini menjelaskan mengenai kisah sepasang kekasih Dewa dan Ra. Kisah cinta mereka sudah dimulai semenjak mereka masih duduk dibangku kuliah. Bahkan Dewa dan Ra memutuskan untuk melanjutkannya ke jenjang yang lebih serius lagi yaitu mahligai rumah tangga. Namun siapa kira seiring berjalannya waktu ternyata harapan itu tidak dapat diwujudkan karena Dewa telah mengkhianati Ra di belakangnya dengan berselingkuh bersama Anita, sehingga pernikahan yang sudah didambakan sejak lama pupus begitu saja karena pengkhianatan yang diberikan oleh Dewa.\n" +
                    "\n" +
                    "Akhirnya Dewa dengan sesal menikahi Anita karena dia harus mempertanggung jawabkan perbuatannya yang telah memghamili Anita, Dewa merasa sangat menyesal atas apa yang telah ia lakukan kepada Ra. Ra sosok gadis yang dikhianati oleh Dewa akhirnya memutuskan untuk pergi ke Beijing untuk merajut impiannya kembali. Di saat perjalanannya di Beijing Ra bertemu dengan seorang lelaki tampan yang ramah dan mengenalkan kepada Ra kisah cinta Ratu Ashima yang merupakan Ratu dari Yunani.\n" +
                    "\n" +
                    "Ia bernama Zhongwen dan lelaki ini memanggil Ra dengan sebutan Ashima karena menurutnya sosok Ra memiliki wajah dan kepribadian yang sama. Ra pun menceritakan perjalanannya saat bersama Zhongwen kepada Sekar sahabatnya. Dan Sekar memberikan nasihat kepada Ra agar sedikit demi sedikit harus mulai membuka hatinya untuk orang lain.\n" +
                    "\n" +
                    "Panjang kisah Zhongwen mulai mencintai Ra dan mencari sosok Ra, akhirnya mereka dipertemukan kembali dan Ra mengajarkan kepada Zhongwen mengenai Agama Islam. Akhirnya Zhongwen memeluk agama Islam, walaupun keluarganya menentang keputusan Zhongwen. Namun seiring berjalannya waktu Ra pergi ke Indonesia karena penyakit yang ia alami APS yang menyebabkan kondisinya melemah, setelah Zhongwen mengetahui tentang keadaan Ra maka ia memutuskan untuk terbang menuju Indonesia.\n" +
                    "\n" +
                    "Kisah cinta Ra dan Zhongwen berakhir dengan penuh cinta dan bahagia karena mereka memutuskan untuk saling menikah, sedangkan Dewa dan Anita membangun keluarga kecil yang sudah memiliki anak, namun tetap saja cinta Dewa hanya untuk Ra, karena menikahnya Dewa dengan Anita akibat jebakan yang dibuat Anita untuk merebut Dewa dari Ra",
            "Novel Dilan ini diangkat dari kisah percintaan di masa-masa SMA. 2 tokoh yang diangkat adalah Milea dan Dilan. Dilan adalah sosok lelaki yang memiliki kepribadian yang cukup aneh, pasalnya ia adalah cowok yang bandel dan sering berulah, ia pun sering mengikuti kegiatan geng motor, namun anehnya Dilan ini selalu mendapatkan peringkat pertama di kelasnya. Hal ini yang membuat Milea penasaran dengan sosok Dilan. Walaupun Dilan sering dikenal banyak ulah namun cowok cerdas ini menyukai sastra yang selalu ia buat untuk Milea.\n" +
                    "\n" +
                    "Novel Dilan ini seolah menceritakan curhatan hati dari seorang Milea yang hanyut dalam gombalan dari Dilan, ia bingung dengan sikap Dilan yang aneh, seolah mengungkapkan perasaannya pada Milea namun seperti diambang, karena Milea tidak mendapatkan suatu kepastian dari Dilan.\n" +
                    "\n" +
                    "Dilan adalah sosok cowok yang sangat menyukai sastra sehingga dalam menyatakan cinta pun ia memiliki cara yang berbeda dan unik sehingga Milea merasa bingung dengan perasaan Dilan yang sesungguhnya Milea. Kisah Dilan ini diangkat seperti tahun 1990 yang sangat unik, walaupun kisah ini menceritakan kisah percintaan masa putih abu-abu namun ini dikemas dengan cara yang berbeda.",
            "Novel Dear Nathan ini bergenre roman, yang mengisahkan suatu kisah di masa putih abu-abu. Di dalam kisah tersebut terkisah 2 insan yang memiliki kepribadian yang sangat berbeda bak langit dan bumi. Sebut saja Salma, gadis lugu yang sangat takut jika berbuat kesalahan itu pindah ke sekolah yang di dalamnya terdapat banyak sekali murid-murid yang berlatar belakang urakan. Sungguh hal ini membuat Salma merasa tidak nyaman. Terlebih lagi pada hari pertama Salma pindah ke sekolah barunya dan ia sudah mendapatkan masalah karena telat datang ke sekolah barunya. Namun ada seorang laki-laki yang membantu Salma lolos dari hukuman keterlambatan pada saat itu, dia bernama Nathan cowok yang sangat terkenal dengan sifatnya yang sering membuat ulah disekolah.\n" +
                    "\n" +
                    "Namun seiring berjalannya waktu Nathan merasa ada yang berbeda dalam dirinya, ia merasa bahwa Salma dapat memberikan hal yang positif untuknya dan selama berada dekat Salma, Nathan sering merasa ada perasaan yang aneh menyelimutinya.\n" +
                    "\n" +
                    "Setelah banyak waktu yang ia habiskan bersama dengan Salma selama di sekolah Nathan banyak mengalami perubahan, ia yang terkenal dengan sifatnya yang senang membuat olah setelah mengenal Salma ia menjadi pribadi yang lebih baik lagi, namun apakah Salma merasakan hal yang sama dengan apa yang Nathan rasakan? Nathan pun takut untuk menyatakan perasaan yang sesungguhnya kepada Salma karena selama ini Salma selalu bersikap jutek dan cuek terhadap Nathan.",
            "Novel yang ditulis oleh Andrea Hirata ini berkisahkan 10 orang anak yang tinggal di Belitung Timur, Desa Gantung Kabupaten Gantung. Kisah ini awalnya dimulai karena Depdikbud yang akan membubarkan sekolah Muhamamadiyah yang terancam akan dibubarkan jika tidak memiliki 10 murid.\n" +
                    "\n" +
                    "Saat itu kepala sekolah Pak Hafran mengumumkan jika jumlah muridnya tidak mencapai 10 orang maka Depdikbud akan membubarkan sekolah tersebut. Namun tak lama setelah Pak Hafran mengumumkan hal tersebut maka datang Harun dan ibunya yang hendak mendaftarkan dirinya di sekolah Muhammadiyah tersebut.\n" +
                    "\n" +
                    "Kisah Laskar Pelangi dari sini dimulai, ketika Bu Muslimah yang akrab disapa Bu Mus yang memberi nama mereka dengan sebutan Laskar Pelangi. Laskar pelangi ini tak hanya menceritakan mengenai Borek yang ceroboh, Kucai yang sering protes, Mahar yang diam-diam memiliki bakat yang menakjubkan, Ikal yang mengalami peristiwa jatuh cinta, dan Lintang yang pekerja keras dan tidak mudah menyerah.\n" +
                    "\n" +
                    "Nama yang diberikan oleh Bu Mus ini dikarenakan para murid yang jumlahnya hanya 10 orang ini memiliki semangat yang sangat luar biasa. Buktinya hal itu ditunjukkan dengan kecerdasan Lintang yang mampu mengalahkan Drs.Zulfikar yang terkenal memiliki otak yang cerdas dan jabatan yang tinggi di PN. Kemenangan yang diraih oleh Mahar pada acara karnaval 17 Agustus.\n" +
                    "\n" +
                    "Kisah laksar pelangi ini tidak hanya mencerikan mengenai kisah mereka dalam lingkup sekolah saja melainkan kisah ini sangat berliku mulai dari kisah kematian ayah Lintang yang dengan tidak sengaja memaksa Lintang yang dijuluki Einstein kecil itu dipaksa untuk putus sekolah. Dan tak lama kisah haru disusul oleh Ikal yang harus melanjutkan sekolahnya di kampung halamannya diluar kampung Belitong.",
            "Awal mula pembuatan novel ini karena banyaknya permintaan penonton karena awalnya cerita London Love Story ini diawali dari sebuah Film akhirnya penulis skenario Tisa TS membuat dalam bentuk novel yang didampingi oleh Stanley Meulen dalam pengeditan novel London Love Story.\n" +
                    "\n" +
                    "Novel love story dikemas sedikit berbeda dengan filmnya, cerita dalam novel ini menceritakan mengenai bagaimana kelanjutan cinta dimasa depan. Bagaimana seseorang mempertahankan dan memperjuangkan cintanya untuk masa yang akan datang. Novel London Love Story ini lebih menekankan mengenai perihal cinta dan sedikit kisah persabahatan.\n" +
                    "\n" +
                    "Kisah yang dituangkan dalam Novel London Love Story ini sangat kental dengan bumbu percintaan, bagaimana seseorang dapat membuka cintanya kembali, percaya dengan cinta yang indah. Novel ini juga berlatar belakang kota London yang menggambarkan kesejukannya dan menampilkan beberapa tempat yang indah di Kota London. London love story ini juga mengangkat beberapa objek di Kota Dewata Bali.",
            "Novel 5 Menara, karya sastra miliki Ahmad Fuadi yang telah diangkat ke film layar lebar. Mengusung tema religius dan moralitas. Tokoh utama dalam novel ini bernama Alif.\n" +
                    "\n" +
                    "Alif lahir di tanah Minangkabau, ia dilahirkan di pinggir Danau Maninjau dan tidak pernah ia menginjak tanah di luar Minangkabau. Sejak kecil, Alif memiliki cita-cita menjadi B. J. Habibie.\n" +
                    "\n" +
                    "Karena itu ia sudah berencana setelah lulus SMP ingin melanjutkan pendidikan ke SMU negeri di Padang, dengan harapan dapat memudahkan langkahnya untuk menorobos kuliah di jurusan yang sesuai.\n" +
                    "\n" +
                    "Di sisi lain, Amak Alif menginginkan ia jadi penerus Buya Hamka, membuat mimpi dan harapan Alif kandas. Alif diberi pilihan, ingin sekolah agama atau menuntut ilmu di pondok pesantren. Sempat kesal, namun akhirnya Alif ikhlas, karena ia tak ingin mengecawakan harapan orang tuanya, terutama ibu. Alif pun menuruti keinginan ibunya dan masuk pondok.\n" +
                    "\n" +
                    "Alif mendapatkan saran dari pamannya yang di Cairo untuk melanjutkan di pondok yang ada di Jawa Timur, yaitu Pondok Madani (Pondok Pesantren Modern Gontor).",
            "Novel sang pemimpi ini adalah sebuah kisah persahabatan yang berjuang untuk mendapatkan pendidikan yang layak. Penulis menggambarkan bahwa cita-cita memang harus diwujudkan dengan tekad yang kuat. Novel ini mengangkat betapa sulitnya mendapatkan pendidikan yang layak di tanah Belitung.\n" +
                    "\n" +
                    "Namun hal itu tak membuat para tokoh Sang Pemimpi itu lantas mundur dan menyerah begitu saja. Mereka memiliki tekad yang kuat untuk bersekolah di SMA Negeri yang nantinya akan menghantarkan mereka ke Kota Sorbenne, Perancis. Novel ini berceritakan bahwa setiap orang berhak bermimpi dan memiliki cita-cita setinggi langit dan itu dibuktikan pada kisah nyata sang penulis yang dituangkan dalam novel Sang Pemimpi. Setelah para tokoh sang pemimpi dapat meraih cita-citanya untuk melanjutkan sekolah ke SMA Negeri, sesungguhnya perjuangan mereka tak berhenti sampai disitu saja. Untuk mewujudkan mimpi bersekolah di SMA Negeri pun mereka rela untuk tinggal di daerah pasar yang kumuh. Tak berhenti perjuangan toko sang pemimpi tersebut, selain mereka tinggal ditempat yang kumuh mereka juga bekerja sebagai kuli ngambat di pasar kumuh itu agar mereka dapat memenuhi kebutuhan hidupnya di luar.\n" +
                    "\n" +
                    "Kisah sang pemimpi ini di dalamnya mengangkat beberapa tokoh, seperti Arai yang hidupnya sangat sebatang kara, lalu ada tokoh seorang Jimbron yang teguh dalam prinsip agama Islamnya walaupun sedari kecil ia dididik oleh seorang pendeta, tak lupa tokoh Ikal yang orangtuanya akan mengalami kebangkrutan.\n" +
                    "\n" +
                    "Ditengah-tengah keterpurukan ini 3 Sang Pemimpi itu mulai berambisi untuk mulai berani bermimpi, hal ini diawali dengan sosok Arai yang memulai mimpi dan kemudia disusul oleh kedua temannya, alhasil mereka bermodal nekat dan yakin berjuang untuk meraih cita-cita dan pergi meninggalkan kampung halaman. Uniknya lagi dalam novel ini diselingkan dengan beberapa kisah cinta yang unik dari para Sang Pemimpi ketika mereka tengah meraih cita-citanya.",
            "Kisah yang ditulis oleh Agnes Davonner ini menggambarkan kisah nyata dari seorang gadis remaja yang berjuang melawan kanker ganas yang ia derita. Ketika gadis itu diprediksi bahwa umurnya sudah tidak lama lagi namun gadis tersebut tetap menjalani aktivitasnya seperti biasa tanpa ada rasa mengeluh yang terucap dari bibirnya. Sebut saja ia Keke, nama panggilannya ia tinggal bersama orangtua tersayangnya. Keke adalah sosok gadis remaja yang sangat periang dan aktif dalam kegiatan intra atau ekstra sekolah. Hal itu menyebabkan ia memiliki teman yang banyak.\n" +
                    "\n" +
                    "Saat masa-masa dimana Keke mengetahui tentang penyakitnya dan di vonis oleh dokter tidak akan lama lagi hidupnya, hal itu tak menggentarkan hati Keke untuk tetap terus bersekolah, walaupun lambat laun kondisi fisiknya banyak yang berubah, kanker itu seolah menggerogoti tubuh Keke gadis yang pintar itu, wajah Keke yang semula cantik dan berseri berubah bak seorang monster yang mengerikan, namun hal ini tak menjadikan Keke patah semangat dalam belajar dan menuntut ilmu. Keke juga lambat laun mengalami kerontokan pada rambut di kepalanya karena efek kemoterapi yang ia lakukan. Maka dari itu sehari-harinya Keke menggunakan rambut palsu.\n" +
                    "\n" +
                    "Ketika sang Ayah melihat keadaan Keke yang semakin hari semakin memburuk kondisinya, hal itu membuat Ayahnya tidak tega atas apa yang dialami oleh puterinya. Namun orangtuanya pun tidak tega jika melihat Keke di operasi agar dapat menyembuhkan wajahnya. Perjuangan Ayah Keke tak berhenti sampai disitu saja, ia terus mencari beberapa alternatif pengobatan yang dapat membantu puterinya untuk menyembuhkan kanker yang diidap oleh Keke. Namun hasilnya sama sekali tidak berbuah apapun, Keke masih saja terus melemah dan memburuk dengan penyakit kankernya. Akhirnya sang Ayah mengambil tindakan medis lagi dan Keke menjalani kemoterapi yang mengakibatkan kerontokan pada rambut di kepalanya, namun hasil dari kemoterapi ini tidak sia-sia karena Keke berhasil bertahan dari vonis dokter yang menyatakan bahwa dirinya akan meninggal dalam waktu dekat.\n" +
                    "\n" +
                    "Kebahagiaan yang menyelimuti mereka tak lama, dan dalam kisah Surat Kecil Untuk Tuhan juga menceritakan kisah betapa setianya teman-teman Keke yang selalu mensupport dan tak malu untuk berteman dengan Keke, setelah dinyatakan Keke sembuh dari penyakit Kanker ganas itu tak lama kemudian Keke mengalami hal yang aneh dan tak lama dari itu setelah dilakukan penelitian bahwa kanker ganas yang diidap oleh Keke telah mengakar pada tubuhnya sehingga sulit untuk dimusnahkan.\n" +
                    "\n" +
                    "Sebelum Keke meninggal dunia ia menuliskan Surat Kecil Untuk Tuhan, dan ditengah kabar haru kepergian Keke, ada juga kabar bahagia yang datang bahwa Keke mendapatkan nilai terbesar pada ujian akhir semester yang beberapa bulan lalu ia lalui.\n" +
                    "\n" +
                    "c. Kelebihan\n" +
                    "\n" +
                    "Resensi Novel Surat Kecil untuk Tuhan – Kelebihan dari cerita dalam novel ini adalah penulis berhasil menghantarkan pesannya kepada pembaca, walaupun dalam bentuk yang tersirat. Bahwa semangat hidup itu tetap harus ada sekalipun tubuh dan keadaan tidak memungkinkan kita untuk bertahan. Melalui novel ini juga pembaca seolah mendapatkan kekuatan yang besar dari perjuangan Keke dalam melawan kanker ganasnya.",
            "Sebuah novel yang fenomenal, hingga diangkat menjadi film. Novel fenomenal ini adalah karya penulis tersohor yaitu Prof. Dr. Haji Abdul Malik Karim Amrullah atau lebih dikenal dengan nama Buya Hamka.\n" +
                    "\n" +
                    "Pada pertama kali Buya Hamka menulis novel ini yaitu sebuah cerita bersambung yang diterbitkan di majalah. Isi yang terkandung di dalam novelnya yaitu Buya Hamka mengkritik suatu tradisi milik masyarakat minang pada kala itu, terutama dalam hal perkawinan paksa.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "Novel ini berkisah tentang dua insan yang saling mencintai dengan penuh rasa tulus, ikhlas, dan suci. Dibalik kisah cinta mereka, ada latar belakang mengenai peraturan adat yang sangat tegak. Adat minang kala itu menganggap bahwa warisan dapat membuat orang berselisih.\n" +
                    "\n" +
                    "Zainuddin, seorang yatim piatu yang memiliki nasib pilu, ia terbuang dari tanah kelahirannya, Makassar. Terbuangnya ia dikarenakan ibunya asli Makassar lalu menikah dengan ayahnya yang asli Minang.\n" +
                    "\n" +
                    "Pada mulanya Zainuddin tidak mengetahui bahwa tanah asalnya yaitu negeri Minangkabau. Ia baru mengetahui akan hal itu saat ayahnya menyampaikan pesan terakhir. Lalu pada suatu hari Zainuddin memutuskan untuk mengunjungi Padang Panjang.\n" +
                    "\n" +
                    "Awalnya Zainuddin merasa senang, namun setelah sampai sana ia masih dianggap orang asing, hingga perasaaan senangnya pudar. Seiring berjalannya waktu ia mulai jenuh dengan keadaan itu, dan pada saat itu juga ia bertemu dengan Hayati.\n" +
                    "\n" +
                    "Hayati, seorang gadis Minang yang membuat Zainuddin terpesona dan Hayati pula yang membuat ia bertahan di sana. Karena pada saat itu belum ada teknologi komunikasi modern, mereka berdua berkomunikasi dengan media surat menyurat.\n" +
                    "\n" +
                    "Seiring berjalannya waktu, mereka merasakan perasaan yang sama, yaitu jatuh cinta. Kabar mengenai hubungan mereka tersebar luas hingga menjadi bahan pembicaraan orang Minang. Keluarga Hayati merupakan keluarga leluhur terpandang.\n" +
                    "\n" +
                    "Mamaknya Hayati mempercayai bahwa kabar hubungan mereka akan menjadi aib bagi keluarga terpandang tersebut. Kemudian mamak Hayati memanggil Zainuddin dan menyuruhnya untuk pergi dari negeri Batipuh. Lalu akhirnya Zainuddin pergi ke Pandang Panjang.\n" +
                    "\n" +
                    "Saat sebelum pergi, Hayati sempat menemui Zainuddin, mereka berdua saling berjanji untuk terus setia dan selalu kirim surat.\n" +
                    "\n" +
                    "Pada suatu hari Hayati mengunjungi Padang Panjang dan menyinggahi rumah temannya Khadijah. Hayati merasa senang karena mendapatkan peluang untuk melepas rindu dengan Zainuddin."
    };

    private static String[] moreDetail = {
            "Judul Buku :\n5 CM\n\n" +
                    "Tahun Terbit :\nMei 2005\n\n" +
                    "Kota Terbit :\nYogyakarta\n\n" +
                    "Penulis :\nDhonny Dhirgantoro\n\n" +
                    "Jumlah Halaman :\n381 hlm\n\n" +
                    "Nomor Edisi Terbit :\nISBN 979-759-151-4",
            "Judul Buku :\nAssalamualaikum Beijing\n\n" +
                    "Penerbit :\nNourabooks\n\n" +
                    "Tahun Terbit :\nOktober 2013\n\n" +
                    "Penulis :\nAsma Nadia\n\n" +
                    "Genre :\nFiksi Islami\n\n" +
                    "Nomer Edisi :\nISBN 9786021606155",
            "Judul Buku :\nDilan 1990\n\n" +
                    "Tahun Terbit :\n2015\n\n" +
                    "Penulis :\nPidi Baiq\n\n" +
                    "Penerbit :\nPastel Books\n\n" +
                    "Jumlah halaman :\n332 halaman\n\n" +
                    "Nomor Edisi :\nISBN 978-602-7870-41-3",
            "Judul buku :\nDear Nathan\n\n" +
                    "Penerbit :\nBest Media\n\n" +
                    "Tahun Terbit :\nMaret 2016\n\n" +
                    "Jumlah Halaman :\n528 hlm\n\n" +
                    "Nomor Edisi :\nISBN 978-602-6940-14-8",
            "Judul buku resensi :\nLaskar Pelangi\n\n" +
                    "Genre :\nRoman\n\n" +
                    "Penerbit :\nYogyakarta, Bandung Pustaka\n\n" +
                    "Penulis :\nAndrea Hirata\n\n" +
                    "Tahun terbit :\n2005\n\n" +
                    "Jumlah halaman :\n529 hlm\n\n" +
                    "Nomor Edisi Terbit :\nISBN 970-3062-79-7",
            "Judul Buku :\nLondon Love Story\n\n" +
                    "Penerbit :\nLoveable\n\n" +
                    "Tahun Terbit :\nDesember 2015\n\n" +
                    "Penulis :\nTisa TS dan didampingi oleh Stanley Meulen\n\n" +
                    "Jumlah halaman :\n192 halaman\n\n" +
                    "Nomer Edisi :\nISBN 978-602-72989-7-2",
            "- Judul Buku :\nNegeri 5 Menara\n\n" +
                    "- Penulis :\nAhmad Fuadi\n\n" +
                    "- Tebal Buku :\n423 halaman\n\n" +
                    "- Penerbit :\nPT. Gramedia Pustaka Utama\n\n" +
                    "- Tahun Terbit :\n2009",
            "Judul Buku Resensi :\nSang Pemimpi\n\n" +
                    "Tahun Terbit :\n2011\n\n" +
                    "Penerbit :\nPT.Bentang Pustaka\n\n" +
                    "Penulis :\nAndrea Hirata\n\n" +
                    "Jumlah Halaman :\n248 hlm",
            "Judul Buku :\nSurat Kecil Untuk Tuhan\n\n" +
                    "Jumlah Halaman :\n232 halaman\n\n" +
                    "Penulis :\nAgnes Davonner\n\n" +
                    "Tahun Terbit :\n2008\n\n" +
                    "Penerbit :\nInandra Published",
            "Judul Buku: Tenggelamnya Kapal Van Der Wijck\n\n" +
                    "Penulis :\nBuya Hamka\n\n" +
                    "Tebal Buku :\n225 halaman\n\n" +
                    "Penerbit :\nPT. Bulan Bintang\n\n" +
                    "Tahun Terbit :\n2012"
    };

    private static int[] booksImages = {
            R.drawable.novel5cm,
            R.drawable.assalamualaikum_beijing,
            R.drawable.dilan,
            R.drawable.dilan_nathan,
            R.drawable.laskar_pelangi,
            R.drawable.london_love_story,
            R.drawable.negeri_5_negara,
            R.drawable.sang_pemimpi,
            R.drawable.surat_kecil_untuk_tuhan,
            R.drawable.van_der_wijck
    };


    static ArrayList<Book> getListData() {
        ArrayList<Book> list = new ArrayList<>();
        for (int position = 0; position < judulBuku.length; position++) {
            Book hero = new Book();
            hero.setJudul(judulBuku[position]);
            hero.setDetail(detailBuku[position]);
            hero.setPhoto(booksImages[position]);
            hero.setMoreDetail(moreDetail[position]);
            list.add(hero);
        }
        return list;
    }

}
