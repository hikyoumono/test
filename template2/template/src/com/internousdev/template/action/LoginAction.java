package com.internousdev.template.action;
import java.sql.SQLException;
import com.internousdev.template.dao.LoginDAO;
import com.internousdev.template.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	/*
	 * ActionSupportはstruts2専用のクラス
	 * privateクラスのものに自動的にjspからの情報が代入されるようになっている
	 * さらにActionSupportでリターンを返すのがstruts.xmlだと指定している
	*/
private String name;
private String password;

public String execute() throws SQLException{
	String ret = ERROR;
	LoginDAO dao = new LoginDAO();
	LoginDTO dto = new LoginDTO();

	dto = dao.select(name, password);

	if(name.equals(dto.getName())){
		if(password.equals(dto.getPassword())){
			ret=SUCCESS;
		}
	}

	return ret;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}
}
