package app.auaf.myhabitbox;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;

public class ProvinceAdapter extends RecyclerView.Adapter<ProvinceAdapter.ProvinceViewHolder>{


    String provinceNames[];

    String provinceDescriptions[];

    int provincePhotos[];

    public ProvinceAdapter(String[] provinceNames, String[] provinceDescriptions, int[] provincePhotos) {
        this.provinceNames = provinceNames;
        this.provinceDescriptions = provinceDescriptions;
        this.provincePhotos = provincePhotos;
    }


    @NonNull
    @Override
    public ProvinceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.province_item,parent,false);

        return new ProvinceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProvinceViewHolder holder, int position) {


        holder.tvDescProvince.setText(provinceDescriptions[position]);
        holder.tvProvinceName.setText(provinceNames[position]);

        holder.ivProvincephoto.setImageResource(provincePhotos[position]);



    }

    @Override
    public int getItemCount() {
        return provincePhotos.length;
    }

    public  class ProvinceViewHolder extends RecyclerView.ViewHolder {

        TextView tvProvinceName;
        TextView tvDescProvince;

        ImageView ivProvincephoto;

        public ProvinceViewHolder(@NonNull View itemView) {
            super(itemView);


            tvProvinceName=itemView.findViewById(R.id.tvProvinceName);
            tvDescProvince=itemView.findViewById(R.id.tvDescriptionPronvince);
            ivProvincephoto=itemView.findViewById(R.id.ivProvincePhoto);
        }
    }
}