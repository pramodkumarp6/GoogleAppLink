package com.googleapplink.pramod

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.googleapplink.pramod.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.link.setOnClickListener {

<<<<<<< HEAD
            applink()
        }
    }

    private fun applink() {

      
        val s = "https://play.google.com/store/apps"

=======
           // applink()

            gmaillink()
        }
    }

    private fun gmaillink() {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("mailto:pramodkumarp6@gmail.com")

        startActivity(intent)
    }

    private fun applink() {
        val s = "https://play.google.com/store/apps"
>>>>>>> 4ffabdf (Initial commit)
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse("geo:37.7749,-122.4194")
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent)

    }
<<<<<<< HEAD
=======

>>>>>>> 4ffabdf (Initial commit)
}