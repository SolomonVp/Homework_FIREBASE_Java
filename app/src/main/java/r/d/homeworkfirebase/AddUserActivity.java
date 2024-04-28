package r.d.homeworkfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddUserActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextLastName;
    private EditText editTextAge;
    private EditText editTextSex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        editTextName = findViewById(R.id.editTextName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextAge = findViewById(R.id.editTextAge);
        editTextSex = findViewById(R.id.editTextSex);
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
        MainActivity.users.add(user);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}