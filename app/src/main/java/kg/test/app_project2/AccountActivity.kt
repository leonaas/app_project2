package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AccountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val moi_english_button = findViewById<Button>(R.id.moi_english_button)

        moi_english_button.setOnClickListener {
            startActivity(Intent(this, MessageAnnaActivity::class.java))
            finish()
        }

        val moi_kyrgyz_button = findViewById<Button>(R.id.moi_kyrgyz_button)

        moi_kyrgyz_button.setOnClickListener {
            startActivity(Intent(this, MessageTimurActivity::class.java))
            finish()
        }

        val moi_gitara_button = findViewById<Button>(R.id.moi_gitara_button)

        moi_gitara_button.setOnClickListener {
            startActivity(Intent(this, MessageAlexActivity::class.java))
            finish()
        }

        val add_button = findViewById<Button>(R.id.add_button)

        add_button.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
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

        val settings = findViewById<Button>(R.id.settings)

        settings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
            finish()
        }

        val edit = findViewById<Button>(R.id.edit)

        edit.setOnClickListener {
            startActivity(Intent(this, AccountEditActivity ::class.java))
            finish()
        }
    }
}