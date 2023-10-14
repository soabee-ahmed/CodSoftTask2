import javax.swing.*;
class StudentTest{
    public static void main(String[] args) {
    int sid=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Student Id: "));
    String sname=JOptionPane.showInputDialog(null,"Enter Student name: ");
    int Mathsmarks=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Maths Marks: "));
    int sciencemarks=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Science Marks: "));
    int Hindimarks=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Hindi Marks: "));
    int Englishmarks=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter English Marks: "));
    int SocialSciencemarks=Integer.parseInt(JOptionPane.showInputDialog(null,"Enter SocialScience Marks: "));
    Student st=new Student(sid, sname, Mathsmarks, sciencemarks, Hindimarks, Englishmarks, SocialSciencemarks);
    st.averageMarks();
    st.averagePercentage();
    st.gradeCalculate();
    st.displayResult();

    }
}   