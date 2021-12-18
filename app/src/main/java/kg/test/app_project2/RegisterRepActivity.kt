package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.test.app_project2.databinding.ActivityRegisterBinding
import kg.test.app_project2.databinding.ActivityRegisterRepBinding

class RegisterRepActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterRepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegisterRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener {
            startActivity(Intent(this, HomeRepActivity::class.java))
            finish()
        }
    }
}