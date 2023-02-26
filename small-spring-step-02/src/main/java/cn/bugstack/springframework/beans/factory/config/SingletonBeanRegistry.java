package cn.bugstack.springframework.beans.factory.config;

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
