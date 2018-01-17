package toong.vn.androidtextviewscroll;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = ((TextView) findViewById(R.id.textView));
        textView.setMovementMethod(new ScrollingMovementMethod());

        textView.setVerticalScrollBarEnabled(true);

    }
}
