package com.example.android_kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)
        val textView = findViewById<TextView>(R.id.textView)

        Users.users.add(User("Ivan", "Ivanov", 25))
        Users.users.add(User("1", "2", 11))
        val user1 = User("Ivan", "Ivanov", 25).toString()
        button.setOnClickListener {
            Toast.makeText(this, user1, Toast.LENGTH_LONG).show()
            textView.text = ""
            textView.append(Users.users[0].toString())
            textView.append(Users.users[1].toString())
            println()
        }
        button2.setOnClickListener {
            for (i in 1..10) {
                println("Hello Kotlin")
            }
            for (i in 10 downTo 1 step 2) {
                println("Bye Kotlin")
            }
            for (i in 0 until Users.users.size) {
                println(Users.users[i])
            }
        }
    }

    data class User(val firstName: String, val lastName: String, val age: Int)

    object Users {
        val users = arrayListOf<User>()
    }
}
