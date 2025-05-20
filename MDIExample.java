 import javax.swing.*;
 
 public class MDIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MDI Example");
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane jd=new JDesktopPane(); 
        JInternalFrame frame1=new JInternalFrame("Internal Frame1",true,true,true,true); 
        frame1.setLayout(null); 
        frame1.setSize(200,100); 
        frame1.setVisible(true); 
        JInternalFrame frame2=new JInternalFrame("Internal Frame2",true,true,true,true); 
        frame2.setLayout(null); 
        frame2.setSize(200,100); 
        frame2.setVisible(true); 
        JInternalFrame frame3=new JInternalFrame("Internal Frame3",true,true,true,true); 
        frame3.setLayout(null); 
        frame3.setSize(200,100); 
        frame3.setVisible(true); 
        jd.add(frame1); 
        jd.add(frame2); 
        jd.add(frame3);
        frame.add(jd);
        frame.setVisible(true);

    }

    
}
