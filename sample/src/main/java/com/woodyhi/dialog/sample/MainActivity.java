package com.woodyhi.dialog.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.woodyhi.dialog.BottomDialogFragment;
import com.woodyhi.dialog.OnViewCreatedListener;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });
    }

    private void showDialog() {
        final BottomDialogFragment bottomDialogFragment = new BottomDialogFragment();
        bottomDialogFragment.setLayoutResId(R.layout.dialog);
        bottomDialogFragment.setOnViewCreatedListener(new OnViewCreatedListener() {
            @Override
            public void onViewCreate(View view) {
                view.findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(), "xxx", Toast.LENGTH_LONG).show();
                        bottomDialogFragment.dismiss();
                    }
                });
            }
        });
        bottomDialogFragment.show(getSupportFragmentManager(), BottomDialogFragment.class.getSimpleName());
    }
}
