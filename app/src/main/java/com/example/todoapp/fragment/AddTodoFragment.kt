package com.example.todoapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.todoapp.TodoModel
import com.example.todoapp.databinding.FragmentAddTodoBinding
import com.example.todoapp.view.MainActivity


class AddTodoFragment : Fragment() {
    private lateinit var binding: FragmentAddTodoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddTodoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonKaydet.setOnClickListener {
            if (binding.titleText.text.isEmpty()) {
                Toast.makeText(
                    requireContext(),
                    "'Başlık' alanı boş bırakılamaz.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val todo = TodoModel(binding.titleText.text, binding.explanationText.text)
                (activity as MainActivity).todoList.add(todo)
                Toast.makeText(
                    requireContext(),
                    "Başarılı bir şekilde kaydedildi.",
                    Toast.LENGTH_LONG
                )
                    .show()
            }

        }
        super.onViewCreated(view, savedInstanceState)
    }

}