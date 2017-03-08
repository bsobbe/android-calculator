package calculator.sobhan.me;

import android.databinding.DataBindingUtil;
import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import calculator.sobhan.me.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private double first_value = Double.NaN;
    private double second_value;
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DEVISION = '/';
    private char CURRENT_ACTION;

    //Setting decimal places in 10.(Available since API Level 24)
    //DecimalFormat decimalFormat = new DecimalFormat("#.##########");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Binding and registering view contents.
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //Setting numbers in edit text after clicking on.
        binding.buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() +  "9");
            }
        });
        binding.buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "8");
            }
        });
        binding.buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "7");
            }
        });
        binding.buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "6");
            }
        });
        binding.buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "5");
            }
        });
        binding.buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "4");
            }
        });
        binding.buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "3");
            }
        });
        binding.buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "2");
            }
        });
        binding.buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "1");
            }
        });
        binding.buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "0");
            }
        });
        binding.buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + ".");
            }
        });
        binding.buttonDevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "/");
            }
        });
        binding.buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "*");
            }
        });
        binding.buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "-");
            }
        });
        binding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText(binding.editText.getText() + "+");
            }
        });
        //To clear the edit text after clicking on C button.
        binding.buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.editText.setText("");
            }
        });

    }
}
