package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import kg.test.app_project2.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMessageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.timurUser.setOnClickListener {
            startActivity(Intent(this, MessageTimurActivity::class.java))
            finish()
        }

        binding.annaUser.setOnClickListener {
            startActivity(Intent(this, MessageAnnaActivity::class.java))
            finish()
        }

        binding.alexUser.setOnClickListener {
            startActivity(Intent(this, MessageAlexActivity::class.java))
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

        binding.settings.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
            finish()
        }

        binding.profile.setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
            finish()
        }
    }
}