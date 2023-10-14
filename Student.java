import javax.swing.*;
class Student{
    int Sid;
    String Sname;
    int Mathsmarks;
    int Sciencemarks;
    int Hindimarks;
    int Englishmarks;
    int SocialSciencemarks;
    public Student(int sid, String sname, int mathsmarks, int sciencemarks, int hindimarks,
            int englishmarks, int socialSciencemarks) {
        Sid = sid;
        Sname = sname;
        Mathsmarks = mathsmarks;
        Sciencemarks = sciencemarks;
        Hindimarks = hindimarks;
        Englishmarks = englishmarks;
        SocialSciencemarks = socialSciencemarks;
    }
    public int totalMarks(){
        int sum=Mathsmarks+Sciencemarks+Hindimarks+Englishmarks+SocialSciencemarks;
        return sum;
    }
    public double averageMarks(){
        int sum=Mathsmarks+Sciencemarks+Hindimarks+Englishmarks+SocialSciencemarks;
        double avg=sum/5;
        return avg;
    }
    public double averagePercentage(){
        double sum=Mathsmarks+Sciencemarks+Hindimarks+Englishmarks+SocialSciencemarks;
        double avgpercent=(sum/500)*100;
        return avgpercent;
    }
    public String gradeCalculate(){
        Student s=new Student(Sid, Sname, Mathsmarks, Sciencemarks, Hindimarks, Englishmarks, SocialSciencemarks);
        double a=s.averagePercentage();
        String grade="";
            if(a>90){
                grade="A+";
            }
            else if(a>80&&a<90){
                grade="A";
            }
            else if(a>70&&a<80){
                grade="B";
            }
            else if(a>600&&a<70){
                grade="C";
            }
            else if(a>500&&a<60){
                grade="D";
            }
            else if(a>400&&a<50){
                grade="E";
            }
            else if(a>33&&a<40){
                grade="F";
            }
            else 
            grade="Fail";


            /*case a>90->grade="A+";
            case a>80&&a<90->grade="A";
            case a>70&&a<80->grade="B";
            case a>60&&a<70->grade="C";
            case a>50&&a<60->grade="D";
            case a>40&&a<50->grade="E";
            case a>33&&a<40->grade="F";
            default->grade="fail";*/
        return grade;
    }
    public void displayResult(){
        JOptionPane.showMessageDialog(null,"STUDENT ID "+Sid+" STUDENT NAME: "+Sname+
        " TOTAL MARKS: "+totalMarks()+" AVERAGE PERCENTAGE: "+averagePercentage()+" GRADE: "+gradeCalculate());
    }
    
    

}