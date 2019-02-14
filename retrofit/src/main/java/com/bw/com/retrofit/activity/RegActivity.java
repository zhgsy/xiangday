package com.bw.com.retrofit.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.bw.com.retrofit.R;
import com.bw.com.retrofit.api.ApiService;
import com.bw.com.retrofit.api.UserApiService;
import com.bw.com.retrofit.bean.UserBean;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegActivity extends AppCompatActivity {

    @BindView(R.id.re_name)
    EditText reName;
    @BindView(R.id.re_pwd)
    EditText rePwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        ButterKnife.bind(this);

    }

    /**
     * 注册点击事件
     *
     * @param view
     */
    public void reg(View view) {
        //第一步添加retrofit依赖 和网络三剑客
        //第二步创建retrofit管理器
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiService.BASE_URL)//主机名字
                .addConverterFactory(GsonConverterFactory.create())//数据解析器
                .build();
        //第三步实现接口
        /*UserApiService userApiService =*/
        /*Call<UserBean> register =*/
        String name = reName.getText().toString();
        String pwd = rePwd.getText().toString();
        retrofit.create(UserApiService.class).register(name, pwd).enqueue(new Callback<UserBean>() {
            @Override
            public void onResponse(Call<UserBean> call, Response<UserBean> response) {
                UserBean userBean = response.body();//响应体
                Toast.makeText(RegActivity.this, userBean.message, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<UserBean> call, Throwable t) {

            }
        });
        //第四步
        /*    Call<UserBean> register = userApiService.register("18625436921", "1111111");*/
        //第五步请求
     /*   register.enqueue(new Callback<UserBean>() {
            @Override
            public void onResponse(Call<UserBean> call, Response<UserBean> response) {
                UserBean userBean = response.body();//响应体
                Toast.makeText(RegActivity.this,userBean.message,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<UserBean> call, Throwable t) {

            }
        });
*/

    }
}
