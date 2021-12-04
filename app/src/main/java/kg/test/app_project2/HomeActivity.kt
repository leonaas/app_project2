package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val english = findViewById<Button>(R.id.english)

        english.setOnClickListener {
            startActivity(Intent(this, EnglishActivity::class.java))
            finish()
        }

        val search = findViewById<Button>(R.id.search)

        search.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
            finish()
        }

        val profile = findViewById<Button>(R.id.profile)

        profile.setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
            finish()
        }

        val message = findViewById<Button>(R.id.message)

        message.setOnClickListener {
            startActivity(Intent(this, MessageActivity::class.java))
            finish()
        }

        val settings = findViewById<Button>(R.id.settings)

        settings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
            finish()
        }
    }
}