package pack;

import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.ResultSetExtractor;  
  


public class studentDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}  	
	
	public int saveStudent(student s){  
	    String query="insert into student values('"+s.getSid()+"','"+s.getSname()+"')";  
	    return jdbcTemplate.update(query);  
	}
	
	public int updateStudent(student s){  
	    String query="update student set sname='"+s.getSname()+"' where sid='"+s.getSid()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	public int deleteStudent(student s){  
	    String query="delete from student where sid='"+s.getSid()+"' ";  
	    return jdbcTemplate.update(query);  
	}  
	
	public List<student> getAllStudent(){  
		return jdbcTemplate.query("select * from student",new ResultSetExtractor<List<student>>(){  
		    @Override  
		     public List<student> extractData(ResultSet rs) throws SQLException,  DataAccessException {
		        List<student> list=new ArrayList<student>();  
		        while(rs.next()){  
		        student e=new student();  
		        e.setSid(rs.getInt(1));  
		        e.setSname(rs.getString(2));   
		        list.add(e);  
		        }  
		        return list;  
		        }  
		    });  
	}  
	
}
