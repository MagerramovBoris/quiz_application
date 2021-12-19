package com.example.quiz_application.views.activities

import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.lottie.LottieAnimationView
import com.example.quiz_application.broadcast.MyBroadCast
import com.example.quiz_application.broadcast.MyBroadCast.ConnectionInterface
import com.example.quiz_application.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), ConnectionInterface {

    private lateinit var myBroadCast: MyBroadCast
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        myBroadCast = MyBroadCast()
    }

    override fun onStart() {
        super.onStart()
        val intentFilter = IntentFilter()
        intentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION)
        registerReceiver(myBroadCast, intentFilter)
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(myBroadCast)
    }

    override fun connectivity(isConnected: Boolean) {
        if (isConnected) {
            activityMainBinding.constrainedAnim.visibility = View.GONE
            activityMainBinding.fragConstraintId.visibility = View.VISIBLE
        } else {
            activityMainBinding.constrainedAnim.visibility = View.VISIBLE
            activityMainBinding.fragConstraintId.visibility = View.INVISIBLE
        }
    }
}