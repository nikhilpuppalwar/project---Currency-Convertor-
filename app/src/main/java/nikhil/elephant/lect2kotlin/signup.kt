package nikhil.elephant.lect2kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import nikhil.elephant.lect2kotlin.databinding.ActivitySignupBinding

class signup : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnsignup.setOnClickListener {
            val email = binding.signupEmailAddress.text.toString()
            val password = binding.signupPassword.text.toString()
            val username = binding.signupUserName.text.toString()
            if (email.isNotEmpty() && password.isNotEmpty() && username.isNotEmpty()) {
                Toast.makeText(this, "Signup successful", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, login::class.java))
                finish()
            } else {
                Toast.makeText(this, "Signup failed", Toast.LENGTH_SHORT).show()
            }
        }

        binding.txtLogin.setOnClickListener {
            startActivity(Intent(this, login::class.java))
            finish()
        }

    }
}