package r.d.homeworkfirebase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    public static final List<User> users = new ArrayList<>(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerViewUsers);

//        if (users.isEmpty()) {
//            users.add(new User("Tommy", "Lee", 23, "M"));
//            users.add(new User("Jimmy", "Twin", 12, "M"));
//            users.add(new User("Katy", "Lemon", 23, "W"));
//            users.add(new User("Susy", "Trump", 21, "W"));
//        }

        UsersAdapter adapter = new UsersAdapter(users); // !!!!!!!!!!!!!!!!!!!!!!
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    public void addUser(View view) {
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }
}