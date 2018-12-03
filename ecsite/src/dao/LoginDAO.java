package dao;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import util.DBConnector;
import dto.LoginDTO;
public class LoginDAO {

	DBConnector db = new DBConnector();
	Connection con =db.getConnection();
	LoginDTO loginDTO = new LoginDTO();

	public LoginDTO getLoginUserInfo(String loginUserId,String loginPassword){

		String sql="select * from login where login_id=? AND login_pass=?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);

			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPassword(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));

				if(!(rs.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
	return loginDTO;
	}
}
