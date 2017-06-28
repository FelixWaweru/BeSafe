package yousalama.com.yousalama;

import android.Manifest;
import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String message;
    String number="5556";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button alert = (Button) findViewById(R.id.alert);
        findViewById(R.id.alert).setOnTouchListener(new View.OnTouchListener() {
            private GestureDetector gestureDetector = new GestureDetector(MainActivity.this, new GestureDetector.SimpleOnGestureListener() {
                @Override
                public boolean onDoubleTap(MotionEvent e) {
                    //        Intent intent= getIntent();
//        number= intent.getStringExtra("Number");
                    SmsManager manager= SmsManager.getDefault();
                    manager.sendTextMessage(number,null,"Please Help",null,null);
                    Toast.makeText(MainActivity.this, "Super Emergency message sent to"+number, Toast.LENGTH_SHORT).show();
                    return super.onDoubleTap(e);
                }
            });

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //        Intent intent= getIntent();
//        number= intent.getStringExtra("Number");
                SmsManager manager= SmsManager.getDefault();
                manager.sendTextMessage(number, null, "Please Help", null, null);
                Toast.makeText(MainActivity.this, "Emergency message sent to"+number, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
//        LocationManager listenerr =(LocationManager) getSystemService(LOCATION_SERVICE);
//        listenerr.requestLocationUpdates(LocationManager.GPS_PROVIDER,30*1000,0,listener);

    }
//    boolean firstTouch = false;
//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        if(event.getAction() == event.ACTION_DOWN){
//            if(firstTouch && (Helper.getCurrentTimeInMilliSeconds() - time) <= 300) {
//                //do stuff here for double tap
//                Log.e("** DOUBLE TAP**"," second tap ");
//                firstTouch = false;
//
//            } else {
//                firstTouch = true;
//                time = Helper.getCurrentTimeInMilliSeconds();
//                Log.e("** SINGLE  TAP**"," First Tap time  "+time);
//                return false;
//            }
//        }
//        return true;
//    }
    private void sendSms() {
//        LocationManager listenerr =(LocationManager) getSystemService(LOCATION_SERVICE);
//        StringBuilder str = new StringBuilder();
//        str.append(listenerr.requestLocationUpdates(LocationManager.GPS_PROVIDER,30*1000,0,listener));
//        Intent intent= getIntent();
//        number= intent.getStringExtra("Number");
        SmsManager manager= SmsManager.getDefault();
        manager.sendTextMessage(number,null,"Please Help",null,null);
        Toast.makeText(MainActivity.this, "Emergency message sent to"+number, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.longpress:
                //open manifesto
                startActivity(new Intent(this, Long_Press.class));
                return true;
            case R.id.mainpress:
                //open main activity
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case R.id.action_settings:
                startActivity(new Intent(this, Settings.class));
            default:
                return super.onOptionsItemSelected(item);

        }


    }
    LocationListener listener = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {

        }

        @Override
        public void onStatusChanged(String provider, int status, Bundle extras) {

        }

        @Override
        public void onProviderEnabled(String provider) {

        }

        @Override
        public void onProviderDisabled(String provider) {

        }
    };
}
