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

        binding.german.setOnClickListener {
            startActivity(Intent(this, GermanActivity ::class.java))
            finish()
        }

        binding.russian.setOnClickListener {
            startActivity(Intent(this, RussianActivity ::class.java))
            finish()
        }

        binding.french.setOnClickListener {
            startActivity(Intent(this, FrenchActivity ::class.java))
            finish()
        }

        binding.kyrgyz.setOnClickListener {
            startActivity(Intent(this, KyrgyzActivity ::class.java))
            finish()
        }

        binding.chinese.setOnClickListener {
            startActivity(Intent(this, ChineseActivity ::class.java))
            finish()
        }

        binding.italian.setOnClickListener {
            startActivity(Intent(this, ItalianActivity ::class.java))
            finish()
        }

        binding.gitara.setOnClickListener {
            startActivity(Intent(this, GitaraActivity ::class.java))
            finish()
        }

        binding.piano.setOnClickListener {
            startActivity(Intent(this, PianoActivity ::class.java))
            finish()
        }

        binding.skripka.setOnClickListener {
            startActivity(Intent(this, SkripkaActivity ::class.java))
            finish()
        }

        binding.fleita.setOnClickListener {
            startActivity(Intent(this, FleitaActivity ::class.java))
            finish()
        }
    }
}