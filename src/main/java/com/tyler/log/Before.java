package com.tyler.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by tyler on 2016/12/1.
 */
public class Before implements MethodBeforeAdvice{
    /**
     *
     * @param method 被调用的方法对象
     * @param objects 被调用的方法参数
     * @param o 被调用的方法的目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"方法被执行");
    }
}
