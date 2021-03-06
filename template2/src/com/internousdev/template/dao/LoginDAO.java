package com.internousdev.template.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.internousdev.template.dto.LoginDTO;
import com.internousdev.template.util.DBConnector;

public class LoginDAO {

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){

		DBConnector db= new DBConnector();
		Connection con = db.getConnection();
		LoginDTO dto = new LoginDTO();

		String sql ="select * from login_user_transaction where login_id =? AND login_pass=?";

		try{
			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setString(1,loginUserId);
			preparedStatement.setString(2, loginPassword);

			ResultSet resultset = preparedStatement.executeQuery();

			if(resultset.next()){
				dto.setLoginId(resultset.getString("login_id"));
				dto.setLoginPassword(resultset.getString("login_pass"));
				dto.setUserName(resultset.getString("user_name"));

				if(!(resultset.getString("login_id").equals(null))){
					dto.setLoginFlg(true);
				}
			}

		}catch(Exception e){
			e.printStackTrace();
		}
		return dto;
	}

}
