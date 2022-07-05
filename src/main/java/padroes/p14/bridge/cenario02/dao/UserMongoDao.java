package padroes.p14.bridge.cenario02.dao;

import padroes.p14.bridge.cenario02.model.User;

public class UserMongoDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Mongo Database!");
	}
}
