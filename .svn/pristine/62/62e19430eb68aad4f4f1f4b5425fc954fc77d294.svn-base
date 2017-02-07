package cn.cooperlink.privatetutor.login.common;

import android.os.CountDownTimer;
import android.widget.Button;

/**
 * @Title：计时器
 * @Description：
 * @Package cn.cooperlink
 * @ClassName TimeCount
 * @author harris
 * @date 2014-12-24 下午3:08:08
 * @version
 */

public class TimeCount extends CountDownTimer {

	
	/**
	 * @Fields btn_count: 按钮
	 */
		
	private Button btn_count;
   private  String    text;
   
	public TimeCount(long millisInFuture, long countDownInterval,
			Button btn_count) {
		super(millisInFuture, countDownInterval);
		// TODO Auto-generated constructor stub
		this.btn_count = btn_count;
		text=	btn_count.getText().toString();
		
	}

	@Override
	public void onTick(long millisUntilFinished) {
		// TODO Auto-generated method stub
		btn_count.setEnabled(false);
		
		
		btn_count.setText(text+"(" + millisUntilFinished / 1000 + ")");

	}

	@Override
	public void onFinish() {
		// TODO Auto-generated method stub
		/**
		 * 
		 */
		btn_count.setEnabled(true);
		btn_count.setText("获取验证码");
	}

}
