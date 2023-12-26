package com.example.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoapp.databinding.FragmentAddTodoBinding
import com.example.todoapp.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        val adapter = TodoRecyclerView(requireContext(), (activity as MainActivity).todoList)
        binding.recyclerView.adapter = adapter;
        return binding.root
    }

}