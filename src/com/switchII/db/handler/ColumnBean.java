package com.switchII.db.handler;

/**
 * �ֶ�����
 * @author Anton
 *
 */
public class ColumnBean {
	//�ֶ�
	private String field ; 
	
	//����
	private String type ; 
	
	//�Ƿ�Ϊ��
	private String isNull ; 
	
	//�Ƿ�Ϊ����
	private String isKey ; 
	
	//Ĭ��ֵ 
	private String defaultVal ; 
	
	//ע�� 
	private String comments ;
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIsNull() {
		return isNull;
	}
	public void setIsNull(String isNull) {
		this.isNull = isNull;
	}
	public String getIsKey() {
		return isKey;
	}
	public void setIsKey(String isKey) {
		this.isKey = isKey;
	}
	public String getDefaultVal() {
		return defaultVal;
	}
	public void setDefaultVal(String defaultVal) {
		this.defaultVal = defaultVal;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	} 
	
}
