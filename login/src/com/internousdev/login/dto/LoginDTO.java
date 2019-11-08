package com.internousdev.login.dto;


public class LoginDTO {

	private int id;
	private String name;
	private String password;

	/*【id】[getter]*/
	public int getId(){
		return id;
	}

	/*【id】[setter]*/
	public void setId(int id) {
		this.id =id;
	}


	/*【name】[getter]･･･値をActionに渡す設定*/
	public String getName() {
		return name;
	}

	/*【name】[setter]･･･DAOクラスからの呼出し後、
	 * 受け取った値を自身のnameフィールドへ格納*/
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
