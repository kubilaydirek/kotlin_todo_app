package com.example.todoapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.todoapp.R
import com.example.todoapp.TodoModel
import com.example.todoapp.databinding.ActivityMainBinding
import com.example.todoapp.fragment.MainFragmentDirections

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var todoList = ArrayList<TodoModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addTodoImage.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToAddTodoFragment()
            Navigation.findNavController(this@MainActivity, R.id.fragmentContainerView).navigate(action)
        }
    }
}