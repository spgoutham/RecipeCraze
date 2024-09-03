package com.example.recipecraze.ui.home;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recipecraze.FoodData;
import com.example.recipecraze.MyAdapter;
import com.example.recipecraze.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private MyAdapter myAdapter;
    private List<FoodData> myFoodList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.recyclerView);
        myFoodList = new ArrayList<>();
        myAdapter = new MyAdapter(getContext(), myFoodList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Add data to the list
        addFoodData();

        return view;
    }

    private void addFoodData() {
        // Add sample data
        myFoodList.add(new FoodData("Pizza", "Ingredients:\n" +
                "\n" +
                "1 pre-made pizza crust\n" +
                "1/2 cup pizza sauce\n" +
                "1 cup shredded mozzarella cheese\n" +
                "1/4 cup fresh basil leaves\n" +
                "1 tbsp olive oil\n" +
                "1/2 tsp dried oregano\n" +
                "Salt and pepper to taste\n" +
                "Instructions:\n" +
                "\n" +
                "Preheat Oven: Preheat to 475°F (245°C).\n" +
                "Assemble: Spread pizza sauce over the crust. Sprinkle with mozzarella cheese.\n" +
                "Bake: Bake for 10-12 minutes until the crust is golden and the cheese is bubbly.\n" +
                "Garnish: Drizzle with olive oil, and top with fresh basil, oregano, salt, and pepper.\n" +
                "Serve: Slice and enjoy!", "30min", "https://media.istockphoto.com/id/1442417585/photo/person-getting-a-piece-of-cheesy-pepperoni-pizza.jpg?s=612x612&w=0&k=20&c=k60TjxKIOIxJpd4F4yLMVjsniB4W1BpEV4Mi_nb4uJU=", "unique_key_1", "recipe_key_1"));

        myFoodList.add(new FoodData("Burger", "Ingredients:\n" +
                "\n" +
                "1 lb ground beef\n" +
                "1 tsp salt\n" +
                "1/2 tsp black pepper\n" +
                "4 hamburger buns\n" +
                "Lettuce, tomato, and pickles (optional)\n" +
                "Ketchup and mustard (optional)\n" +
                "Instructions:\n" +
                "\n" +
                "Form Patties: Mix beef with salt and pepper. Form into 4 patties.\n" +
                "Cook: Grill or pan-fry patties over medium-high heat for 4 minutes per side.\n" +
                "Toast Buns: Toast the buns on the grill or in a skillet.\n" +
                "Assemble: Place patties on buns and add desired toppings.\n" +
                "Serve: Serve immediately.", "25min", "https://www.allrecipes.com/thmb/5JVfA7MxfTUPfRerQMdF-nGKsLY=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/25473-the-perfect-basic-burger-DDMFS-4x3-56eaba3833fd4a26a82755bcd0be0c54.jpg", "unique_key_2", "recipe_key_2"));

        myFoodList.add(new FoodData("Pasta", "Ingredients:\n" +
                "\n" +
                "8 oz pasta (e.g., fettuccine)\n" +
                "2 tbsp butter\n" +
                "1 cup heavy cream\n" +
                "1 cup grated Parmesan cheese\n" +
                "Salt and pepper to taste\n" +
                "Instructions:\n" +
                "\n" +
                "Cook Pasta: Boil pasta according to package instructions. Drain.\n" +
                "Make Sauce: Melt butter in a skillet. Add cream and simmer. Stir in Parmesan until smooth.\n" +
                "Combine: Toss pasta with sauce. Season with salt and pepper.\n" +
                "Serve: Serve immediately.", "30min", "https://www.indianhealthyrecipes.com/wp-content/uploads/2023/05/red-sauce-pasta-recipe.jpg", "unique_key_3", "recipe_key_3"));

        myFoodList.add(new FoodData("French Fries",
                "Ingredients:\n" +
                        "\n" +
                        "2 large potatoes, peeled and cut into fries\n" +
                        "Oil for frying\n" +
                        "Salt to taste\n" +
                        "Instructions:\n" +
                        "\n" +
                        "Prepare Potatoes: Soak cut potatoes in cold water for 30 minutes. Drain and pat dry.\n" +
                        "Fry: Heat oil in a deep fryer or pot. Fry potatoes until golden and crispy.\n" +
                        "Season: Drain on paper towels and sprinkle with salt.\n" +
                        "Serve: Enjoy hot with your favorite dipping sauce.",
                "20min",
                "https://img.taste.com.au/ol2Jq8ZQ/taste/2016/11/rachel-87711-2.jpeg",
                "unique_key_4",
                "recipe_key_4"));


        myFoodList.add(new FoodData("Chicken Nuggets",
                "Ingredients:\n" +
                        "\n" +
                        "1 lb chicken breast, cut into bite-sized pieces\n" +
                        "1 cup breadcrumbs\n" +
                        "1/2 cup flour\n" +
                        "2 eggs, beaten\n" +
                        "Salt and pepper to taste\n" +
                        "Oil for frying\n" +
                        "Instructions:\n" +
                        "\n" +
                        "Coat Chicken: Season chicken pieces with salt and pepper. Dredge in flour, dip in beaten eggs, then coat with breadcrumbs.\n" +
                        "Fry: Heat oil in a skillet. Fry chicken pieces until golden and cooked through.\n" +
                        "Drain: Place on paper towels to drain excess oil.\n" +
                        "Serve: Serve with your favorite dipping sauce.",
                "20min",
                "https://upload.wikimedia.org/wikipedia/commons/6/64/Chicken_Nuggets.jpg",
                "unique_key_5",
                "recipe_key_5"));


        // Notify adapter of data changes
        myAdapter.notifyDataSetChanged();
    }
}

