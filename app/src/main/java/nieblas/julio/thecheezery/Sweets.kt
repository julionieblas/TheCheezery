package nieblas.julio.thecheezery;

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Sweets : AppCompatActivity() {
    var sweets = ArrayList<Product>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sweets)

        agregarProductos()

        var listview: ListView =findViewById(R.id.listview) as ListView

        var adaptador: AdaptadorProductos= AdaptadorProductos(this, sweets)
        listview.adapter=adaptador

    }

    fun agregarProductos() {
        sweets.add(Product("Blueberry cake", R.drawable.blueberrycake, "Vanilla cake flavor, topped with cheese topping and blueberries.", 6.00))
        sweets.add(Product("Chocolate cupcake", R.drawable.chocolatecupcake, "Chocolate cupcakes topped with butter cream and cherries", 3.00))
        sweets.add(Product("Lemon tartalette", R.drawable.lemontartalette, "Pastry shell with a lemon flavored filling", 4.00))
        sweets.add(Product("Red Velvet cake", R.drawable.redvelvetcake, "Soft, moist, buttery cake topped with an easy cream cheese frosting.", 6.00))
        sweets.add(Product("Cherry cheesecake", R.drawable. strawberrycheesecake, "This cherry topped cheesecake is positively creamy and delicious and will be your new favorite dessert.", 7.00))
        sweets.add(Product("Tiramisu", R.drawable.tiramisu, "Coffee-flavored Italian dessert", 6.00))
    }

}