package com.ahmeterdem.bootcampedu.odevler

class Odev2Fonksiyonlar {

        //Celcius to Fahrenheit
        fun cToF(celcius: Double): Double {
            return (celcius * 1.8) + 32
        }

        // Dikdortgen Cevresi
        fun dikdortgenCevresi(kisaK: Double, uzunK: Double): Double {
            return 2 * (kisaK + uzunK)
        }

        //Faktoriyel
        fun faktoriyel(sayi: Int): Int {
            var sonuc = 1
            for (i in 1..sayi) {
                sonuc *= i
            }
            return sonuc
        }

        //Kelimedeki a harflerinin sayisi
        fun kelimedeAHarfiSayisi(kelime: String): Int {
            var sayac = 0
            for (harf in kelime) {
                if (harf == 'a' || harf == 'A') {
                    sayac++
                }
            }
            return sayac
        }

        //Kenar sayisina gore ic acilar toplami
        fun icAciToplami(kenarSayisi: Int): Int {
            if (kenarSayisi < 3) {
                return 0
            }
            return (kenarSayisi - 2) * 180
        }

        //Maas Hesabi
        fun MaasHesapla(calismaSaati:Int):Double {
            val toplamCalismaSaati = 30*calismaSaati
            val calismaUcreti= 10.0
            val mesaiUcreti= 20.0
            if(toplamCalismaSaati<=160){
                return toplamCalismaSaati*calismaUcreti
            }
            else{
                val mesaiSaati = toplamCalismaSaati - 160
                val normalMaas = 160 * calismaUcreti
                val mesaiMaasi = mesaiSaati * mesaiUcreti
                return normalMaas + mesaiMaasi
            }
        }

        //Kota-Ucret Hesabi
        fun KotaUcret(harcanan:Double):Double{
            val kota = 50
            if(harcanan<=kota){
                return 100.0
            }
            else{
                return 100.0 + (harcanan-kota)*4
            }
        }
}