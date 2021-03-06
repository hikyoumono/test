package dao;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import util.DBConnector;
import dto.BuyItemDTO;
public class BuyItemDAO {

private DBConnector db =new DBConnector();
private Connection con =db.getConnection();
private BuyItemDTO buyItemDTO = new BuyItemDTO();

public BuyItemDTO getItemInfo(){
	String sql="select id, item_name, item_price from itemlist";

	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs =ps.executeQuery();

		if(rs.next()){
			buyItemDTO.setId(rs.getString("id"));
			buyItemDTO.setItemName(rs.getString("item_name"));
			buyItemDTO.setItemPrice(rs.getString("item_price"));
		}

	}catch(Exception e){
		e.printStackTrace();
	}

	return buyItemDTO;
}

public BuyItemDTO getBuyItemDTO() {
	return buyItemDTO;
}

public void setBuyItemDTO(BuyItemDTO buyItemDTO) {
	this.buyItemDTO = buyItemDTO;
}

}
