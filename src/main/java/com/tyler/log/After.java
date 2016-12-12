package com.tyler.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by tyler on 2016/12/1.
 */
public class After implements AfterReturningAdvice {
    /**
     *
     * @param o 返回值
     * @param method 被调用的方法对象
     * @param objects 被调用的方法对象的形参
     * @param o1 被调用的方法对象的目标对象
     * @throws Throwable
     */
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println(o1.getClass().getName()+"类"+method.getName()+"方法执行完了！"+"返回值是："+o);
    }
}
