package GUI_Programming;

import java.awt.*; // Thư viện cho giao diện AWT
import java.awt.event.*; // Thư viện cho sự kiện AWT

public class AWTAccumulator extends Frame {
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0; // Tổng tích lũy, khởi tạo là 0

    // Constructor để thiết lập các thành phần giao diện và xử lý sự kiện
    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2));

        // Dòng nhập
        add(new Label("Enter an Integer: "));
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener()); // Xử lý sự kiện khi nhấn Enter

        // Dòng hiển thị tổng
        add(new Label("The Accumulated Sum is: "));
        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);

        // Cài đặt cửa sổ
        setTitle("AWT Accumulator");
        setSize(350, 120);
        setVisible(true);

        // Xử lý đóng cửa sổ
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0); // Thoát chương trình
            }
        });
    }

    public static void main(String[] args) {
    	new AWTAccumulator();
    }

    // Lớp lắng nghe sự kiện cho TextField nhập
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            try {
                // Lấy số từ trường nhập
                int numberIn = Integer.parseInt(tfInput.getText());
                sum += numberIn; // Cộng dồn vào tổng
                tfInput.setText(""); // Xóa trường nhập
                tfOutput.setText(sum + ""); // Hiển thị tổng
            } catch (NumberFormatException e) {
                tfOutput.setText("Invalid input!"); // Thông báo nếu nhập không hợp lệ
            }
        }
    }
}
