package com.example.contactsme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactsme.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class ContactsMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.cast_1,
            R.drawable.cast_2,
            R.drawable.cast_3
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter
    }

}