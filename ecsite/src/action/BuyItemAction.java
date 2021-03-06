package action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class BuyItemAction extends ActionSupport implements SessionAware{
public Map<String,Object>session;
private int count;
private String pay;

public String execute(){
	String result=SUCCESS;
session.put("count", count);
int intCount =Integer.parseInt(session.get("count").toString());
int intPrice =Integer.parseInt(session.get("price").toString());
session.put("total_price", intCount * intPrice);

if(pay.equals("1")){
	String payment="現金払い";
	session.put("pay", payment);
}else{
	String payment="クレジットカード";
	session.put("pay", payment);
}
return result;
}

public Map<String, Object> getSession() {
	return session;
}

public void setSession(Map<String, Object> session) {
	this.session = session;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

public String getPay() {
	return pay;
}

public void setPay(String pay) {
	this.pay = pay;
}

}
