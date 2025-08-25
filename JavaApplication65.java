package javaapplication65;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.util.Locale;
import javax.swing.plaf.FileChooserUI;
import sun.swing.FilePane.FileChooserUIAccessor;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class JavaApplication65 extends JFrame implements ActionListener
{
     String style[]={"Arial","Bold","Blackadder ITC","Broadway","Ink Free"},color[]={"Green","Red","Cyan","Pink"},s,co;
    String ss,st;
    static Dimension d=null;
    JMenuBar jmb=new JMenuBar();
    JMenu jm=new JMenu("File ");
    JMenu jm2=new JMenu("Edit");
    JMenu jm3=new JMenu("Format");
    JMenuItem mItem1=new JMenuItem("New");
    JMenuItem mItem2=new JMenuItem("Open");
    JMenuItem mItem3= new JMenuItem("New Window");
    JMenuItem mItem4=new JMenuItem("Save");
    JMenuItem mItem5= new JMenuItem("Save AS");
    JMenuItem mItem6= new JMenuItem("Exit");
    JMenuItem mItem7= new JMenuItem("Undo");
    JMenuItem mItem8= new JMenuItem("Cut");
    JMenuItem mItem9= new JMenuItem("Copy");
    JMenuItem mItem10= new JMenuItem("Paste");
    JMenuItem mItem11= new JMenuItem("Delete");
    JMenuItem mItem12= new JMenuItem("Select All");
    JComboBox cm1=new JComboBox(style); 
    JComboBox cm2=new JComboBox(color); 
    JRadioButton jr1=new JRadioButton("Yes");
    JRadioButton jr2=new JRadioButton("No");
    JTextArea ta=new JTextArea();
    JFileChooser file=new JFileChooser("C:\\Users\\Dilpr\\OneDrive\\Desktop\\Notepad Saved");  
    ImageIcon img= new ImageIcon("C:\\Users\\my pc\\Desktop\rose.jpg");
    JLabel lbl1=new JLabel("",img,JLabel.CENTER);
    ButtonGroup bg=new ButtonGroup();
    Container c;
    public JavaApplication65() 
    {
                setLayout(null);
        c=getContentPane();
        lbl1.setBounds(50,50,300,300);
        setIconImage(img.getImage());
        ta.setBounds(0,30,1500,790);
        ta.setLineWrap(true);
        ta.requestFocus();
        jmb.add(jm);
        jmb.add(jm2);
        jmb.add(jm3);
        jmb.add(cm1);
        jmb.add(cm2);
        setJMenuBar(jmb);
        jm.add(mItem1);
        jm.add(mItem2);
        jm.add(mItem3);
        jm.add(mItem4);
        jm.add(mItem5);
        jm.add(mItem6);
        jm.setMnemonic('F');
        jm2.add(mItem7);
        jm2.add(mItem8);
        jm2.add(mItem9);
        jm2.add(mItem10);
        jm2.add(mItem11);
        jm2.add(mItem12);
        jm2.setMnemonic('E');
        jm3.setMnemonic('F');        
        mItem1.setMnemonic('N');
        mItem2.setMnemonic('O');
        mItem3.setMnemonic('N');
        mItem4.setMnemonic('S');
        mItem5.setMnemonic('S');
        mItem6.setMnemonic('E');
        mItem7.setMnemonic('U');
        mItem8.setMnemonic('C');
        mItem9.setMnemonic('C');
        mItem10.setMnemonic('P');
        mItem11.setMnemonic('D');
        mItem12.setMnemonic('S'); 
        c.add(ta);
        mItem1.setAccelerator(KeyStroke.getKeyStroke('N',KeyEvent.CTRL_DOWN_MASK));
        mItem2.setAccelerator(KeyStroke.getKeyStroke('O',KeyEvent.CTRL_DOWN_MASK));        
        mItem3.setAccelerator(KeyStroke.getKeyStroke('N',KeyEvent.SHIFT_DOWN_MASK));
        mItem4.setAccelerator(KeyStroke.getKeyStroke('S',KeyEvent.CTRL_DOWN_MASK));
        mItem5.setAccelerator(KeyStroke.getKeyStroke('S',KeyEvent.SHIFT_DOWN_MASK));  
        mItem6.setAccelerator(KeyStroke.getKeyStroke('E',KeyEvent.CTRL_DOWN_MASK));
        mItem7.setAccelerator(KeyStroke.getKeyStroke('U',KeyEvent.CTRL_DOWN_MASK));
        mItem8.setAccelerator(KeyStroke.getKeyStroke('X',KeyEvent.CTRL_DOWN_MASK)); 
        mItem9.setAccelerator(KeyStroke.getKeyStroke('C',KeyEvent.CTRL_DOWN_MASK));
        mItem10.setAccelerator(KeyStroke.getKeyStroke('V',KeyEvent.CTRL_DOWN_MASK));
        mItem1.addActionListener(this);
        mItem2.addActionListener(this);
        mItem3.addActionListener(this);
        mItem4.addActionListener(this); 
        mItem5.addActionListener(this); 
        mItem6.addActionListener(this); 
        mItem7.addActionListener(this);
        mItem8.addActionListener(this);
        mItem9.addActionListener(this);
        mItem10.addActionListener(this);
        mItem11.addActionListener(this);
        mItem12.addActionListener(this);
        cm1.addActionListener(this);
        cm2.addActionListener(this);
       
       
    }
    public void saveFile(File file, JTextArea textArea) 
    {
        try
        {
            FileWriter writer = new FileWriter(file.getAbsolutePath());  
            BufferedWriter buffer = new BufferedWriter(writer);  
            buffer.write(textArea.getText());  
            buffer.close();  
        }
        catch(Exception ex)
        {
            
        }
    }
     public void saveasFile(File file, JTextArea textArea) 
    {
        try
        {
            FileWriter writer = new FileWriter(file.getAbsolutePath());  
            BufferedWriter buffer = new BufferedWriter(writer);  
            buffer.write(textArea.getText());  
            buffer.close();  
        }
        catch(Exception ex)
        {
            
        }
    }
    public void delete(String filepath,int deleteline)
    {
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==cm1)
        {
           ss=cm1.getSelectedItem().toString(); 
           ta.setFont(new Font(ss,10,40));
           ta.requestFocus();
        }
        if(ae.getSource()==cm2)
        {
           int o=cm2.getSelectedIndex();
           
           if(o==0)
           {
               ta.setForeground(Color.green);
               ta.setFont(new Font(ss,10,40));
           }
           if(o==1)
           {
               ta.setForeground(Color.red);
               ta.setFont(new Font(ss,10,40));
           }
           if(o==2)
           {
               ta.setForeground(Color.cyan);
               ta.setFont(new Font(ss,10,40));
           }
           if(o==3)
           {
               ta.setForeground(Color.pink);
               ta.setFont(new Font(ss,10,40));
           }
        }
       if(ae.getSource()==mItem1)
       {
           int response=JOptionPane.showConfirmDialog(this,"Do you want to save?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           if(response==JOptionPane.NO_OPTION)
           {
                ta.setText("");
                ta.requestFocus();
           }     
           else if(response==JOptionPane.YES_OPTION)
           {
               FileNameExtensionFilter textFilter=new FileNameExtensionFilter("Only text files(.txt)", "txt");
               file.setAcceptAllFileFilterUsed(false);
               file.addChoosableFileFilter(textFilter);
               file.showSaveDialog(this);
                saveFile(file.getSelectedFile(), ta);
               JOptionPane.showMessageDialog(this, "File Saved");     
           }             
       }
         if(ae.getSource()==mItem2)
       {
            int res=file.showOpenDialog(null);
            if(res==JFileChooser.APPROVE_OPTION)
            {
                try
                {
                    //FileReader reader = new FileReader(file.getAbsolutePath());  
                    BufferedReader  buffer = new BufferedReader(new FileReader(file.getSelectedFile()));  
                    ta.read( buffer,null);  
                    buffer.close();  
                    ta.requestFocus();
                }
                catch(Exception ex)
                {
            
                }
               
            }
            else
            {
                JOptionPane.showMessageDialog(this,"User Cancelled");
            }
       }
       if(ae.getSource()==mItem3)
       {
            A ob=new A();
            d=Toolkit.getDefaultToolkit().getScreenSize();
            ob.setSize(d.width-400,d.height-200);
            ob.setLocation(300,100);
            ob.setVisible(true);
            ob.setTitle("Notepad");
            ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
       }
       if(ae.getSource()==mItem4)
       {
           int response=JOptionPane.showConfirmDialog(this,"Save..", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           if(response==JOptionPane.NO_OPTION)
           {
                JOptionPane.showMessageDialog(this, "Cancelled by user.");
                ta.requestFocus();
           }     
           else if(response==JOptionPane.YES_OPTION)
           {
               FileNameExtensionFilter textFilter=new FileNameExtensionFilter("Only text files(.txt)", "txt");
               file.setAcceptAllFileFilterUsed(false);
               file.addChoosableFileFilter(textFilter);
               file.showSaveDialog(this);
               saveFile(file.getSelectedFile(), ta);
               JOptionPane.showMessageDialog(this, "File Saved");
           }
       }
       if(ae.getSource()==mItem5)
       {
           int response=JOptionPane.showConfirmDialog(this,"Do you want to rename save?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
           if(response==JOptionPane.NO_OPTION)
           {
                JOptionPane.showMessageDialog(this, "Cancelled by user.");
               
           }     
           else if(response==JOptionPane.YES_OPTION)
           {
               FileNameExtensionFilter textFilter=new FileNameExtensionFilter("Only text files(.txt)", "txt");
               file.setAcceptAllFileFilterUsed(false);
               file.addChoosableFileFilter(textFilter);
               file.showSaveDialog(this);
               saveasFile(file.getSelectedFile(), ta);
               JOptionPane.showMessageDialog(this, "File Saved");
           }
       }
       if(ae.getSource()==mItem6)
       {
           System.exit(0);
       }
       //undo
       if(ae.getSource()==mItem7)
       {
           ta.setText("");
       }
       //cut
       if(ae.getSource()==mItem8)
       {
           ta.cut();
       }
       //copy
       if(ae.getSource()==mItem9)
       {
           ta.copy();
       }
       //paste
       if(ae.getSource()==mItem10)
       {
           ta.paste();
       }
       //delete
       if(ae.getSource()==mItem11)
       {
           String g;
           g=ta.getText();
          s=ta.getSelectedText();
          int a=ta.getText().length();
          //String g=ta.getText().charAt(i);
          int y=g.indexOf(s);
          //JOptionPane.showMessageDialog(this, y);    
          g=g.replace(s, "");
          ta.setText(g);
          ta.requestFocus();
       }
       //select all
       if(ae.getSource()==mItem12)
       {
             ta.selectAll();
       }
       //print
      // if(ae.getSource()==mItem13)
       {
           try
           {
               ta.print();
           }    
           catch(Exception ex)
           {
               
           }
       }
       //date,time
       //if(ae.getSource()==mItem14)
       {
          
       }
       
    }
    public static void main(String[] args) 
    {
       JavaApplication65 ob=new JavaApplication65();
        d=Toolkit.getDefaultToolkit().getScreenSize();
        ob.setSize(d.width-400,d.height-200);
        ob.setLocation(300,100);
        ob.setVisible(true);
        ob.setTitle("Notepad");
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }
}
class A extends JFrame
{
    static Dimension d=null;
    JMenuBar jmb=new JMenuBar();
    JMenu jm=new JMenu("File ");
    JMenu jm2=new JMenu("Edit");
    JMenu jm3=new JMenu("Format");
    JMenuItem mItem1=new JMenuItem("New");
    JMenuItem mItem2=new JMenuItem("Open");
   
    JMenuItem mItem4=new JMenuItem("Save");
    JMenuItem mItem5=new JMenuItem("Save As"); 
    JMenuItem mItem6=new JMenuItem("Exit"); 
    JMenuItem mItem7=new JMenuItem(); 
    JMenuItem mItem8=new JMenuItem();
    JFileChooser file=new JFileChooser();
    JTextArea ta=new JTextArea();
    ImageIcon img= new ImageIcon("D:\\dilpreetjava\\Notepad.png");
    JLabel lbl1=new JLabel("",img,JLabel.CENTER);
    ButtonGroup bg=new ButtonGroup();
    Container c;
    A()
    {
        setLayout(null);
        c=getContentPane();
        lbl1.setBounds(50,50,300,300);
        setIconImage(img.getImage());
        ta.setBounds(0,30,1500,790);
        jmb.add(jm);
        jmb.add(jm2);
        jmb.add(jm3);
        setJMenuBar(jmb);
        jm.add(mItem1);
        jm.add(mItem2);
        //jm.add(mItem3);
        jm.add(mItem4);
        jm.add(mItem5);
        jm.add(mItem6);
        jm.setMnemonic('F');
        jm2.setMnemonic('E');
        jm3.setMnemonic('F');        
        mItem1.setMnemonic('N');
        mItem2.setMnemonic('O');
        //mItem3.setMnemonic('N');
        mItem4.setMnemonic('S');
        mItem5.setMnemonic('S');
        mItem6.setMnemonic('E');
        c.add(ta);
        mItem1.setAccelerator(KeyStroke.getKeyStroke('N',KeyEvent.CTRL_DOWN_MASK));
        mItem2.setAccelerator(KeyStroke.getKeyStroke('O',KeyEvent.CTRL_DOWN_MASK));        
       // mItem3.setAccelerator(KeyStroke.getKeyStroke('N',KeyEvent.SHIFT_DOWN_MASK));
        mItem4.setAccelerator(KeyStroke.getKeyStroke('S',KeyEvent.CTRL_DOWN_MASK));
        mItem5.setAccelerator(KeyStroke.getKeyStroke('S',KeyEvent.SHIFT_DOWN_MASK));  
        mItem6.setAccelerator(KeyStroke.getKeyStroke('E',KeyEvent.CTRL_DOWN_MASK));
        
    }
} 
      
     

    

    

