package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.test.app_project2.databinding.ActivityHomeBinding
import kg.test.app_project2.databinding.ActivityHomeRepBinding

class HomeRepActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeRepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.english.setOnClickListener {
            startActivity(Intent(this, EnglishRepActivity::class.java))
            finish()
        }

        binding.search.setOnClickListener {
            startActivity(Intent(this, SearchRepActivity::class.java))
            finish()
        }

        binding.profile.setOnClickListener {
            startActivity(Intent(this, AccountRepActivity::class.java))
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

        binding.german.setOnClickListener {
            startActivity(Intent(this, GermanRepActivity ::class.java))
            finish()
        }

        binding.russian.setOnClickListener {
            startActivity(Intent(this, RussianRepActivity ::class.java))
            finish()
        }

        binding.french.setOnClickListener {
            startActivity(Intent(this, FrenchRepActivity ::class.java))
            finish()
        }

        binding.kyrgyz.setOnClickListener {
            startActivity(Intent(this, KyrgyzRepActivity ::class.java))
            finish()
        }

        binding.chinese.setOnClickListener {
            startActivity(Intent(this, ChineseRepActivity ::class.java))
            finish()
        }

        binding.italian.setOnClickListener {
            startActivity(Intent(this, ItalianRepActivity ::class.java))
            finish()
        }

        binding.gitara.setOnClickListener {
            startActivity(Intent(this, GitaraRepActivity ::class.java))
            finish()
        }

        binding.piano.setOnClickListener {
            startActivity(Intent(this, PianoRepActivity ::class.java))
            finish()
        }

        binding.skripka.setOnClickListener {
            startActivity(Intent(this, SkripkaRepActivity ::class.java))
            finish()
        }

        binding.fleita.setOnClickListener {
            startActivity(Intent(this, FleitaRepActivity ::class.java))
            finish()
        }
    }
}