package com.example.yuvi.instagramhashtags;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.modelViewHolder> {
   private Context mContext;
   private List<TagsModelClass> itemlist;
    ImageView imageforcopy;
    TextView tagsName;
    
    public ModelAdapter(Context mContext, List<TagsModelClass> itemlist) {
        this.mContext = mContext;
        this.itemlist = itemlist;
    }


    @Override
    public modelViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list,parent,false);
        return new modelViewHolder(view);

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onBindViewHolder(final modelViewHolder holder, int position) {
        holder.toptext.setText(itemlist.get(position).getToptext());
        holder.tagsName.setText(itemlist.get(position).getTagsName());
        holder.imageforcopy.setImageDrawable(mContext.getDrawable(R.drawable.copttxt));

        holder.imageforcopy.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){

                String text = holder.tagsName.getText().toString();
                ClipboardManager myClipboard = (ClipboardManager) v.getContext().getSystemService(Context.CLIPBOARD_SERVICE);


                ClipData myClip = ClipData.newPlainText("text", text);
                myClipboard.setPrimaryClip(myClip);
                Toast.makeText(v.getContext(), "Hastags Copied" , Toast.LENGTH_SHORT ).show();

            }
        });

    }

    @Override
    public int getItemCount()  {
        return itemlist.size();
    }

    public class modelViewHolder extends RecyclerView.ViewHolder{
        TextView toptext, tagsName;
        ImageView imageforcopy;

        public modelViewHolder(View itemView) {
            super(itemView);
            toptext= (TextView) itemView.findViewById(R.id.toptext);
            tagsName= (TextView) itemView.findViewById(R.id.tagsName);
            imageforcopy= (ImageView) itemView.findViewById(R.id.imageforcopy);

        }
    }

    public void setFilter (ArrayList<TagsModelClass> newList){
        itemlist=new ArrayList<>();
        itemlist.addAll(newList);
        notifyDataSetChanged();
    }
}

