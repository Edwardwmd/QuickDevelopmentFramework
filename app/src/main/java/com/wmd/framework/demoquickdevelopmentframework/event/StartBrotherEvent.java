package com.wmd.framework.demoquickdevelopmentframework.event;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * 时间：2016/11/25/13：11
 * 作者：Wumingde
 * 邮箱：1732141816@qq.com
 * 作用：StartBrotherEvent
 * 声明：版权归作者所有
 */
public class StartBrotherEvent {
    public SupportFragment targetFragment;

    public StartBrotherEvent(SupportFragment targetFragment) {
        this.targetFragment = targetFragment;
    }
}
