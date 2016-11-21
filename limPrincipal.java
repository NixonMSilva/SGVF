/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Limites;
import Controles.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author pedrosg
 */
public class limPrincipal extends JFrame implements ActionListener{

    JPanel painelProduto, painelCliente, painelPrincipal, painelVenda,painelConsulta;
    JButton btnCliente, btnProduto, btnAtualiza, btnVenda, btnConsulta;
    ControlePrincipal ctrPrincipal;
    
    public limPrincipal(ControlePrincipal pCtrPrincipal){
        
        super("Trabalho Final");
        
        ctrPrincipal = pCtrPrincipal;
        
        //Criacao dos paineis
        painelPrincipal = new JPanel(new GridLayout(5,1));
        painelProduto = new JPanel();
        painelProduto.setLayout(new FlowLayout());
        painelCliente = new JPanel();
        painelVenda = new JPanel();
        painelConsulta = new JPanel();
        
        //Criancao dos botoes
        btnProduto = new JButton("Cadastra Produto");
        btnCliente = new JButton("Cadastra Cliente");
        btnAtualiza = new JButton("Atualiza Estoque");
        btnVenda = new JButton("Vender Produto");
        btnConsulta = new JButton("Consultar");
    
        //adicao dos ActionListener
        btnProduto.addActionListener(this);
        btnCliente.addActionListener(this);
        btnAtualiza.addActionListener(this);
        btnVenda.addActionListener(this);
        btnConsulta.addActionListener(this);
        
        //adicao dos botoes aos paineis respectivos
        painelProduto.add(btnProduto);
        painelProduto.add(btnAtualiza);
        painelCliente.add(btnCliente);
        painelVenda.add(btnVenda);
        painelConsulta.add(btnConsulta);
        
        //PAINEL PRINCIPAL
        painelPrincipal.add(painelProduto);
        painelPrincipal.add(painelCliente);
        painelPrincipal.add(painelVenda);
        painelPrincipal.add(painelConsulta);
        
        //Frame Principal
        this.add(painelPrincipal);
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);  
        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnProduto)){
            ctrPrincipal.getCtrMercadoria().criaJanelaMercadoria();
        } else if(e.getSource().equals(btnCliente)){
            ctrPrincipal.getCtrCliente().criaJanelaCliente();
        } else if(e.getSource().equals(btnAtualiza)){
            
        } else if(e.getSource().equals(btnVenda)){
            
        } else if(e.getSource().equals(btnConsulta)){
            
        }
    }
    
}
