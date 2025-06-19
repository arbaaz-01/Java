import java.awt.*;
public class _01 extends Frame{
        _01(){
        Button b = new Button("Click");
        b.setBounds(30, 100, 80, 30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        }
        public static void main(String[] args) {
            _01 f = new _01();
        }
}


// Actionevent
// ActionListener