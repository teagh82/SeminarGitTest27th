package org.sopt.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.sopt.first.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        initButtonClickEvent()
    }

    private fun initButtonClickEvent(){
        binding.btnLogin.setOnClickListener{
            val userId = binding.etId.text
            
            // id가 비어있다면
            if(userId.isNullOrBlank()){
                Toast.makeText(
                    this@MainActivity, 
                    "Id를 입력해주세요", 
                    Toast.LENGTH_SHORT
                ).show()    
            }else{
                Toast.makeText(
                    this@MainActivity,
                    "안녕하세요",
                    Toast.LENGTH_SHORT
                ).show()

                val intent = Intent(this@MainActivity,
                SignupActivity::class.java)
                startActivity(intent)
            }
        }
    }
}