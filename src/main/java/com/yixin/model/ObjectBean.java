package com.yixin.model;

import java.util.Date;

public class ObjectBean {
	
	private String id;
	
	private String title;
	
	private String describe;
	
	private Date createTime;
	
	private String remark;
	
	private Integer state;
	
	private String anonymousFlag;

	private Boolean giftFlag;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getAnonymousFlag() {
		return anonymousFlag;
	}

	public void setAnonymousFlag(String anonymousFlag) {
		this.anonymousFlag = anonymousFlag;
	}

	public Boolean getGiftFlag() {
		return giftFlag;
	}

	public void setGiftFlag(Boolean giftFlag) {
		this.giftFlag = giftFlag;
	}
	
	
}
