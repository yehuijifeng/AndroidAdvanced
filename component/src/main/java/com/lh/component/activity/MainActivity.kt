package com.lh.component.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lh.component.Contants
import com.lh.component.R

/**
 * user：LuHao
 * time：2020/9/11 14:29
 * describe：
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_component)
        Toast.makeText(this, Contants.AAA, Toast.LENGTH_LONG).show()
    }
}