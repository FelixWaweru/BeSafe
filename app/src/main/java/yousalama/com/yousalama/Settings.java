package yousalama.com.yousalama;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by USER PC on 28-Jun-17.
 */
public class Settings extends AppCompatActivity{
    EditText phoneNo1;
    EditText contactname;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        contactname=(EditText) findViewById(R.id.name);
        phoneNo1=(EditText) findViewById(R.id.number1);
        Button Save = (Button) findViewById(R.id.save);
        Save.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String str = contactname.getText().toString();
                        String str2 = phoneNo1.getText().toString();
                        TextView namee = (TextView) findViewById(R.id.namee);
                        namee.setText(str);
                        TextView number = (TextView) findViewById(R.id.textt);
                        number.setText(str2);
                        Intent intent = new Intent(Settings.this, MainActivity.class);
                        intent.putExtra("Name", str);
                        Intent intent2 = new Intent(Settings.this, MainActivity.class);
                        intent2.putExtra("Number", str2);
                    }
                }
        );

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
