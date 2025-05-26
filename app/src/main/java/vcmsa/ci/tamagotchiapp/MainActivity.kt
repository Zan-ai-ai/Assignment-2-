package vcmsa.ci.tamagotchiapp

import android.content.Intent
import com.bumptech.glide.Glide
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vcmsa.ci.tamagotchiapp.Welcome

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


     val playbtn : Button = findViewById (R.id.playbtn)

     val petImage: ImageView= findViewById(R.id.happycatimage)






     playbtn.setOnClickListener{
        startActivity(Intent(this,Welcome::class.java))



     }



        Glide.with(this)
            .load(R.drawable.happycat)
            .into(petImage)

        }
    }


