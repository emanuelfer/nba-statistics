/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.ControllerEquipe;
import controllers.ControllerEstatistica;
import controllers.ControllerJogador;
import controllers.ControllerPartida;
import java.awt.Color;
import java.util.ArrayList;
import models.Equipe;
import models.EstatisticaJogador;
import models.Jogador;
import models.Partida;

/**
 *
 * @author emanu
 */
public class TelaBuscarJogador extends javax.swing.JInternalFrame {
    private MainFrame desktop;
    /**
     * Creates new form TelaCadastrarParida
     */
    public TelaBuscarJogador(MainFrame desktop) {
        initComponents();
        this.desktop = desktop;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCpf = new javax.swing.JTextField();
        btnBuscarJogador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPosicao = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JLabel();
        txtAltura = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPontos = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRebotes = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtAssistencias = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtRoubadas = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTocos = new javax.swing.JLabel();
        txtTurnovers = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnBuscarJogador1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtTocos1 = new javax.swing.JLabel();
        txtTurnovers1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNome1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPosicao1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtIdade1 = new javax.swing.JLabel();
        txtAltura1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtPeso1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPontos1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtRebotes1 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtAssistencias1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtRoubadas1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtCpf1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtNumPartidas = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtNumPartidas1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Partida");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 40, 172, -1));

        btnBuscarJogador.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarJogador.setText("Buscar");
        btnBuscarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarJogadorActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 39, -1, 20));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("CPF:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 99, -1, -1));

        txtNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNome.setText("None");
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 99, 136, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Posição:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 127, -1, -1));

        txtPosicao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPosicao.setText("None");
        getContentPane().add(txtPosicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 127, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Idade:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 155, -1, -1));

        txtIdade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIdade.setText("None");
        getContentPane().add(txtIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 155, -1, -1));

        txtAltura.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAltura.setText("None");
        getContentPane().add(txtAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 183, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Altura:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 183, -1, -1));

        txtPeso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPeso.setText("None");
        getContentPane().add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 212, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Peso:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 212, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel4.setText("X");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 11, -1, -1));

        txtPontos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPontos.setText("None");
        getContentPane().add(txtPontos, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 268, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Pontos:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 268, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Rebotes:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 296, -1, -1));

        txtRebotes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRebotes.setText("None");
        getContentPane().add(txtRebotes, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 296, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Assistências:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 324, -1, -1));

        txtAssistencias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAssistencias.setText("None");
        getContentPane().add(txtAssistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 324, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Roubadas:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 352, -1, -1));

        txtRoubadas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRoubadas.setText("None");
        getContentPane().add(txtRoubadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 352, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Tocos:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 380, -1, -1));

        txtTocos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTocos.setText("None");
        getContentPane().add(txtTocos, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 380, -1, -1));

        txtTurnovers.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTurnovers.setText("None");
        getContentPane().add(txtTurnovers, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 408, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Turnovers:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 408, -1, -1));

        btnBuscarJogador1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscarJogador1.setText("Buscar");
        btnBuscarJogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarJogador1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarJogador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 39, -1, 20));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("CPF:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 11, -1, -1));

        txtTocos1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTocos1.setText("None");
        getContentPane().add(txtTocos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 380, -1, -1));

        txtTurnovers1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTurnovers1.setText("None");
        getContentPane().add(txtTurnovers1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 408, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Turnovers:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 408, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 99, -1, -1));

        txtNome1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNome1.setText("None");
        getContentPane().add(txtNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 99, 136, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Posição:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 127, -1, -1));

        txtPosicao1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPosicao1.setText("None");
        getContentPane().add(txtPosicao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(493, 127, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Idade:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 155, -1, -1));

        txtIdade1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtIdade1.setText("None");
        getContentPane().add(txtIdade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 155, -1, -1));

        txtAltura1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAltura1.setText("None");
        getContentPane().add(txtAltura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 183, -1, -1));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Altura:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 183, -1, -1));

        txtPeso1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPeso1.setText("None");
        getContentPane().add(txtPeso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 212, -1, -1));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Peso:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 212, -1, -1));

        txtPontos1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtPontos1.setText("None");
        getContentPane().add(txtPontos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 268, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Pontos:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 268, -1, -1));

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setText("Rebotes:");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 296, -1, -1));

        txtRebotes1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRebotes1.setText("None");
        getContentPane().add(txtRebotes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 296, -1, -1));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel23.setText("Assistências:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 324, -1, -1));

        txtAssistencias1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAssistencias1.setText("None");
        getContentPane().add(txtAssistencias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 324, -1, -1));

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("Roubadas:");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 352, -1, -1));

        txtRoubadas1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtRoubadas1.setText("None");
        getContentPane().add(txtRoubadas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 352, -1, -1));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel25.setText("Tocos:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 380, -1, -1));
        getContentPane().add(txtCpf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 40, 172, -1));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setText("N. Partidas:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 71, -1, -1));

        txtNumPartidas.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNumPartidas.setText("None");
        getContentPane().add(txtNumPartidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 71, 136, -1));

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setText("N. Partidas:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 71, -1, -1));

        txtNumPartidas1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNumPartidas1.setText("None");
        getContentPane().add(txtNumPartidas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 71, 136, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setText("Médias por jogo:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 240, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setText("Médias por jogo:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarJogadorActionPerformed
        ControllerJogador cj = new ControllerJogador();
        String cpf = txtCpf.getText();
        Jogador jogador = cj.getJogadorByCpf(cpf);
        txtNome.setText(jogador.getNome());
        txtPosicao.setText(jogador.getPosicao());
        txtIdade.setText(jogador.getIdade().toString() + " anos");
        txtAltura.setText(jogador.getAltura().toString() + " cm");
        txtPeso.setText(jogador.getPeso().toString() + " kg");
        
        ControllerEstatistica ce = new ControllerEstatistica();
        EstatisticaJogador ej = ce.getEstatisticaJogador(jogador);
        System.out.println(ej.getPontos());
        
        Integer numPartidas = ej.getNumPartidas();
        Double mediaPontos = (ej.getPontos().doubleValue()/numPartidas.doubleValue());
        Double mediaRebotes = (ej.getRebotes().doubleValue()/numPartidas.doubleValue());
        Double mediaAssistencias = (ej.getAssistencias().doubleValue()/numPartidas.doubleValue());
        Double mediaRoubadas = (ej.getRoubadas().doubleValue()/numPartidas.doubleValue());
        Double mediaTocos = (ej.getTocos().doubleValue()/numPartidas.doubleValue());
        Double mediaTurnovers = (ej.getTurnovers().doubleValue()/numPartidas.doubleValue());
        
        
        txtNumPartidas.setText(ej.getNumPartidas().toString());
        txtPontos.setText((mediaPontos).toString());
        txtRebotes.setText(mediaRebotes.toString());
        txtAssistencias.setText(mediaAssistencias.toString());
        txtRoubadas.setText(mediaRoubadas.toString());
        txtTocos.setText(mediaTocos.toString());
        txtTurnovers.setText(mediaTurnovers.toString());
        this.changeColor();
    }//GEN-LAST:event_btnBuscarJogadorActionPerformed

    private void btnBuscarJogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarJogador1ActionPerformed
        // TODO add your handling code here:
        ControllerJogador cj = new ControllerJogador();
        String cpf = txtCpf1.getText();
        Jogador jogador = cj.getJogadorByCpf(cpf);
        txtNome1.setText(jogador.getNome());
        txtPosicao1.setText(jogador.getPosicao());
        txtIdade1.setText(jogador.getIdade().toString() + " anos");
        txtAltura1.setText(jogador.getAltura().toString() + " cm");
        txtPeso1.setText(jogador.getPeso().toString() + " kg");
        
        ControllerEstatistica ce = new ControllerEstatistica();
        EstatisticaJogador ej = ce.getEstatisticaJogador(jogador);
        System.out.println(ej.getPontos());
        
        Integer numPartidas = ej.getNumPartidas();
        Double mediaPontos = (ej.getPontos().doubleValue()/numPartidas.doubleValue());
        Double mediaRebotes = (ej.getRebotes().doubleValue()/numPartidas.doubleValue());
        Double mediaAssistencias = (ej.getAssistencias().doubleValue()/numPartidas.doubleValue());
        Double mediaRoubadas = (ej.getRoubadas().doubleValue()/numPartidas.doubleValue());
        Double mediaTocos = (ej.getTocos().doubleValue()/numPartidas.doubleValue());
        Double mediaTurnovers = (ej.getTurnovers().doubleValue()/numPartidas.doubleValue());
        
        
        txtNumPartidas1.setText(ej.getNumPartidas().toString());
        txtPontos1.setText((mediaPontos).toString());
        txtRebotes1.setText(mediaRebotes.toString());
        txtAssistencias1.setText(mediaAssistencias.toString());
        txtRoubadas1.setText(mediaRoubadas.toString());
        txtTocos1.setText(mediaTocos.toString());
        txtTurnovers1.setText(mediaTurnovers.toString());
        this.changeColor();
    }//GEN-LAST:event_btnBuscarJogador1ActionPerformed
    
    public void changeColor(){
        
        if(Double.parseDouble(txtPontos.getText()) > Double.parseDouble(txtPontos1.getText())){
            txtPontos.setForeground(Color.GREEN);
            txtPontos1.setForeground(Color.red);
        }else if(Double.parseDouble(txtPontos.getText()) < Double.parseDouble(txtPontos1.getText())){
            txtPontos.setForeground(Color.red);
            txtPontos1.setForeground(Color.GREEN);
        }
        
        if(Double.parseDouble(txtRebotes.getText()) > Double.parseDouble(txtRebotes1.getText())){
            txtRebotes.setForeground(Color.GREEN);
            txtRebotes1.setForeground(Color.red);
        }else if(Double.parseDouble(txtRebotes.getText()) < Double.parseDouble(txtRebotes1.getText())){
            txtRebotes.setForeground(Color.red);
            txtRebotes1.setForeground(Color.GREEN);
        }
        
        if(Double.parseDouble(txtRoubadas.getText()) > Double.parseDouble(txtRoubadas1.getText())){
            txtRoubadas.setForeground(Color.GREEN);
            txtRoubadas1.setForeground(Color.red);
        }else if(Double.parseDouble(txtRoubadas.getText()) < Double.parseDouble(txtRoubadas1.getText())){
            txtRoubadas.setForeground(Color.red);
            txtRoubadas1.setForeground(Color.GREEN);
        }
        
        if(Double.parseDouble(txtAssistencias.getText()) > Double.parseDouble(txtAssistencias1.getText())){
            txtAssistencias.setForeground(Color.GREEN);
            txtAssistencias1.setForeground(Color.red);
        }else if(Double.parseDouble(txtAssistencias.getText()) < Double.parseDouble(txtAssistencias1.getText())){
            txtAssistencias.setForeground(Color.red);
            txtAssistencias1.setForeground(Color.GREEN);
        }
        
        if(Double.parseDouble(txtTocos.getText()) > Double.parseDouble(txtTocos1.getText())){
            txtTocos.setForeground(Color.GREEN);
            txtTocos1.setForeground(Color.red);
        }else if(Double.parseDouble(txtTocos.getText()) < Double.parseDouble(txtTocos1.getText())){
            txtTocos.setForeground(Color.red);
            txtTocos1.setForeground(Color.GREEN);
        }
        
        if(Double.parseDouble(txtTurnovers.getText()) < Double.parseDouble(txtTurnovers1.getText())){
            txtTurnovers.setForeground(Color.GREEN);
            txtTurnovers1.setForeground(Color.red);
        }else if(Double.parseDouble(txtTurnovers.getText()) > Double.parseDouble(txtTurnovers1.getText())){
            txtTurnovers.setForeground(Color.red);
            txtTurnovers1.setForeground(Color.GREEN);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarJogador;
    private javax.swing.JButton btnBuscarJogador1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel txtAltura;
    private javax.swing.JLabel txtAltura1;
    private javax.swing.JLabel txtAssistencias;
    private javax.swing.JLabel txtAssistencias1;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCpf1;
    private javax.swing.JLabel txtIdade;
    private javax.swing.JLabel txtIdade1;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNome1;
    private javax.swing.JLabel txtNumPartidas;
    private javax.swing.JLabel txtNumPartidas1;
    private javax.swing.JLabel txtPeso;
    private javax.swing.JLabel txtPeso1;
    private javax.swing.JLabel txtPontos;
    private javax.swing.JLabel txtPontos1;
    private javax.swing.JLabel txtPosicao;
    private javax.swing.JLabel txtPosicao1;
    private javax.swing.JLabel txtRebotes;
    private javax.swing.JLabel txtRebotes1;
    private javax.swing.JLabel txtRoubadas;
    private javax.swing.JLabel txtRoubadas1;
    private javax.swing.JLabel txtTocos;
    private javax.swing.JLabel txtTocos1;
    private javax.swing.JLabel txtTurnovers;
    private javax.swing.JLabel txtTurnovers1;
    // End of variables declaration//GEN-END:variables
}