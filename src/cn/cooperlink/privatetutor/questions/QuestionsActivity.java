/** 
 * Project Name：androidproject 
 * File Name：QuestionsActivity.java 
 * Package Name：cn.cooperlink.privatetutor.questions 
 * Date：2015年7月21日 下午10:11:10 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.questions;

import java.util.ArrayList;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.base.BaseActivity;
import cn.cooperlink.privatetutor.common.LoadMode;
import cn.cooperlink.privatetutor.model.BusinessUserStudentQuestion;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_017Request;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.Interface_017Response;
import cn.cooperlink.privatetutor.model.dto.mobileInterface.RequestHead;
import cn.cooperlink.privatetutor.net.OnRequestDataListener;
import cn.cooperlink.privatetutor.utils.JacksonJsonUtil;
import cn.cooperlink.privatetutor.utils.StringAndDateUtil;
import cn.cooperlink.privatetutor.utils.StringUtils;
import cn.cooperlink.privatetutor.utils.UserManager;
import cn.cooperlink.privatetutor.view.CircleImageView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshBase.OnRefreshListener;
import com.handmark.pulltorefresh.library.PullToRefreshListView;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.questions
 * @ClassName QuestionsActivity
 * @author harrishuang   
 * @date 2015年7月21日 下午10:11:10
 * @version 
 */
public class QuestionsActivity extends  BaseActivity{
    private ImageButton btn_left;
	private TextView txt_title;
	private PullToRefreshListView lisv_questions;
	private List<BusinessUserStudentQuestion> dataList;
     private QuestionAdapter adapter;
	@Override
    protected void onCreate(Bundle arg0) {
    	// TODO Auto-generated method stub
    	super.onCreate(arg0);
    	setContentView(R.layout.activity_questions);
    	initHeader();
    	initView();
    	initData();
    	setOnLitenrs();
    	loadData(LoadMode.NOMAL);
    }
	
	private void initView() {
		lisv_questions=(PullToRefreshListView)findViewById(R.id.lisv_questions);
	}
	
	
	private void setOnLitenrs() {
		lisv_questions.setOnRefreshListener(new OnRefreshListener<ListView>() {
			@Override
			public void onRefresh(PullToRefreshBase<ListView> refreshView) {
				loadData(LoadMode.PULL_REFRSH);
			}
		});
	}
	
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		loadData(LoadMode.NOMAL);
	}
	
    private void initData() {
    	
    	dataList=new ArrayList<BusinessUserStudentQuestion>();
    	adapter=new QuestionAdapter();
    	lisv_questions.setAdapter(adapter);
	}
    /**
	 * @Title: initHeader
	 * @Description:初始化头
	 */

	private void initHeader() {
		btn_left = (ImageButton) findViewById(R.id.btn_left);
		txt_title=(TextView)findViewById(R.id.txt_title);
		txt_title.setText("提问");
		btn_left.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				QuestionsActivity.this.finish();			
			}
		});
	}
	
	
	
	/**
	 * @Title：适配器
	 * @Description：
	 * @Package cn.cooperlink.privatetutor.questions
	 * @ClassName PositonAdapter
	 * @author harrishuang   
	 * @date 2015年7月21日 下午10:26:27
	 * @version 
	 */ 
	
	
	
		
	private  class  QuestionAdapter  extends BaseAdapter{
       private ViewHolder viewHolder;
       
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return dataList.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return dataList.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			
			if (convertView==null) {
				convertView=LayoutInflater.from(QuestionsActivity.this).inflate(R.layout.item_questions,null);
				viewHolder=new ViewHolder();
				viewHolder.txt_question_title=(TextView)convertView.findViewById(R.id.txt_question_title);
				viewHolder.txt_question_time=(TextView)convertView.findViewById(R.id.txt_question_time);
				viewHolder.txt_question_name=(TextView)convertView.findViewById(R.id.txt_question_name);
				viewHolder.txt_question_id=(TextView)convertView.findViewById(R.id.txt_question_id);
				viewHolder.txt_question_evaluation=(TextView)convertView.findViewById(R.id.txt_question_evaluation);
				viewHolder.txt_question_write=(TextView)convertView.findViewById(R.id.txt_question_write);
				viewHolder.img_tutor_icon=(CircleImageView)convertView.findViewById(R.id.img_tutor_icon);
				convertView.setTag(viewHolder);
			}else{
				viewHolder=(ViewHolder) convertView.getTag();
			}
			BusinessUserStudentQuestion businessUserStudentQuestion = dataList.get(position);
			viewHolder.txt_question_title.setText(businessUserStudentQuestion.getTitle());
			viewHolder.txt_question_time.setText(StringAndDateUtil.getTimeString(businessUserStudentQuestion.getCreatedDate()));
			
			
			return convertView;
		}
	}
	
	
	private class ViewHolder  {
		private TextView  txt_question_title;
		private TextView  txt_question_time;
		private TextView  txt_question_name;
		private TextView  txt_question_id;
		private TextView  txt_question_evaluation;
		private TextView  txt_question_write;
       private  CircleImageView  img_tutor_icon;
       
		
	}
	
	
	public void  onAsk(View  v){
		Intent intent=new Intent(this, AskQuestionsActivity.class);
		startActivity(intent);
	}
	
	
	
	private void loadData(LoadMode  loadMode) {

		if (loadMode==LoadMode.NOMAL) {
			showProgress("");
		}
		request(this, getJsonDada(), new OnRequestDataListener() {
			@Override
			public void onSuccess(String result) {
				dismissProgress();
				try {
					System.out.println("===interface_017Response====");
					Interface_017Response  interface_017Response= (Interface_017Response) JacksonJsonUtil.jsonToBean(result, Interface_017Response.class);
					List<BusinessUserStudentQuestion> list = interface_017Response.getBody().getList();
					dataList.clear();
					dataList.addAll(list);
					adapter.notifyDataSetChanged();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			@Override
			public void onFail(String eirr) {
				dismissProgress();
			}
		});
	}
	
	
	
	
	
	
	private String  getJsonDada() {
		try {
			Interface_017Request request = new Interface_017Request();
			RequestHead requestHead = new RequestHead();
			request.setHead(requestHead);
			requestHead.setInterfaceCode("interface_017");
			requestHead.setTokenId(UserManager.getUser(this).getBody().getTokenId());
			requestHead.setUuid(StringUtils.getUUID());
			String beanToJson = JacksonJsonUtil.beanToJson(request);
			return beanToJson;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
	
}
