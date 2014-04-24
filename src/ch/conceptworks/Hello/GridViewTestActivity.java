package ch.conceptworks.Hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * TODO
 *
 * @author Florian Specker
 */
public class GridViewTestActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // remove title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_grid_view_test);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        final GridAdapter gridadapter = new GridAdapter(this);
        gridview.setAdapter(gridadapter);

/*        gridView.setOnItemClickListener(new onItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                // do something here (see next section)
            }
        });
        */
    }
}