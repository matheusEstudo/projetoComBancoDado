package telas;

import dao.rodada.RodadaDao;
import dao.rodada.RodadaImplDao;
import entidade.Rodada;
import entidade.Usuario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Inicio extends javax.swing.JFrame {

    private Usuario usuario;
    private Rodada rodada;
    private Integer numeroCerto = 0;
    private Integer tentativa = 0;
    private Integer quantRodada = 0;
    private String resultado = "";
    private DefaultTableModel tabelaModelo;
    private RodadaDao rodadaDao = new RodadaImplDao();

    public Inicio() {
        initComponents();
        numeroCerto = (int) (Math.random() * 101);
        lbTentativa.setText(String.valueOf(tentativa));
        lbIncorreto.setVisible(false);
        lbCorreto.setVisible(false);
        System.out.println(numeroCerto);
        lbErroSelecionar.setVisible(false);
        varNumero.setVisible(false);
        lbTxtNumero.setVisible(false);
        btJogar.setVisible(false);
        btReplay.setVisible(false);
    }

    public Inicio(Usuario usuario) throws SQLException {
        initComponents();
        numeroCerto = (int) (Math.random() * 101);
        this.usuario = usuario;
        lbNome.setText(usuario.getNome());
        lbUser.setText(usuario.getUsuario());
        lbTentativa.setText(String.valueOf(tentativa));
        lbIncorreto.setVisible(false);
        lbCorreto.setVisible(false);
        System.out.println(numeroCerto);
        lbErroSelecionar.setVisible(false);
        varNumero.setVisible(false);
        lbTxtNumero.setVisible(false);
        btJogar.setVisible(false);
        btReplay.setVisible(false);
        popularTabela(rodadaDao.mostrar());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbTentativa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pnNivel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rbFacil = new javax.swing.JRadioButton();
        rbMedio = new javax.swing.JRadioButton();
        rbDificil = new javax.swing.JRadioButton();
        lbErroSelecionar = new javax.swing.JLabel();
        btJogar = new javax.swing.JLabel();
        btReplay = new javax.swing.JLabel();
        btConficurar = new javax.swing.JLabel();
        lbTxtNumero = new javax.swing.JLabel();
        varNumero = new javax.swing.JFormattedTextField();
        lbIncorreto = new javax.swing.JLabel();
        lbCorreto = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        varTabela = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mbAlterarSenha = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo");
        setBackground(new java.awt.Color(204, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome:");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuário");

        lbNome.setForeground(new java.awt.Color(0, 0, 0));

        lbUser.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Jogador (a):");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(204, 0, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jogo");

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbTentativa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTentativa.setForeground(new java.awt.Color(0, 0, 0));
        lbTentativa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tentativas:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbTentativa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(lbTentativa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pnNivel.setBackground(new java.awt.Color(255, 255, 102));
        pnNivel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnNivel.setForeground(new java.awt.Color(255, 255, 102));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nivel:");

        rbFacil.setForeground(new java.awt.Color(0, 0, 0));
        rbFacil.setText("Fácill");

        rbMedio.setForeground(new java.awt.Color(0, 0, 0));
        rbMedio.setText("Médio");

        rbDificil.setForeground(new java.awt.Color(0, 0, 0));
        rbDificil.setText("Difícil");

        lbErroSelecionar.setForeground(new java.awt.Color(255, 0, 0));
        lbErroSelecionar.setText("Selecione um nível");

        javax.swing.GroupLayout pnNivelLayout = new javax.swing.GroupLayout(pnNivel);
        pnNivel.setLayout(pnNivelLayout);
        pnNivelLayout.setHorizontalGroup(
            pnNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNivelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnNivelLayout.createSequentialGroup()
                        .addGroup(pnNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFacil)
                            .addComponent(rbDificil)
                            .addComponent(rbMedio))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbErroSelecionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnNivelLayout.setVerticalGroup(
            pnNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbFacil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMedio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbDificil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbErroSelecionar)
                .addContainerGap())
        );

        btJogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/checkmark-verify-interface-symbol-button_icon-icons.com_73298.png"))); // NOI18N
        btJogar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btJogar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btJogarMouseClicked(evt);
            }
        });

        btReplay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/-replay_90563.png"))); // NOI18N
        btReplay.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btReplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btReplayMouseClicked(evt);
            }
        });

        btConficurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1904675-configuration-edit-gear-options-preferences-setting-settings_122525.png"))); // NOI18N
        btConficurar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btConficurar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btConficurarMouseClicked(evt);
            }
        });

        lbTxtNumero.setForeground(new java.awt.Color(0, 0, 0));
        lbTxtNumero.setText("Número:");

        varNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        lbIncorreto.setForeground(new java.awt.Color(255, 0, 0));
        lbIncorreto.setText("Numero Incorreto!!!");

        lbCorreto.setForeground(new java.awt.Color(0, 51, 0));
        lbCorreto.setText("Numero Correto!!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnNivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(91, 91, 91)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTxtNumero)
                            .addComponent(varNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIncorreto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCorreto, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btConficurar)
                                .addGap(18, 18, 18)
                                .addComponent(btReplay, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btJogar)))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lbTxtNumero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(varNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbIncorreto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbCorreto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(btConficurar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btReplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btJogar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(15, 15, 15))))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setForeground(new java.awt.Color(153, 153, 255));

        varTabela.setBackground(new java.awt.Color(255, 153, 255));
        varTabela.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        varTabela.setForeground(new java.awt.Color(0, 0, 0));
        varTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tentativa", "Numero certo", "Resultado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        varTabela.setShowVerticalLines(true);
        jScrollPane1.setViewportView(varTabela);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jMenu1.setText("Usuário");

        mbAlterarSenha.setText("Alterar senha");
        mbAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbAlterarSenhaActionPerformed(evt);
            }
        });
        jMenu1.add(mbAlterarSenha);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btJogarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btJogarMouseClicked
        String numero = varNumero.getText();
        if (jogabilidade(numero)) {
            lbCorreto.setVisible(true);
            lbIncorreto.setVisible(false);
            btJogar.setVisible(false);
            varNumero.setText("");
            resultado = "acertou";
            rodada = new Rodada(numeroCerto, quantRodada, resultado);
            rodada.setId_usuario(usuario.getId());
            try {
                rodadaDao.salvar(rodada);
                popularTabela(rodadaDao.mostrar());
            } catch (SQLException ex) {
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btJogarMouseClicked

    private void btReplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btReplayMouseClicked
        numeroCerto = (int) (Math.random() * 101);
        btConficurar.setVisible(true);
        pnNivel.setVisible(true);
        quantRodada = 0;
        btConficurar.setVisible(true);
        btReplay.setVisible(false);
        btJogar.setVisible(false);
        lbIncorreto.setVisible(false);
        lbCorreto.setVisible(false);
        varNumero.setVisible(false);
        lbTxtNumero.setVisible(false);
        btJogar.setVisible(false);
        tentativa = 0;
        lbTentativa.setText(String.valueOf(tentativa));
        System.out.println(numeroCerto);
    }//GEN-LAST:event_btReplayMouseClicked

    private void btConficurarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btConficurarMouseClicked
        if (rbFacil.isSelected() == true && rbDificil.isSelected() == true
                && rbMedio.isSelected() == true) {
            lbErroSelecionar.setVisible(true);
            tentativa = 0;
            lbTentativa.setText(String.valueOf(tentativa));

        } else if (rbFacil.isSelected() == false && rbDificil.isSelected() == false
                && rbMedio.isSelected() == false) {
            lbErroSelecionar.setVisible(true);
            tentativa = 0;
            lbTentativa.setText(String.valueOf(tentativa));

        } else if (rbFacil.isSelected() == true && rbMedio.isSelected() == true) {
            lbErroSelecionar.setVisible(true);
            tentativa = 0;
            lbTentativa.setText(String.valueOf(tentativa));

        } else if (rbFacil.isSelected() == true && rbDificil.isSelected() == true) {
            lbErroSelecionar.setVisible(true);
            tentativa = 0;
            lbTentativa.setText(String.valueOf(tentativa));

        } else if (rbMedio.isSelected() == true && rbDificil.isSelected() == true) {
            lbErroSelecionar.setVisible(true);
            tentativa = 0;
            lbTentativa.setText(String.valueOf(tentativa));

        } else if (rbFacil.isSelected() == true) {
            lbErroSelecionar.setVisible(false);
            tentativa = 10;
            lbTentativa.setText(String.valueOf(tentativa));
            btJogar.setVisible(true);
            btReplay.setVisible(true);
            varNumero.setVisible(true);
            lbTxtNumero.setVisible(true);
            btConficurar.setVisible(false);
            pnNivel.setVisible(false);

        } else if (rbMedio.isSelected() == true) {
            lbErroSelecionar.setVisible(false);
            tentativa = 5;
            lbTentativa.setText(String.valueOf(tentativa));
            btJogar.setVisible(true);
            btReplay.setVisible(true);
            varNumero.setVisible(true);
            lbTxtNumero.setVisible(true);
            btConficurar.setVisible(false);
            pnNivel.setVisible(false);

        } else if (rbDificil.isSelected() == true) {
            lbErroSelecionar.setVisible(false);
            tentativa = 4;
            lbTentativa.setText(String.valueOf(tentativa));
            btJogar.setVisible(true);
            btReplay.setVisible(true);
            varNumero.setVisible(true);
            lbTxtNumero.setVisible(true);
            btConficurar.setVisible(false);
            pnNivel.setVisible(false);
        }
        rbFacil.setSelected(false);
        rbMedio.setSelected(false);
        rbDificil.setSelected(false);


    }//GEN-LAST:event_btConficurarMouseClicked

    private void mbAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbAlterarSenhaActionPerformed
        new AlterarSenha(usuario).setVisible(true);
    }//GEN-LAST:event_mbAlterarSenhaActionPerformed

    private boolean jogabilidade(String numero) {
        if (!numero.equals(String.valueOf(numeroCerto))) {
            lbIncorreto.setVisible(true);
            tentativa -= 1;
            quantRodada += 1;
            lbTentativa.setText(String.valueOf(tentativa));
            varNumero.setText("");
            if (tentativa.equals(0)) {
                btJogar.setVisible(false);
                resultado = "game over";
                rodada = new Rodada(numeroCerto, quantRodada, resultado);
                rodada.setId_usuario(usuario.getId());
                try {
                    rodadaDao.salvar(rodada);
                    popularTabela(rodadaDao.mostrar());
                } catch (SQLException ex) {
                    Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            return false;
        }
        return true;
    }

    public void popularTabela(List<Rodada> rodadas) {
        tabelaModelo = (DefaultTableModel) varTabela.getModel();
        tabelaModelo.setNumRows(0);
        String numeroCerto;
        String tentativa;
        String resul;
        for (Rodada rodada : rodadas) {
            numeroCerto = Integer.toString(rodada.getNumero_certo());
            tentativa = Integer.toString(rodada.getTentativa());
            resul = rodada.getResultado();

            tabelaModelo.addRow(new Object[]{tentativa, numeroCerto, resul});
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btConficurar;
    private javax.swing.JLabel btJogar;
    private javax.swing.JLabel btReplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCorreto;
    private javax.swing.JLabel lbErroSelecionar;
    private javax.swing.JLabel lbIncorreto;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbTentativa;
    private javax.swing.JLabel lbTxtNumero;
    private javax.swing.JLabel lbUser;
    private javax.swing.JMenuItem mbAlterarSenha;
    private javax.swing.JPanel pnNivel;
    private javax.swing.JRadioButton rbDificil;
    private javax.swing.JRadioButton rbFacil;
    private javax.swing.JRadioButton rbMedio;
    private javax.swing.JFormattedTextField varNumero;
    private javax.swing.JTable varTabela;
    // End of variables declaration//GEN-END:variables
}
