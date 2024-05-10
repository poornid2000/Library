package com.example.sqliteapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private com.allcodingtutorials.sqliteapplication.DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToAddBook(View view) {
        Intent intent = new Intent(this, com.allcodingtutorials.sqliteapplication.AddBookActivity.class);
        startActivity(intent);
    }

    public void navigateToAddMember(View view) {
        Intent intent = new Intent(this, AddMemberActivity.class);
        startActivity(intent);
    }



    public void navigateToViewBook(View view) {
        Intent intent = new Intent(this, com.allcodingtutorials.sqliteapplication.BookManagementActivity.class);
        startActivity(intent);
    }

    public void navigateToViewMember(View view) {
        Intent intent = new Intent(this, MemberManagementActivity.class);
        startActivity(intent);
    }


}
