package com.example.user.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class singlePlayerBoardType extends AppCompatActivity {
    private RadioGroup selectedMove;
    public static int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player_board_type);
        selectedMove=findViewById(R.id.move);
    }
    public void threeByThree(View view){
        id=selectedMove.getCheckedRadioButtonId();
        Intent intent=new Intent(getBaseContext(),single_player.class);
        startActivity(intent);

    }
    public void fiveByFive(View view){
        id=selectedMove.getCheckedRadioButtonId();
        Intent intent=new Intent(getBaseContext(),singleFiveByFive.class);
        startActivity(intent);

    }

}