package com.wmd.framework.demoquickdevelopmentframework.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * 时间：2016/11/25/13：20
 * 作者：Wumingde
 * 邮箱：1732141816@qq.com
 * 作用：fragmentment基类
 * 声明：版权归作者所有
 */
public abstract class BaseLazyMainFragment extends SupportFragment {
    // 再点一次退出程序时间设置
    private static final long WAIT_TIME = 2000L;
    private long TOUCH_TIME = 0;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
    }


    /**
     * 处理回退事件
     *
     * @return
     */
    @Override
    public boolean onBackPressedSupport() {
        if (System.currentTimeMillis() - TOUCH_TIME < WAIT_TIME) {
            _mActivity.finish();
        } else {
            TOUCH_TIME = System.currentTimeMillis();
            Toast.makeText(_mActivity, "再按一次退出界面", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}
