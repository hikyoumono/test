package com.internousdev.ecsite.dto;

public class LoginDTO {
private String LoginId;
private String LoginPassword;
private String UserName;
private boolean LoginFlg;


public String getLoginId() {
	return LoginId;
}
public void setLoginId(String loginId) {
	LoginId = loginId;
}
public String getLoginPassword() {
	return LoginPassword;
}
public void setLoginPassword(String loginPassword) {
	LoginPassword = loginPassword;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public boolean isLoginFlg() {
	return LoginFlg;
}
public void setLoginFlg(boolean loginFlg) {
	LoginFlg = loginFlg;
}




}
