package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.test.app_project2.databinding.ActivitySettingsBinding
import kg.test.app_project2.databinding.ActivitySettingsRepBinding

class SettingsRepActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsRepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySettingsRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.deleteAccount.setOnClickListener {
            startActivity(Intent(this, RegisterRepActivity::class.java))
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

        binding.profile.setOnClickListener {
            startActivity(Intent(this, AccountRepActivity::class.java))
            finish()
        }
    }
}