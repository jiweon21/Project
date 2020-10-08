package com.example.project_test.Food.FoodContent;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_test.R;

public class FoodActivityContent extends AppCompatActivity {
    Toolbar toolbar;

    private RecyclerView recyclerView;
    public RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;
    TextView text1, writer, contents;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_foodcontent);

            //상단탭
            toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowCustomEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // ↓툴바의 홈버튼의 이미지를 변경(기본 이미지는 뒤로가기 화살표)
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.backbtn);
            getSupportActionBar().setDisplayShowTitleEnabled(false);

            text1 = findViewById(R.id.text1);
            writer = findViewById(R.id.id_day);
            contents = findViewById(R.id.con);

            //받아오기
            Intent intent = getIntent();
            String title = intent.getStringExtra("제목");
            String id = intent.getStringExtra("작성자");
            String day = intent.getStringExtra("날짜");
            String con = intent.getStringExtra("내용");

            //setText
            text1.setText(title);
            writer.setText(id+"\n"+day);
            contents.setText(con);

            recyclerView = findViewById(R.id.recyclerView);
            recyclerView.setHasFixedSize(true);

            layoutManager = new LinearLayoutManager(this);

            recyclerView.setLayoutManager(layoutManager);

            adapter = new FoodRecyclerAdapterContent();
            recyclerView.setAdapter(adapter);
        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        int id = item.getItemId();
        switch (id) {
            case android.R.id.home:
                finish();
                return true;
        }
        return true;
    }
}

