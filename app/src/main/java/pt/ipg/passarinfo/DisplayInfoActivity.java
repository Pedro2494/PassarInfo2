package pt.ipg.passarinfo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);

        Intent intent = getIntent();
        String message = intent.getStringExtra("messageNome");
        TextView Nome = (TextView) findViewById(R.id.textViewNome);
        Nome.setText(message);


        String message1 = intent.getStringExtra("messageIdade");
        TextView Idade = (TextView) findViewById(R.id.textViewIdade);
        Idade.setText(message1);


        String message2 = intent.getStringExtra("messageTelefone");
        TextView Telefone = (TextView) findViewById(R.id.textViewTelefone);
        Telefone.setText(message2);

        String message3 = intent.getStringExtra("messageEmail");
        TextView Email = (TextView) findViewById(R.id.textViewEmail);
        Email.setText(message3);

        String message4 = intent.getStringExtra("messagePeso");
        TextView Peso = (TextView) findViewById(R.id.textViewPeso);
        Peso.setText(message4);

        String message5 = intent.getStringExtra("messageAltura");
        TextView Altura = (TextView) findViewById(R.id.textViewAltura);
        Altura.setText(message5);
    }
}
