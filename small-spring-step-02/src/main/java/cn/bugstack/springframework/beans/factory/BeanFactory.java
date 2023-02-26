package cn.bugstack.springframework.beans.factory;

import cn.bugstack.springframework.beans.BeansException;

@SuppressWarnings("all")
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
