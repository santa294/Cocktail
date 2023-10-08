package com.example.cocktail.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.cocktail.R;
import com.example.cocktail.data.CocktailAdapter;
import com.example.cocktail.model.Cocktail;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CocktailAdapter cocktailAdapter;
    private ArrayList<Cocktail> cocktails;
    private RequestQueue requestQueue;
    private Button button_a;
    private Button button_b;
    private Button button_c;
    private Button button_d;
    private Button button_e;
    private Button button_f;
    private Button button_g;
    private Button button_h;
    private Button button_i;
    private Button button_j;
    private Button button_k;
    private Button button_l;
    private Button button_m;
    private Button button_n;
    private Button button_o;
    private Button button_p;
    private Button button_q;
    private Button button_r;
    private Button button_s;
    private Button button_t;
    private Button button_u;
    private Button button_v;
    private Button button_w;
    private Button button_x;
    private Button button_y;
    private Button button_z;




    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        cocktails = new ArrayList<>();
        requestQueue = Volley.newRequestQueue(this);


        getCocktails();
        button_a = findViewById(R.id.button_a);
        button_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivity.class));
                finish();
            }
        });

        button_b = findViewById(R.id.button_b);
        button_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityB.class));
                finish();
            }
        });
        button_c = findViewById(R.id.button_c);
        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityC.class));
                finish();
            }
        });
        button_d = findViewById(R.id.button_d);
        button_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityD.class));
                finish();
            }
        });
        button_e = findViewById(R.id.button_e);
        button_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityE.class));
                finish();
            }
        });
        button_f = findViewById(R.id.button_f);
        button_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityF.class));
                finish();
            }
        });
        button_g = findViewById(R.id.button_g);
        button_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityG.class));
                finish();
            }
        });
        button_h = findViewById(R.id.button_h);
        button_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityH.class));
                finish();
            }
        });
        button_i = findViewById(R.id.button_i);
        button_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityI.class));
                finish();
            }
        });
        button_j = findViewById(R.id.button_j);
        button_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityJ.class));
                finish();
            }
        });
        button_k = findViewById(R.id.button_k);
        button_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityK.class));
                finish();
            }
        });
        button_l = findViewById(R.id.button_l);
        button_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityL.class));
                finish();
            }
        });
        button_m = findViewById(R.id.button_m);
        button_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityM.class));
                finish();
            }
        });
        button_o = findViewById(R.id.button_o);
        button_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityO.class));
                finish();
            }
        });
        button_p = findViewById(R.id.button_p);
        button_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityP.class));
                finish();
            }
        });button_q = findViewById(R.id.button_q);
        button_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityQ.class));
                finish();
            }
        });
        button_r = findViewById(R.id.button_r);
        button_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityR.class));
                finish();
            }
        });
        button_s = findViewById(R.id.button_s);
        button_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityS.class));
                finish();
            }
        });
        button_t = findViewById(R.id.button_t);
        button_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityT.class));
                finish();
            }
        });
        button_u = findViewById(R.id.button_u);
        button_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivity.class));
                finish();
            }
        });
        button_v = findViewById(R.id.button_v);
        button_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityV.class));
                finish();
            }
        });button_w = findViewById(R.id.button_w);
        button_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityW.class));
                finish();
            }
        });
        button_x = findViewById(R.id.button_x);
        button_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivity.class));
                finish();
            }
        });
        button_y = findViewById(R.id.button_y);
        button_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityY.class));
                finish();
            }
        });
        button_z = findViewById(R.id.button_z);
        button_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityZ.class));
                finish();
            }
        });
        button_n = findViewById(R.id.button_n);
        button_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,FirstLetterActivityN.class));
                finish();
            }
        });




    }



    private void getCocktails() {
        String url = "https://www.thecocktaildb.com/api/json/v1/1/random.php";


        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("drinks");

                            for (int i = 0;i<jsonArray.length();i++){
                                JSONObject jsonObject = jsonArray.getJSONObject(i);

                                 String title = jsonObject.getString("strDrink");
                                 String pictureUrl = jsonObject.getString("strDrinkThumb");
                                 String category = jsonObject.getString("strCategory");
                                 String instruction = jsonObject.getString("strInstructions");

                                 Cocktail cocktail = new Cocktail();
                                 cocktail.setTitle(title);
                                 cocktail.setPictureUrl(pictureUrl);
                                 cocktail.setCategory(category);
                                 cocktail.setInstruction(instruction);
                                 cocktails.add(cocktail);
                            }
                            cocktailAdapter = new CocktailAdapter(MainActivity.this,cocktails);
                            recyclerView.setAdapter(cocktailAdapter);

                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        requestQueue.add(request);


    }




    public void clickLetterButton(View view) {





    }


}