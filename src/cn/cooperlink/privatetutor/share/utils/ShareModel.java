/** 
 * Project Name：androidproject 
 * File Name：ShareModel.java 
 * Package Name：cn.cooperlink.privatetutor.share.utils 
 * Date：2015年7月27日 下午11:25:48 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.share.utils;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.share.utils
 * @ClassName ShareModel
 * @author harrishuang   
 * @date 2015年7月27日 下午11:25:48
 * @version 
 */
public class ShareModel {
    private String title;
    private String text;
    private String url;
    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}
