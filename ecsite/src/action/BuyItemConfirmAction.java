package action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import dao.BuyItemCompleteDAO;
import java.sql.SQLException;
import java.util.Map;
public class BuyItemConfirmAction extends ActionSupport implements SessionAware{

	public Map<String,Object>session;
	private BuyItemCompleteDAO buyItemCompleteDAO =new BuyItemCompleteDAO();

	public String execute(){
		buyItemCompleteDAO.buyItemInfo(
				session.get("id").toString(),
				
				);
		String result=SUCCESS;

		return result;
	}

}
