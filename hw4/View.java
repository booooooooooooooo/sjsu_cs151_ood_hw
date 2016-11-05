import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class View extends JFrame{
  private Model model;
  private final int FRAME_WIDTH = 1000;
  private final int FRAME_HEIGHT = 600;
  private MyPanel cur_P;
  public View(Model m){
    this.model = m;
    this.cur_P = new Month_Event_P(model, this);


    setSize(FRAME_WIDTH, FRAME_HEIGHT);
    add(cur_P);
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
