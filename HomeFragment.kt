package com.example.city

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.city.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.coffeeButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.coffeeShopsFragment)
        }
        binding.restaurantsButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.restaurantsFragment)
        }
        binding.childFriendlyPlacesButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.childFriendlyPlacesFragment)
        }
        binding.parksButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.parksFragment)
        }
        binding.mallsButton.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.mallsFragment)
        }
    }


}