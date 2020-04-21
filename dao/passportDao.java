package passport.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neuedu.test04.entity.User;

import passport.entity.Passport;
import passport.util.DBManager;


public class passportDao {
	//增加记录
	public int add(Passport p){
		int i=0;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
			
		try {
			conn =DBManager.getConnection();
			String sql="INSERT INTO passport(id,name,car_number,address,reg_date,audit)"+"VALUES(?,?,?,?,NOW(),?)";
			st=conn.prepareStatement(sql);//创建预处理语句
			st.setString(1, p.getId());//1个？
			st.setString(2, p.getName());//第二个？
			st.setString(3, p.getCarNumber());
			st.setString(4, p.getAddress());
			st.setString(5, p.getAudit());
			i=st.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.closeAll(conn,st,rs);
			}
			
			
			return i;
		}
	
	
	//根据id查一条记录
		public Passport queryBysearch(String search){
			Passport p=null;
			
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				conn =DBManager.getConnection();
				String sql="SELECT * FROM passport"+" WHERE name=? or id=? or car_number=? ";//?为占位符
				st=conn.prepareStatement(sql);//创建预处理语句
				st.setString(1,search);//第1个？
				st.setString(2,search);
				st.setString(3,search);
				rs=st.executeQuery();
				
				while(rs.next()) {//开始遍历结果集
					p=new Passport();
					p.setId(rs.getString("id"));
					p.setName(rs.getString("name"));
					p.setCarNumber(rs.getString("car_number"));
					p.setAddress(rs.getString("address"));
					p.setRegDate(rs.getDate("reg_date"));
					p.setAudit(rs.getString("audit"));
				}
					
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.closeAll(conn,st,rs);
			}
			
			
			return p;
		}
		
		//删除
		public int delete(String id){
			int i=0;
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				conn =DBManager.getConnection();
				String sql="DELETE FROM passport"+" WHERE id=?";
				st=conn.prepareStatement(sql);//创建预处理语句
				st.setString(1, id);
				i=st.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.closeAll(conn,st,rs);
			}
			
			
			return i;
		}
		
		
		//查询所有未审核电子通行证记录
		public List<Passport> queryUnaudit(){
			List <Passport> list=new ArrayList<>();
			Passport p=null;
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				conn =DBManager.getConnection();
				String sql="SELECT * FROM passport WHERE audit='审核中' ";//?为占位符
				st=conn.prepareStatement(sql);//创建预处理语句
				rs=st.executeQuery();
				
				while(rs.next()) {//开始遍历结果集
					p=new Passport();
					p.setId(rs.getString("id"));
					p.setName(rs.getString("name"));
					p.setCarNumber(rs.getString("car_number"));
					p.setAddress(rs.getString("address"));
					p.setRegDate(rs.getDate("reg_date"));
					p.setAudit(rs.getString("audit"));
					list.add(p);
				}
					
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.closeAll(conn,st,rs);
			}
			
			
			return list;
		}
		
		//查询所有电子通行证记录
				public List<Passport> queryAll(){
					List <Passport> list=new ArrayList<>();
					Passport p=null;
					Connection conn=null;
					PreparedStatement st=null;
					ResultSet rs=null;
					
					try {
						conn =DBManager.getConnection();
						String sql="SELECT * FROM passport  ";//?为占位符
						st=conn.prepareStatement(sql);//创建预处理语句
						rs=st.executeQuery();
						
						while(rs.next()) {//开始遍历结果集
							p=new Passport();
							p.setId(rs.getString("id"));
							p.setName(rs.getString("name"));
							p.setCarNumber(rs.getString("car_number"));
							p.setAddress(rs.getString("address"));
							p.setRegDate(rs.getDate("reg_date"));
							p.setAudit(rs.getString("audit"));
							list.add(p);
						}
							
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						DBManager.closeAll(conn,st,rs);
					}
					
					
					return list;
				}
	
				//审核电子通行证
				public int audit(String id){
					int i=0;
					Connection conn=null;
					PreparedStatement st=null;
					ResultSet rs=null;
					
					try {
						conn =DBManager.getConnection();
						String sql="UPDATE passport SET audit='通过审核' "+" WHERE id=?";
						st=conn.prepareStatement(sql);//创建预处理语句
						st.setString(1, id);
						i=st.executeUpdate();
						
					}catch(Exception e) {
						e.printStackTrace();
					}finally {
						DBManager.closeAll(conn,st,rs);
					}
					
					
					return i;
				}

}
