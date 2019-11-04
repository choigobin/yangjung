package com.company.myweb;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleConnectionTest {
	private static final String DRIVER ="oracle.jdbc.driver.OracleDriver";
	private static final String URL ="jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USER ="scott";
	private static final String PW ="1234";
	@Test
	public void testConnect() throws Exception{
	Class.forName(DRIVER);
	try(Connection con = DriverManager.getConnection(URL, USER, PW)){
	System.out.println(con);
	System.out.println("오라클 연렬 성공");
	}catch(Exception e) {
	System.out.println("오라클 연렬 실패");
	e.printStackTrace();
	}
	}

}
