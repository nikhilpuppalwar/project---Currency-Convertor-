package nikhil.elephant.lect2kotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btDR=findViewById<Button>(R.id.btnDtoR)
        val btYR=findViewById<Button>(R.id.btnYtoR)
        val btPR=findViewById<Button>(R.id.btnPtoR)
        val btER=findViewById<Button>(R.id.btnEtoR)
        btDR.setOnClickListener {
            val next = Intent(this, convertingamount::class.java)
            startActivity(next)
        }

        btPR.setOnClickListener {
            val next = Intent(this, poundtorupee::class.java)
            startActivity(next)
        }

        btYR.setOnClickListener {
            val next = Intent(this, YenToRupee::class.java)
            startActivity(next)
        }

        btER.setOnClickListener {
            val next = Intent(this, EURtoRupee::class.java)
            startActivity(next)
        }
    }
}
