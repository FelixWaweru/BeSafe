package yousalama.com.yousalama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by USER PC on 28-Jun-17.
 */
public class Settings extends AppCompatActivity{
    EditText phoneNo1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        phoneNo1=(EditText) findViewById(R.id.number1);
        Intent intent= new Intent(Settings.this,MainActivity.class);
        String str=phoneNo1.getText().toString();
        TextView mTextView = (TextView) findViewById(R.id.textt);
        mTextView.setText(str);
        intent.putExtra("Number",str);
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
}
