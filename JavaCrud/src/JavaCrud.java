import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class JavaCrud {
    private JPanel Main;
    private JTextField txtID;
    private JTextField txtname;
    private JTextField txtanzahl;
    private JTextField txtpreis;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton saveButton;
    private JButton searchButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCrud");
        frame.setContentPane(new JavaCrud().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    Connection con;
    PreparedStatement pst;

    public JavaCrud() {

        Connection();

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name, anzahl, preis;
                name = txtname.getText();
                preis = txtpreis.getText();
                anzahl = txtanzahl.getText();
                try {
                    pst = con.prepareStatement("insert into products(productName, anzahl, preis) values (?,?,?)");
                    pst.setString(1, name);
                    pst.setString(2, anzahl);
                    pst.setString(3, preis);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Produkt wurde addiert!!!");

                    txtname.setText("");
                    txtanzahl.setText("");
                    txtpreis.setText("");
                    txtname.requestFocus();
                } catch(SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });


        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = txtID.getText();
                    pst = con.prepareStatement("select productName, anzahl, preis from products where productID = ?");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();

                    if(rs.next() == true) {
                        String name = rs.getString(1);
                        String anzahl = rs.getString(2);
                        String preis = rs.getString(3);

                        txtname.setText(name);
                        txtanzahl.setText(anzahl);
                        txtpreis.setText(preis);
                    }else {
                        txtname.setText("");
                        txtanzahl.setText("");
                        txtpreis.setText("");
                        JOptionPane.showMessageDialog(null,"Die ProduktID nicht vorhanden!");
                    }
                } catch(SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });


        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String id = txtID.getText();
                    boolean vorhanden = false;
                    pst = con.prepareStatement("select * from products where productID = ?");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();
                    if(rs.next()==true){
                        vorhanden = true;
                    }
                    if(vorhanden) {
                        pst = con.prepareStatement("delete from products where productID = ?");
                        pst.setString(1, id);
                        pst.executeUpdate();
                        txtID.setText("");
                        txtanzahl.setText("");
                        txtname.setText("");
                        txtpreis.setText("");
                        JOptionPane.showMessageDialog(null, "Das Produkt wurde gelöscht!");
                    } else {
                        txtID.setText("");
                        txtanzahl.setText("");
                        txtname.setText("");
                        txtpreis.setText("");
                        JOptionPane.showMessageDialog(null, "Die ProduktID nicht vorhanden!");
                    }

                } catch(SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });


        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String id, name, anzahl, preis;
                    id = txtID.getText();
                    name = txtname.getText();
                    anzahl = txtanzahl.getText();
                    preis = txtpreis.getText();
                    boolean vorhanden = false;
                    pst = con.prepareStatement("select * from products where productID = ?");
                    pst.setString(1, id);
                    ResultSet rs = pst.executeQuery();
                    if(rs.next() == true) {
                        vorhanden = true;
                    }
                    if(vorhanden) {
                        pst = con.prepareStatement("update products set productName = ?, anzahl = ?, preis = ?" +
                                "where productID = ?");
                        pst.setString(1, name);
                        pst.setString(2, anzahl);
                        pst.setString(3, preis);
                        pst.setString(4, id);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "die Produkt wurde aktualisiert!");
                        txtpreis.setText("");
                        txtname.setText("");
                        txtanzahl.setText("");
                        txtID.setText("");
                    } else {
                        txtpreis.setText("");
                        txtname.setText("");
                        txtanzahl.setText("");
                        txtID.setText("");
                        JOptionPane.showMessageDialog(null, "die ProduktID nicht vorhanden!");
                    }


                } catch(SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }



    public void Connection() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            String host = "jdbc:mysql://localhost:3306/myshop";
            String user = "root";
            String password = "long";
            con = DriverManager.getConnection(host, user, password);
            System.out.println("Success");

        //}catch(ClassNotFoundException e) {
        //    e.printStackTrace();
        /* driver is automatically registered via the SPI
        * and manual loading of the driver class is generally unnecessary
        * */
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
