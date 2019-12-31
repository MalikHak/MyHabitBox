package app.auaf.myhabitbox;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentsViewHolder> {


    String names[];
    String jobs[];
    String description[];

    int photos[];
    int photosdescriptions[];


    public StudentsAdapter(String[] names, String[] jobs, String[] description, int[] photos, int[] photosdescriptions) {
        this.names = names;
        this.jobs = jobs;
        this.description = description;
        this.photos = photos;
        this.photosdescriptions = photosdescriptions;
    }

    @NonNull
    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {



        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_items,parent,false);


        return new StudentsViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, int position) {

        holder.tvNames.setText(names[position]);
        holder.tvJob.setText(jobs[position]);
        holder.tvDescription.setText(description[position]);

        holder.ivDescription.setImageResource(photosdescriptions[position]);
        holder.ivProfile.setImageResource(photos[position]);

    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public class StudentsViewHolder extends RecyclerView.ViewHolder{

        TextView tvNames,tvJob,tvDescription;
        CircleImageView ivProfile;
        ImageView ivDescription;

        public StudentsViewHolder(@NonNull View itemView) {
            super(itemView);


            tvNames=itemView.findViewById(R.id.tvUserName);
            tvDescription=itemView.findViewById(R.id.tvDetailPost);
            tvJob=itemView.findViewById(R.id.tvJobUser);

            ivProfile=itemView.findViewById(R.id.ivprofileUser);
            ivDescription=itemView.findViewById(R.id.ivPhotoPost);


        }
    }
}
