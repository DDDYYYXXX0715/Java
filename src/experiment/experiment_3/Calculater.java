package experiment.experiment_3;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculater extends JFrame {
    JPanel pane;
    JTextField tx1;
    JTextField tx2;
    JLabel lb1;  // +
    JLabel lb2;  // =
    JLabel lb3;  // 结果标签（显示计算结果）
    JButton bt;

    public Calculater() {
        this.setTitle("加法窗口");
        pane = new JPanel();
        lb1 = new JLabel("+");
        lb2 = new JLabel("=");
        lb3 = new JLabel(); // 用于显示结果
        tx1 = new JTextField(10);
        tx2 = new JTextField(10);
        bt = new JButton("加法");

        // 添加组件到面板
        pane.add(tx1);
        pane.add(lb1);
        pane.add(tx2);
        pane.add(lb2);
        pane.add(lb3); // 显示结果
        pane.add(bt);

        // 设置内容面板和窗口属性
        this.setContentPane(pane);
        this.setSize(300, 200);
        this.setLocation(50, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 点X退出程序
        this.setVisible(true);

        // 为按钮添加事件监听器
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // 获取文本框中的数值
                    double num1 = Double.parseDouble(tx1.getText());
                    double num2 = Double.parseDouble(tx2.getText());
                    double result = num1 + num2;

                    // 将结果显示在标签中
                    lb3.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "请输入有效的数字！", "错误", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    public static void main(String[] args) {
        new Calculater();
    }
}