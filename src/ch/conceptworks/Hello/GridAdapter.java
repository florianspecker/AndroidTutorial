package ch.conceptworks.Hello;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * TODO
 *
 * @author Florian Specker
 */
public class GridAdapter extends BaseAdapter {
    private Context context;
    private Integer[] imageIds = {
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table,
            R.drawable.hat, R.drawable.shoe, R.drawable.table
    };

    public GridAdapter(Context c) {
        context = c;
    }

    public int getCount() {
        return imageIds.length;
    }

    public Object getItem(int position) {
        return imageIds[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        ImageView iview;
        if (view == null) {
            iview = new ImageView(context);
            iview.setLayoutParams(new GridView.LayoutParams(100,100));
            iview.setScaleType(ImageView.ScaleType.FIT_CENTER);
            iview.setPadding(5, 5, 5, 5);
        } else {
            iview = (ImageView) view;
        }
        iview.setImageResource(imageIds[position]);
        return iview;
    }
}