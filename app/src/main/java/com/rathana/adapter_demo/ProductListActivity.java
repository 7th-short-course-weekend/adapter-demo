package com.rathana.adapter_demo;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.GridView;

import com.rathana.adapter_demo.adapter.ProductAdapter;
import com.rathana.adapter_demo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListActivity extends AppCompatActivity {

    GridView gridView;
    ProductAdapter adapter;
    List<Product> products=new ArrayList<Product>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        gridView=findViewById(R.id.gridView);
        adapter=new ProductAdapter(products,this);
        gridView.setAdapter(adapter);

        gridView.setColumnWidth(getWidowsWidth()/2);
        adapter.setItemWith(getWidowsWidth()/2);
        getProducts();
    }

    private int getWidowsWidth(){
        Display display= getWindowManager().getDefaultDisplay();
        Point size= new Point();
        display.getSize(size);
        return size.x;
    }

    private void getProducts(){
        for(int i=0;i<10;i++){
            this.products.add(new Product(
                    700d,
                    R.drawable.oneplus_7
            ));
            this.products.add(new Product(
                    720d,
                    R.drawable.bgr_oneplus_6t_purple_1
            ));

            this.products.add(new Product(
                    710d,
                    R.drawable.bgr_oneplus_7_pro_5
            ));

            this.products.add(new Product(
                    1110d,
                    R.drawable.apple_iphonexs_max_gold
            ));

            this.products.add(new Product(
                    1100d,
                    R.drawable.apple_iphonexsmax_gold
            ));

        }

        adapter.notifyDataSetChanged();
    }
}
