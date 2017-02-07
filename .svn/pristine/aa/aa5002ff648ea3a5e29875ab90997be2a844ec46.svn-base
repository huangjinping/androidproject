/** 
 * Project Name：privateTutor 
 * File Name：SubjectsDialog.java 
 * Package Name：cn.cooperlink.privatetutor.dialog 
 * Date：2015年7月20日 下午9:38:35 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.dialog;

import cn.cooperlink.privatetutor.R;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.dialog
 * @ClassName SubjectsDialog
 * @author harrishuang   
 * @date 2015年7月20日 下午9:38:35
 * @version 
 */
public class SubjectsDialog  extends  AlertDialog {

	
	
	private  ListView  liv_phase;
	private  ListView  liv_subjects;
	private ListView  liv_grade;
	private  RelativeLayout  layout_bottom;
    private   ArrayAdapter<String> phaseAdapter;
    private   ArrayAdapter<String> subjectsAdapter;
    private   ArrayAdapter<String> gradeAdapter;
  String[] phaseArr;
  String[] subjectsArr;
  String[] gradeArr;
  private   android.view.View.OnClickListener   clickListener;
  
  
  
  
  
	public SubjectsDialog(Context context,android.view.View.OnClickListener    clickListener) {
		super(context);
		this.clickListener=clickListener;
		
		phaseArr=context.getResources().getStringArray(R.array.phase_arr);
		subjectsArr=context.getResources().getStringArray(R.array.subjects_arr);
		gradeArr=context.getResources().getStringArray(R.array.grade_arr);
		phaseAdapter=new ArrayAdapter<String>(context, R.layout.item_subjects_list_text, phaseArr);
		subjectsAdapter=new ArrayAdapter<String>(context, R.layout.item_subjects_list_text, subjectsArr);
		gradeAdapter=new ArrayAdapter<String>(context, R.layout.item_subjects_list_text, gradeArr);
	}
	
	  @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_subjects);
		liv_phase=(ListView)findViewById(R.id.liv_phase);
		liv_subjects=(ListView)findViewById(R.id.liv_subjects);
		liv_grade=(ListView)findViewById(R.id.liv_grade);
		layout_bottom=(RelativeLayout)findViewById(R.id.layout_bottom);
		liv_phase.setAdapter(phaseAdapter);
		liv_subjects.setAdapter(subjectsAdapter);
		liv_grade.setAdapter(gradeAdapter);
		layout_bottom.setOnClickListener(clickListener);
	}
	
	  
    

}
