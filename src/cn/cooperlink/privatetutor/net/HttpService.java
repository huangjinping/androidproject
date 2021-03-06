package cn.cooperlink.privatetutor.net;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

import net.tsz.afinal.FinalHttp;
import net.tsz.afinal.http.AjaxCallBack;

import org.apache.http.entity.InputStreamEntity;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;


/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.net
 * @ClassName HttpRequestService
 * @author harrishuang   
 * @date 2015年7月22日 下午6:19:38
 * @version 
 */ 



	
public class HttpService {
	private static byte[] jsonByteArray;
	private static InputStreamEntity inputStreamEntity;
	private static final int TIMEOUT_DURATION = 60 * 1000;

	private static  final   int  SUCCESS=0;
	private static  final int EIRR=1;
	
	
	/**
	 * 提交后台数据 tokenId interfaceCode,
	 */
	public static void submitPostRequest(String jsonData,
			final OnRequestDataListener listener) {
		FinalHttp finalHttp = new FinalHttp();
		finalHttp.configTimeout(TIMEOUT_DURATION);
		try {
			jsonByteArray = jsonData.getBytes("UTF-8");
			inputStreamEntity = new InputStreamEntity(new ByteArrayInputStream(
					jsonByteArray), jsonByteArray.length);
			finalHttp.post(NetConst.HOME, inputStreamEntity,
					"application/octest-stream", new AjaxCallBack<Object>() {

						@Override
						public void onFailure(Throwable t, int errorNo,
								String strMsg) {
							super.onFailure(t, errorNo, strMsg);
							System.out.println(errorNo + "----onFailure-------"
									+ strMsg);
							listener.onFail(strMsg);
						}

						@Override
						public void onSuccess(Object t) {
							super.onSuccess(t);
							String result = t.toString();
							try {
								JSONObject jsonObject=new JSONObject(result);
								JSONObject optJSONObject = jsonObject.optJSONObject("head");
								int optInt = optJSONObject.optInt("status");
							   String  errorMessage=	optJSONObject.optString("errorMessage");
								if (SUCCESS==optInt) {
									listener.onSuccess(result);
								}else{
									listener.onFail(errorMessage);
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								listener.onFail(e.getMessage());
								e.printStackTrace();
							}
							
							
							
						}
					});
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void submitPostRequest(final Context context,
			String jsonData, final OnRequestDataListener listener) {
		FinalHttp finalHttp = new FinalHttp();
		finalHttp.configTimeout(TIMEOUT_DURATION);
		System.out.println("System.out-----------请求后台数据--------" + jsonData);
		try {
			jsonByteArray = jsonData.getBytes("UTF-8");
			inputStreamEntity = new InputStreamEntity(new ByteArrayInputStream(
					jsonByteArray), jsonByteArray.length);
			finalHttp.post(NetConst.HOME, inputStreamEntity,
					"application/octest-stream", new AjaxCallBack<Object>() {

						@Override
						public void onFailure(Throwable t, int errorNo,
								String strMsg) {
							super.onFailure(t, errorNo, strMsg);
							System.out.println(errorNo + "----onFailure-------"
									+ strMsg);
							listener.onFail(strMsg);
						}

						@Override
						public void onSuccess(Object t) {
							super.onSuccess(t);
							String result = t.toString();
							System.out.println("返回数据" + t);

							try {
								JSONObject jsonObject=new JSONObject(result);
								JSONObject optJSONObject = jsonObject.optJSONObject("head");
								int optInt = optJSONObject.optInt("status");
							String  errorMessage=	optJSONObject.optString("errorMessage");
								if (SUCCESS==optInt) {
									listener.onSuccess(result);
								}else{
									Toast.makeText(context, errorMessage, 1).show();
									listener.onFail(errorMessage);
								}
							} catch (Exception e) {
								// TODO Auto-generated catch block
								listener.onFail(e.getMessage());
								e.printStackTrace();
							}
							
							
							
						}
					});
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

//	/**
//	 * 获取后台数据
//	 */
//	public static void postRequest(String tokenId, String interfaceCode,
//			HashMap<String, Object> parameters,
//			final OnRequestDataListener listener) {
//		FinalHttp finalHttp = new FinalHttp();
//		finalHttp.configTimeout(TIMEOUT_DURATION);
//		String jsonString = JsonUtil.getRequestJsonString(tokenId,
//				interfaceCode, parameters);
//		System.out.println("-----------请求后台数据1--------" + jsonString);
//		try {
//			jsonByteArray = jsonString.getBytes("UTF-8");
//			inputStreamEntity = new InputStreamEntity(new ByteArrayInputStream(
//					jsonByteArray), jsonByteArray.length);
//			finalHttp.post(UrlConstants.SERVE_HOST, inputStreamEntity,
//					"application/octest-stream", new AjaxCallBack<Object>() {
//
//						@Override
//						public void onFailure(Throwable t, int errorNo,
//								String strMsg) {
//							super.onFailure(t, errorNo, strMsg);
//							listener.onFail();
//						}
//
//						@Override
//						public void onSuccess(Object t) {
//							super.onSuccess(t);
//							String result = t.toString();
//							System.out.println("----后台返回数据1-------" + result);
//							Log2FileUtil.getInstance().logMsg(result);
//							listener.onSuccess(result);
//						}
//					});
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//	}

}
