/** 
 * Project Name：androidproject 
 * File Name：ShareUtils.java 
 * Package Name：cn.cooperlink.privatetutor.share.utils 
 * Date：2015年7月27日 下午11:24:21 
 * Copyright (c) 2015, cooperlink.cn All Rights Reserved. 
 * 北京酷博灵科信息技术有限公司
 */
package cn.cooperlink.privatetutor.share.utils;

import android.content.Context;
import cn.sharesdk.framework.Platform;
import cn.sharesdk.framework.Platform.ShareParams;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.ShareSDK;

/**
 * @Title：
 * @Description：
 * @Package cn.cooperlink.privatetutor.share.utils
 * @ClassName ShareUtils
 * @author harrishuang   
 * @date 2015年7月27日 下午11:24:21
 * @version 
 */
public class ShareUtils {
	
	 private String text = "这是我的分享测试数据！~我只是来酱油的！~请不要在意 好不好？？？？？";
	    private String imageurl = "http://h.hiphotos.baidu.com/image/pic/item/ac4bd11373f082028dc9b2a749fbfbedaa641bca.jpg";
	    private String title = "拍拍搜";
	    private String url = "www.baidu.com";
		private ShareParams shareParams;
		private PlatformActionListener platformActionListener;
		private Context  context;
		
	   public void  share(){
		   
		   
		   
	   }
	   
	   
	   
	   
		/**
		 * 分享
		 * 
		 * @param position
		 */
		private void share(int position) {

			if (position == 1) {
				qq();
			} else if (position == 4) {
				qzone();
			} else if (position == 5) {
//				shortMessage();
			}  else {
				Platform plat = null;
				plat = ShareSDK.getPlatform(context, getPlatform(position));
				if (platformActionListener != null) {
					plat.setPlatformActionListener(platformActionListener);
				}

				plat.share(shareParams);
			}
		}


		/**
		 * 获取平台
		 * 
		 * @param position
		 * @return
		 */
		private String getPlatform(int position) {
			String platform = "";
			switch (position) {
			case 0:
				platform = "Wechat";
				break;
			case 1:
				platform = "QQ";
				break;
			case 2:
				platform = "SinaWeibo";
				break;
			case 3:
				platform = "WechatMoments";
				break;
			case 4:
				platform = "QZone";
				break;
			case 5:
				platform = "ShortMessage";
				break;
			case 6:
				platform = "TencentWeibo";
				break;
			}
			return platform;
		}

	    
		private void qq() {
			ShareParams sp = new ShareParams();
			sp.setTitle(shareParams.getTitle());
			sp.setTitleUrl(shareParams.getUrl()); // 标题的超链接
			sp.setText(shareParams.getText());
			sp.setImageUrl(shareParams.getImageUrl());
			sp.setComment("我对此分享内容的评论");
			sp.setSite(shareParams.getTitle());
			sp.setSiteUrl(shareParams.getUrl());
			Platform qq = ShareSDK.getPlatform(context, "QQ");
			qq.setPlatformActionListener(platformActionListener);
			qq.share(sp);
		}
		/**
		 * 分享到QQ空间
		 */
		private void qzone() {
			ShareParams sp = new ShareParams();
			sp.setTitle(shareParams.getTitle());
			sp.setTitleUrl(shareParams.getUrl()); // 标题的超链接
			sp.setText(shareParams.getText());
			sp.setImageUrl(shareParams.getImageUrl());
			sp.setComment("我对此分享内容的评论");
			sp.setSite(shareParams.getTitle());
			sp.setSiteUrl(shareParams.getUrl());

			Platform qzone = ShareSDK.getPlatform(context, "QZone");

			qzone.setPlatformActionListener(platformActionListener); // 设置分享事件回调 //
																		// 执行图文分享
			qzone.share(sp);
		}
		
		
}
