package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.internousdev.template.dto.MyPageDTO;
import com.internousdev.template.util.DBConnector;

public class MyPageDAO {

	public MyPageDTO getMyPageUserInfo(String item_transaction_id,String user_master_id)throws SQLException{
	DBConnector db =new DBConnector();
	Connection con =db.getConnection();
	MyPageDTO myPage =new MyPageDTO();



	//iit ubit 名前を付けてる
	String sql="select iit.item_name, ubit.total_price, ubit.total_count, ubit.pay from user_buy_item_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_transaction_id = iit.id where ubit.item_transaction_id=? AND ubit.user_master_id=? ORDER BY ubit.insert_date DESC";

try{
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, item_transaction_id);
	ps.setString(2, user_master_id);
	ResultSet rs = ps.executeQuery();

	if(rs.next()){
		myPage.setItemName(rs.getString("item_name"));
		myPage.setTotalPrice(rs.getString("total_price"));
		myPage.setTotalCount(rs.getString("total_count"));
		myPage.setPayment(rs.getString("pay"));

	}

}catch(SQLException e){
	e.printStackTrace();
}finally{
	con.close();
}
return myPage;
}
	public int buyItemHistoryDelete(String item_transaction_id,String user_master_id)throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="delete from user_buy_item_transaction where item_transaction_id=? and user_master_id =?";

		PreparedStatement ps;
		int result=0;

		//②
		try{
			ps =con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);

			result=ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}
}
