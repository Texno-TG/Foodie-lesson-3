package air.texnodev.foodieslesson_3.service;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import air.texnodev.foodieslesson_3.R;
import air.texnodev.foodieslesson_3.models.Category;


public class Adapter_Category extends ArrayAdapter<Category> {

        public Adapter_Category(@NonNull Context context, ArrayList<Category> gridModels) {
            super(context, 0, gridModels);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            View listitemView = convertView;
            if (listitemView == null) {
                // Layout Inflater inflates each item to be displayed in GridView.
                listitemView = LayoutInflater.from(getContext()).inflate(R.layout.card_first, parent, false);
            }

            Category courseModel = getItem(position);
            TextView courseTV = listitemView.findViewById(R.id.idTVCourse);
            ImageView courseIV = listitemView.findViewById(R.id.idIVcourse);

            courseTV.setText(courseModel.getName());
            courseIV.setImageResource(courseModel.getImg());
            return listitemView;
        }


    }

