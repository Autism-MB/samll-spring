package cn.bugstack.springframework.beans.factory.config;

/**
 * @description:定义一个注册和获取单例对象的接口
 */
@SuppressWarnings("all")
public interface SingletonBeanRegistry {

    /*
     * 获取单例对象接口
     * */
    Object getSingleton(String beanName);

    /*
    * 注册单例对象接口
    * */
    void registerSingleton(String beanName, Object singletonObject);
}
