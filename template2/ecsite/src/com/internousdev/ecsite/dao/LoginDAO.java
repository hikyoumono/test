package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.ecsite.dto.LoginDTO;
import com.internousdev.ecsite.util.DBConnector;

public class LoginDAO {
	private DBConnector db =new DBConnector();
	private Connection con=db.getConnection();
	private LoginDTO loginDTO =new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){

		String sql="select * from login_user_transaction where login_id=? AND login_pass=?";

		try{
			PreparedStatement pr =con.prepareStatement(sql);

			pr.setString(1, loginUserId);
			pr.setString(2, loginPassword);

			ResultSet rs=pr.executeQuery();

			if(rs.next()){
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));

				//ここ

				if(!(rs.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return loginDTO;
	}


	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

}
