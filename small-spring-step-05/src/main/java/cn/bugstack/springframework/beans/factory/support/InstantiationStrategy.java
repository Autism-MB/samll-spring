package cn.bugstack.springframework.beans.factory.support;

import cn.bugstack.springframework.beans.BeansException;
import cn.bugstack.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;


@SuppressWarnings("all")
public interface InstantiationStrategy {

    /**
     * 在instantiate添加必要的入参信息
     * @param beanDefinition
     * @param beanName
     * @param ctor 获取与入参信息相对应的构造函数
     * @param args 是一个具体的入参信息,在实例化对象时会使用到
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor,
                       Object[] args) throws BeansException;
}
