/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getlistalltables;

/**
 *
 * @author Omer Faruk KURT
 */
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class TreeTest extends JFrame{
  public TreeTest(){                       

    DefaultMutableTreeNode general=
      new DefaultMutableTreeNode("Genel Müdürlük");
    DefaultMutableTreeNode marketing=
      new DefaultMutableTreeNode("Pazarlama Bölümü");
    DefaultMutableTreeNode aliyilmaz=
      new DefaultMutableTreeNode("Ali Yılmaz");
    DefaultMutableTreeNode alisatar=
      new DefaultMutableTreeNode("Ali Satar");
    DefaultMutableTreeNode production=
      new DefaultMutableTreeNode("Üretim");
    DefaultMutableTreeNode velikaya=
      new DefaultMutableTreeNode("Veli Kaya");
    DefaultMutableTreeNode metinselim=
      new DefaultMutableTreeNode("Metin Selim");

    general.add(marketing);
    general.add(production); 
    marketing.add(aliyilmaz);
    marketing.add(alisatar);
    production.add(velikaya);
    production.add(metinselim); 

    DefaultTreeModel model=new DefaultTreeModel(general);  
    JTree tree=new JTree(model); 

    getContentPane().add(new JScrollPane(tree));
  }   
  public static void main(String[] args){
    TreeTest test=new TreeTest();
    test.setBounds(100,100,300,300);
    test.setVisible(true);        
  }
}