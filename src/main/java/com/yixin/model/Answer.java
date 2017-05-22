package com.yixin.model;

public class Answer {

	private String id;
	
	/**
	 *问卷
	 */
	private ObjectBean objBean;
	
	/**
	 * 回复答卷表
	 */
	private Replay replay;
	
	/**
	 * 问题的序号
	 */
	private int qSeq;
	
	/**
	 * 问题的选项序号
	 */
	private int seSeq;
	
	/**
	 * 选择的答案（可能是选项序号，也可能文字）
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
