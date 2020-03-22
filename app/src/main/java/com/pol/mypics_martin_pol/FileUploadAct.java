package com.pol.mypics_martin_pol;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class FileUploadAct extends AppCompatActivity {
    Button btnUpload;
    ImageButton btnDelete;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_upload);

        btnDelete = findViewById(R.id.btnDelete);
        btnUpload = findViewById(R.id.btnUpload);

        editText = findViewById(R.id.editText);

    }
}
