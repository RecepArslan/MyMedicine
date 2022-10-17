package com.receparslan.mymedicine.base

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log

abstract class BaseApplication : Application(), Application.ActivityLifecycleCallbacks  {

    lateinit var foregroundActivity: Activity

    override fun onCreate() {
        super.onCreate()

        application = this
        registerActivityLifecycleCallbacks(this)
    }

    companion object {
        lateinit var application: BaseApplication
    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        foregroundActivity = activity
        Log.d("TAG", "onActivityCreated: " + activity::class.java.simpleName)
    }

    override fun onActivityStarted(activity: Activity) {}

    override fun onActivityResumed(activity: Activity) {
        foregroundActivity = activity
    }

    override fun onActivityPaused(activity: Activity) {}
    override fun onActivityStopped(activity: Activity) {}
    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {}
    override fun onActivityDestroyed(activity: Activity) {}
}