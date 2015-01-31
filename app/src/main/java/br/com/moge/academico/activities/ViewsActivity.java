package br.com.moge.academico.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import br.com.moge.academico.R;


public class ViewsActivity extends ActionBarActivity {
    private SeekBar seekBar;
    private TextView seekValue;
    private RadioGroup radioGroup;
    private Spinner spinner;
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekValue = (TextView) findViewById(R.id.seekValue);
        configSeekBar();

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        configRadioGroup();

        spinner = (Spinner) findViewById(R.id.spinner);
        String[] alunos = new String[] {"Helder", "Hermogenes", "Guilherme", "Bruno", "Cesar"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, alunos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://www.conhecimentodigital.com.br");

        webView.setWebViewClient(new MyWebViewClient());

    }

    private void configRadioGroup() {
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton button = (RadioButton) findViewById(checkedId);

                Toast.makeText(ViewsActivity.this, "Sexo: " + button.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void configSeekBar() {
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekValue.setText("R$ " + progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    public class MyWebViewClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            Toast.makeText(ViewsActivity.this, "Carregando...", Toast.LENGTH_LONG).show();
            return super.shouldOverrideUrlLoading(view, url);
        }


    }


}
