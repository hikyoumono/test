package action;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.SQLException;
import util.DBConnector;
import dto.HelloStrutsDTO;
import dao.HelloStrutsDAO;

public class HelloStrutsAction extends ActionSupport{

	private String result;

	public String execute(){
		String ret=ERROR;
		HelloStrutsDAO dao =new HelloStrutsDAO();
		HelloStrutsDTO dto =new HelloStrutsDTO();

		dto=dao.select();
		System.out.println(dto.getResult());

		result =dto.getResult();

		if(result.equals("MySQLÇ∆ê⁄ë±Ç≈Ç´Ç‹Ç∑")){
			ret=SUCCESS;
		}else{
			ret=ERROR;
		}
		return ret;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
