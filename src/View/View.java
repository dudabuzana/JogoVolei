package View;

import Controller.GameController;
import Controller.GameScoreObserver;
import javax.swing.JOptionPane;

/**
 * View referente ao Placar do Jogo
 * 
 * @author Maria Eduarda Buzana
 */
public class View extends javax.swing.JFrame implements GameScoreObserver {

    /**
     * Creates new form View
     */
    public GameController gameController = GameController.getIntance();

    public View() {
        initComponents();
        gameController.attach(this);
        setLocationRelativeTo(null);
    }
    
    public void atualizaLabels() { //Poderia manter o padrão inglês usando "updateLabels()"
        lblTeam1.setText(gameController.getGame().getTeam1().getName());
        lblTeam2.setText(gameController.getGame().getTeam2().getName());
        lblHorario.setText(gameController.getGame().getHorario());
    }

    @Override
    public void setDefaultCloseOperation(int operation) {
        super.setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTeam1 = new javax.swing.JLabel();
        lblTeam2 = new javax.swing.JLabel();
        lblSet = new javax.swing.JLabel();
        lblSetCount = new javax.swing.JLabel();
        lblScoreTeam1 = new javax.swing.JLabel();
        lblScoreTeam2 = new javax.swing.JLabel();
        btnAddTeam1 = new javax.swing.JButton();
        btnSubTeam1 = new javax.swing.JButton();
        btnAddTeam2 = new javax.swing.JButton();
        btnSubTeam2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lblHorario = new javax.swing.JLabel();
        lblTeam4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTeam1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTeam1.setText("Time 1");

        lblTeam2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTeam2.setText("Time 2");

        lblSet.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblSet.setText("SET");

        lblSetCount.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblSetCount.setText("1");

        lblScoreTeam1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblScoreTeam1.setText("00");

        lblScoreTeam2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblScoreTeam2.setText("00");

        btnAddTeam1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAddTeam1.setText("+");
        btnAddTeam1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAddTeam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeam1ActionPerformed(evt);
            }
        });

        btnSubTeam1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSubTeam1.setText("-");
        btnSubTeam1.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSubTeam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubTeam1ActionPerformed(evt);
            }
        });

        btnAddTeam2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnAddTeam2.setText("+");
        btnAddTeam2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnAddTeam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeam2ActionPerformed(evt);
            }
        });

        btnSubTeam2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSubTeam2.setText("-");
        btnSubTeam2.setPreferredSize(new java.awt.Dimension(50, 50));
        btnSubTeam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubTeam2ActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        lblHorario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblHorario.setText("00:00");

        lblTeam4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblTeam4.setText("Horário: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeam1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblScoreTeam1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnSubTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnAddTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSetCount)
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSet)
                        .addGap(73, 73, 73)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblScoreTeam2)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSubTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnAddTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTeam2)
                        .addGap(79, 79, 79))))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblTeam4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHorario)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTeam1)
                            .addComponent(lblTeam2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblScoreTeam1)
                            .addComponent(lblScoreTeam2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubTeam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblSet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSetCount)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeam4)
                    .addComponent(lblHorario))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddTeam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeam1ActionPerformed
        gameController.addScore(1);
    }//GEN-LAST:event_btnAddTeam1ActionPerformed

    private void btnSubTeam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubTeam1ActionPerformed
        gameController.subScore(1);
    }//GEN-LAST:event_btnSubTeam1ActionPerformed

    private void btnAddTeam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeam2ActionPerformed
        gameController.addScore(2);
    }//GEN-LAST:event_btnAddTeam2ActionPerformed

    private void btnSubTeam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubTeam2ActionPerformed
        gameController.subScore(2);
    }//GEN-LAST:event_btnSubTeam2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTeam1;
    private javax.swing.JButton btnAddTeam2;
    private javax.swing.JButton btnSubTeam1;
    private javax.swing.JButton btnSubTeam2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lblScoreTeam1;
    private javax.swing.JLabel lblScoreTeam2;
    private javax.swing.JLabel lblSet;
    private javax.swing.JLabel lblSetCount;
    private javax.swing.JLabel lblTeam1;
    private javax.swing.JLabel lblTeam2;
    private javax.swing.JLabel lblTeam4;
    // End of variables declaration//GEN-END:variables

    @Override
    public void resetGame() {
        //Sugestão: Poderia utilizar apenas "lblScoreTeam1.setText("0");", sem a necessidade de concatenação
        lblScoreTeam1.setText("" + 0);
        lblScoreTeam2.setText("" + 0);
        lblSetCount.setText("" + 1);
        jList1.setListData(new String[5]);
        btnAddTeam1.setEnabled(true);
        btnAddTeam2.setEnabled(true);
        btnSubTeam1.setEnabled(true);
        btnSubTeam2.setEnabled(true);
    }

    @Override
    public void refreshScore(int x, int y) {
        //Sugestão: Poderia utilizar um cast como "String.valueOf(x)" e "String.valueOf(y)" no lugar de concatenar uma String vazia com um valor inteiro
        lblScoreTeam1.setText("" + x);
        lblScoreTeam2.setText("" + y);
    }

    @Override
    public void updateList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    //Sugestão: Poderia renomear o parâmetro "i" para algo mais significativo
    public void wonSet(int i, int set, String[] list) {
        //Sugestão: Poderia utilizar um cast como "String.valueOf(set)" no lugar de concatenar uma String vazia com um valor inteiro
        lblSetCount.setText("" + set); 
        JOptionPane.showMessageDialog(null, "O time " + getNameTime(i) + " ganhou o SET!!");
        jList1.setListData(list);
    }

    @Override
    //Sugestão: Poderia renomear o parâmetro "i" para algo mais significativo
    public void finishGame(int i) {
        JOptionPane.showMessageDialog(null, "O Time " + getNameTime(i) + " ganhou o Jogo!!!");
        btnAddTeam1.setEnabled(false);
        btnAddTeam2.setEnabled(false);
        btnSubTeam1.setEnabled(false);
        btnSubTeam2.setEnabled(false);
    }
    
    //Sugestão: Manter o padrão de código em inglês utilizando "getNameTeam(int i)"
    public String getNameTime(int i) { 
        return (i == 1 ? gameController.getGame().getTeam1().getName() : gameController.getGame().getTeam2().getName());
    }

}
