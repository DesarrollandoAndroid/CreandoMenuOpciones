package desarrollandoandroid.creandomenuopciones;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        switch (item.getItemId()) {

            case R.id.MenuOpcion1:
                Toast.makeText(MainActivity.this, "La opción 1 ha sido pulsada.", Toast.LENGTH_LONG).show();
                return true;

            case R.id.MenuOpcion2:

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.desarrollandoandroid.wordpress.com"));
                startActivity(intent);
                return true;

            case R.id.MenuOpcion3:
                finish();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
