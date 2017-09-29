package com.example.dineshbalajivenkataraman.kansastour;


import android.content.Context;

import java.util.List;

public class Places {

    public static void initPlaceList(List<Card> list, Context context)
    {
        list.add(new Card(
                R.drawable.palces_1,
                context.getString(R.string.places_one_name),
                context.getString(R.string.places_one_description),
                context.getString(R.string.places_one_address),
                context.getString(R.string.places_one_phone),
                context.getString(R.string.places_one_hours)
  ));

        list.add(new Card(
                R.drawable.places_2,
                context.getString(R.string.places_two_name),
                context.getString(R.string.places_two_description),
                context.getString(R.string.places_two_address),
                context.getString(R.string.places_two_phone),
                context.getString(R.string.places_two_hours)
        ));

        list.add(new Card(
                R.drawable.arts_2,
                context.getString(R.string.places_three_name),
                context.getString(R.string.places_three_description),
                context.getString(R.string.places_three_address),
                context.getString(R.string.places_three_phone),
                context.getString(R.string.places_three_hours)
        ));

        list.add(new Card(
                R.drawable.places_4,
                context.getString(R.string.places_four_name),
                context.getString(R.string.places_four_description),
                context.getString(R.string.places_four_address),
                context.getString(R.string.places_four_phone),
                context.getString(R.string.places_four_hours)
        ));

        list.add(new Card(
                R.drawable.places_5,
                context.getString(R.string.places_five_name),
                context.getString(R.string.places_five_description),
                context.getString(R.string.places_five_address),
                context.getString(R.string.places_five_phone),
                context.getString(R.string.places_five_hours)
        ));
    }
}
