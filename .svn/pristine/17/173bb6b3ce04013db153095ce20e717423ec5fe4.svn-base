
package cn.cooperlink.privatetutor.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

/**
 * @Title：
 * @Description：在scrollView中不滑动的GridView
 * @Package cn.cooperlink.westinghouse.view
 * @ClassName NoScrollGridView
 * @author harris
 * @date 2014-12-9 下午6:27:26
 * @version
 */

public class NoScrollGridView extends GridView {
	public NoScrollGridView(Context context) {
		super(context);

	}

	public NoScrollGridView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}
}
