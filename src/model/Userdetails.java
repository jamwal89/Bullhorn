package model;



public class Userdetails {
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}



	public boolean isValidUser(){
		boolean res=false;
		if(username.equalsIgnoreCase("neha") && password.equalsIgnoreCase("orange")){
			res=true;

		}
		return res;
	}

}

