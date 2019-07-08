package marketplace.jpr.com.interviewrecyclerviewapi.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import marketplace.jpr.com.interviewrecyclerviewapi.R;
import marketplace.jpr.com.interviewrecyclerviewapi.model.Category;
import marketplace.jpr.com.interviewrecyclerviewapi.model.CategoryResponse;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder> {
    List<Category> categoryAdapterList;
    Context context;




    public CategoryAdapter(Context context) {
        this.context = context;
    }
    public void setdata(List<Category> itemList) {
        this.categoryAdapterList = itemList;
    }



    @NonNull
    @Override
    public CategoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_item, viewGroup, false);

        return new MyViewHolder(itemView);

    }



    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.MyViewHolder myViewHolder, int i) {

        final Category category = categoryAdapterList.get(i);
        myViewHolder.textView1.setText(category.getCatTitle());
        Picasso.with(context).load(category.getCatImage())
                .error(R.drawable.veg).into(myViewHolder.pro_img);

        myViewHolder.textView2.setText(category.getCatDesc());

        myViewHolder.textView3.setText(category.getDTitle());

    }

    @Override
    public int getItemCount() {
        return categoryAdapterList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private ImageView pro_img,arrow_img;
        private TextView textView1,textView2,textView3;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            pro_img=itemView.findViewById(R.id.logoID1);
            arrow_img=itemView.findViewById(R.id.arrow2);
            textView1=itemView.findViewById(R.id.text_tv11);
            textView2=itemView.findViewById(R.id.text_tv22);
            textView3=itemView.findViewById(R.id.text_tv33);


        }
    }
}
