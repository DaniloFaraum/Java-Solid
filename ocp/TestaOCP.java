package ocp;

public class TestaOCP {
	public static void main(String[] args) {
		Fatura fatura = new Fatura(); 
		Persistencia persistencia = getPersistencia(args[0]);
		persistencia.persistir(fatura);
	}

	private static Persistencia getPersistencia(String tipo) {
		// TODO Auto-generated method stub
		
/*		switch (tipo) {
		case "csv" : return new PersistenciaCSV();
		case "bd" : return new PersistenciaBD();
		default: throw new IllegalArgumentException();
		}*/
		try {
			Persistencia p = (Persistencia) Class.forName("ocp.Persistencia"+tipo.toUpperCase()).newInstance();
			return p;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
