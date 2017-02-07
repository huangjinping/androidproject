/** 
 * Project Name：androidproject 
 * File Name：PostingActivity.java 
 * Package Name：cn.cooperlink.privatetutor.community 
 * Date：2015年7月22日 下午10:56:13 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.community;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;
import cn.cooperlink.privatetutor.model.BbsTopicAnswer;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_033Request;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_033Request.RequestBody;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.RequestHead;
import cn.cooperlink.privatetutor.net.OnRequestDataListener;
import cn.cooperlink.privatetutor.utils.JacksonJsonUtil;
import cn.cooperlink.privatetutor.utils.StringUtils;
import cn.cooperlink.privatetutor.utils.UserManager;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.community
 * @ClassName PostingActivity
 * @author harrishuang
 * @date 2015年7月22日 下午10:56:13
 * @version
 */
public class PostingActivity extends BaseActivity {
	
	private EditText  edt_posting_title;
	private  EditText  edt_posting_content;
	
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.activity_posting);
		initView();
	}
	/**
	 * @Title: initView
	 * @Description:初始化数据
	 */
	private void initView() {
		edt_posting_title=(EditText)findViewById(R.id.edt_posting_title);
		edt_posting_content=(EditText)findViewById(R.id.edt_posting_content);
	}
	
	
	
	
	/**
	 * @Title: checkInput
	 * @Description:true  校验通过  false  教研不通过
	 * @return
	 */
		
	private boolean checkInput() {
		if (TextUtils.isEmpty(edt_posting_title.getText().toString())) {
			showToast("请输入发帖标题");
			return  false;
		}
		if (TextUtils.isEmpty(edt_posting_content.getText().toString())) {
			showToast("请输入发帖内容");
			return  false;
		}
		
		return true;
	}
	
	
	
	
    /**
     * @Title: onPosting
     * @Description:
     * @param v
     */
    public  void onPosting(View  v) {
        if (!checkInput()) {
			return;
		}
        showProgress("");

		request(this, getJsonDada(), new OnRequestDataListener() {
			
			@Override
			public void onSuccess(String result) {
				 dismissProgress();
				 
				 PostingActivity.this.finish();
			}
			
			@Override
			public void onFail(String eirr) {
				dismissProgress();				
			}
		});
		
        
        
	}
    
	private String getJsonDada() {
		try {
			
			
			
			
			Interface_033Request request = new Interface_033Request();
			RequestHead requestHead = new RequestHead();
			RequestBody requestBody = request.new RequestBody();
			BbsTopicAnswer bbsTopicAnswer = new BbsTopicAnswer();
			request.setHead(requestHead);
			request.setBody(requestBody);
			requestBody.setBbsTopicAnswer(bbsTopicAnswer);
			bbsTopicAnswer.setBbsTopicId("402880124eae76f9014eae77d3500001");
			bbsTopicAnswer.setBusinessUserId(UserManager.getUser(this).getBody().getBusinessUser().getId());
			bbsTopicAnswer.setContent(edt_posting_title.getText().toString()+"/n"+edt_posting_content.getText().toString());
			requestHead.setInterfaceCode("interface_033");
			requestHead.setTokenId(UserManager.getUser(this).getBody()
					.getTokenId());
			requestHead.setUuid(StringUtils.getUUID());
			String beanToJson = JacksonJsonUtil.beanToJson(request);
			return beanToJson;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
    
}
