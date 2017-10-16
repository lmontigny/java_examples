import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class tuna extends JFrame{
    private JLabel item1;

    public tuna(){
        super("title bar");
        setLayout(new FlowLayout());

        item1 = new JLabel("sentence");
        item1.setToolTipText("show up");
        add(item1);

    }

}
