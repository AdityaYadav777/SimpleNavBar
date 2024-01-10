package com.aditya.simplenavbar

import android.net.wifi.hotspot2.pps.HomeSp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.aditya.simplenavbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
swapFragment(HomeFrag())
   binding.myNav.setOnItemSelectedListener {

       when (it.itemId) {

           R.id.myhome->swapFragment(HomeFrag())
           R.id.myReels->swapFragment(ReelsFrag())
           R.id.mySetting->swapFragment(SettingFrag())


           else->{

           }

       }
       true




   }

    }
 fun swapFragment(fragment: Fragment){

        val fragmentManager=supportFragmentManager
        val manager=fragmentManager.beginTransaction()
        manager.replace(R.id.myFrame,fragment)

        manager.commit()

    }

}