public class Test{
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame frame = new javax.swing.JFrame("Formulario");
                frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
                frame.setSize(300, 150);
                frame.setLayout(new java.awt.FlowLayout());

                javax.swing.JButton boton = new javax.swing.JButton("Presionar");
                boton.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent e) {
                        javax.swing.JOptionPane.showMessageDialog(frame, "Botón presionado");
                    }
                });

                frame.add(boton);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
