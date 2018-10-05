package com.example.mraec.labact4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button back = (Button) findViewById(R.id.back);
        final Button next = (Button) findViewById(R.id.next);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String msg= "This is a Toast message!!";
                int duration = Toast.LENGTH_LONG;

                Toast.makeText(MainActivity.this, msg, duration).show();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg="This is a Snackbar message";
                int duration = Snackbar.LENGTH_LONG;

                Snackbar snackbar = Snackbar.make(next, msg, duration)
                        .setAction("UNDO", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Snackbar snackbarAct = Snackbar.make(next, "nice", Snackbar.LENGTH_LONG);
                                snackbarAct.show();
                            }
                        });
                        snackbar.show();
            }
        });
    }
}
