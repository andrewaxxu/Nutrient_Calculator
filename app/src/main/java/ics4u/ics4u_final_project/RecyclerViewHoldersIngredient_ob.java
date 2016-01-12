package ics4u.ics4u_final_project;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;



public class RecyclerViewHoldersIngredient_ob extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView ingredientName;

    public RecyclerViewHoldersIngredient_ob(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        ingredientName = (TextView) itemView.findViewById(R.id.ingredient_name);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Country Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}