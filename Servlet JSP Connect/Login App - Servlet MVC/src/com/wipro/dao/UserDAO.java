package com.wipro.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.wipro.bean.UserBean;
import com.wipro.util.DBUtil;

public class UserDAO {
	
	public String checkUser(UserBean userBean) {
		String status = "Fail";
		try {
			String sql = "select * from user_table where username=? and password=?";
			Connection con = DBUtil.getConnection();
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, userBean.getUserName());
			st.setString(2, userBean.getPassword());
			ResultSet rs = st.executeQuery();
			if(rs.next())
			status = "Success";
			st.close();
			con.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
}
