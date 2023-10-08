package com.example.cicerone_aston

import com.github.terrakok.cicerone.Screen
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun fragmentA(): Screen = FragmentScreen { FragmentA.newInstance() }
    fun fragmentB(): Screen = FragmentScreen { FragmentB.newInstance() }
    fun fragmentC(resultKey: String): Screen = FragmentScreen { FragmentC.newInstance(resultKey) }
    fun fragmentD(): Screen = FragmentScreen { FragmentD.newInstance() }
}