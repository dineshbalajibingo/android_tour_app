package com.example.dineshbalajivenkataraman.kansastour;

import android.content.Context;

import java.util.List;

public class Arts {

    public static void initArtsList(List<Card> list, Context context)
    {
        list.add(new Card(
                R.drawable.arts_1,
                context.getString(R.string.arts_one_name),
                context.getString(R.string.arts_one_description),
                context.getString(R.string.arts_one_address),
                context.getString(R.string.arts_one_phone),
                context.getString(R.string.arts_one_hours)
        ));

        list.add(new Card(
                R.drawable.arts_2,
                context.getString(R.string.arts_two_name),
                context.getString(R.string.arts_two_description),
                context.getString(R.string.arts_two_address),
                context.getString(R.string.arts_two_phone),
                context.getString(R.string.arts_two_hours)
        ));

        list.add(new Card(
                R.drawable.arts_3,
                context.getString(R.string.arts_three_name),
                context.getString(R.string.arts_three_description),
                context.getString(R.string.arts_three_address),
                context.getString(R.string.arts_three_phone),
                context.getString(R.string.arts_three_hours)
        ));

        list.add(new Card(
                R.drawable.arts_4,
                context.getString(R.string.arts_four_name),
                context.getString(R.string.arts_four_description),
                context.getString(R.string.arts_four_address),
                context.getString(R.string.arts_four_phone),
                context.getString(R.string.arts_four_hours)
        ));

        list.add(new Card(
                R.drawable.arts_5,
                context.getString(R.string.arts_five_name),
                context.getString(R.string.arts_five_description),
                context.getString(R.string.arts_five_address),
                context.getString(R.string.arts_five_phone),
                context.getString(R.string.arts_five_hours)
        ));





    }



}
