package com.verifone.tony.uitest;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.verifone.tony.uitest.adapter.FruitAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.txt)
    public TextView textView;

    @BindView(R.id.editTxt)
    public EditText editText;

    @BindView(R.id.btnOne)
    public Button btnOne;

    /** EditText result;
     *  Button; */
    @OnClick(R.id.btnOne)
    public void onBtnOneClicked() {
        String getEditText = editText.getText().toString();
        Toast.makeText(getApplicationContext(), getEditText, Toast.LENGTH_SHORT).show();
    }

    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        /**---------------- ImageView/TextView ------------------------------------------------*/
        Drawable[] drawable = textView.getCompoundDrawables();
        // 数组下表0~3,依次是:左上右下
        //left, top 可以理解为x, y坐标, 相对于文字的.
        //right, bottom可以理解为宽度和高度
        drawable[2].setBounds(0, 0, 64, 64);
        textView.setCompoundDrawables(drawable[0], drawable[1], drawable[2],
                drawable[3]);

        /*---------------- ListView ------------------------------------------------*/
        /* From 第一行代码 */
//        String[] data = {"Apple", "Mango", "Banana"};
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(arrayAdapter);
        initFruits();
        FruitAdapter adapter = new FruitAdapter(this, R.layout.fruit_item, fruitList);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        //点击事件
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Fruit fruit = fruitList.get(i);
                Toast.makeText(getApplicationContext(), fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        /*---------------- ButtonView ------------------------------------------------*/


        /*---------------- textView ------------------------------------------------*/
    }


    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.mipmap.apple);
        Fruit mango = new Fruit("Mango", R.mipmap.mongo);
        Fruit banana = new Fruit("Banana", R.mipmap.banana);

        fruitList.add(apple);
        fruitList.add(mango);
        fruitList.add(banana);
    }

}
