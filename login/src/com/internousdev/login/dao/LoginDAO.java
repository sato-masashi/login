package com.internousdev.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.login.dto.LoginDTO;
import com.internousdev.login.util.DBConnector;


public class LoginDAO {

	public LoginDTO select(String name,String password) throws SQLException{
		LoginDTO dto = new LoginDTO();
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "select * from user where user_name=? and password=?";

	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, password);

		/*select文のSQL文を実行するメソッド：ResultSetを返す*/
		ResultSet rs = ps.executeQuery();

		if(rs.next()){
			dto.setName(rs.getString("user_name"));
			dto.setPassword(rs.getString("password"));
		}/*if*/

		/*try*/
		}catch(SQLException e){
		e.printStackTrace();
		}finally{

			/*DB接続の終了*/
			con.close();

		}

		/*DTOの格納値をActionへ渡す*/
		return dto;


	}




}
