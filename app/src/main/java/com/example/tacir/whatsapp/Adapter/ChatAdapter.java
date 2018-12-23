package com.example.tacir.whatsapp.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tacir.whatsapp.Fragments.ChatFragment;
import com.example.tacir.whatsapp.R;
import com.example.tacir.whatsapp.Sohbetler;
import com.example.tacir.whatsapp.model.Chat;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatView> {
    private ArrayList<Chat> chatArrayList;
    private Context context;


    public ChatAdapter(ArrayList<Chat> chatArrayList, Context context) {
        this.context = context;
    }
    @NonNull

    @Override
    public ChatAdapter.ChatView onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_chats, viewGroup, false);

        return new ChatView(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ChatView chatView, final int i) {
        final Chat chat = chatArrayList.get(i);
        chatView.textName.setText(chat.getName());
        Picasso.get().load(chat.getImage()).into(chatView.profilPhoto);
        chatView.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Sohbetler.class);
                intent.putExtra("Name", chat.getName());
                intent.putExtra("Image", chat.getName());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
      return chatArrayList==null ? 0: chatArrayList.size();
    }

    public class ChatView extends RecyclerView.ViewHolder {
        private CircleImageView profilPhoto;
        private TextView textName;


        public ChatView(View itemView) {
            super(itemView);
            profilPhoto = itemView.findViewById(R.id.image_1);
            textName = itemView.findViewById(R.id.text_1);

        }
    }
}
