package com.example.fblogin_page
import ...
public  class MainActivity extends AppCompatActivity{



@Override

protected void onCreate(Bundle savedInstanceState) {

    super.onCreate(savedInstanceState); Button reg findViewById(R.id.reg);

    setContentView(R.layout.activity_main);

    reg.setOnClickListener(new View.OnClickListener() {

        @Override

        public void onClick(View view) {

            Intent intent = new Intent(packageContent.MainActivity.this, RegisterActivity.class);

            startActivity(intent);

        });
    }
}
