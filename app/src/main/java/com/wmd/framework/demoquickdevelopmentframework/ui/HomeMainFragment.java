package com.wmd.framework.demoquickdevelopmentframework.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wmd.framework.demoquickdevelopmentframework.base.BaseLazyMainFragment;


/**
 * 时间：2016/11/25/13：43
 * 作者：Wumingde
 * 邮箱：1732141816@qq.com
 * 作用：框架分支页面
 * 声明：版权归作者所有
 */
public class HomeMainFragment extends BaseLazyMainFragment {
    private Toolbar toolbar;

    public static HomeMainFragment newInstance() {
        Bundle args = new Bundle();

        HomeMainFragment fragment = new HomeMainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    TextView tv;

    //初始化控件
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tv = new TextView(getContext());
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(Color.YELLOW);
        tv.setTextSize(40);
        return tv;
    }

    private void initView(View view) {
//        toolbar = (Toolbar)view.findViewById(R.id.toolbar);

    }


    //加载数据

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        tv.setText("首页");
    }
}
