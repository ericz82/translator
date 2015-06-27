package com.firstapp.eric.translator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;


public class Translate extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_translate, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void yourLang(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        RadioButton a = (RadioButton) this.findViewById(R.id.hello);
        RadioButton b = (RadioButton) this.findViewById(R.id.how_much);
        RadioButton c = (RadioButton) this.findViewById(R.id.please);
        RadioButton d = (RadioButton) this.findViewById(R.id.thank_you);
        RadioButton e = (RadioButton) this.findViewById(R.id.goodbye);


        switch(view.getId()) {
            case R.id.your_english:
                if (checked) {
                    a.setText(R.string.helloe);
                    b.setText(R.string.how_muche);
                    c.setText(R.string.pleasee);
                    d.setText(R.string.thank_youe);
                    e.setText(R.string.goodbyee);
                    break;
                }
            case R.id.your_french:
                if (checked) {
                    a.setText(R.string.hellof);
                    b.setText(R.string.how_muchf);
                    c.setText(R.string.pleasef);
                    d.setText(R.string.thank_youf);
                    e.setText(R.string.goodbyef);
                    break;
                }
            case R.id.your_chinese:
                if (checked) {
                    a.setText(R.string.helloc);
                    b.setText(R.string.how_muchc);
                    c.setText(R.string.pleasec);
                    d.setText(R.string.thank_youc);
                    e.setText(R.string.goodbyec);
                    break;
                }
        }
    }

    public void phrase(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView a = (TextView) this.findViewById(R.id.resulte);
        TextView b = (TextView) this.findViewById(R.id.resultf);
        TextView c = (TextView) this.findViewById(R.id.resultc);

        switch(view.getId()) {
            case R.id.hello:
                if (checked) {
                    a.setText(R.string.helloe);
                    b.setText(R.string.hellof);
                    c.setText(R.string.helloc);
                    break;
                }
            case R.id.how_much:
                if (checked) {
                    a.setText(R.string.how_muche);
                    b.setText(R.string.how_muchf);
                    c.setText(R.string.how_muchc);
                    break;
                }
            case R.id.please:
                if (checked) {
                    a.setText(R.string.pleasee);
                    b.setText(R.string.pleasef);
                    c.setText(R.string.pleasec);
                    break;
                }
            case R.id.thank_you:
                if (checked) {
                    a.setText(R.string.thank_youe);
                    b.setText(R.string.thank_youf);
                    c.setText(R.string.thank_youc);
                    break;
                }
            case R.id.goodbye:
                if (checked) {
                    a.setText(R.string.goodbyee);
                    b.setText(R.string.goodbyef);
                    c.setText(R.string.goodbyec);
                    break;
                }
        }

    }
}
