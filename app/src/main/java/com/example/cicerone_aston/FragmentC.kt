package com.example.cicerone_aston

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cicerone_aston.databinding.FragmentCBinding

class FragmentC : Fragment() {
    private var _binding: FragmentCBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goToFragmentD.setOnClickListener {
            App.instance.router.navigateTo(AndroidScreens().fragmentD())
        }

        binding.goToBack.setOnClickListener {
            App.instance.router.exit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        fun newInstance() = FragmentC()
    }
}