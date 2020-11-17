package com.example.contactsme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contactsme.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class ContactsMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupTabs()
    }

    private fun setupTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(TabFragment1(), "Home")
        adapter.addFragment(TabFragment2(), "Settings")
        adapter.addFragment(TabFragment3(), "Favourites")
        viewPager.adapter = adapter
    }
}