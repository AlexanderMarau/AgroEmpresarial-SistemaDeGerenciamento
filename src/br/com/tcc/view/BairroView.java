/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tcc.view;

import br.com.tcc.entity.Cidade;
import br.com.tcc.entity.Bairro;
import br.com.tcc.util.EntityManagerUtil;
import br.com.tcc.view.*;
import br.com.tcc.util.Uteis;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class BairroView extends javax.swing.JFrame {

    Boolean editando;  // Variavel global responsavel pela ativações dos componentes da classe(ex: botões, tabelas e campos).

    /**
     * Método construtor 
     * editando = false - responsável por desativar componentes
     * trataEdicao() - responsável por determinar quais componente podem ser editado
     */
    public BairroView() {
        this.setExtendedState(MAXIMIZED_BOTH );
        initComponents();
        editando = false;
        trataEdicao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = EntityManagerUtil.getEntityManager();
        bairroQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT b FROM Bairro b");
        bairroList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(bairroQuery.getResultList());
        cidadeQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("FROM Cidade order by nome");
        cidadeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(cidadeQuery.getResultList());
        jPanel1 = new javax.swing.JPanel();
        btnPrimeiro = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        abas = new javax.swing.JTabbedPane();
        tabLista = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxOrdem = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        txtFiltro = new javax.swing.JTextField();
        btnFiltrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblObjetos = new javax.swing.JTable();
        tabDados = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxCidade = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manutenção de Bairros");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrimeiro);

        btnAnterior.setText("<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior);

        btnProximo.setText(">");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProximo);

        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });
        jPanel1.add(btnUltimo);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        jPanel1.add(btnFechar);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        abas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                abasStateChanged(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro e Ordenação"));

        jLabel1.setText("Ordem:");

        cbxOrdem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Bairro", "Cidade" }));
        cbxOrdem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbxOrdemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbxOrdemFocusLost(evt);
            }
        });
        cbxOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrdemActionPerformed(evt);
            }
        });

        jLabel2.setText("Filtro:");

        txtFiltro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtFiltroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFiltroFocusLost(evt);
            }
        });
        txtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiltroActionPerformed(evt);
            }
        });
        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFiltroKeyPressed(evt);
            }
        });

        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFiltrar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnFiltrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, bairroList, tblObjetos);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Código");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCidade.nome}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane2.setViewportView(tblObjetos);

        javax.swing.GroupLayout tabListaLayout = new javax.swing.GroupLayout(tabLista);
        tabLista.setLayout(tabListaLayout);
        tabListaLayout.setHorizontalGroup(
            tabListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabListaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tabListaLayout.setVerticalGroup(
            tabListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        abas.addTab("Lista", tabLista);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel3.add(btnNovo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditar);

        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        jPanel3.add(btnGravar);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCancelar);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel3.add(btnExcluir);

        jLabel3.setText("Código:");

        jLabel4.setText("Bairro:");

        txtCodigo.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblObjetos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.id}"), txtCodigo, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblObjetos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nome}"), txtDescricao, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusLost(evt);
            }
        });
        txtDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescricaoKeyTyped(evt);
            }
        });

        jLabel5.setText("Cidade:");

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cidadeList, cbxCidade);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, tblObjetos, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idCidade}"), cbxCidade, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout tabDadosLayout = new javax.swing.GroupLayout(tabDados);
        tabDados.setLayout(tabDadosLayout);
        tabDadosLayout.setHorizontalGroup(
            tabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tabDadosLayout.createSequentialGroup()
                        .addGroup(tabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(tabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao)
                            .addGroup(tabDadosLayout.createSequentialGroup()
                                .addGroup(tabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        tabDadosLayout.setVerticalGroup(
            tabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(tabDadosLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel4))
                    .addGroup(tabDadosLayout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(tabDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        abas.addTab("Dados", tabDados);

        getContentPane().add(abas, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Evento responsável por fechar o sistema
     * @param evt 
     */
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        Document documento = new Document();
        try {
            OutputStream outputStream = new FileOutputStream("C:\\Users\\Leonardo P Souza\\Desktop\\Relat\\Registro Bairros.pdf");
            PdfWriter.getInstance(documento, outputStream);
            documento.open();
            Font fonte = new Font(Font.FontFamily.TIMES_ROMAN, 36, Font.BOLD);
            Paragraph paragrafo = new Paragraph("Relatório da Bairro", fonte);
            paragrafo.setAlignment(Element.ALIGN_CENTER);
            documento.add(paragrafo);
            Paragraph paragrafoLista = new Paragraph(bairroList.toString());
            documento.add(paragrafoLista);
            documento.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MovimentoVendaView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(MovimentoVendaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    /**
     * Evento responsável por adicionar um novo objeto numa List
     * @param evt 
     */
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        bairroList.add((Bairro) new Bairro());
        int row = bairroList.size() - 1;
        tblObjetos.setRowSelectionInterval(row, row);
        editando = true;
        trataEdicao();
        txtDescricao.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    /**
     * Evento responsável por persistir um objeto no banco
     * @param evt 
     */
    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        if (validaCampos()) {
            try {
                int linhaClicada = tblObjetos.getSelectedRow();
                Bairro obj = bairroList.get(linhaClicada);
                entityManager.getTransaction().begin();
                entityManager.persist(obj);
                entityManager.getTransaction().commit();
                editando = false;
                trataEdicao();
                atualizaGrid();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Gravar \n" + e.getMessage());
                if (entityManager.getTransaction().isActive() == false) {
                    entityManager.getTransaction().begin();
                }
                entityManager.getTransaction().rollback();
                editando = false;
                trataEdicao();
                atualizaGrid();

            }
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    /**
     * Evento responsável por editar um objeto selecionado 
     * @param evt 
     */
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linhaClicada = tblObjetos.getSelectedRow();
        if (linhaClicada < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro para Editar");
        } else {
            editando = true;
            trataEdicao();
            txtDescricao.requestFocus();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        editando = false;
        trataEdicao();
        atualizaGrid();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * Evento responsável por remover um objeto 
     * @param evt 
     */
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(Uteis.confirmar("Confirma Exclução?")){
        int linhaClicada = tblObjetos.getSelectedRow();
        if (linhaClicada < 0) {
            JOptionPane.showMessageDialog(null, "Selecione um registro para excluir");
        } else {
            try {
                Bairro obj = bairroList.get(linhaClicada);
                entityManager.getTransaction().begin();
                entityManager.remove(obj);
                entityManager.getTransaction().commit();
                atualizaGrid();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao Excluir \n" + e.getMessage());
                if (entityManager.getTransaction().isActive() == false) {
                    entityManager.getTransaction().begin();
                }
                entityManager.getTransaction().rollback();
            }
        }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * Evento responsável por apontar o 1º registro do banco
     * @param evt 
     */
    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed
        tblObjetos.setRowSelectionInterval(0, 0);
        tblObjetos.scrollRectToVisible(tblObjetos.getCellRect(0, 0, true));
    }//GEN-LAST:event_btnPrimeiroActionPerformed

    /**
     * Evento responsável por anteceder um registro
     * @param evt 
     */
    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        int linha = tblObjetos.getSelectedRow();
        if((linha -1) >= 0){
            linha--;
        }
        tblObjetos.setRowSelectionInterval(linha, linha);
        tblObjetos.scrollRectToVisible(tblObjetos.getCellRect(linha, linha, true));
    }//GEN-LAST:event_btnAnteriorActionPerformed

    /**
     * Evento responsável por avançar um registro
     * @param evt 
     */
    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        int linha = tblObjetos.getSelectedRow();
        if((linha + 1) <= (tblObjetos.getRowCount() - 1)){
            linha++;
        }
        tblObjetos.setRowSelectionInterval(linha, linha);
        tblObjetos.scrollRectToVisible(tblObjetos.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnProximoActionPerformed

    /**
     * Evento responsável por apontar o ultimo registro 
     * @param evt 
     */
    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        int linha = tblObjetos.getRowCount() - 1;
        tblObjetos.setRowSelectionInterval(linha, linha);
        tblObjetos.scrollRectToVisible(tblObjetos.getCellRect(linha, 0, true));
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void cbxOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrdemActionPerformed
        atualizaGrid();
    }//GEN-LAST:event_cbxOrdemActionPerformed

    private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
//        atualizaGrid();
    }//GEN-LAST:event_txtFiltroActionPerformed

    private void abasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_abasStateChanged
        atualizaGrid();
    }//GEN-LAST:event_abasStateChanged

    private void txtFiltroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyPressed
//        atualizaGrid();
    }//GEN-LAST:event_txtFiltroKeyPressed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        atualizaGrid();
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void txtDescricaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyTyped
        Uteis.limitaTamanhoCampo(evt, 50);
    }//GEN-LAST:event_txtDescricaoKeyTyped

    private void txtDescricaoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusGained
        Uteis.entraCampo(evt);
    }//GEN-LAST:event_txtDescricaoFocusGained

    private void txtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusLost
        Uteis.saiCampo(evt);
    }//GEN-LAST:event_txtDescricaoFocusLost

    private void txtFiltroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroFocusGained
        Uteis.entraCampo(evt);
    }//GEN-LAST:event_txtFiltroFocusGained

    private void txtFiltroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFiltroFocusLost
        Uteis.saiCampo(evt);
    }//GEN-LAST:event_txtFiltroFocusLost

    private void cbxOrdemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxOrdemFocusGained
        Uteis.entraCampo(evt);
    }//GEN-LAST:event_cbxOrdemFocusGained

    private void cbxOrdemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxOrdemFocusLost
        Uteis.saiCampo(evt);
    }//GEN-LAST:event_cbxOrdemFocusLost

    private void txtDescricaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoKeyReleased
        bairroQuery = entityManager.createNamedQuery("Bairro.findByNome");
                bairroQuery.setParameter("nome", txtDescricao.getText());
                List<Bairro> verifica = bairroQuery.getResultList();
                if (verifica.size() > 0) {
                    btnGravar.setEnabled(false);
                    txtDescricao.setBackground(Color.red);
                } else {
                    btnGravar.setEnabled(true);
                    txtDescricao.setBackground(Color.lightGray);
                    
                }
    }//GEN-LAST:event_txtDescricaoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abas;
    private java.util.List<br.com.tcc.entity.Bairro> bairroList;
    private javax.persistence.Query bairroQuery;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JComboBox cbxCidade;
    private javax.swing.JComboBox cbxOrdem;
    private java.util.List<br.com.tcc.entity.Cidade> cidadeList;
    private javax.persistence.Query cidadeQuery;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel tabDados;
    private javax.swing.JPanel tabLista;
    private javax.swing.JTable tblObjetos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtFiltro;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

/**
 * Método de atualização de Grid
 * Responsável por fazer a consulta e ordenação dos registros no banco
 */
    private void atualizaGrid() {
        String sql = "from Bairro";
        String ordem = "";
        if (cbxOrdem.getSelectedItem().toString().equals("Código")) {
            ordem = "id";
        } else if (cbxOrdem.getSelectedItem().toString().equals("Bairro")) {
            ordem = "nome";
        } else if (cbxOrdem.getSelectedItem().toString().equals("Cidade")) {
            ordem = "idCidade.nome";
        }
        String filtro = txtFiltro.getText();
        if (filtro.length() > 0 && filtro != null) {
            sql += " where upper(" + ordem + ") like '" + filtro.toUpperCase() + "%' ";
        }
//        sql += " order by " + "p.id desc";
        sql += " order by " + ordem;
        System.out.println("SQL Gerado: " + sql);
        bairroQuery = entityManager.createQuery(sql);
        bairroList.clear();
        bairroList.addAll(bairroQuery.getResultList());
        int row = bairroList.size() - 1;
        if (row >= 0) {
        tblObjetos.setRowSelectionInterval(row, row);
        tblObjetos.scrollRectToVisible(tblObjetos.getCellRect(row, row, true));
        }
    }

    /**
     * Método que trata as edições de quais campos ficam abalitados
     */
    private void trataEdicao() {
        // botões e campos de filtro
        btnCancelar.setEnabled(editando);
        btnGravar.setEnabled(editando);
        btnEditar.setEnabled(!editando);
        btnExcluir.setEnabled(!editando);
        btnNovo.setEnabled(!editando);
        btnFechar.setEnabled(!editando);
        btnPrimeiro.setEnabled(!editando);
        btnAnterior.setEnabled(!editando);
        btnProximo.setEnabled(!editando);
        btnUltimo.setEnabled(!editando);
        cbxOrdem.setEnabled(!editando);
        txtFiltro.setEnabled(!editando);
        tblObjetos.setEnabled(!editando);

        // compos do formulario
        txtDescricao.setEnabled(editando);
        cbxCidade.setEnabled(editando);
    }

    /**
     * Método que valida o campos de preenchimento de formulário
     * @return 
     */
    private boolean validaCampos() {
        if (!(txtDescricao.getText().length() > 0 && txtDescricao.getText() != null)) {
            JOptionPane.showMessageDialog(null, "Descricão deve ser informado");
            txtDescricao.requestFocus();
            return false;
            
        }
        if(cbxCidade.getSelectedIndex() < 0){
                JOptionPane.showMessageDialog(null, "Selecione uma cidade");
                cbxCidade.requestFocus();
            return false;
            }
        return true;
    }
    
}