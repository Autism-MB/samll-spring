package cn.bugstack.springframework.beans.factory.config;

/**
 * @author：小肖coding
 * @descriped：Bean对象的实例化交给容器处理
 */
@SuppressWarnings("all")
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
