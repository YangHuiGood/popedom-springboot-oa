package cn.tedu.popedom.pojo;

import java.io.Serializable;

public class Popedom implements Serializable{
	private String popedomId;
	private String popedomName;
	private String popedomFatherId;
	private String  popedomDomain;
	private String popedomUrl;
	public String getPopedomId() {
		return popedomId;
	}
	public void setPopedomId(String popedomId) {
		this.popedomId = popedomId;
	}
	public String getPopedomName() {
		return popedomName;
	}
	public void setPopedomName(String popedomName) {
		this.popedomName = popedomName;
	}
	public String getPopedomFatherId() {
		return popedomFatherId;
	}
	public void setPopedomFatherId(String popedomFatherId) {
		this.popedomFatherId = popedomFatherId;
	}
	public String getPopedomDomain() {
		return popedomDomain;
	}
	public void setPopedomDomain(String popedomDomain) {
		this.popedomDomain = popedomDomain;
	}
	public String getPopedomUrl() {
		return popedomUrl;
	}
	public void setPopedomUrl(String popedomUrl) {
		this.popedomUrl = popedomUrl;
	}
	
}