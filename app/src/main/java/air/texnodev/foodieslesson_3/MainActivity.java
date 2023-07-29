package air.texnodev.foodieslesson_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

import air.texnodev.foodieslesson_3.models.Category;
import air.texnodev.foodieslesson_3.models.Foodie;
import air.texnodev.foodieslesson_3.service.Adapter_Category;
import air.texnodev.foodieslesson_3.service.Adapter_Food;

public class MainActivity extends AppCompatActivity {

    ArrayList<Foodie> foodieArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.grid_item);

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(new Category("Fast-Food", R.drawable.burger1));
        categories.add(new Category("Drink", R.drawable.capuchino));
        categories.add(new Category("Pizza", R.drawable.pizza_old));

        Adapter_Category category = new Adapter_Category(this, categories);
        gridView.setAdapter(category);
        foodieArrayList.add(new Foodie("Burger 1", "", "35.000 so'm", R.drawable.burger1));
        foodieArrayList.add(new Foodie("Burger 2", "", "35.000 so'm", R.drawable.burger2));
        foodieArrayList.add(new Foodie("Burger 3", "", "35.000 so'm", R.drawable.burger3));
        foodieArrayList.add(new Foodie("Burger 4", "", "35.000 so'm", R.drawable.burger4));
        foodieArrayList.add(new Foodie("Burger 5", "", "35.000 so'm", R.drawable.burger5));
        foodieArrayList.add(new Foodie("Burger 6", "", "35.000 so'm", R.drawable.burger6));

        RecyclerView recyclerView = findViewById(R.id.food_list);
        Adapter_Food adapterFood = new Adapter_Food(this, foodieArrayList);
        recyclerView.setAdapter(adapterFood);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                int id = i;
                if (id == 0){
                    getItemBurger();
                } else if (id == 1) {
                    getItemDrink();
                } else if (id == 2) {
                    getItemPizza();
                }
                Toast.makeText(MainActivity.this, String.valueOf(id), Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void getItemBurger(){
        foodieArrayList.clear();

        foodieArrayList.add(new Foodie("Burger 1", "", "35.000 so'm", R.drawable.burger1));
        foodieArrayList.add(new Foodie("Burger 2", "", "35.000 so'm", R.drawable.burger2));
        foodieArrayList.add(new Foodie("Burger 3", "", "35.000 so'm", R.drawable.burger3));
        foodieArrayList.add(new Foodie("Burger 4", "", "35.000 so'm", R.drawable.burger4));
        foodieArrayList.add(new Foodie("Burger 5", "", "35.000 so'm", R.drawable.burger5));
        foodieArrayList.add(new Foodie("Burger 6", "", "35.000 so'm", R.drawable.burger6));
        RecyclerView recyclerView = findViewById(R.id.food_list);
        Adapter_Food adapterFood = new Adapter_Food(this, foodieArrayList);
        recyclerView.setAdapter(adapterFood);
    }
    public void getItemDrink(){
        foodieArrayList.clear();

        foodieArrayList.add(new Foodie("Tea", "Green", "5.000 so'm", R.drawable.tea));
        foodieArrayList.add(new Foodie("Tea", "Lemon", "5.000 so'm", R.drawable.lemon_tea));
        foodieArrayList.add(new Foodie("Coffee", "Black", "10.000 so'm", R.drawable.black_coffee));
        foodieArrayList.add(new Foodie("Capuchino", "", "30.000 so'm", R.drawable.capuchino));
        foodieArrayList.add(new Foodie("Koktel", "Pink", "10.000 so'm", R.drawable.pink_koktel));
        foodieArrayList.add(new Foodie("7 UP", "", "7.000 so'm", R.drawable.up));
        foodieArrayList.add(new Foodie("Pepsi", "Black", "12.000 so'm", R.drawable.pepsi_black));
        foodieArrayList.add(new Foodie("Marinda", "", "12.000 so'm", R.drawable.marinda));
        foodieArrayList.add(new Foodie("Pepsi", "", "12.000 so'm", R.drawable.pepsi));
        RecyclerView recyclerView = findViewById(R.id.food_list);
        Adapter_Food adapterFood = new Adapter_Food(this, foodieArrayList);
        recyclerView.setAdapter(adapterFood);

    }
    public void getItemPizza(){
        foodieArrayList.clear();

        foodieArrayList.add(new Foodie("Pizza 1", "", "70.000 so'm", R.drawable.pizza1));
        foodieArrayList.add(new Foodie("Pizza 2", "", "70.000 so'm", R.drawable.pizza2));
        foodieArrayList.add(new Foodie("Pizza 3", "", "70.000 so'm", R.drawable.pizza3));
        foodieArrayList.add(new Foodie("Pizza 4", "", "70.000 so'm", R.drawable.pizza4));
        foodieArrayList.add(new Foodie("Pizza 5", "", "70.000 so'm", R.drawable.pizza5));
        foodieArrayList.add(new Foodie("Pizza 6", "", "70.000 so'm", R.drawable.pizza6));
        foodieArrayList.add(new Foodie("Pizza 7", "", "70.000 so'm", R.drawable.pizza7));
        foodieArrayList.add(new Foodie("Pizza 8", "", "70.000 so'm", R.drawable.pizza8));
        RecyclerView recyclerView = findViewById(R.id.food_list);
        Adapter_Food adapterFood = new Adapter_Food(this, foodieArrayList);
        recyclerView.setAdapter(adapterFood);

    }
}