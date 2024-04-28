package r.d.homeworkfirebase;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class AddUserActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextLastName;
    private EditText editTextAge;
    private EditText editTextSex;
    FirebaseFirestore db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        editTextName = findViewById(R.id.editTextName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextAge = findViewById(R.id.editTextAge);
        editTextSex = findViewById(R.id.editTextSex);

        db = FirebaseFirestore.getInstance();
    }

    public void saveUser(View view) {
        String name = editTextName.getText().toString();
        String lastName = editTextLastName.getText().toString();
        String age = editTextAge.getText().toString();
        String sex = editTextSex.getText().toString();

//        Intent intent2 = new Intent(this, MainActivity.class);
//        intent2.putExtra("name", name);
//        intent2.putExtra("lastName", lastName);
//        intent2.putExtra("age", Integer.parseInt(age));
//        intent2.putExtra("sex", sex);
//        startActivity(intent2);

        User user = new User(name, lastName, Integer.parseInt(age), sex);

        db.collection("users")
                .add(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Toast.makeText(AddUserActivity.this, "Отлично", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(AddUserActivity.this, "Печально", Toast.LENGTH_SHORT).show();
                    }
                });

    }
}