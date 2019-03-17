package com.chenghuaxing.designpattern.creational.singleton;

/**
 * 每个线程独立
 * @author cheng.huaxing
 * @date 2019-03-11
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal
            = ThreadLocal.withInitial(ThreadLocalInstance::new);

    private ThreadLocalInstance() {}

    private static ThreadLocalInstance getInstance() {
        return threadLocalInstanceThreadLocal.get();
    }
}
