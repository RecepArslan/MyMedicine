package com.receparslan.mymedicine

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.receparslan.mymedicine.databinding.FragmentHomePageBinding
import com.receparslan.mymedicine.databinding.FragmentSplashScreenBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomePageFragment : Fragment() {
    private lateinit var binding: FragmentHomePageBinding
    val args: HomePageFragmentArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.setContentView(requireActivity(), R.layout.fragment_home_page);
        binding.textviews.setOnClickListener {
            view?.let { it1 -> Navigation.findNavController(it1).navigate(R.id.action_homePageFragment_to_splashScreen) }
        }
        var myNumber = args.number
        binding.textviews.text = myNumber.toString()
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }
    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}