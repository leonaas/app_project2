package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kg.test.app_project2.databinding.ActivityAccountBinding
import kg.test.app_project2.databinding.ActivityLoginBinding

class AccountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

            binding.moiEnglishButton.setOnClickListener {
            startActivity(Intent(this, MessageAnnaActivity::class.java))
            finish()
        }

        binding.moiEnglishButton.setOnClickListener {
            startActivity(Intent(this, MessageTimurActivity::class.java))
            finish()
        }

        binding.moiGitaraButton.setOnClickListener {
            startActivity(Intent(this, MessageAlexActivity::class.java))
            finish()
        }

        binding.addButton.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        binding.search.setOnClickListener {
            startActivity(Intent(this, SearchActivity::class.java))
            finish()
        }

        binding.home.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
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

        binding.edit.setOnClickListener {
            startActivity(Intent(this, AccountEditActivity ::class.java))
            finish()
        }
    }
}