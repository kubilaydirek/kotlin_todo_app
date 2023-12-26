package com.example.todoapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class TodoRecyclerView(private val mContext: Context, private val todoList: List<TodoModel>) :
    RecyclerView.Adapter<TodoRecyclerView.TodoViewHolder>() {
    inner class TodoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleText: TextView
        val cardView: CardView

        init {
            titleText = view.findViewById(R.id.titleTextView)
            cardView = view.findViewById(R.id.card_view)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view =
            LayoutInflater.from(mContext).inflate(R.layout.card_view, parent, false)
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todoList.size;
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.titleText.text = todoList[position].todoTitle
        holder.cardView.setOnClickListener {
            Toast.makeText(mContext, todoList[position].todoExplanation, Toast.LENGTH_LONG).show()
        }

    }
}