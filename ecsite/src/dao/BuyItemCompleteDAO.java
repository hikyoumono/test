package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import util.DBConnector;
import util.DateUtil;

public class BuyItemCompleteDAO {
private DBConnector db =new DBConnector();
private Connection con =db.getConnection();
private DateUtil dateUtil =new DateUtil();
private String sql="INSERT INTO buy_item_transaction (item_transaction_id, total_price, total_count, user_master_id, pay, insert_date)VALUES(?, ?, ?, ?, ?, ?)";

public void buyItemInfo(String item_transaction_id){

}
}
