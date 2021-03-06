/** 
 * Project Name：privateTutor 
 * File Name：BaseFragment.java 
 * Package Name：cn.cooperlink.privatetutor.base 
 * Date：2015年7月17日 上午10:00:41 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.base;

import cn.cooperlink.privatetutor.R;
import cn.cooperlink.privatetutor.dialog.LoadingDialog;
import cn.cooperlink.privatetutor.net.HttpService;
import cn.cooperlink.privatetutor.net.OnRequestDataListener;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.base
 * @ClassName BaseFragment
 * @author harrishuang
 * @date 2015年7月17日 上午10:00:41
 * @version
 */
public abstract class BaseFragment extends Fragment {
	private LoadingDialog loadingDialog;

	protected void request(String jsonData, OnRequestDataListener listener) {

		HttpService.submitPostRequest(jsonData, listener);

	}

	protected void request(Context context, String jsonData,
			OnRequestDataListener listener) {
		HttpService.submitPostRequest(context, jsonData, listener);
	}

	public void showProgress(String message) {
		loadingDialog = new LoadingDialog(getActivity());
		if (TextUtils.isEmpty(message)) {
			loadingDialog.setMessage(getString(R.string.progressdialog_title));
		} else {
			loadingDialog.setMessage(message);
		}
		loadingDialog.setCanceledOnTouchOutside(false);
		loadingDialog.show();
	}

	public void dismissProgress() {
		if (loadingDialog != null) {
			if (loadingDialog.isShowing()) {
				if (!getActivity().isFinishing()) {
					loadingDialog.dismiss();

				}
			}
		}
	}

	/**
	 * 弹出提示
	 * 
	 * @param text
	 */
	public void showAlert(String text) {
		try {
			new AlertDialog.Builder(getActivity())
					.setTitle("提示")
					.setMessage(text)
					.setNeutralButton("确定",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int which) {

								}
							}).show();

		} catch (Exception e) {
			// 可能会出 android.view.WindowManager$BadTokenException: Unable to add
			// window 异常，hold住，不处理就ok
			e.printStackTrace();
		}

	}

	/**
	 * 弹出提示
	 * 
	 * @param text
	 */
	public void showAlert(String title, String text) {
		try {
			new AlertDialog.Builder(getActivity())
					.setTitle(title)
					.setMessage(text)
					.setNeutralButton("确定",
							new DialogInterface.OnClickListener() {
								@Override
								public void onClick(DialogInterface dialog,
										int which) {

								}
							}).show();
		} catch (Exception e) {
			// 可能会出 android.view.WindowManager$BadTokenException: Unable to add
			// window 异常，hold住，不处理就ok
			e.printStackTrace();
		}
	}

	/**
	 * 弹出一个显示的Toast
	 * 
	 * @param text
	 */
	public void showToast(String text) {
		Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
	}

}
