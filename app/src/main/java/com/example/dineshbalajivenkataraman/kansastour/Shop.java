package com.example.dineshbalajivenkataraman.kansastour;

import android.content.Context;

import java.util.List;

public class Shop {

    public static void initArtsList(List<Card> list, Context context) {

        list.add(new Card(
                R.drawable.shopping_1,
                context.getString(R.string.shop_one_name),
                context.getString(R.string.shop_one_description),
                context.getString(R.string.shop_one_address),
                context.getString(R.string.shop_one_phone),
                context.getString(R.string.shop_one_hours)
        ));

        list.add(new Card(
                R.drawable.shopping_2,
                context.getString(R.string.shop_two_name),
                context.getString(R.string.shop_two_description),
                context.getString(R.string.shop_two_address),
                context.getString(R.string.shop_two_phone),
                context.getString(R.string.shop_two_hours)
        ));

        list.add(new Card(
                R.drawable.shopping_3,
                context.getString(R.string.shop_three_name),
                context.getString(R.string.shop_three_description),
                context.getString(R.string.shop_three_address),
                context.getString(R.string.shop_three_phone),
                context.getString(R.string.shop_three_hours)
        ));

        list.add(new Card(
                R.drawable.shopping_4,
                context.getString(R.string.shop_four_name),
                context.getString(R.string.shop_four_description),
                context.getString(R.string.shop_four_address),
                context.getString(R.string.shop_four_phone),
                context.getString(R.string.shop_four_hours)
        ));

        list.add(new Card(
                R.drawable.shopping_5,
                context.getString(R.string.shop_five_name),
                context.getString(R.string.shop_five_description),
                context.getString(R.string.shop_five_address),
                context.getString(R.string.shop_five_phone),
                context.getString(R.string.shop_five_hours)
        ));
    }
    }
