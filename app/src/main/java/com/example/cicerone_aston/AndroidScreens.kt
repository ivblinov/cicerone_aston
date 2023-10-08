package com.example.cicerone_aston

import com.github.terrakok.cicerone.Screen
import com.github.terrakok.cicerone.androidx.FragmentScreen

class AndroidScreens {
    fun fragmentA(): Screen = FragmentScreen { FragmentA.newInstance() }
    fun fragmentB(): Screen = FragmentScreen { FragmentB.newInstance() }
    fun fragmentC(): Screen = FragmentScreen { FragmentC.newInstance() }
    fun fragmentD(): Screen = FragmentScreen { FragmentD.newInstance() }
}