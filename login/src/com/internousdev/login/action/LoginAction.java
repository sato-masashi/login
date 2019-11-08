package com.internousdev.login.action;

import java.sql.SQLException;

import com.internousdev.login.dao.LoginDAO;
import com.internousdev.login.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport{

	/*JSPから受け取る値の設定*/
	private String name;
	private String password;

	public String execute() throws SQLException {

		/*初期値のセット*/
		String ret = ERROR;

		LoginDAO dao = new LoginDAO();
		LoginDTO dto = new LoginDTO();

		/*JSPから送られてきた"name"と"password"を引数とし
		 * LoginDAOクラスのselectメソッドを呼び出す。
		 * その後、DAOで取得した結果を
		 * LoginDTOへ代入*/
		dto = dao.select(name, password);


		/*ユーザーが入力した(name)と(password)の値が
		 * DTOから持ってきた値(dto.getName())と(dto.getPassword())に
		 * 一致するか確認*/
		if(name.equals(dto.getName())) {

			if(password.equals(dto.getPassword())) {

				ret = SUCCESS;

			}


		}

		return ret;

	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}



}
