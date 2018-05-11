package com.ningkangkj.common.core.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @Description 获取properties文件配置信息
 * @Author luckypt
 * @Date 2018/05/11
 */
public class ServerProperty {

    /**
     * 私有化构造方法,不需要该类创建对象
     */
    private ServerProperty() {

    }

    public static Properties prop = null;

    /**
     * @Description 静态类只在类第一次加载的时候执行一次,之后不会在执行
     */
    static {
        prop = new Properties();
        InputStream in = ServerProperty.class.getResourceAsStream("/server.properties");

        try {
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return prop.getProperty(key);
    }

    public static String get(String key,String defaultVal) {
        String val = get(key);
        return val == null ? defaultVal:val;
    }

}
