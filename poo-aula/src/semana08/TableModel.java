package semana08;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.text.DecimalFormat;
import java.util.Vector;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableModel
{
	private static DefaultTableModel tableModel;

	public static DefaultTableModel getModel(BD bd, String sql) {
		try 
		{
			Vector<String> cabecalho = new Vector<String>();
			Vector<Vector<String>> linhas = new Vector<Vector<String>>();
			bd.preparedStatement = bd.connection.prepareStatement(sql);
			bd.resultSet = bd.preparedStatement.executeQuery();
			bd.resultSet.next();
			// busca os cabecalhos 
			ResultSetMetaData rsmd = bd.resultSet.getMetaData();
			for ( int i = 1; i <= rsmd.getColumnCount(); i++ ) 
				cabecalho.addElement( rsmd.getColumnName( i ) );
	
			// busca dados das linhas
			do 
			{
				Vector<String> linhaAtual = new Vector<String>();
				DecimalFormat df = new DecimalFormat("R$ 00.00");
				for ( int i = 1; i <= rsmd.getColumnCount(); i++ )
				{
					switch( rsmd.getColumnType(i)) 
					{
					case Types.VARCHAR:
						linhaAtual.addElement(bd.resultSet.getString(i));break;
					case Types.CHAR:
						linhaAtual.addElement(bd.resultSet.getString(i));break;
					case Types.TIMESTAMP:
						linhaAtual.addElement(""+bd.resultSet.getDate(i));break;
					case Types.DOUBLE:
						linhaAtual.addElement(""+bd.resultSet.getDouble(i));break;
					case Types.INTEGER:
						linhaAtual.addElement(""+bd.resultSet.getInt(i));break;
					case Types.NUMERIC:
						linhaAtual.addElement(""+df.format(bd.resultSet.getDouble(i)));break;
					case Types.SMALLINT:
						linhaAtual.addElement(""+bd.resultSet.getInt(i));break;
	//					default:System.out.println(rsmd.getColumnType(i));   
					}
				}
				linhas.addElement(linhaAtual);     
			} 
			while (bd.resultSet.next());       

			tableModel = new DefaultTableModel(linhas,cabecalho);
		}
		catch (SQLException erro) 
		{ 
			System.out.println(erro.toString());
			return null;
		}
		return tableModel;
	}
}


