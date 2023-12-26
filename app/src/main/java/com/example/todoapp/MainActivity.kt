package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import com.example.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var todoList = ArrayList<TodoModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView2.setOnClickListener {
            val action = MainFragmentDirections.actionMainFragmentToAddTodoFragment()
            Navigation.findNavController(this@MainActivity, R.id.fragmentContainerView)
                .navigate(action)
        }
    }
}