package com.example.dineshbalajivenkataraman.kansastour.Adapters;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.dineshbalajivenkataraman.kansastour.Card;
import com.example.dineshbalajivenkataraman.kansastour.R;

import java.util.List;
public class CardAdapter extends ArrayAdapter<Card> {
    public CardAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Card> cardList) {
        super(context, 0, cardList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final Card currentLocation = getItem(position);
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        TextView nameCardView = (TextView) listItemView.findViewById(R.id.titleTextView);
        nameCardView.setText(currentLocation.getTitle());
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.descriptionTextView);
        descriptionTextView.setText(currentLocation.getDescription());
        TextView locationView = (TextView) listItemView.findViewById(R.id.locationTextView);
        locationView.setText(currentLocation.getLocation());
        TextView phoneView = (TextView) listItemView.findViewById(R.id.phoneTextView);
        phoneView.setText((currentLocation.getPhoneNumber()));
        TextView hoursView = (TextView) listItemView.findViewById(R.id.hoursTxtView);
        hoursView.setText(currentLocation.getHours());
        ImageView mainImg = (ImageView) listItemView.findViewById(R.id.photoImageView);
        mainImg.setImageResource(currentLocation.getImgURL());
        mainImg.setVisibility(View.VISIBLE);
        return listItemView;
    }
}
