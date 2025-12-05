package experiment.experiment_4;

import java.sql.*;

public class QueryUser {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM user");

            System.out.println("用户名\t密码");
            while (rs.next()) {
                System.out.println(rs.getString("Username") + "\t" + rs.getString("Password"));
            }
        } catch (SQLException e) {
            System.err.println("数据库操作出错：");
            e.printStackTrace();
        } finally {
            // 安全关闭资源
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
