package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.test.app_project2.databinding.ActivityChineseRepBinding
import kg.test.app_project2.databinding.ActivityEnglishRepBinding

class EnglishRepActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEnglishRepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEnglishRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this, HomeRepActivity::class.java))
            finish()
        }

        binding.search.setOnClickListener {
            startActivity(Intent(this, SearchRepActivity::class.java))
            finish()
        }

        binding.home.setOnClickListener {
            startActivity(Intent(this, HomeRepActivity::class.java))
            finish()
        }

        binding.message.setOnClickListener {
            startActivity(Intent(this, MessageRepActivity::class.java))
            finish()
        }

        binding.settings.setOnClickListener {
            startActivity(Intent(this, SettingsRepActivity::class.java))
            finish()
        }

        binding.profile.setOnClickListener {
            startActivity(Intent(this, AccountRepActivity::class.java))
            finish()
        }

        binding.add.setOnClickListener {
            startActivity(Intent(this, EnglishRepAddActivity::class.java))
            finish()
        }
    }
}