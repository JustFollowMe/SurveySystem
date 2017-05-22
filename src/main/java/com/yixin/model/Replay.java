package com.yixin.model;

import java.util.Date;

public class Replay {

	private String id;
	
	private ObjectBean objBean;
	
	private String replayCode;
	
	private String replayIp;
	
	private Date replayTime;
	
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

	public String getReplayCode() {
		return replayCode;
	}

	public void setReplayCode(String replayCode) {
		this.replayCode = replayCode;
	}

	public String getReplayIp() {
		return replayIp;
	}

	public void setReplayIp(String replayIp) {
		this.replayIp = replayIp;
	}

	public Date getReplayTime() {
		return replayTime;
	}

	public void setReplayTime(Date replayTime) {
		this.replayTime = replayTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}
