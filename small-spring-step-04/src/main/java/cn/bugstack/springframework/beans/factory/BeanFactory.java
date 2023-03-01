package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

@SuppressWarnings("all")
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
