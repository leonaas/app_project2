package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.test.app_project2.databinding.ActivitySearchBinding
import kg.test.app_project2.databinding.ActivitySearchRepBinding

class SearchRepActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySearchRepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySearchRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

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
    }
}