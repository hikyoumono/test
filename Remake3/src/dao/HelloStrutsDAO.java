package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dto.HelloStrutsDTO;
import util.DBConnector;

public class HelloStrutsDAO {

	public HelloStrutsDTO select(){
		DBConnector db = new DBConnector();
		Connection con =db.getConnection();
		HelloStrutsDTO dto=new HelloStrutsDTO();
		String sql ="select * from users";

		try{
			PreparedStatement ps =con.prepareStatement(sql);
			ResultSet rs =ps.executeQuery();

			if(rs.next()){
				dto.setResult("MySQL�Ɛڑ��ł��܂�");
			}else{
				dto.setResult("MySQL�Ɛڑ��ł��܂���");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	return dto;
	}
}