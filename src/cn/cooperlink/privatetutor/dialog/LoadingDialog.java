/** 
 * Project Name：PetDogPro 
 * File Name：LoadingDialog.java 
 * Package Name：cn.cooperlink.petdogpro.pet.dialog 
 * Date：2014-9-23 上午10:19:36 
 * Copyright (c) 2014, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.petdogpro.pet.dialog
 * @ClassName LoadingDialog
 * @author loading dialog用于访问网络数据加载中  
 * @date 2014-9-23 上午10:19:36
 * @version 
 */
public class LoadingDialog extends AlertDialog{

    
    /**
     * @Fields tips_loading_msg: TODO
     */
    	
    private TextView tips_loading_msg;

    
    /**
     * @Fields message: 加载信息
     */
    	
    private String message = null;
    
    /**
     * @Fields context: 上下文对象
     */
    	
    private Context context;
    
    public LoadingDialog(Context context) {
        super(context);
        this.context=context;
        message = getContext().getResources().getString(R.string.progressdialog_title);
    }

    public LoadingDialog(Context context, String message) {
        super(context);
        this.context=context;
        this.message = message;
        this.setCancelable(false);
    }

    public LoadingDialog(Context context, int theme, String message) {
        super(context, theme);
        this.context=context;
        this.message = message;
        this.setCancelable(false);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.item_dialog_loading);
        
        
        tips_loading_msg = (TextView) findViewById(R.id.tips_loading_msg);
        tips_loading_msg.setText(this.message);
        
    }

    public void setText(String message) {
        this.message = message;
        tips_loading_msg.setText(this.message);
    }

    public void setText(int resId) {
        setText(getContext().getResources().getString(resId));
    }

}
