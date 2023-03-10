package bean;

import java.util.HashMap;
import java.util.Map;

/**
 * github：<a href="https://github.com/Autism-sow">小肖coding</a><br>
 *
 * @author 小肖coding
 * 创建时间：2023/3/3 16:09
 * @version v1.0.0
 * @description:
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    static {
        hashMap.put("10001", "小茂彬");
        hashMap.put("10002", "小学生");
        hashMap.put("10003", "阿毛");
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }
}
