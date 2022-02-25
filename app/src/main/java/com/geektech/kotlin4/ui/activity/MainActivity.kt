package com.geektech.kotlin4.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.geektech.kotlin4.ui.fragments.FirstFragment
import com.geektech.kotlin4.ui.fragments.SecondFragment
import com.geektech.kotlin4.ui.fragments.ThirdFragment
import com.geektech.kotlin4.ui.adapters.PageAdapter
import com.geektech.kotlin4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragments: ArrayList<Fragment> = arrayListOf(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment(),
        )
        val adapter = PageAdapter(fragments, this)
        binding.pager.adapter = adapter
    }
}