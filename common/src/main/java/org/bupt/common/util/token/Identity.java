package org.bupt.common.util.token;

/**
 * Token携带信息
 * Created by ken on 2017/6/9.
 */
public class Identity {

	private String token;
	private Integer id; // 对应id
	private String issuer;
	private String clientId; //client_id/username
	private String permission; // 可以是角色，也可以是权限
	private Long duration; // 有效时长，单位毫秒


	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
}
