package com.receparslan.mymedicine.base

import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyMedicineApp:BaseApplication() {
    companion object {

        fun getApplication(): BaseApplication {
            return application
        }
    }
}