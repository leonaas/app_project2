package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import kg.test.app_project2.databinding.ActivityGermanBinding
import kg.test.app_project2.databinding.ActivityGitaraBinding

class GitaraActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGitaraBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGitaraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        binding.constraintJames.setOnClickListener {
            startActivity(Intent(this, MessageJamesActivity::class.java))
            finish()
        }

        binding.constraintAnna.setOnClickListener {
            startActivity(Intent(this, MessageAnnaActivity::class.java))
            finish()
        }

        binding.constraintSam.setOnClickListener {
            startActivity(Intent(this, MessageSamActivity::class.java))
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

        binding.profile.setOnClickListener {
            startActivity(Intent(this, AccountActivity::class.java))
            finish()
        }
    }
}