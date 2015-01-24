package br.com.moge.academico;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


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
        //configSeekBar();

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        spinner = (Spinner) findViewById(R.id.spinner);
        String[] alunos = new String[] {"Helder", "Hermogenes", "Guilherme", "Bruno", "Cesar"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, alunos);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        webView = (WebView) findViewById(R.id.webview);
        webView.loadUrl("http://www.conhecimentodigital.com.br");

        webView.setWebViewClient(new MyWebViewClient());

    }

    public class MyWebViewClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            Toast.makeText(ViewsActivity.this, "Carregando...", Toast.LENGTH_LONG).show();
            return super.shouldOverrideUrlLoading(view, url);
        }


    }


}
