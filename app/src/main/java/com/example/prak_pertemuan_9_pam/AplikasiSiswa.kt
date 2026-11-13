package com.example.prak_pertemuan_9_pam

import android.app.Application
import com.example.prak_pertemuan_9_pam.repositori.ContainerApp
import com.example.prak_pertemuan_9_pam.repositori.ContainerDataApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}