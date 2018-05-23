package rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.aplose.smooss.model.User;

@Path("user")
public class UserRS {

	HashMap<Long, User> users = new HashMap<>();

	public UserRS() {
		User u1 = new User();
		u1.setFirstName("soso");
		u1.setLastName("sisi");
		u1.setEmail("so@gmail.com");
		u1.setNickName("Sonja!");
		u1.setPassword("olaola");
		u1.setId(1);
		users.put(u1.getId(), u1);
		User u2 = new User();
		u2.setFirstName("romain");
		u2.setLastName("rolland");
		u2.setEmail("ro@gmail.com");
		u2.setNickName("Rouba!");
		u2.setPassword("password");
		u2.setId(2);
		users.put(u2.getId(), u2);
	}

	// la on peut mettre toto carc cets ce qui vient apres user. meme chose dans
	// pathparam
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User readuser(@PathParam("id") long id) {

		return users.get(id);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<User> readUsers() {
		List<User> userList=new ArrayList<>();
		for(Entry<Long, User> entry:users.entrySet()) {
			userList.add(entry.getValue());
		}
		return userList;
	}
	
//	@Produces(MediaType.APPLICATION_JSON)
//	public List findusers(Users users) {
//	}

}
