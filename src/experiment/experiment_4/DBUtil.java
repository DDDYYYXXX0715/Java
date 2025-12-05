package experiment.experiment_4;
import java.sql.*;
public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/java?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";          // 替换为你的用户名
    private static final String PASSWORD = "dongjiayin668"; // 替换为你的密码

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC 驱动加载失败！");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
