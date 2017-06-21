package yousalama.com.yousalama;

import android.app.ActionBar;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//
//    private ViewPager viewPager;
//    private TabsPagerAdapter mAdapter;
//    private ActionBar actionBar;
//    // Tab titles
//    private String[] tabs = { "Top Rated", "Games", "Movies" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alert = (Button) findViewById(R.id.alert);
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber;
                Location currentLocation;
//                public void sendLocationSMS(phoneNumber,currentLocation) {
                    phoneNumber = "0705244074";
                    SmsManager smsManager = SmsManager.getDefault();
                    StringBuffer smsBody = new StringBuffer();
                    smsBody.append("http://maps.google.com?q=");
                    smsBody.append(currentLocation.getLatitude());
                    smsBody.append(",");
                    smsBody.append(currentLocation.getLongitude());
                    smsManager.sendTextMessage(phoneNumber, null, smsBody.toString(), null, null);
//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?saddr=" + phoneNumber)));
                    Toast.makeText(MainActivity.this, "Distress sent", Toast.LENGTH_SHORT).show();
//                }

        }
        });

//// Initilization
//        viewPager = (ViewPager) findViewById(R.id.pager);
//        actionBar = getActionBar();
//        mAdapter = new TabsPagerAdapter(getSupportFragmentManager());
//
//        viewPager.setAdapter(mAdapter);
//        actionBar.setHomeButtonEnabled(false);
//        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
//
//        // Adding Tabs
//        for (String tab_name : tabs) {
//            actionBar.addTab(actionBar.newTab().setText(tab_name)
//                    .setTabListener(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
