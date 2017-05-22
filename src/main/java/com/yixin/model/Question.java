package com.yixin.model;

import java.util.List;

public class Question {
	
	private String id;
	
	private ObjectBean objBean;
	
	private int seq;
	
	private int qtype;
	
	private String content;
	
	private String remark;
	
	private List<Selecter> selecters;

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

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public int getQtype() {
		return qtype;
	}

	public void setQtype(int qtype) {
		this.qtype = qtype;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<Selecter> getSelecters() {
		return selecters;
	}

	public void setSelecters(List<Selecter> selecters) {
		this.selecters = selecters;
	}
	

}
