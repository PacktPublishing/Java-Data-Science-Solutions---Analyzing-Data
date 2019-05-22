import java.sql.*;
import java.util.Properties;

public class TestDB {

	public static void main(String[] args) {
		TestDB test = new TestDB();
		test.readTable();
	}
	Connection conn = null;
	public void readTable(){
		Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "root123");
        properties.setProperty("useSSL", "false");
        properties.setProperty("autoReconnect", "true");
        
        try{
        	
        	String connectionURL = "jdbc:mysql://localhost:3300/"; 
        	Connection conn = DriverManager.getConnection(connectionURL, properties);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * from data_science.books");
            
            while (rs.next()){
                int id = rs.getInt("id");
                String book = rs.getString("book_name");
                String author = rs.getString("author_name");
                Date dateCreated = rs.getDate("date_created");
                System.out.format("%s, %s, %s, %s\n", id, book, author, dateCreated);
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch (Exception e){
        	
        }	
	}
}
