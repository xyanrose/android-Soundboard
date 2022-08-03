package com.csab.soundboard;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class SoundTileAdapter extends ArrayAdapter<Sound>{
        public SoundTileAdapter(Context context, ArrayList<Sound> soundList) {
            super(context, 0, soundList);
        }

        @Override
        public View getView(int position,  View convertView, ViewGroup parent) {
            View listitemView = convertView;
            if (listitemView == null) {
                // Layout Inflater inflates each item to be displayed in GridView.
                listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_item, parent, false);
            }
            Sound sound = getItem(position);
            TextView soundTV = listitemView.findViewById(R.id.idTVSound);
            ImageView soundIV = listitemView.findViewById(R.id.idIVSound);
            soundTV.setText(sound.getName());
            soundIV.setImageResource(sound.getmImageResourceId());
            return listitemView;
        }


}
