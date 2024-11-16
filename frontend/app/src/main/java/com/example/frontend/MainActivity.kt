package com.example.frontend

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.frontend.databinding.ActivityMainBinding
import com.example.frontend.databinding.TodoItemsBinding

class MainActivity : AppCompatActivity() {
    private lateinit var todoItemBinding : TodoItemsBinding
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        todoItemBinding = TodoItemsBinding.inflate(layoutInflater)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(todoItemBinding.root)
        setContentView(activityMainBinding.root)
    }
}