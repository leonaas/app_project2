package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.test.app_project2.databinding.ActivityAccountRepBinding
import kg.test.app_project2.databinding.ActivitySettingsLanguageBinding

class SettingsLanguageActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsLanguageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySettingsLanguageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this, SettingsActivity::class.java))
            finish()
        }
    }
}