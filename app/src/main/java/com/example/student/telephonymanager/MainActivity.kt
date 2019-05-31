package com.example.student.telephonymanager

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.telecom.TelecomManager
import android.telephony.TelephonyManager
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text=findViewById<TextView>(R.id.text1)
        val tpm:TelephonyManager=getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager
        val s=tpm.networkCountryIso.toString()
        text.setText(s)
    }
}
