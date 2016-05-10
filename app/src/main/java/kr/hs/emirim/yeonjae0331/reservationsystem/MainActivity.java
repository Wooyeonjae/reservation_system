package kr.hs.emirim.yeonjae0331.reservationsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Chronometer chrono;
    Button butStart, butDone;
    RadioButton radioDate, radioTime;
    CalendarView calView;
    TimePicker timePic;
    TextView textResult;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chrono=(Chronometer)findViewById(R.id.chrono);
        butStart=(Button)findViewById(R.id.but_start); //예약 시작버튼
        butDone=(Button)findViewById(R.id.but_done); //예약 완료버튼
        radioDate=(RadioButton)findViewById(R.id.radio_date);
        radioTime=(RadioButton)findViewById(R.id.radio_time);
        calView=(CalendarView)findViewById(R.id.calendar);
        timePic=(TimePicker)findViewById(R.id.time_pick);
        textResult=(TextView)findViewById(R.id.time_result);

        timePic.setVisibility(View.INVISIBLE);
        calView.setVisibility(View.INVISIBLE);
    }
}
