package cn.arunner.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item :
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item :
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //第一个参数:指定资源参数,第二个参数:指定menu对象
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d("FirstActivity","Task id is " + getTaskId());
        //加载布局
        setContentView(R.layout.first_layout);
        //获取页面上的按钮
        Button button1 =  (Button)findViewById(R.id.button_1);
        //给按钮绑定点击监听事件
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //第一个参数:上下文,由于活动本身就是一个Content对象,所以直接传入FirstActivity.this
//                Toast.makeText(FirstActivity.this,"you clicked Button 1",Toast.LENGTH_SHORT).show();
                //销毁活动
//                finish();
                //显示Intent
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                //隐式intent
//                Intent intent = new Intent("cn.arunner.activitytest.ACTION_START");
                //添加一个category
//                intent.addCategory("cn.arunner.activitytest.MY_CATEGORY");
                //调用浏览器
//                Intent intent = new Intent(Intent.ACTION_VIEW);
                //指定当前intent正在操作的数据
//                intent.setData(Uri.parse("http://www.baidu.com"));  //将网址字符解析成URI对象
                //拨打电话
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
                //向下一个活动传递数据
//                String data = "Hello SecondActivity";
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                intent.putExtra("extra_data",data);
//                startActivity(intent);
                //向上一个活动返回数据
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                startActivityForResult(intent,1);
                //打开当前活动
//                Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
                startActivityForResult(intent,1);
            }
        });
    }

    //重写方法,第一个参数是启动活动传入的请求码,第二个参数是返回数据时传入的处理结果,第三个参数是返回的数据
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        switch (requestCode) {
//            case 1 :
//                if (resultCode == RESULT_OK) {
//                    String returnedData = data.getStringExtra("data_return");
//                    Log.d("FirstActivity",returnedData);
//                }
//                break;
//            default:
//        }
//    }

//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.d("FirstActivity","onRestart");
//    }
}
