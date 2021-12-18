package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kg.test.app_project2.databinding.ActivityAccountBinding
import kg.test.app_project2.databinding.ActivityAccountRepBinding

class AccountRepActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAccountRepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAccountRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.edit.setOnClickListener {
            startActivity(Intent(this, AccountRepActivity::class.java))
            finish()

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
        }
    }
}