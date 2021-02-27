package nieblas.julio.thecheezery;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

var hotDrinks = ArrayList<Product>()

class HotDrinks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hot_drinks)

        agregarProductos()

        var listview: ListView =findViewById(R.id.listview) as ListView

        var adaptador: AdaptadorProductos= AdaptadorProductos(this, hotDrinks)
        listview.adapter=adaptador
    }


    fun agregarProductos() {
        hotDrinks.add(Product("Latte", R.drawable.latte, "Coffee drink made with espresso and steamed milk", 6.00))
        hotDrinks.add(Product("Hot chocolate", R.drawable.hotchocolate, "Heated drink consisting of shaved chocolate, topped with marshmallows.", 5.00))
        hotDrinks.add(Product("Espresso", R.drawable.espresso, "Full-flavored, concentrated form of coffee.", 4.00))
        hotDrinks.add(Product("Chai Latte", R.drawable.chailatte, "Spiced tea concentrate with milk", 6.00))
        hotDrinks.add(Product("Capuccino", R.drawable.capuccino, "A cappuccino is an espresso-based coffee drink, prepared with steamed foam.", 7.00))
        hotDrinks.add(Product("American coffee", R.drawable.americano, "Espresso with hot water", 2.00))

    }


}