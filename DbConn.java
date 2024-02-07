import java.sql.*;

public class DbConn {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "");
            
            //Creating a table in mysql database
//            String sql = "create table tbl_student(name varchar(100), email varchar(100), phone int(10))";
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.executeUpdate();
            
            // to create something, to insert something
            String sql1 = ("insert into tbl_student values (?,?,?)");
            PreparedStatement stmt = conn.prepareStatement(sql1);
                    
            stmt.setString(1, "sauravhjdf");
            stmt.setString(2, "il.com");
            stmt.setInt(3, 987654222);
            stmt.executeUpdate();
            
            //stmt.executeUpdate(sql);
            
            String insert1 = "insert into tbl_student values ('Ram190','harfin123@gmail.com',977654321)";
            Statement st = conn.createStatement();
            st.executeUpdate(insert1);
            
            
            Statement s = conn.createStatement(); 
            //try { 
                //int from;
                //int select;
                String tbl_student1 = "select * from tbl_student";
                ResultSet resultSet = s.executeQuery(tbl_student1); 
                while (resultSet.next()) {
                    
                
                String name1 = resultSet.getString("name");
                 String email1 = resultSet.getString("email");
                 int phone1 = resultSet.getInt("phone");
                 //System.out.println();
                 System.out.println(name1 +"\t\t" +email1 +"" +phone1);
                 } // end while
                // } // end try
//                 catch ( SQLException sqlException ) 
//                 { 
//                 sqlException.printStackTrace();
//                 
//            
//    }
    
}
}