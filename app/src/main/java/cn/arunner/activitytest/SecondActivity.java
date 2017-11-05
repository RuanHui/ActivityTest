package cn.arunner.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d("SecondActivity","Task id is " + getTaskId());
        setContentView(R.layout.second_layout);
        //接受从上一个活动传来的数据
//        Intent intent = getIntent();
//        String data = intent.getStringExtra("extra_data");
//        Log.d("SecondActivity",data);
        //给button 2 注册按钮监听事件
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
                //定义数据返回给上一个活动
//                Intent intent = new Intent();
//                intent.putExtra("data_return","Hello FirstActivity");
//                setResult(RESULT_OK,intent);
//                //销毁活动
//                finish();
            }
        });
    }
    //重写方法(按下Back键返回的方法)
//    @Override
//    public void onBackPressed() {
//        //定义数据返回给上一个活动
//        Intent intent = new Intent();
//        intent.putExtra("data_return","Hello FirstActivity");
//        setResult(RESULT_OK,intent);
//        //销毁活动
//        finish();
//    }

//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d("SecondActivity","onDestroy");
//    }
}
