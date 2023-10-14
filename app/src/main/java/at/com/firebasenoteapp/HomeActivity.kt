package at.com.firebasenoteapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import at.com.firebasenoteapp.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            binding = ActivityMainBinding.inflate(layoutInflater)
            super.onCreate(savedInstanceState)
            setContentView(binding.root)

            binding.logoutBtn.setOnClickListener {
                Firebase.auth.signOut()
                startActivity(Intent(this@HomeActivity, MainActivity::class.java))
                finish()
            }
        }
    }
