package com.yixin.model;

import java.math.BigDecimal;

public class Selecter {

	private String id;
	
	private ObjectBean objBean;
	
	private int qseq;
	
	private int selseq;
	
	private String content;
	
	private String remark;
	
	private int acount;
	
	private BigDecimal apercent;

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

	public int getQseq() {
		return qseq;
	}

	public void setQseq(int qseq) {
		this.qseq = qseq;
	}

	public int getSelseq() {
		return selseq;
	}

	public void setSelseq(int selseq) {
		this.selseq = selseq;
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

	public int getAcount() {
		return acount;
	}

	public void setAcount(int acount) {
		this.acount = acount;
	}

	public BigDecimal getApercent() {
		return apercent;
	}

	public void setApercent(BigDecimal apercent) {
		this.apercent = apercent;
	}
	
}
