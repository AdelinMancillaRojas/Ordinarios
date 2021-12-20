package com.itiudc.ordi_adelina.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.itiudc.ordi_adelina.R
import com.itiudc.ordi_adelina.adapters.ViewpageAdapter

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2 = findViewById<ViewPager2>(R.id.view_pager_2)

        val adapter = ViewpageAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter=adapter
        TabLayoutMediator(tabLayout, viewPager2){tab, position->
            when(position){
                0->{
                    tab.text = "Marvel Comics"
                }
                1->{
                    tab.text = "DogFact"
                }
            }
        }.attach()
    }
}