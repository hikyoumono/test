package action;
import java.util.Map;

import dao.BuyItemDAO;
import dao.LoginDAO;
import dto.BuyItemDTO;
import dto.LoginDTO;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
public class LoginAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String loginPassword;
	private Map<String ,Object>session;
	private LoginDTO loginDTO = new LoginDTO();
	private LoginDAO loginDAO = new LoginDAO();
	private BuyItemDTO buyItemDTO =new BuyItemDTO();
	private BuyItemDAO buyItemDAO =new BuyItemDAO();

	public String execute(){
		String result =ERROR;
		loginDTO =loginDAO.getLoginUserInfo(loginUserId,loginPassword);
		session.put("loginUser",loginDTO);

		if(((LoginDTO)session.get("loginUser")).isLoginFlg()){
			result=SUCCESS;
			buyItemDTO =buyItemDAO.getItemInfo();

			session.put("login_user_id", loginDTO.getLoginId());
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItemPrice", buyItemDTO.getItemPrice());

			return result;
		}

		return result;
	}

	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}

	public LoginDAO getLoginDAO() {
		return loginDAO;
	}

	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

}
