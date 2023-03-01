package cn.bugstack.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * github：<a href="https://github.com/Autism-sow">小肖coding</a><br>
 *
 * @author 小肖coding
 * 创建时间：2023/3/1 16:23
 * @version v1.0.0
 * @description:传递Bean对象创建过程中所需要的属性信息
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
