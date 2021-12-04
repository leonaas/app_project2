package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val delete_account = findViewById<Button>(R.id.delete_account)

        delete_account.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }

        val search = findViewById<Button>(R.id.search)

        search.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
            finish()
        }

        val home = findViewById<Button>(R.id.home)

        home.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        val message = findViewById<Button>(R.id.message)

        message.setOnClickListener {
            startActivity(Intent(this, MessageActivity::class.java))
            finish()
        }

        val profile = findViewById<Button>(R.id.profile)

        profile.setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
            finish()
        }
    }
}