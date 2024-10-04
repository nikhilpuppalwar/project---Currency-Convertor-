package nikhil.elephant.lect2kotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class convertingamount : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_convertingamount)
       val txtconv = findViewById<EditText>(R.id.edtextdolRup)
        val conv =findViewById<Button>(R.id.butcalute)
        val txtres=findViewById<TextView>(R.id.txtres)

        conv.setOnClickListener {
            val temp = txtconv.text.toString();
            if (temp.equals("")) {
                txtconv.text.clear()
                txtres.text = "Please enter a number"
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show()
            } else {
                val num = temp.toDouble()
                val res = num * 83.72
                Toast.makeText(this, "Rupees $res", Toast.LENGTH_SHORT).show()
                txtres.text = res.toString() + " Rupees"

            }
        }

        val restart =findViewById<Button>(R.id.restart)
        restart.setOnClickListener {
            txtconv.text.clear()
            txtres.text="Result"
            Toast.makeText(this, "Reset", Toast.LENGTH_SHORT).show()

        }
    }
}