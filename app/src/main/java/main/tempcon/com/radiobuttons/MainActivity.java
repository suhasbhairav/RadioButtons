package main.tempcon.com.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView final_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final_result = (TextView) findViewById(R.id.result_text);
        final_result.setEnabled(false);
    }

    public void selectFruit(View view){
        boolean checked = ((RadioButton)view).isChecked();
        switch(view.getId()){
            case R.id.fruit_apple:
                if(checked) {
                    final_result.setText("Apple");
                    final_result.setEnabled(true);
                }else{
                    final_result.setEnabled(false);
                }
                break;
            case R.id.fruit_orange:
                if(checked) {
                    final_result.setText("Orange");
                    final_result.setEnabled(true);
                }else{
                    final_result.setEnabled(false);
                }
                break;
            case R.id.fruit_grapes:
                if(checked) {
                    final_result.setText("Grapes");
                    final_result.setEnabled(true);
                }else{
                    final_result.setEnabled(false);
                }
                break;
        }

    }
}
