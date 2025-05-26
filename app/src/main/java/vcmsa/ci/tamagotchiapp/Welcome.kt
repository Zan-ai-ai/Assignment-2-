package vcmsa.ci.tamagotchiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Welcome : AppCompatActivity() {

   private var statusView: TextView?= null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

        statusView= findViewById(R.id.statusView)
        val homebtn=findViewById<Button>(R.id.homebtn)

        val resetbtn=findViewById<Button>(R.id.resetbtn)

        val playtimebtn= findViewById<Button>(R.id.playtimebtn)

        val cleanbtn= findViewById<Button>(R.id.cleanbtn)

        val feedbtn = findViewById<Button>(R.id.feedbtn)






        homebtn.setOnClickListener{

            startActivity(Intent(this, MainActivity::class.java))
        }

        resetbtn.setOnClickListener{
        }

        playtimebtn.setOnClickListener {

        }

        cleanbtn.setOnClickListener {

        }

        feedbtn.setOnClickListener {

        }
    }



}



