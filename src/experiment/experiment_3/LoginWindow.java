package experiment.experiment_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame {
    // 预设的正确用户名和密码
    private final String CORRECT_USERNAME = "admin";
    private final String CORRECT_PASSWORD = "123456";

    // 组件声明
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton cancelButton;
    private JLabel messageLabel;

    public LoginWindow() {
        // 设置窗口标题
        setTitle("系统登录");

        // 设置窗口图标（可选，这里使用默认图标）
        // 如果有图片文件，可以这样设置：
        // ImageIcon icon = new ImageIcon("icon.png");
        // setIconImage(icon.getImage());

        // 设置窗口大小
        setSize(300, 200);

        // 禁止最大化
        setResizable(false);

        // 居中显示
        setLocationRelativeTo(null);

        // 设置关闭操作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 创建面板
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // 添加标签和输入框
        panel.add(new JLabel("用户名："));
        usernameField = new JTextField();
        panel.add(usernameField);

        panel.add(new JLabel("密码："));
        passwordField = new JPasswordField();
        panel.add(passwordField);

        // 按钮
        loginButton = new JButton("登录");
        cancelButton = new JButton("取消");

        // 添加按钮到面板
        panel.add(loginButton);
        panel.add(cancelButton);

        // 提示信息标签
        messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setForeground(Color.RED);
        panel.add(messageLabel);

        // 添加面板到窗口
        add(panel);

        // 设置按钮事件
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText().trim();
                String password = new String(passwordField.getPassword()).trim();

                if (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD)) {
                    messageLabel.setText("用户名和密码输入正确！");
                    messageLabel.setForeground(Color.GREEN);
                } else if (!username.equals(CORRECT_USERNAME)) {
                    messageLabel.setText("用户名输入错误！");
                    messageLabel.setForeground(Color.RED);
                } else {
                    messageLabel.setText("密码输入错误！");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usernameField.setText("");
                passwordField.setText("");
                messageLabel.setText("");
            }
        });

        // 显示窗口
        setVisible(true);
    }

    // 主方法启动程序
    public static void main(String[] args) {
        new LoginWindow();
    }
}
