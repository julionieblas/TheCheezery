package nieblas.julio.thecheezery;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.get_started_button) as Button

        button.setOnClickListener {
            var intent: Intent = Intent(this, RegisterActivyty::class.java)
            startActivity(intent)

        }

    }
}