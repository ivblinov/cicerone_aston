package com.example.cicerone_aston

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cicerone_aston.databinding.FragmentCBinding

private const val TAG = "MyLog"
class FragmentC() : Fragment() {
    private var _binding: FragmentCBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // ????????????????????????????????
/*        App.instance.router.setResultListener(RESULT_KEY) { data ->
            Log.d(TAG, "Data = $data")
            binding.helloFragmentCTv.text = data as String
        }*/


        binding.goToFragmentD.setOnClickListener {
            App.instance.router.navigateTo(Screens.fragmentD())
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
        private const val RESULT_KEY = "result"
        fun newInstance(result: String) = FragmentC()
    }
}