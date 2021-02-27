package nieblas.julio.thecheezery;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnCold: Button = findViewById(R.id.cold_drinks_button) as Button
        var btnHot: Button = findViewById(R.id.hot_drinks_button) as Button
        var btnSweets: Button = findViewById(R.id.sweets_button) as Button
        var btnSalties: Button =findViewById(R.id.salties_button) as Button

        btnCold.setOnClickListener {
            var intent: Intent = Intent(this,ColdDrinksActivity::class.java)
            startActivity(intent)
        }

        btnHot.setOnClickListener {
            var intent: Intent = Intent(this,HotDrinks::class.java)
            startActivity(intent)
        }

        btnSweets.setOnClickListener {
            var intent: Intent = Intent(this,Sweets::class.java)
            startActivity(intent)
        }

        btnSalties.setOnClickListener {
            var intent: Intent = Intent(this,Salties::class.java)
            startActivity(intent)
        }


    }
}