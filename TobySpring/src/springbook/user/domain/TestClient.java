package springbook.user.domain;

import java.sql.SQLException;

public class TestClient {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		UserDAO dao = new UserDAO();
		
		User user = new User();
		user.setId("whiteShip");
		user.setName("백기선");
		user.setPassword("married");
		
		dao.add(user);
		
		System.out.println(user.getId() + " 등록 성공!");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		
		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + " 조회 성공");
	}
}
