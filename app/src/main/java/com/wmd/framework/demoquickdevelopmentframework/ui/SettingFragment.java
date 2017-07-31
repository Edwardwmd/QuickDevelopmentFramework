package com.wmd.framework.demoquickdevelopmentframework.ui;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.wmd.framework.demoquickdevelopmentframework.base.BaseLazyMainFragment;


/**
 * 时间：2016/11/25/13：22
 * 作者：吴明德
 * 邮箱：1732141816@qq.com
 * 作用：框架分支页面
 * 声明：版权归作者所有
 */
public class SettingFragment extends BaseLazyMainFragment {
    public static SettingFragment newInstance() {

        Bundle args = new Bundle();

        SettingFragment fragment = new SettingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    TextView tv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        tv = new TextView(getContext());
        tv.setGravity(Gravity.CENTER);
        tv.setTextColor(Color.YELLOW);
        tv.setTextSize(40);
        return tv;
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        tv.setText("设置");
    }
}
