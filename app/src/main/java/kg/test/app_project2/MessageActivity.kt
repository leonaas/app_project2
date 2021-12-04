package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        val timur_user = findViewById<LinearLayout>(R.id.timur_user)

        timur_user.setOnClickListener {
            startActivity(Intent(this, MessageTimurActivity::class.java))
            finish()
        }

        val anna_user = findViewById<LinearLayout>(R.id.anna_user)

        anna_user.setOnClickListener {
            startActivity(Intent(this, MessageAnnaActivity::class.java))
            finish()
        }

        val alex_user = findViewById<LinearLayout>(R.id.alex_user)

        alex_user.setOnClickListener {
            startActivity(Intent(this, MessageAlexActivity::class.java))
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

        val settings = findViewById<Button>(R.id.settings)

        settings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
            finish()
        }

        val profile = findViewById<Button>(R.id.profile)

        profile.setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
            finish()
        }
    }
}