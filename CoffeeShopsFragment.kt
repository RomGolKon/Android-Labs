// CoffeeShopsFragment.kt

package com.example.city

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.city.databinding.FragmentCoffeeShopsBinding

class CoffeeShopsFragment : Fragment() {

    private var _binding: FragmentCoffeeShopsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCoffeeShopsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val vm = ViewModelProvider(this)[CityViewModel::class.java]
        binding.back.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.fragment_home)
        }
        vm.loadRecommendations(1)

        vm.recommendations.observe(viewLifecycleOwner) { recs ->
            if(recs.isNotEmpty())
            {
                binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
                binding.recyclerView.adapter = Adapter(recs)
                Log.d("CityReport", "Recommendations count: ${recs}")
            }

        }
    }
}