package br.com.caelum.tarefas.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.caelum.tarefas.conn.Conexao;

public class JdbcTarefaDao {

	private Conexao conexao = new Conexao();
	private Connection conn;
	
	
	public void adiciona(Tarefa tarefa) {
		
		conn = conexao.getConn();
		
		String sql = "insert into formulario values(?)";
		
		try {
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setString(1, tarefa.getDescricao());
			
			stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
