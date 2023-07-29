package air.texnodev.foodieslesson_3.service;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import air.texnodev.foodieslesson_3.R;
import air.texnodev.foodieslesson_3.models.Foodie;

public class Adapter_Food extends RecyclerView.Adapter<Adapter_Food.ViewHolder> {
   private LayoutInflater inflater;
   private List<Foodie> foodies;

    public Adapter_Food(Context context, List<Foodie> foodies) {
        this.foodies = foodies;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.card_list, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Foodie foodie = foodies.get(position);
        holder.food_img.setImageResource(foodie.getImg());
        holder.name.setText(foodie.getName());
        holder.desc.setText(foodie.getDesc());
        holder.price.setText(foodie.getPrice());
    }

    @Override
    public int getItemCount() {
        return foodies.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView food_img;
        TextView name, desc, price;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            food_img = itemView.findViewById(R.id.idIVcoursem);
            name = itemView.findViewById(R.id.name_food);
            desc = itemView.findViewById(R.id.food_desc);
            price = itemView.findViewById(R.id.food_price);


        }
    }
}
