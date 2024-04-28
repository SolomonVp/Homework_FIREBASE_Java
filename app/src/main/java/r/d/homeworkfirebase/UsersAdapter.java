package r.d.homeworkfirebase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.Firebase;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UsersViewHolder> {

    private List<User> users;
    public UsersAdapter(List<User> users) {
        this.users = users;
    }
    public List<User> getUsers() {
        return users;
    }
    public void setUsers(List<User> users) {
        this.users = users;
    }

    @NonNull
    @Override
    public UsersViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_item, viewGroup, false);
        return new UsersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UsersViewHolder usersViewHolder, int i) {
        User user = users.get(i);
        usersViewHolder.textViewName.setText(user.getName());
        usersViewHolder.textViewLastName.setText(user.getLasName());
        usersViewHolder.textViewAge.setText(String.format("%s", user.getAge()));
        usersViewHolder.textViewSex.setText(user.getSex());
    }

    @Override
    public int getItemCount() {
        return users.size(); //!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

    static class UsersViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewName;
        private TextView textViewLastName;
        private TextView textViewSex;
        private TextView textViewAge;
        public UsersViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewLastName = itemView.findViewById(R.id.textViewLastName);
            textViewSex = itemView.findViewById(R.id.textViewSex);
            textViewAge = itemView.findViewById(R.id.textViewAge);
        }
    }

}
