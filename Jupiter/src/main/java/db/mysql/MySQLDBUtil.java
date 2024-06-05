package db.mysql;

public class MySQLDBUtil {
	private static final String HOSTNAME = "localhost"; //hostname and ip address serve same function
	private static final String PORT_NUM = "3306"; // change it to your mysql port number (originally 8889)
	public static final String DB_NAME = "innovationai";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	public static final String URL = "jdbc:mysql://"
			+ HOSTNAME + ":" + PORT_NUM + "/" + DB_NAME
			+ "?user=" + USERNAME + "&password=" + PASSWORD
			+ "&autoReconnect=true&serverTimezone=UTC";
}
