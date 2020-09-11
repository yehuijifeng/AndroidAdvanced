package com.lh.majiabao1.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lh.component.Contants
import com.lh.majiabao1.R

/**
 * user：LuHao
 * time：2020/9/11 14:06
 * describe：
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,Contants.AAA,Toast.LENGTH_LONG).show()
    }
}