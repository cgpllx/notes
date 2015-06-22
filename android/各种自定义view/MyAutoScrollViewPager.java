//2014-8-4
package com.fatebird.player.widget;

import com.kubeiwu.commontool.view.aotuviewpager.AutoScrollViewPager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;

/**
 * 
 * @author  cgpllx1@qq.com (www.kubeiwu.com)
 * @date    2014-8-4
 */
public class MyAutoScrollViewPager extends AutoScrollViewPager {
	private GestureDetector mGestureDetector;
	View.OnTouchListener mGestureListener;

	public MyAutoScrollViewPager(Context paramContext, AttributeSet paramAttributeSet) {
		super(paramContext, paramAttributeSet);
		mGestureDetector = new GestureDetector(getContext(), new MyGestureLinstener());
	}

	public MyAutoScrollViewPager(Context paramContext) {
		super(paramContext);
		mGestureDetector = new GestureDetector(getContext(), new MyGestureLinstener());
	}

	boolean ctrl = false;

	class MyGestureLinstener extends SimpleOnGestureListener {
		@Override
		public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
			if (Math.abs(distanceY) > Math.abs(distanceX)) {
				ctrl = false;
			}
			return ctrl;
		}
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		mGestureDetector.onTouchEvent(ev);
		switch (ev.getAction()) {
		case MotionEvent.ACTION_DOWN:
			ctrl = true;
			getParent().requestDisallowInterceptTouchEvent(true);
			break;
		case MotionEvent.ACTION_MOVE:
			getParent().requestDisallowInterceptTouchEvent(ctrl);
			break;
		case MotionEvent.ACTION_UP:
		case MotionEvent.ACTION_CANCEL:
			getParent().requestDisallowInterceptTouchEvent(false);
			break;
		}
		return super.dispatchTouchEvent(ev);
	}
}
