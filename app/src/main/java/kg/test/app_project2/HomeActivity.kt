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

        val german = findViewById<Button>(R.id.german)

        german.setOnClickListener {
            startActivity(Intent(this, GermanActivity ::class.java))
            finish()
        }

        val russian = findViewById<Button>(R.id.russian)

        russian.setOnClickListener {
            startActivity(Intent(this, RussianActivity ::class.java))
            finish()
        }

        val french = findViewById<Button>(R.id.french)

        french.setOnClickListener {
            startActivity(Intent(this, FrenchActivity ::class.java))
            finish()
        }

        val kyrgyz = findViewById<Button>(R.id.kyrgyz)

        kyrgyz.setOnClickListener {
            startActivity(Intent(this, KyrgyzActivity ::class.java))
            finish()
        }

        val chinese = findViewById<Button>(R.id.chinese)

        chinese.setOnClickListener {
            startActivity(Intent(this, ChineseActivity ::class.java))
            finish()
        }

        val italian = findViewById<Button>(R.id.italian)

        italian.setOnClickListener {
            startActivity(Intent(this, ItalianActivity ::class.java))
            finish()
        }

        val gitara = findViewById<Button>(R.id.gitara)

        gitara.setOnClickListener {
            startActivity(Intent(this, GitaraActivity ::class.java))
            finish()
        }

        val piano = findViewById<Button>(R.id.piano)

        piano.setOnClickListener {
            startActivity(Intent(this, PianoActivity ::class.java))
            finish()
        }

        val skripka = findViewById<Button>(R.id.skripka)

        skripka.setOnClickListener {
            startActivity(Intent(this, SkripkaActivity ::class.java))
            finish()
        }

        val fleita = findViewById<Button>(R.id.fleita)

        fleita.setOnClickListener {
            startActivity(Intent(this, FleitaActivity ::class.java))
            finish()
        }
    }
}