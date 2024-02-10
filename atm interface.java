package src;

import java.awt.*;
import java.awt.event.*;

class atm1 extends Frame implements ActionListener {
    Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18,
            l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16,
            b17, b18, b19, b20, b21, b22, b23;
    TextField t1, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18;

    public atm1() {
        super("ATM INTERFACE");
        setSize(1200, 1000);
        setVisible(true);
        l1 = new Label("Atm management system");
        l2 = new Label("Account NO");
        l3 = new Label("PIN code");
        l1.setBounds(100, 50, 400, 50);
        l2.setBounds(100, 150, 200, 30);
        l3.setBounds(100, 250, 200, 30);
        l1.setForeground(Color.BLUE);
        l2.setForeground(Color.BLACK);
        l3.setForeground(Color.BLACK);
        b1 = new Button(" Login ");
        b2 = new Button(" Singup ");
        b1.setBackground(Color.RED);
        b2.setBackground(Color.RED);
        b1.setBounds(150, 400, 80, 50);
        b2.setBounds(300, 400, 80, 50);
        t1 = new TextField();
        t3 = new TextField();
        t1.setBounds(150, 150, 300, 30);
        t3.setBounds(150, 250, 300, 30);
        add(l1);
        add(l2);
        add(l3);
        add(b1);
        add(b2);
        add(t1);
        add(t3);

        // ..... #2....... #login

        l4 = new Label("Welcome to RAKA ATM");
        l5 = new Label("Account NO: #123");
        l4.setBounds(100, 50, 400, 50);
        l5.setBounds(100, 100, 400, 50);
        b3 = new Button(" Add Money ");
        b4 = new Button(" Transfer Money ");
        b5 = new Button("CHANGE PIN ");
        b6 = new Button(" Debit Amount");
        b7 = new Button(" MINI STATEMENT ");
        b8 = new Button(" BALANCE ");
        b9 = new Button(" LOGOUT ");
        b3.setBackground(Color.RED);
        b4.setBackground(Color.RED);
        b5.setBackground(Color.RED);
        b6.setBackground(Color.RED);
        b7.setBackground(Color.RED);
        b8.setBackground(Color.RED);
        b9.setBackground(Color.YELLOW);
        b3.setBounds(50, 200, 300, 80);
        b5.setBounds(50, 300, 300, 80);
        b7.setBounds(50, 400, 300, 80);
        b4.setBounds(600, 200, 300, 80);
        b6.setBounds(600, 300, 300, 80);
        b8.setBounds(600, 400, 300, 80);
        b9.setBounds(400, 500, 150, 50);
        add(l4);
        add(l5);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);

        l4.setVisible(false);
        l5.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        b6.setVisible(false);
        b7.setVisible(false);
        b8.setVisible(false);
        b9.setVisible(false);

        // #...3............ balanace ........

        l6 = new Label(" BALANCE");
        l7 = new Label("Account no: #123XXX ");
        l8 = new Label("Your Balance : 999XXX ");
        l6.setBounds(300, 50, 150, 50);
        l7.setBounds(150, 150, 400, 40);
        l8.setBounds(150, 250, 400, 50);
        l6.setBackground(Color.RED);
        l7.setForeground(Color.BLACK);
        l8.setForeground(Color.BLACK);
        b10 = new Button(" Back ");
        b10.setBounds(250, 350, 80, 50);
        b10.setBackground(Color.YELLOW);
        add(l6);
        add(l7);
        add(l8);
        add(b10);
        l6.setVisible(false);
        l7.setVisible(false);
        l8.setVisible(false);
        b10.setVisible(false);

        // #4.......Sign_Up........//
        l9 = new Label(" sign up ");
        l10 = new Label(" sign up to Raka Atm");
        l11 = new Label(" sign up From");
        l12 = new Label("Account no");
        l13 = new Label(" PIN no");
        l14 = new Label("Name");
        l15 = new Label("Education");
        l16 = new Label(" Father Name ");
        l17 = new Label("occupation");
        l18 = new Label("Address");
        l19 = new Label("Mobile no");
        l20 = new Label("Date of birth");

        l9.setBounds(100, 50, 100, 30);
        l9.setBackground(Color.BLUE);
        l10.setBounds(100, 100, 250, 30);
        l10.setForeground(Color.BLACK);
        l11.setBounds(100, 150, 250, 30);
        l11.setForeground(Color.BLACK);
        l12.setBounds(50, 220, 150, 30);
        l12.setForeground(Color.BLUE);
        l13.setBounds(520, 220, 150, 30);
        l13.setForeground(Color.BLUE);
        l14.setBounds(50, 300, 150, 30);
        l14.setForeground(Color.BLUE);
        l15.setBounds(520, 300, 150, 30);
        l15.setForeground(Color.BLUE);
        l16.setBounds(50, 380, 150, 30);
        l16.setForeground(Color.BLUE);
        l17.setBounds(520, 380, 150, 30);
        l17.setForeground(Color.BLUE);
        l18.setBounds(50, 460, 150, 30);
        l18.setForeground(Color.BLUE);
        l19.setBounds(520, 460, 150, 30);
        l19.setForeground(Color.BLUE);
        l20.setBounds(50, 540, 150, 30);
        l20.setForeground(Color.BLUE);

        b11 = new Button(" Submit");
        b12 = new Button(" Back ");
        b11.setBackground(Color.YELLOW);
        b12.setBackground(Color.YELLOW);
        b11.setBounds(300, 600, 100, 40);
        b12.setBounds(500, 600, 100, 40);

        t4 = new TextField();
        t4.setBounds(230, 220, 250, 40);
        t5 = new TextField();
        t5.setBounds(600, 220, 250, 40);
        t6 = new TextField();
        t6.setBounds(230, 300, 250, 40);
        t7 = new TextField();
        t7.setBounds(600, 300, 250, 40);
        t8 = new TextField();
        t8.setBounds(230, 380, 250, 40);
        t9 = new TextField();
        t9.setBounds(600, 380, 250, 40);
        t10 = new TextField();
        t10.setBounds(230, 460, 250, 40);
        t11 = new TextField();
        t11.setBounds(600, 460, 250, 40);
        t12 = new TextField();
        t12.setBounds(230, 540, 250, 40);

        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);
        add(l14);
        add(l15);
        add(l16);
        add(l17);
        add(l18);
        add(l19);
        add(l20);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        add(t8);
        add(t9);
        add(t10);
        add(t11);
        add(t12);
        add(b11);
        add(b12);

        l9.setVisible(false);
        l10.setVisible(false);
        l11.setVisible(false);
        l12.setVisible(false);
        l13.setVisible(false);
        l14.setVisible(false);
        l15.setVisible(false);
        l16.setVisible(false);
        l17.setVisible(false);
        l18.setVisible(false);
        l19.setVisible(false);
        l20.setVisible(false);

        t4.setVisible(false);
        t5.setVisible(false);
        t6.setVisible(false);
        t7.setVisible(false);
        t8.setVisible(false);
        t9.setVisible(false);
        t10.setVisible(false);
        t11.setVisible(false);
        t12.setVisible(false);
        b11.setVisible(false);
        b12.setVisible(false);

        // .........#5.....Deposit........ Bank.........................

        l25 = new Label("Add Money");
        l25.setBounds(500, 100, 100, 50);
        l25.setBackground(Color.RED);
        add(l25);
        l25.setVisible(false);

        l26 = new Label("Enter the Account no");
        l26.setBounds(100, 200, 300, 30);
        l26.setForeground(Color.BLACK);
        l26.setVisible(false);
        add(l26);

        t14 = new TextField();
        t14.setBounds(450, 200, 250, 40);
        t14.setVisible(false);
        add(t14);

        l27 = new Label("Enter the Amount");
        l27.setBounds(100, 300, 300, 30);
        l27.setForeground(Color.RED);
        add(l27);
        l27.setVisible(false);

        t15 = new TextField();
        t15.setBounds(450, 300, 250, 40);
        add(t15);
        t15.setVisible(false);

        b20 = new Button(" OK ");
        b20.setBackground(Color.YELLOW);
        b20.setBounds(300, 600, 100, 40);
        add(b20);
        b20.setVisible(false);

        b21 = new Button(" BACK");
        b21.setBackground(Color.YELLOW);
        b21.setBounds(500, 600, 100, 40);
        add(b21);
        b21.setVisible(false);

        // ...#.........6........Transfer....................................

        l28 = new Label(" Transfer  Money");
        l28.setBounds(500, 100, 100, 50);
        l28.setBackground(Color.RED);
        add(l28);
        l28.setVisible(false);

        l29 = new Label("SENDER ACCOUNT NO");
        l29.setBounds(100, 200, 300, 30);
        l29.setForeground(Color.BLACK);
        l29.setVisible(false);
        add(l29);

        t16 = new TextField();
        t16.setBounds(450, 200, 250, 40);
        t16.setVisible(false);
        add(t16);

        l30 = new Label("Reciver Account no");
        l30.setBounds(100, 300, 300, 30);
        l30.setForeground(Color.BLACK);
        l30.setVisible(false);
        add(l30);

        t17 = new TextField();
        t17.setBounds(450, 300, 250, 40);
        t17.setVisible(false);
        add(t17);

        l31 = new Label("Account NO");
        l31.setBounds(100, 400, 300, 30);
        l31.setForeground(Color.BLACK);
        l31.setVisible(false);
        add(l31);

        t18 = new TextField();
        t18.setBounds(450, 400, 250, 40);
        t18.setVisible(false);
        add(t18);

        b22 = new Button(" OK ");
        b22.setBackground(Color.YELLOW);
        b22.setBounds(300, 550, 100, 40);
        add(b22);
        b22.setVisible(false);

        b22 = new Button(" Cancel ");
        b22.setBackground(Color.YELLOW);
        b22.setBounds(300, 550, 100, 40);
        add(b22);
        b22.setVisible(false);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b8.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l4.setVisible(true);
            l5.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            b7.setVisible(true);
            b8.setVisible(true);
            b9.setVisible(true);

            b1.setVisible(false);
            b2.setVisible(false);
            l1.setVisible(false);
            l2.setVisible(false);
            l3.setVisible(false);
            t1.setVisible(false);
            t3.setVisible(false);
            // b10.setVisible(false);
            // l6.setVisible(false);
            // l7.setVisible(false);
            // l8.setVisible(false);

        }
        if (e.getSource() == b8) {
            l6.setVisible(true);
            l7.setVisible(true);
            l8.setVisible(true);
            b10.setVisible(true);

            l4.setVisible(false);
            l5.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
             b5.setVisible(false);
            b6.setVisible(false);
            b7.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);

            b1.setVisible(false);
            b2.setVisible(false);
            l1.setVisible(false);
            l2.setVisible(false);
            l3.setVisible(false);
            t1.setVisible(false);
            t3.setVisible(false);

        }
        if (e.getSource() == b2) {

            l9.setVisible(true);
            l10.setVisible(true);
            l11.setVisible(true);
            l12.setVisible(true);
            l13.setVisible(true);
            l14.setVisible(true);
            l15.setVisible(true);
            l16.setVisible(true);
            l17.setVisible(true);
            l18.setVisible(true);
            l19.setVisible(true);
            l20.setVisible(true);

            t4.setVisible(true);
            t5.setVisible(true);
            t6.setVisible(true);
            t7.setVisible(true);
            t8.setVisible(true);
            t9.setVisible(true);
            t10.setVisible(true);
            t11.setVisible(true);
            t12.setVisible(true);
            b11.setVisible(true);
            b12.setVisible(true);

            b1.setVisible(false);
            b2.setVisible(false);
            l1.setVisible(false);
            l2.setVisible(false);
            l3.setVisible(false);
            t1.setVisible(false);
            t3.setVisible(false);
            b10.setVisible(false);
            l6.setVisible(false);
            l7.setVisible(false);
            l8.setVisible(false);
            l4.setVisible(false);
            l5.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            b6.setVisible(false);
            b7.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);
        }
        // >>>>>>>>>>>>>>>>Deposit code>>>>>>>>>>......//

        if (e.getSource() == b3) {
            l25.setVisible(true);
            l26.setVisible(true);
            l27.setVisible(true);
            b20.setVisible(true);
            b21.setVisible(true);
            t14.setVisible(true);
            t15.setVisible(true);

            l4.setVisible(false);
            l5.setVisible(false);
            b3.setVisible(false);
            b4.setVisible(false);
            b5.setVisible(false);
            b6.setVisible(false);
            b7.setVisible(false);
            b8.setVisible(false);
            b9.setVisible(false);

        } else {
            l25.setVisible(false);
            l26.setVisible(false);
            l27.setVisible(false);
            b20.setVisible(false);
            b21.setVisible(false);
            t14.setVisible(false);
            t15.setVisible(false);
        }

        // if (e.getSource() == b10) {

        // l4.setVisible(true);
        // l5.setVisible(true);
        // b3.setVisible(true);
        // b4.setVisible(true);
        // b5.setVisible(true);
        // b6.setVisible(true);
        // b7.setVisible(true);
        // b8.setVisible(true);
        // b9.setVisible(true);

        // b1.setVisible(false);
        // b2.setVisible(false);
        // l1.setVisible(false);
        // l2.setVisible(false);
        // l3.setVisible(false);
        // t1.setVisible(false);
        // t3.setVisible(false);
        // l6.setVisible(false);
        // l7.setVisible(false);
        // l8.setVisible(false);
        // b10.setVisible(false);

        // }

    }
}

class atm1 {
    public static void main(String args[]) {
        atm1 obj = new atm1();

    }
}