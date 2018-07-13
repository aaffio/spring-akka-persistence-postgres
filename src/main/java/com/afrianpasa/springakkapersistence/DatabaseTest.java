package com.afrianpasa.springakkapersistence;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {
	
	public static void main(String[] args) {
		final String url = "jdbc:postgresql://localhost:5432/akka";
		Properties props = new Properties();
		props.setProperty("user","postgres");
		props.setProperty("password","postgres");
		props.setProperty("ssl","false");
		try {
			Class.forName("org.postgresql.Driver");
			Connection conn = DriverManager.getConnection(url, props);
		
			conn.close();
			
			System.out.println("AMAN");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		List<Journal> journalEntries = new ArrayList<Journal>();
		journalEntries.add(new Journal("pid1", 1, 10000, "1,2,3,4", "MSG1"));
		journalEntries.add(new Journal("pid2", 2, 20000, "1,2,3,5", "MSG2"));
		journalEntries.add(new Journal("pid3", 3, 30000, "1,2,3,6", "MSG3"));
	}

}

class Journal{
	public String pid;
	public int seqno;
	public int created;
	public String tags;
	public String message;
	public Journal(String pid, int seqno, int created, String tags, String message) {
		this.pid = pid;
		this.seqno = seqno;
		this.created = created;
		this.tags = tags;
		this.message = message;
	}
}