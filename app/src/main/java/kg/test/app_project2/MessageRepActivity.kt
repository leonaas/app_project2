package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.test.app_project2.databinding.ActivityMessageBinding
import kg.test.app_project2.databinding.ActivityMessagesRepBinding

class MessageRepActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMessagesRepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMessagesRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.user.setOnClickListener {
            startActivity(Intent(this, MessageUserRepActivity::class.java))
            finish()
        }

        binding.samUser.setOnClickListener {
            startActivity(Intent(this, MessageAlinaRepActivity::class.java))
            finish()
        }

        binding.alexUser.setOnClickListener {
            startActivity(Intent(this, MessageDanilRepActivity::class.java))
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