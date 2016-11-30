package com.morasclass.mora.catblast;
// thecatapi.com MTM4ODQ4
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int index;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    public void nextCat(View view) {
        int[] pics = {
                R.drawable.cat1,
                R.drawable.cat2,
                R.drawable.cat3,
                R.drawable.cat4,
                R.drawable.cat5,
                R.drawable.cat6,
                R.drawable.cat7,
                R.drawable.cat8,
                R.drawable.cat9,
                R.drawable.cat10,
                R.drawable.cat11,
                R.drawable.cat12,
                R.drawable.cat13,
                R.drawable.cat14,
                R.drawable.cat15,
                R.drawable.cat16,
                R.drawable.cat17,
                R.drawable.cat18,
                R.drawable.cat19,
                R.drawable.cat20,
                R.drawable.cat21,
                R.drawable.cat22,
                R.drawable.cat23,
                R.drawable.cat24,
                R.drawable.cat25,
                R.drawable.cat26,
                R.drawable.cat27,
                R.drawable.cat28,
                R.drawable.cat29,
                R.drawable.cat30,
                R.drawable.cat31,
                R.drawable.cat32,
                R.drawable.cat33,
                R.drawable.cat34,
                R.drawable.cat35,
                R.drawable.cat36,
                R.drawable.cat37,
        };

        int c = index;
       do {
            index = new Random().nextInt(36) + 1;
        } while (index == c);

        if(new java.util.Random().nextInt(10)>6)
        Toast.makeText(MainActivity.this, "sweet cat!", Toast.LENGTH_SHORT).show();
        else if(new java.util.Random().nextInt(10)>6){
            Toast.makeText(MainActivity.this, "sweet cat!", Toast.LENGTH_SHORT).show();
        }
        else if(new java.util.Random().nextInt(10)>6){
            Toast.makeText(MainActivity.this, "pretty kitty!", Toast.LENGTH_SHORT).show();
        }
        else if(new java.util.Random().nextInt(10)>6){
            Toast.makeText(MainActivity.this, "I love cats!", Toast.LENGTH_SHORT).show();
        }
        else if(new java.util.Random().nextInt(10)>6){
            Toast.makeText(MainActivity.this, "kitty cat!", Toast.LENGTH_SHORT).show();
        }
        else if(new java.util.Random().nextInt(10)>6){
            Toast.makeText(MainActivity.this, "furry baby!", Toast.LENGTH_SHORT).show();
        }

        Log.i("Info", "cat #"+(index+1));

        ImageView image = (ImageView) findViewById(R.id.theStage);


        //image.setImageResource(index);
        image.setImageResource(pics[index]);

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

}
