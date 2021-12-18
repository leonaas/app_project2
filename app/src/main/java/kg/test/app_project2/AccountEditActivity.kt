package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kg.test.app_project2.databinding.ActivityAccountEditBinding

class AccountEditActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAccountEditBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAccountEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this, AccountActivity ::class.java))
            finish()
        }

        binding.save.setOnClickListener {
            startActivity(Intent(this, AccountActivity ::class.java))
            finish()
        }
    }
}