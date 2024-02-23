package com.example.keuangan

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var et_username = findViewById<EditText>(R.id.et_username)
        var et_password = findViewById<EditText>(R.id.et_password)
        var btn_reset = findViewById<Button>(R.id.btn_reset)
        var btn_submit = findViewById<Button>(R.id.btn_submit)

        btn_reset.setOnClickListener {
            et_username.setText("")
            et_password.setText("")
            Toast.makeText(this@MainActivity, "Success!", Toast.LENGTH_LONG).show()
        }

        btn_submit.setOnClickListener {
            val username = et_username.text.toString()
            val password = et_password.text.toString()

            AlertDialog.Builder(this)
                .setTitle("Login")
                .setMessage("Anda berhasil login")
                .setPositiveButton("ya") { dialogInterface: DialogInterface, i: Int ->
                    val intent = Intent(this@MainActivity, MainActivity2::class.java)
                    startActivity(intent)
                }
                .setNegativeButton("tidak") { dialogInterface: DialogInterface, i: Int ->
                    Toast.makeText(this@MainActivity, "Jalankan perintah", Toast.LENGTH_LONG).show()
                }
                .show()
        }
    }
}