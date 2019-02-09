package action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import dao.LoginDAO;
import dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private String username;
	private String password;
	private List<LoginDTO> dto = new ArrayList<LoginDTO>();
	private Map<String,Object> session;

	public String execute(){
		String ret =ERROR;
		System.out.println(username);
		System.out.println(password);
		LoginDAO dao =new LoginDAO();

		dto =dao.select(username,password);
		if(this.username.equals(dto.get(0).getUsername())
			&& this.password.equals(dto.get(0).getPassword())){
			session.put("dto", dto);
			ret =SUCCESS;
		}else{
			session.put("dto", dto);
			ret =ERROR;
		}
		return ret;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<LoginDTO> getDto() {
		return dto;
	}

	public void setDto(List<LoginDTO> dto) {
		this.dto = dto;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
