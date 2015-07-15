package com.training.amazon.dao.FromServlet2_2015_03;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/* public class SurveyeeInfoDAOJDBCImpl extends BaseDAO implements SurveyeeInfoDAO {
 * Commented out original public SurveyeeInfoDAOJDBCImpl and replaced with below non-public
 */

@Repository
public class SurveyeeInfoDAOJDBCImpl implements SurveyeeInfoDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<SurveyeeInfo> getAllSurveyeeInfos() throws DAOException {
		System.out.println("This is getAllSurveyeeInfos()");
		return jdbcTemplate.query("select * from surveyee_info",
				new SurveyeeInfoRowMapper());
	}


/*
	@Override
	public List<SurveyeeInfo> getAllSurveyeeInfos() throws DAOException {
		
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		
		List<SurveyeeInfo> surveyeeInfos = new ArrayList<SurveyeeInfo>();
		
		try
		{
			con = getConnection();
			statement = con.createStatement();
			
			rs = statement.executeQuery("select * from surveyee_info");
			
			while(rs.next())
			{
				int surveyeeId = rs.getInt("surveyee_id");
				String surveyeeName = rs.getString("surveyee_name");
				int companyId = rs.getInt("company_id");
				String deskNumber = rs.getString("desk_number");
				String phoneNumber = rs.getString("phone_number");
				
				SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);
				surveyeeInfos.add(surveyeeInfo);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while selecting", ex);
		} finally {
			closeResources(rs, statement, con);
		}
		
		return surveyeeInfos;
	}
*/

/*
	@Override
	public void createSurveyeeInfo(SurveyeeInfo surveyeeInfo) throws DAOException {
		
		Connection con = null;
		PreparedStatement statement = null;
		
		try
		{
			con = getConnection();
			String sql = "insert into surveyee_info values (surveyee_info_seq.nextval,?,?,?,?)";
			
			statement = con.prepareStatement(sql);
			
			statement.setInt(1, surveyeeInfo.getSurveyeeId());
			statement.setString(2, surveyeeInfo.getSurveyeeName());
			statement.setInt(3, surveyeeInfo.getCompanyId());
			statement.setString(4, surveyeeInfo.getDeskNumber());
			statement.setString(5, surveyeeInfo.getPhoneNumber());
			
			System.out.println(sql.toString());
			
			int rowsInserted = statement.executeUpdate();
			
			System.out.println("rowsInserted = " + rowsInserted);
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while creating the surveyeeInfo", ex);
		} finally {
			closeResources(null, statement, con);
		}
	}
*/

/*	
	@Override
	public void updateSurveyeeInfo(SurveyeeInfo surveyeeInfo) throws DAOException {
		Connection con = null;
		PreparedStatement statement = null;
		
		try
		{
			con = getConnection();

			String sql = "update 	surveyee_info " +
			             "set		surveyee_name = ?, " +
					     "			company_id = ?, " +
			             "			desk_number = ?, " +
					     "			phone_number = ? " +
			             "where 	surveyee_name = ?";

			statement = con.prepareStatement(sql);

			// statement.setInt(1, surveyeeInfo.getSurveyeeId());
			statement.setString(1, surveyeeInfo.getSurveyeeName());
			statement.setInt(2, surveyeeInfo.getCompanyId());
			statement.setString(3, surveyeeInfo.getDeskNumber());
			statement.setString(4, surveyeeInfo.getPhoneNumber());

			int rowsUpdated = statement.executeUpdate();
			System.out.println("rowsUpdated = " + rowsUpdated);
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while updating", ex);
		} finally {
			closeResources(null, statement, con);
		}
	}
*/	

/*
	@Override
	public void deleteSurveyeeInfo(String surveyeeName) throws DAOException {
		Connection con = null;
		PreparedStatement statement = null;
		
		try
		{
			con = getConnection();
			statement = con.prepareStatement("delete from surveyee_info where surveyee_name = ?");
			
			statement.setString(1, surveyeeName);
			
			int rowsDeleted = statement.executeUpdate();			
			System.out.println("rowsDeleted = " + rowsDeleted);
			
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while deleting", ex);
		} finally {
			closeResources(null, statement, con);
		}
	}
*/

/*	
	@Override
	public SurveyeeInfo findByPrimaryKey(int id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
*/

	private static final class SurveyeeInfoRowMapper implements RowMapper<SurveyeeInfo> {
		@Override
		public SurveyeeInfo mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
			
			System.out.println("This is new SurveyeeInfoRowMapper()");

			int surveyeeId = resultSet.getInt("surveyee_id");
			String surveyeeName = resultSet.getString("surveyee_name");
			int companyId = resultSet.getInt("company_id");
			String deskNumber = resultSet.getString("desk_number");
			String phoneNumber = resultSet.getString("phone_number");

			SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);

			return surveyeeInfo;
		}
		
		public SurveyeeInfoRowMapper() {
			System.out.println(" I am in SurveyeeInfoRowMapper constructor");
		}
	}	
}
