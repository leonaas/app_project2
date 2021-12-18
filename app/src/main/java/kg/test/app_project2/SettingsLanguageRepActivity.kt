package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.test.app_project2.databinding.ActivitySettingsLanguageBinding
import kg.test.app_project2.databinding.ActivitySettingsLanguageRepBinding

class SettingsLanguageRepActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsLanguageRepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySettingsLanguageRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this, SettingsRepActivity::class.java))
            finish()
        }
    }
}