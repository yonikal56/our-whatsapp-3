package com.example.ourwhatsapp.Activities.Messages;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ourwhatsapp.R;

import java.util.ArrayList;
import java.util.List;

public class ChatActivity extends AppCompatActivity {

    private ImageView profilePictureView;
    private TextView userNameView;
    private Button retButton;
    private MessageAdapter messageAdapter;
    private List<Message> messages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        profilePictureView = findViewById(R.id.user_image_profile_image);
        userNameView = findViewById(R.id.user_text_user_name);

        Intent activityIntent = getIntent();

        if (activityIntent != null) {
            String userName = activityIntent.getStringExtra("userName");
            int profilePicture = activityIntent.getIntExtra("profilePicture", R.drawable.blue);

            profilePictureView.setImageResource(profilePicture);
            userNameView.setText(userName);

            messages = new ArrayList<>();
            messages.add(new Message("Hello", "10:00", Message.MessageType.SENT));
            messages.add(new Message("Hi", "10:05", Message.MessageType.RECEIVED));

            ListView listView = findViewById(R.id.list_view);
            messageAdapter = new MessageAdapter(this, R.layout.custom_messages_item, messages);
            listView.setAdapter(messageAdapter);
        }

        retButton = findViewById(R.id.returnBtn);

        retButton.setOnClickListener(view -> finish());
    }
}