package r.d.homeworkfirebase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    public static final List<User> users = new ArrayList<>(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    private UsersAdapter adapter;
    private ImageButton imageButton;

    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerViewUsers);
        db = FirebaseFirestore.getInstance();

//            users.add(new User("Tommy", "Lee", 23, "M"));
//            users.add(new User("Jimmy", "Twin", 12, "M"));
//            users.add(new User("Katy", "Lemon", 23, "W"));
//            users.add(new User("Susy", "Trump", 21, "W"));


//        db.collection("users")
//                .get()
//                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                    @Override
//                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                        if (task.isSuccessful()) {
//                            Toast.makeText(MainActivity.this, "Отлично ёпта!", Toast.LENGTH_SHORT).show();
//                            QuerySnapshot querySnapshot = task.getResult();
//                            if (querySnapshot == null) return;
//                            for (QueryDocumentSnapshot documentSnapshot : querySnapshot) {
//                                documentSnapshot.getData();
//                                Map<String, Object> user = documentSnapshot.getData();
//                                Log.i("Test", users.get("name").toString());
//                                Log.i("Test", users.get("lastName").toString());
//                                Log.i("Test", users.get("age").toString());
//                                Log.i("Test", users.get("sex").toString());
//                            }
//                        } else {
//                            Toast.makeText(MainActivity.this, "Всё печально", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });


//        db.collection("users")
//                .get()
//                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
//                    @Override
//                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
//                        if (task.isSuccessful()) {
//                            for (QueryDocumentSnapshot document : task.getResult()) {
//                                Log.i("Test", document.getId() + " => " + document.getData());
//                            }
//                        } else {
//                            Log.i("Test", "Error getting documents.", task.getException());
//                        }
//                    }
//                });
//
        adapter = new UsersAdapter(users); // !!!!!!!!!!!!!!!!!!!!!!
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


//        db.collection("users")
//                .addSnapshotListener(new EventListener<QuerySnapshot>() {
//                    @Override
//                    public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
//                        if (queryDocumentSnapshots != null) {
//                            for (QueryDocumentSnapshot document : queryDocumentSnapshots) {
//                                Log.i("Test", document.getId() + " => " + document.getData());
//                            }
//                        } else {
//                            Toast.makeText(MainActivity.this, "Ошибка слушателя", Toast.LENGTH_SHORT).show();
//                        }
//                    }
//                });
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        db.collection("users").addSnapshotListener(new EventListener<QuerySnapshot>() {
//            @Override
//            public void onEvent(@Nullable QuerySnapshot queryDocumentSnapshots, @Nullable FirebaseFirestoreException e) {
//                if (queryDocumentSnapshots != null) {
//                    List<User> users = queryDocumentSnapshots.toObjects(User.class);
//                    adapter.setUsers(users);
//                }
//            }
//        });
//    }

    public void addUser(View view) {
        Intent intent = new Intent(this, AddUserActivity.class);
        startActivity(intent);
    }
}