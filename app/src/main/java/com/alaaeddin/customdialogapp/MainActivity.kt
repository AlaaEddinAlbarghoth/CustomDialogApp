package com.alaaeddin.customdialogapp

import android.app.Dialog
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_login.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val d = Dialog(this@MainActivity)
            d.setTitle("Login")
            d.setContentView(R.layout.dialog_login)
            d.show()

            val btnOk = d.findViewById<Button>(R.id.btn_ok)
            val btnCancel = d.findViewById<Button>(R.id.btn_cancel)
            val etUsername = d.findViewById<EditText>(R.id.et_username)
            val etPass = d.findViewById<EditText>(R.id.et_pass)

            btnOk.setOnClickListener {
                Toast.makeText(this@MainActivity, "Button Ok Clicked ...\n " +
                        "Username Value is ${etUsername.text} \n Button Cancel Click \n" +
                        "Password Value is ${etPass.text} :P :P :P", Toast.LENGTH_LONG).show()
            }

            btnCancel.setOnClickListener {
                d.cancel()
            }
        }
    }
}
