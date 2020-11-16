package com.example.contactsme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactsme.adapters.ViewPagerAdapter

class ContactsMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupTabs()
    }

    private fun setupTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
    }

}