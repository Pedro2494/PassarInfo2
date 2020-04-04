package pt.ipg.passarinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayInfoActivity.class);
        EditText Nome = (EditText) findViewById(R.id.editText);
        String messageNome = Nome.getText().toString();
        intent.putExtra("messageNome", messageNome);

        EditText Idade = (EditText) findViewById(R.id.editText2);
        String messageIdade= Idade.getText().toString();
        intent.putExtra("messageIdade", messageIdade);

        EditText Telefone = (EditText) findViewById(R.id.editText3);
        String messageTelefone= Telefone.getText().toString();
        intent.putExtra("messageTelefone", messageTelefone);

        EditText Email = (EditText) findViewById(R.id.editText4);
        String messageEmail= Email.getText().toString();
        intent.putExtra("messageEmail", messageEmail);


        EditText Peso = (EditText) findViewById(R.id.editText5);
        String messagePeso= Peso.getText().toString();
        intent.putExtra("messagePeso", messagePeso);


        EditText Altura = (EditText) findViewById(R.id.editText6);
        String messageAltura= Altura.getText().toString();
        intent.putExtra("messageAltura", messageAltura);
        startActivity(intent);
    }
}
