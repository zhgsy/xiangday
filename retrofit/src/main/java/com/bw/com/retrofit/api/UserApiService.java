package com.bw.com.retrofit.api;

import com.bw.com.retrofit.bean.UserBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserApiService {
    //post请求数据
    @POST("small/user/v1/register")
    @FormUrlEncoded
    /*Call<UserBean> register(@Field("phone")String mobile,@Field("pwd") String p);*/
    Call<UserBean> register(@Field("phone")String mobile,@Field("pwd") String p);


}
