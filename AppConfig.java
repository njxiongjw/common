package com.focustech.common.base;

/***********************************************************
 * @文件名称：AppConfig.java
 * @文件作者：yangyouxiang
 * @创建时间：2016年5月4日 上午11:15:49
 * @文件描述：一些app的配置信息
 * @修改历史：2016年5月4日创建初始版本
 **********************************************************/
public class AppConfig {

    /**
     * app使用的服务端版本
     */
    private static Version APP_VERSION = Version.F;

    public static Version getAppVersion() {
        return APP_VERSION;
    }

    public static void setAppVersion(Version version)
    {
        APP_VERSION =version;
    }

    public enum Version {
        /**
         * 测试版
         */
        T,
        /**
         * 正式版/P版
         */
        F
    }


}
