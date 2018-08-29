package ph.edu.iicsust.hernandez.allianagabriel.even;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button displayButton = (Button) findViewById(R.id.displayButton);
        displayButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int count = 1;

                for (int n = 2; count <= 10; n=n+2) {
                    resultTextView.append(n + " ");
                    count++;
                }

            }
        });
    }
}
