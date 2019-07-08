package marketplace.jpr.com.interviewrecyclerviewapi.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import marketplace.jpr.com.interviewrecyclerviewapi.R;
import marketplace.jpr.com.interviewrecyclerviewapi.adapter.CategoryAdapter;
import marketplace.jpr.com.interviewrecyclerviewapi.model.Category;
import marketplace.jpr.com.interviewrecyclerviewapi.model.CategoryResponse;
import marketplace.jpr.com.interviewrecyclerviewapi.retrofit.RestClient;
import marketplace.jpr.com.interviewrecyclerviewapi.utils.Utils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
   private List<Category>itemList4;
    private RecyclerView recyclerview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerview = findViewById(R.id.recycler);
        getAllItem();



    }


    private void getAllItem() {
        Utils.showProgressDialog(this, "Please wait...");
        if (Utils.isInternetConnected(this)) {
            Utils.showProgressDialog(this, "Please wait...");
            RestClient.allItems(new Callback<CategoryResponse>() {
                @Override
                public void onResponse(Call<CategoryResponse> call, Response<CategoryResponse> response) {

                    Utils.dismissProgressDialog();
                    if (response.body() != null) {
                        if (response.body().getStatus()) {
                            /*itemList1 = response.body().getBestSelling();

                            BestSelling bestSelling = new BestSelling();
                            bestSelling.setPTitle("See All");
                            itemList1.add(bestSelling)*/;

                           /* itemList2 = response.body().getBlockbusterSavers();

                            BlockbusterSaver blockbusterSaver=new BlockbusterSaver();
                            blockbusterSaver.setPDesc("See All");
                            itemList2.add(blockbusterSaver);*/

                           /* itemList3 = response.body().getTodaySavers();

                            TodaySaver todaySaver=new TodaySaver();
                            todaySaver.setPDesc("See All");
                            itemList3.add(todaySaver);

*/
                            Category category=new Category();

                            itemList4 = response.body().getCategories();

                           /* BestSellingAdapter bestSellingAdapter = new BestSellingAdapter(getApplicationContext());
                            bestSellingAdapter.setdata(itemList1);
                            Log.d("Main Activity", "Done");
                            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
                            Log.d("Main Activity", "Two");
                            recyclerView.setLayoutManager(linearLayoutManager);
                            Log.d("Main Activity", "Three");
                            recyclerView.setAdapter(bestSellingAdapter);
                            Log.d("Main Activity", "Four");*/


                           /* /// click listner
                            bestSellingAdapter.setSellingListInterface(new BestSellingAdapter.SellingListInterface() { ///
                                @Override
                                ///
                                public void sellinglistitem(String id) {
                                    Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                                    intent.putExtra("id", id);
                                    startActivity(intent);
                                }                                                                                        ///

                                @Override
                                public void sellinglistitemSeeAll(String id) {
                                    //open see all activity
                                    Intent intent = new Intent(MainActivity.this, SeeAllActivity.class);
                                    intent.putExtra("id", id);
                                    startActivity(intent);

                                }
                            });*/

/*

                            BlockBusterAdapter blockBusterAdapter=new BlockBusterAdapter(getApplicationContext());
                            blockBusterAdapter.setdata(itemList2);
                            LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
                            recyclerView1.setLayoutManager(linearLayoutManager1);
                            recyclerView1.setAdapter(blockBusterAdapter);

                            /// click listner
                            blockBusterAdapter.setSellingListInterface1(new BlockBusterAdapter.SellingListInterface() { ///
                                @Override
                                ///
                                public void sellinglistitem1(String id) {
                                    Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                                    intent.putExtra("id", id);
                                    startActivity(intent);
                                }                                                                                        ///

                                @Override
                                public void sellinglistitemSeeAll1(String id) {
                                    //open see all activity
                                    Intent intent = new Intent(MainActivity.this, TabLayoutActivity3.class);
                                    intent.putExtra("id", id);
                                    startActivity(intent);

                                }
                            });

*/

/*
                            TopSaverAdapter topSaverAdapter = new TopSaverAdapter(getApplicationContext());
                            topSaverAdapter.setdata(itemList3);
                            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
                            recyclerView2.setLayoutManager(linearLayoutManager2);
                            recyclerView2.setAdapter(topSaverAdapter);
                            Log.d("Main Activity", "Four");
                            /// click listner
                            topSaverAdapter.setSellingListInterface2(new TopSaverAdapter.SellingListInterface() { ///
                                @Override
                                ///
                                public void sellinglistitem2(String id) {
                                    Intent intent = new Intent(MainActivity.this, ProductActivity.class);
                                    intent.putExtra("id", id);
                                    startActivity(intent);
                                }                                                                                        ///

                                @Override
                                public void sellinglistitemSeeAll2(String id) {
                                    //open see all activity
                                    Intent intent = new Intent(MainActivity.this, TabLayoutActivity4.class);
                                    intent.putExtra("id", id);
                                    startActivity(intent);

                                }
                            });*/
                            CategoryAdapter categoryAdapter = new CategoryAdapter(getApplicationContext());
                            categoryAdapter.setdata(itemList4);
                            LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
                            recyclerview.setLayoutManager(linearLayoutManager1);
                            recyclerview.setAdapter(categoryAdapter);


                       /*     categoryDashboardAdapter.setSellingListInterface(new CategoryDashboardAdapter.SellingListInterface() {
                                @Override
                                public void sellinglistitem(String id) {
                                    Intent intent = new Intent(MainActivity.this, SubCategoryActivity.class);
                                    intent.putExtra("id", id);
                                    startActivity(intent);

                                }
                            });*/


                        }
                    }

                }

                @Override
                public void onFailure(Call<CategoryResponse> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                    Utils.dismissProgressDialog();

                }
            });


        }

    }

    public void onResume() {
        super.onResume();
    }

}
