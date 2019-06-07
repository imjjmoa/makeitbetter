package GUI;

import java.awt.*;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import javax.swing.*;

public class GUI extends JFrame{
    private String [] md={"TIM","STW","ALM","TMR","DIC","RRT"};                   // md=모드이름, d3=요일
    private String [] d3={"MON","TUS","WED","TUR","FRY","SAT","SUN","SET","---","ON","OFF"};

    Font font=new Font("digital-7",Font.BOLD,40);

    public long btn_press=0,btn_release=0;
    public long btn_time=0;

    public int btn_input=0;
    public int btn_temp=0;

    ImageIcon img;
    JLabel image;
    private JButton ok=new JButton("OK");
    private JButton menu=new JButton("MENU");
    private JButton up=new JButton("UP");
    private JButton down=new JButton("DOWN");

    private JLabel mode=new JLabel();
    private JLabel time=new JLabel();
    private JLabel day=new JLabel();

    public GUI(){

        setLayout();
        setButton();
        setLabel();

    }
    private class MyActionListener implements MouseListener {

        public void mouseClicked(MouseEvent e){
        }
        public void mousePressed(MouseEvent e) {
            if(!e.isMetaDown()){
                btn_press=System.currentTimeMillis();
            }
        }
        public void mouseReleased(MouseEvent e) {
            JButton b = (JButton)e.getSource();
            if(!e.isMetaDown()){
                btn_release=System.currentTimeMillis();
                btn_time=btn_release-btn_press;
                if(b.getText().equals("UP")) {
                    btn_input=1;
                }
                if(b.getText().equals("DOWN")) {
                    btn_input=2;
                }
                if(b.getText().equals("OK") && btn_time>=2000)
                {
                    btn_input=5;
                }
                else if(b.getText().equals("OK")){
                    btn_input=3;
                }
                if(b.getText().equals("MENU")&&btn_time>=2000)
                {
                    btn_input=6;
                }
                else if(b.getText().equals("MENU")){
                    btn_input=4;
                }
            }
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }
    }
    private void setButton(){
        MyActionListener listener=new MyActionListener();

        this.ok.addMouseListener(listener);
        this.menu.addMouseListener(listener);
        this.up.addMouseListener(listener);
        this.down.addMouseListener(listener);

        this.ok.setSize(80,48);
        this.ok.setLocation(65,185);
        this.menu.setSize(80,48);
        this.menu.setLocation(65,336);
        this. up.setSize(80,48);
        this.up.setLocation(470,187);
        this.down.setSize(80,48);
        this.down.setLocation(470,338);

        add(this.ok);
        add(this.menu);
        add(this.up);
        add(this.down);
    }
    private void setLayout(){
        setTitle("Watch");
        setSize(618,647);
        setLayout(null);
        setLocationRelativeTo(null);
        ImageIcon img=new ImageIcon("watch.png");
        image=new JLabel(img);
        image.setBounds(145,157,img.getIconWidth(),img.getIconHeight());
        add(image);

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void setLabel(){

        this.mode.setFont(font);
        this.mode.setOpaque(true);
        this.mode.setBackground(new Color(0,0,0,0));
        this.mode.setBounds(230,230,180,40);
        this.mode.setForeground(Color.black);

        this.time.setFont(font);
        this.time.setOpaque(true);
        this.time.setBackground(new Color(0,0,0,0));
        this.time.setBounds(230,260,180,40);
        this.time.setForeground(Color.black);

        this.day.setFont(font);
        this.day.setOpaque(true);
        this.day.setBackground(new Color(0,0,0,0));
        this.day.setBounds(230,290,180,40);
        this.day.setForeground(Color.black);
    }

    public void display(int [] dis){

        this.mode.setText("Mode : " + this.md[dis[0]]);
        this.time.setText(dis[1] + ":" + dis[2] + ":" + dis[3]);
        this.day.setText(dis[4] + "-" + dis[5] + "-" + this.d3[dis[6]]);

        add(this.mode);
        add(this.time);
        add(this.day);
    }

    public int GUI_btn(){
        btn_temp=btn_input;
        btn_input=0;
        return btn_temp;
    }
}
