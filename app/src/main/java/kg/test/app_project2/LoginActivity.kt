package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val voiti_button = findViewById<Button>(R.id.voiti_button)

        voiti_button.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        val register = findViewById<TextView>(R.id.register)

        register.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }
    }


}