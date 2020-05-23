package com.example.myproject;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class CheckoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        TextView price = findViewById(R.id.etprice);
        TextView title = findViewById(R.id.titledescription);

        Intent intent = getIntent();
        String intent_title = intent.getStringExtra("Title");
        String intent_price = intent.getStringExtra("Price");
        title.setText(intent_title);
        price.setText(intent_price);



    }

    public void checkoutBtnClicked(View view) {
        startActivity(new Intent(this, SplashActivity.class));
    }
}

