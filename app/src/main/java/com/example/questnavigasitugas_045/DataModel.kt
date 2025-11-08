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
            tanggalLahir = "23-12-2004",
            asal = "Bantul",
            role = "Gold Laner"
        ),
        Peserta(
            nama = "Wildan Indi",
            tanggalLahir = "1995-04-20",
            asal = "Bengkulu",
            role = "EXP Laner"
        ),
        Peserta(
            nama = "Harlan Fadhilah",
            tanggalLahir = "1988-11-02",
            asal = "Ngapak",
            role = "Jungler"
        ),
        Peserta(
            nama = "Dean Dwi Bekti",
            tanggalLahir = "1991-01-10",
            asal = "Ciamis",
            role = "Midlaner"
        ),
        Peserta(
            nama = "Rizky PP",
            tanggalLahir = "1996-07-22",
            asal = "Bantul",
            role = "Roamer"
        )
    )
}
