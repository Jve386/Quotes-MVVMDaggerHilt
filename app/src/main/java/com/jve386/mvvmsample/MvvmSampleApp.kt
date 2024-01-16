/**
 * This file defines the `MvvmSampleApp` class, which extends the Android `Application` class.
 * The `@HiltAndroidApp` annotation is used for Dagger Hilt integration.
 */
package com.jve386.mvvmsample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MvvmSampleApp : Application()
