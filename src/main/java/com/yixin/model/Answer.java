package com.yixin.model;

public class Answer {

	private String id;
	
	/**
	 *�ʾ�
	 */
	private ObjectBean objBean;
	
	/**
	 * �ظ�����
	 */
	private Replay replay;
	
	/**
	 * ��������
	 */
	private int qSeq;
	
	/**
	 * �����ѡ�����
	 */
	private int seSeq;
	
	/**
	 * ѡ��Ĵ𰸣�������ѡ����ţ�Ҳ�������֣�
	 */
	private String seValue;
	
	private String remark;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ObjectBean getObjBean() {
		return objBean;
	}

	public void setObjBean(ObjectBean objBean) {
		this.objBean = objBean;
	}

	public Replay getReplay() {
		return replay;
	}

	public void setReplay(Replay replay) {
		this.replay = replay;
	}

	public int getqSeq() {
		return qSeq;
	}

	public void setqSeq(int qSeq) {
		this.qSeq = qSeq;
	}

	public int getSeSeq() {
		return seSeq;
	}

	public void setSeSeq(int seSeq) {
		this.seSeq = seSeq;
	}

	public String getSeValue() {
		return seValue;
	}

	public void setSeValue(String seValue) {
		this.seValue = seValue;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
