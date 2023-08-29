import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtstname;
    private JButton calculateButton;
    private JTextField txtMarks1;
    private JTextField txtMarks2;
    private JTextField txtMarks3;
    private JTextField txtmarks4;
    private JTextField txttotal;
    private JTextField txtAverage;
    private JPanel Main;
    private JTextField txtGrade;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
    calculateButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            int n1,n2,n3,n4,total;
            double avg;

            n1 = Integer.parseInt(txtMarks1.getText());
            n2 = Integer.parseInt(txtMarks2.getText());
            n3 = Integer.parseInt(txtMarks3.getText());
            n4 = Integer.parseInt(txtmarks4.getText());

            total = n1 + n2 + n3 + n4;

            txttotal.setText(String.valueOf(total));

            avg = total/4;

            txtAverage.setText(String.valueOf(avg));

            if(avg > 50) {
                txtGrade.setText("Pass");
            }
            else
            {
                txtGrade.setText("Fail");
            }




        }
    });
}
}
