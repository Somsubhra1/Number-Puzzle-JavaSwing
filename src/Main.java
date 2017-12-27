import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    JFrame f;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,shuffle;
    JLabel l;
    int moves=0;

    Main() {
        f=new JFrame("Puzzle");
        f.setSize(450, 500);
        f.setLayout(null);
        f.getContentPane().setBackground(Color.orange);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("");
        shuffle=new JButton("Shuffle");

        b1.setBounds(100,100,50,50);
        f.add(b1);
        b2.setBounds(190,100,50,50);
        f.add(b2);
        b3.setBounds(280,100,50,50);
        f.add(b3);

        b4.setBounds(100,190,50,50);
        f.add(b4);
        b5.setBounds(190,190,50,50);
        f.add(b5);
        b6.setBounds(280,190,50,50);
        f.add(b6);

        b7.setBounds(100,280,50,50);
        f.add(b7);
        b8.setBounds(190,280,50,50);
        f.add(b8);
        b9.setBounds(280,280,50,50);
        f.add(b9);

        shuffle.setBounds(170,360,80,50);
        shuffle.setBackground(Color.pink);
        f.add(shuffle);

        l=new JLabel("Moves: "+moves);
        l.setBounds(190,55,100,10);
        f.add(l);

        f.setVisible(true);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        shuffle.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String t;
        if(e.getSource()==shuffle) {
            t=b1.getText();
            b1.setText(b7.getText());
            b7.setText(t);

            t=b5.getText();
            b5.setText(b3.getText());
            b3.setText(t);

            t=b9.getText();
            b9.setText(b4.getText());
            b4.setText(t);

            moves=0;
        }

        else if(e.getSource()==b1) {
            if(b2.getText().equals("")) {
                t=b1.getText();
                b1.setText(b2.getText());
                b2.setText(t);
                moves++;
            }
            else if(b4.getText().equals("")) {
                t=b1.getText();
                b1.setText(b4.getText());
                b4.setText(t);
                moves++;
            }
        }

        else if(e.getSource()==b2) {
            if(b1.getText().equals("")) {
                t=b2.getText();
                b2.setText(b1.getText());
                b1.setText(t);
                moves++;
            }
            else if(b3.getText().equals("")) {
                t=b3.getText();
                b3.setText(b2.getText());
                b2.setText(t);
                moves++;
            }
            else if(b5.getText().equals("")) {
                t=b5.getText();
                b5.setText(b2.getText());
                b2.setText(t);
                moves++;
            }
        }

        else if(e.getSource()==b3) {
            if(b2.getText().equals("")) {
                t=b3.getText();
                b3.setText(b2.getText());
                b2.setText(t);
                moves++;
            }
            else if(b6.getText().equals("")) {
                t=b6.getText();
                b6.setText(b3.getText());
                b3.setText(t);
                moves++;
            }
        }

        else if(e.getSource()==b4) {
            if(b1.getText().equals("")) {
                t=b4.getText();
                b4.setText(b1.getText());
                b1.setText(t);
                moves++;
            }
            else if(b5.getText().equals("")) {
                t=b5.getText();
                b5.setText(b4.getText());
                b4.setText(t);
                moves++;
            }
            else if(b7.getText().equals("")) {
                t=b7.getText();
                b7.setText(b4.getText());
                b4.setText(t);
                moves++;
            }
        }
        else if(e.getSource()==b5) {
            if(b2.getText().equals("")) {
                t=b2.getText();
                b2.setText(b5.getText());
                b5.setText(t);
                moves++;
            }
            else if(b4.getText().equals("")) {
                t=b4.getText();
                b4.setText(b5.getText());
                b5.setText(t);
                moves++;
            }
            else if(b6.getText().equals("")) {
                t=b6.getText();
                b6.setText(b5.getText());
                b5.setText(t);
                moves++;
            }
            else if(b8.getText().equals("")) {
                t=b8.getText();
                b8.setText(b5.getText());
                b5.setText(t);
                moves++;
            }
        }
        else if(e.getSource()==b6) {
            if(b3.getText().equals("")) {
                t=b3.getText();
                b3.setText(b6.getText());
                b6.setText(t);
                moves++;
            }
            else if(b5.getText().equals("")) {
                t=b5.getText();
                b5.setText(b6.getText());
                b6.setText(t);
                moves++;
            }
            else if(b9.getText().equals("")) {
                t=b9.getText();
                b9.setText(b6.getText());
                b6.setText(t);
                moves++;
            }
        }
        else if(e.getSource()==b7) {
            if(b4.getText().equals("")) {
                t=b4.getText();
                b4.setText(b7.getText());
                b7.setText(t);
                moves++;
            }
            else if(b8.getText().equals("")) {
                t=b8.getText();
                b8.setText(b7.getText());
                b7.setText(t);
                moves++;
            }
        }
        else if(e.getSource()==b8) {
            if(b7.getText().equals("")) {
                t=b7.getText();
                b7.setText(b8.getText());
                b8.setText(t);
                moves++;
            }
            else if(b5.getText().equals("")) {
                t=b5.getText();
                b5.setText(b8.getText());
                b8.setText(t);
                moves++;
            }
            else if(b9.getText().equals("")) {
                t=b9.getText();
                b9.setText(b8.getText());
                b8.setText(t);
                moves++;
            }
        }
        else if(e.getSource()==b9) {
            if(b6.getText().equals("")) {
                t=b6.getText();
                b6.setText(b9.getText());
                b9.setText(t);
                moves++;
            }
            else if(b8.getText().equals("")) {
                t=b8.getText();
                b8.setText(b9.getText());
                b9.setText(t);
                moves++;
            }
        }

        if((b1.getText().equals("1")) && (b2.getText().equals("2")) &&
                (b3.getText().equals("3")) && (b4.getText().equals("4")) &&
                (b5.getText().equals("5")) && (b6.getText().equals("6")) &&
                (b7.getText().equals("7")) && (b8.getText().equals("8")) &&
                (b9.getText().equals(""))) {
            if(moves>3) {
                JOptionPane.showMessageDialog(null,"You win in "+moves+" moves!!");
            }
            else if(moves==2){
                JOptionPane.showMessageDialog(f,"DO NOT CHEAT!!!!","ALERT",JOptionPane.WARNING_MESSAGE);
                moves=0;
            }
        }
        l.setText("Moves: "+moves);
    }

    public static void main(String[] args) {
        new Main();

    }

}
