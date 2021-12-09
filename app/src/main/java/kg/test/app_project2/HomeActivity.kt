package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kg.test.app_project2.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.english.setOnClickListener {
            startActivity(Intent(this, EnglishActivity::class.java))
            finish()
        }

        binding.search.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
            finish()
        }

        binding.profile.setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
            finish()
        }


        binding.message.setOnClickListener {
            startActivity(Intent(this, MessageActivity::class.java))
            finish()
        }


        binding.settings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
            finish()
        }
    }
}