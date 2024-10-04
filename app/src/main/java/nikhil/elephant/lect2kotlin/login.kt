package nikhil.elephant.lect2kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import nikhil.elephant.lect2kotlin.databinding.ActivityLoginBinding

class login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.btnlogin.setOnClickListener {
    val email = binding.loginEmailAddress.text.toString()
    val password = binding.loginPassword.text.toString()

    if (email.isNotEmpty() && password.isNotEmpty()) {
        Toast.makeText(this, "login successful", Toast.LENGTH_SHORT).show()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    } else {
        Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show()
    }

}
        binding.signupredirect.setOnClickListener {
            startActivity(Intent(this, signup::class.java))
            finish()
        }
    }
}