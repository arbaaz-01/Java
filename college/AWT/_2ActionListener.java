// Important

import java.awt.*;
import java.awt.event.*;

class _2ActionListener extends Frame implements ActionListener{
    TextField tf;
    _2ActionListener(){
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b =new Button("Click");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        // addWindowListener(new);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("GUI");
    }
    public static void main(String[] args) {
        new _2ActionListener();
    }
}

// 2 
// 3  Anonymous
// login form, Registration form
// Delegation event model  >Source >Listener        -->Imp
// Closing event