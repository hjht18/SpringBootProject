package springbook.user.domain;

public class DAOFactory {
	public UserDAO userDAO() {
		
		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDAO userDAO = new UserDAO(connectionMaker);
		
		return userDAO;
	}
}
