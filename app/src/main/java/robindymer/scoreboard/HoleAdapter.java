package robindymer.scoreboard;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HoleAdapter extends RecyclerView.Adapter<HoleAdapter.HoleViewHolder> {

    private Hole mHoles;
    private Context mContext;

    public HoleAdapter(Context context, Hole holes) {
        mContext = context;
        mHoles = holes;
    }

    @Override
    public HoleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.hole_list_item, parent, false);
        HoleViewHolder viewHolder = new HoleViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(HoleViewHolder holder, int position) {
        holder.bindHole(mHoles[position]);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HoleViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        public HoleViewHolder(View itemView) {
            super(itemView);
        }

        public void bindHole(Hole hole) {

        }

        @Override
        public void onClick(View v) {

        }
    }
}
