package com.example.questnavigasitugas_045


data class Peserta(
    val nama: String,
    val tanggalLahir: String,
    val asal: String,
    val role: String
)

object DataProvider {
    val listPeserta = listOf(
        Peserta(
            nama = "Wildan Pratama",
            tanggalLahir = "23-07-2004",
            asal = "Bantul",
            role = "Gold Laner"
        ),
        Peserta(
            nama = "Wildan Indi",
            tanggalLahir = "11-05-2004",
            asal = "Bengkulu",
            role = "EXP Laner"
        ),
        Peserta(
            nama = "Harlan Fadhilah",
            tanggalLahir = "12-12-2004",
            asal = "Ngapak",
            role = "Jungler"
        ),
        Peserta(
            nama = "Dean Dwi Bekti",
            tanggalLahir = "31-12-2002",
            asal = "Ciamis",
            role = "Midlaner"
        ),
        Peserta(
            nama = "Rizky PP",
            tanggalLahir = "12-01-2003",
            asal = "Bantul",
            role = "Roamer"
        ) ,
        Peserta(
            nama = "Skylar",
            tanggalLahir = "22-12-2001",
            asal = "Bantul",
            role = "Gold Laner"
    )
    )
}
