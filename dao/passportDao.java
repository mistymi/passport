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
	//���Ӽ�¼
	public int add(Passport p){
		int i=0;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
			
		try {
			conn =DBManager.getConnection();
			String sql="INSERT INTO passport(id,name,car_number,address,reg_date,audit)"+"VALUES(?,?,?,?,NOW(),?)";
			st=conn.prepareStatement(sql);//����Ԥ�������
			st.setString(1, p.getId());//1����
			st.setString(2, p.getName());//�ڶ�����
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
	
	
	//����id��һ����¼
		public Passport queryBysearch(String search){
			Passport p=null;
			
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				conn =DBManager.getConnection();
				String sql="SELECT * FROM passport"+" WHERE name=? or id=? or car_number=? ";//?Ϊռλ��
				st=conn.prepareStatement(sql);//����Ԥ�������
				st.setString(1,search);//��1����
				st.setString(2,search);
				st.setString(3,search);
				rs=st.executeQuery();
				
				while(rs.next()) {//��ʼ���������
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
		
		//ɾ��
		public int delete(String id){
			int i=0;
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				conn =DBManager.getConnection();
				String sql="DELETE FROM passport"+" WHERE id=?";
				st=conn.prepareStatement(sql);//����Ԥ�������
				st.setString(1, id);
				i=st.executeUpdate();
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBManager.closeAll(conn,st,rs);
			}
			
			
			return i;
		}
		
		
		//��ѯ����δ��˵���ͨ��֤��¼
		public List<Passport> queryUnaudit(){
			List <Passport> list=new ArrayList<>();
			Passport p=null;
			Connection conn=null;
			PreparedStatement st=null;
			ResultSet rs=null;
			
			try {
				conn =DBManager.getConnection();
				String sql="SELECT * FROM passport WHERE audit='�����' ";//?Ϊռλ��
				st=conn.prepareStatement(sql);//����Ԥ�������
				rs=st.executeQuery();
				
				while(rs.next()) {//��ʼ���������
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
		
		//��ѯ���е���ͨ��֤��¼
				public List<Passport> queryAll(){
					List <Passport> list=new ArrayList<>();
					Passport p=null;
					Connection conn=null;
					PreparedStatement st=null;
					ResultSet rs=null;
					
					try {
						conn =DBManager.getConnection();
						String sql="SELECT * FROM passport  ";//?Ϊռλ��
						st=conn.prepareStatement(sql);//����Ԥ�������
						rs=st.executeQuery();
						
						while(rs.next()) {//��ʼ���������
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
	
				//��˵���ͨ��֤
				public int audit(String id){
					int i=0;
					Connection conn=null;
					PreparedStatement st=null;
					ResultSet rs=null;
					
					try {
						conn =DBManager.getConnection();
						String sql="UPDATE passport SET audit='ͨ�����' "+" WHERE id=?";
						st=conn.prepareStatement(sql);//����Ԥ�������
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
