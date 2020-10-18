import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Ex10 extends JFrame{
    int c=0;
    JLabel[] la=new JLabel[10];
    Ex10(){
        this.setTitle("Ten 레이블 클릭");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        for(int i=0; i<10; i++){
            la[i]= new JLabel("");
            la[i].setText(""+i);
            la[i].setSize(15,15);
            int x=(int)(Math.random()*250);
            int y=(int)(Math.random()*250);
            la[i].setLocation(x,y);
            la[i].addMouseListener(new MyMouseListener());
            this.add(la[i]);
        }
        this.setSize(300,300);
        this.setVisible(true);
    }
    class MyMouseListener implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {
            JLabel a =(JLabel)e.getSource();
            if(la[c]==a){
                a.setVisible(false);
                c++;
            }
        }
        @Override
        public void mousePressed(MouseEvent e) {
        }
        @Override
        public void mouseReleased(MouseEvent e) {
        }
        @Override
        public void mouseEntered(MouseEvent e) {
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
    }


    public static void main(String[] args) {
        new Ex10();
    }
}


