package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccountEditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_edit)

        val back = findViewById<Button>(R.id.back)

        back.setOnClickListener {
            startActivity(Intent(this, AccountActivity ::class.java))
            finish()
        }

        val save = findViewById<Button>(R.id.save)

        save.setOnClickListener {
            startActivity(Intent(this, AccountActivity ::class.java))
            finish()
        }
    }
}