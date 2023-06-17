package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public String getUserName(int userid) {
		String sql = "select username from userdb.user where userid = ?";
		String name = jdbcTemplate.queryForObject(sql,new Object[] {userid},String.class);
		return name;
	}

}
