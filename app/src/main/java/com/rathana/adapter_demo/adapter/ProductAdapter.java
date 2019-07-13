package com.rathana.adapter_demo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.rathana.adapter_demo.R;
import com.rathana.adapter_demo.model.Product;

import java.util.List;

public class ProductAdapter extends BaseAdapter {

    List<Product> products;
    Context context;

    int itemWith;

    public void setItemWith(int itemWith) {
        this.itemWith = itemWith;
    }

    public ProductAdapter(List<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @Override
    public int getCount() {
        return this.products.size();
    }

    @Override
    public Object getItem(int position) {
        return this.products.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=null;
        if(convertView==null)
            view = LayoutInflater.from(context)
                    .inflate(R.layout.product_item_layout,parent,false);
        else
            view=convertView;

        //bind data
        Product product=products.get(position);
        ImageView image= view.findViewById(R.id.image);
        TextView tvPrice=view.findViewById(R.id.tvPrice);
        ImageView btnFavorite=view.findViewById(R.id.btnFavorite);

        image.getLayoutParams().width=itemWith;
        //set data to layout
        image.setImageResource(product.getThumbnail());
        tvPrice.setText(""+product.getPrice());
        btnFavorite.setOnClickListener(v->{
            Toast.makeText(context, "add to favorite", Toast.LENGTH_SHORT).show();
        });
        return view;
    }
}
