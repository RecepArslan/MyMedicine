package com.receparslan.mymedicine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.receparslan.mymedicine.databinding.FragmentSplashScreenBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashScreen : Fragment() {

   private lateinit var binding:FragmentSplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.setContentView(requireActivity(), R.layout.fragment_splash_screen);
        binding.textview.setOnClickListener {
            var action = SplashScreenDirections.actionSplashScreenToHomePageFragment(number=10)
            view?.let { it1 -> Navigation.findNavController(it1).navigate(action) }
    }
        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}