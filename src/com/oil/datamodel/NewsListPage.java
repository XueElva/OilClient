package com.oil.datamodel;

import java.util.List;

public class NewsListPage {
	private String PageName;// ģ����
	private List<Object> pointList;// �����б�

	public String getPageName() {
		return PageName;
	}

	public void setPageName(String pageName) {
		PageName = pageName;
	}

	public List<Object> getPointList() {
		return pointList;
	}

	public void setPointList(List<Object> pointList) {
		this.pointList = pointList;
	}
}
