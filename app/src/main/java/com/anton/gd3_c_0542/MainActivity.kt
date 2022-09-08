package com.anton.gd3_c_0542

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    // Atribue yang akan kita pakai
    private lateinit var inputUsername: TextInputLayout
    private lateinit var  inputPassword: TextInputLayout
    private lateinit var  mainLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ubah Tittle pada App Bar Aplikasi
        setTitle("User Login")

        // Hubungkan variabel dengan view di layoutnya.
        inputUsername = findViewById(R.id.inputLayoutUsername)
        inputPassword = findViewById(R.id.inputLayoutPassword)
        mainLayout = findViewById(R.id.mainLayout)
        val btnClear: Button = findViewById(R.id.btnClear)
        val btnLogin: Button = findViewById(R.id.btnLogin)

        // Aksi btnClear ketika di klik
        btnClear.setOnClickListener { // Mengkososongkan Input }
            inputUsername.getEditText()?.setText("")
            inputPassword.getEditText()?.setText("")

            // Memunculkan Snackbar
            Snackbar.make(mainLayout, "Text Cleared Succes",Snackbar.LENGTH_LONG).show()
        }

        // Aksi pada btnLogin
        btnLogin.setOnClickListener(View.OnClickListener {
            var checkLogin = false
            val username: String = inputUsername.getEditText()?.getText().toString()
            val password: String = inputPassword.getEditText()?.getText().toString()

            // Pengecekan apakah inputan kosong
            if (username.isEmpty()) {
                inputUsername.setError("Username must be filled with text")
                checkLogin = false
            }

            // Pengecekan apakah inputan kosong
            if (password.isEmpty()) {
                inputPassword.setError("Password must be filled with text")
                checkLogin = false
            }

            // Ganti Password dengan NPM kalian
            if (username == "admin" && password == "0542") checkLogin = true
            if(!checkLogin) return@OnClickListener
            val moveHome = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(moveHome)
        })
    }
}