package com.chatapp

import android.os.Bundle // Added
import org.devio.rn.splashscreen.SplashScreen // Added
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.fabricEnabled
import com.facebook.react.defaults.DefaultReactActivityDelegate

class MainActivity : ReactActivity() {

   override fun onCreate(savedInstanceState: Bundle?) {
    SplashScreen.show(this);  // add this
    super.onCreate(null)
  }
}