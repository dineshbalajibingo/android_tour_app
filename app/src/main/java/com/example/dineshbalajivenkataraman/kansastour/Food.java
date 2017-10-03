package com.example.dineshbalajivenkataraman.kansastour;
import android.content.Context;
import java.util.List;
public class Food {
    public static void initArtsList(List<Card> list, Context context) {
        list.add(new Card(
                R.drawable.food_1,
                context.getString(R.string.food_one_name),
                context.getString(R.string.food_one_description),
                context.getString(R.string.food_one_address),
                context.getString(R.string.food_one_phone),
                context.getString(R.string.food_one_hours)
        ));
        list.add(new Card(
                R.drawable.food_2,
                context.getString(R.string.food_two_name),
                context.getString(R.string.food_two_description),
                context.getString(R.string.food_two_address),
                context.getString(R.string.food_two_phone),
                context.getString(R.string.food_two_hours)
        ));
        list.add(new Card(
                R.drawable.food_3,
                context.getString(R.string.food_three_name),
                context.getString(R.string.food_three_description),
                context.getString(R.string.food_three_address),
                context.getString(R.string.food_three_phone),
                context.getString(R.string.food_three_hours)
        ));
        list.add(new Card(
                R.drawable.food_4,
                context.getString(R.string.food_four_name),
                context.getString(R.string.food_four_description),
                context.getString(R.string.food_four_address),
                context.getString(R.string.food_four_phone),
                context.getString(R.string.food_four_hours)
        ));
        list.add(new Card(
                R.drawable.food_5,
                context.getString(R.string.food_five_name),
                context.getString(R.string.food_five_description),
                context.getString(R.string.food_five_address),
                context.getString(R.string.food_five_phone),
                context.getString(R.string.food_five_hours)
        ));
    }
}
