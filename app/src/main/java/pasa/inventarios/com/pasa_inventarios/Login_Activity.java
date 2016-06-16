package pasa.inventarios.com.pasa_inventarios;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnAcceder = (Button) findViewById(R.id.btnAceptar);
        btnAcceder.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Intent i = new Intent(Login_Activity.this,MainActivity.class);
        startActivity(i);
        finish();
    }
    }











