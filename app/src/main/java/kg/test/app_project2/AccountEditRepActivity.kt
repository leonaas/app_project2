package kg.test.app_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import kg.test.app_project2.databinding.ActivityAccountEditBinding
import kg.test.app_project2.databinding.ActivityAccountEditRepBinding

class AccountEditRepActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAccountEditRepBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAccountEditRepBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this, AccountRepActivity ::class.java))
            finish()
        }

        binding.save.setOnClickListener {
            startActivity(Intent(this, AccountRepActivity ::class.java))
            finish()
        }
    }
}