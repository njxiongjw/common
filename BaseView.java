package com.micen.suppliers.business.base;

/**********************************************************
 * @文件名称：BaseView.java
 * @文件作者：chengsheng
 * @创建时间：2016/7/15 9:48
 * @文件描述：ActivityView层接口
 * @修改历史：2016/7/15 创建初始版本
 **********************************************************/
public interface BaseView<P> {
    void setPresenter(P presenter);

    boolean isActivityFinishing();

    void kickOut();

    void showReLoginDialog(boolean isFromKickout);

    void initNavigationBarStyle(boolean isNavigationBarGray);

    void loginStart();

    void loginEnd(boolean success);

    void showToastSHORT(String msg);

    void showToastSHORT(int resId);

    void showToastSHORT(Object object);

    void loginCancel();
}
