package com.ahmeterdem.bootcampedu.odevler

fun main() {
    val func= Odev2Fonksiyonlar()
    //Celcius to Fahrenheit
    val celsius = 25.0
    val fahrenheit = func.cToF(celsius)
    println("$celsius Celsius = $fahrenheit Fahrenheit")

    //Dikdortgen Cevresi
    val kisaK = 5.0
    val uzunK = 10.0
    val cevre = func.dikdortgenCevresi(kisaK, uzunK)
    println("Dikdörtgenin çevresi: $cevre")

    //Faktoriyel
    val sayi = 5
    val faktoriyel = func.faktoriyel(sayi)
    println("$sayi sayısının faktoriyeli: $faktoriyel")

    //Kelimedeki a harflerinin sayisi
    val kelime = "Ahmet"
    val aHarfSayisi = func.kelimedeAHarfiSayisi(kelime)
    println("$kelime kelimesinde 'a' harfi sayısı: $aHarfSayisi")

    //Kenar sayisina gore ic acilar toplami
    val kenarSayisi = 5
    val icAciToplami = func.icAciToplami(kenarSayisi)
    println("$kenarSayisi kenar sayılı çokgenin iç açıları toplamı: $icAciToplami")

    //Maas Hesabi
    val calismaSaati = 10
    val maas = func.MaasHesapla(calismaSaati)
    println("Çalışma saati: $calismaSaati, Maaş: $maas")

    //Kota-Ucret Hesabi
    val harcanan = 120.0
    val kota = 100.0
    val ucret = func.KotaUcret(harcanan)
    println("Harcanan: $harcanan, Kota: $kota, Ucret: $ucret")

}