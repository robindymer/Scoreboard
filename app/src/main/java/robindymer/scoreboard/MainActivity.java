package robindymer.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override // Inflate custom menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override // item - parameter that will be the selected item
    public boolean onOptionsItemSelected(MenuItem item) {
        // Figure out what item was selected
        switch (item.getItemId()) {
            case R.id.clearStrokes:
                // Clear saved data from SharedPreferences file and set all scores to their default
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
