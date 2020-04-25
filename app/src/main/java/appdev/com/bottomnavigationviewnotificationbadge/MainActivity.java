package appdev.com.bottomnavigationviewnotificationbadge;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.ammarptn.bottomnavbadge.Badge;
import com.ammarptn.bottomnavbadge.NotificationBadge;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottom_navigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottom_navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.bottomNavigationAlarmMenuId){
                    Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.bottomNavigationClockMenuId){
                    Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.bottomNavigationStopWatchMenuId){
                    Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.bottomNavigationTimerMenuId){
                    Toast.makeText(MainActivity.this, "Clicked", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });

        // pass bottomNavMenu view and index of menu you want to show badge
        Badge badge = NotificationBadge.getBadge(bottom_navigation, 0);

// set number to it
        badge.setNumber(2);
        badge.setVisibility(View.GONE);

        Badge badge1 = NotificationBadge.getBadge(bottom_navigation, 1);

// set number to it
        badge1.setNumber(3);
    }


}
