package com.switchII.db.handler;

import java.util.List;

/**
 * �����ݽṹʵ����
 * @author Anton
 *
 */
public class TableBean {
	
	//������
	private String tableName ; 
 
	//��������
	List<ColumnBean> columns ; 
	
	public List<ColumnBean> getColumns() {
		return columns;
	}
	public void setColumns(List<ColumnBean> columns) {
		this.columns = columns;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	
}
