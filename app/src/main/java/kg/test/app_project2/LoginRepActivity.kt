package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.test.app_project2.databinding.ActivityLoginBinding
import kg.test.app_project2.databinding.ActivityLoginRepBinding

class LoginRepActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginRepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.voitiButton.setOnClickListener {
            startActivity(Intent(this, HomeRepActivity::class.java))
            finish()
        }

        binding.register.setOnClickListener {
            startActivity(Intent(this, RegisterRepActivity::class.java))
            finish()
        }
    }
}