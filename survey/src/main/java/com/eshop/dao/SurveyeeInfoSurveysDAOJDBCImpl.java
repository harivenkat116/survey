package com.eshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

/* public class SurveyeeInfoDAOJDBCImpl extends BaseDAO implements SurveyeeInfoDAO {
 * Commented out original public SurveyeeInfoDAOJDBCImpl and replaced with below non-public
 */

@Repository
public class SurveyeeInfoSurveysDAOJDBCImpl extends BaseDAO implements SurveyeeInfoSurveysDAO {

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
	
	@Override
	public List<SurveyeeInfo> findSurveyeeInfoByPrimaryKey(int surveyeeId) throws DAOException {
		
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		List<SurveyeeInfo> surveyeeInfos = new ArrayList<SurveyeeInfo>();
		
		try
		{
			con = getConnection();
			
			String sql = "select * from surveyee_info where surveyee_id = ?";
			
			statement = con.prepareStatement(sql);
			statement.setInt(1, surveyeeId);
			
			rs = statement.executeQuery();
			
			while(rs.next())
			{
				surveyeeId = rs.getInt("surveyee_id");
				String surveyeeName = rs.getString("surveyee_name");
				int companyId = rs.getInt("company_id");
				String deskNumber = rs.getString("desk_number");
				String phoneNumber = rs.getString("phone_number");
				
				SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);
				surveyeeInfos.add(surveyeeInfo);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while finding", ex);
		} finally {
			closeResources(rs, statement, con);
		}
		
		return surveyeeInfos;
	}
	
	@Override
	public List<SurveyeeInfo> findSurveyeeInfoByName(String surveyeeName) throws DAOException {
		
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		List<SurveyeeInfo> surveyeeInfos = new ArrayList<SurveyeeInfo>();
		
		try
		{
			con = getConnection();
			
			String sql = "select * from surveyee_info where surveyee_name like ?";
			
			statement = con.prepareStatement(sql);
			statement.setString(1, surveyeeName);
			
			rs = statement.executeQuery();
			
			while(rs.next())
			{
				int surveyeeId = rs.getInt("surveyee_id");
				surveyeeName = rs.getString("surveyee_name");
				int companyId = rs.getInt("company_id");
				String deskNumber = rs.getString("desk_number");
				String phoneNumber = rs.getString("phone_number");
				
				SurveyeeInfo surveyeeInfo = new SurveyeeInfo(surveyeeId, surveyeeName, companyId, deskNumber, phoneNumber);
				surveyeeInfos.add(surveyeeInfo);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while finding", ex);
		} finally {
			closeResources(rs, statement, con);
		}
		
		return surveyeeInfos;
	}

	@Override
	public List<Surveys> getAllSurveys() throws DAOException {
		
		Connection con = null;
		Statement statement = null;
		ResultSet rs = null;
		
		List<Surveys> surveys = new ArrayList<Surveys>();
		
		try
		{
			con = getConnection();
			statement = con.createStatement();
			
			rs = statement.executeQuery("select * from surveys");

			while(rs.next())
			{
				int surveyDetailsId = rs.getInt("survey_details_id");
				int surveyeeId = rs.getInt("surveyee_id");
				String techCategory = rs.getString("tech_category");
				String solvedOrNot = rs.getString("solved_or_not");
				String solutionDegree = rs.getString("solution_degree");
				String willToHelpRating = rs.getString("will_to_help_rating");
				String courtesyRating = rs.getString("courtesy_rating");
				
				Surveys survey = new Surveys(surveyDetailsId, surveyeeId, techCategory, solvedOrNot, solutionDegree, willToHelpRating, courtesyRating);
				surveys.add(survey);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while selecting", ex);
		} finally {
			closeResources(rs, statement, con);
		}
		
		return surveys;
	}

	@Override
	public List<Surveys> findSurveysBySurveyeeId(int surveyeeId) throws DAOException {
		
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		List<Surveys> surveys = new ArrayList<Surveys>();
		
		try
		{
			con = getConnection();
			
			String sql = "select * from surveys where surveyee_id = ?";
			
			statement = con.prepareStatement(sql);
			statement.setInt(1, surveyeeId);
			
			rs = statement.executeQuery();
			
			while(rs.next())
			{
				int surveyDetailsId = rs.getInt("survey_details_id");
				surveyeeId = rs.getInt("surveyee_id");
				String techCategory = rs.getString("tech_category");
				String solvedOrNot = rs.getString("solved_or_not");
				String solutionDegree = rs.getString("solution_degree");
				String willToHelpRating = rs.getString("will_to_help_rating");
				String courtesyRating = rs.getString("courtesy_rating");
				
				Surveys survey = new Surveys(surveyDetailsId, surveyeeId, techCategory, solvedOrNot, solutionDegree, willToHelpRating, courtesyRating);
				surveys.add(survey);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while finding", ex);
		} finally {
			closeResources(rs, statement, con);
		}
		
		return surveys;
	}
	
	@Override
	public List<FullSurveyRecord> getAllFullSurvey() throws DAOException {
		
		Connection con = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		
		List<FullSurveyRecord> fullSurveyRecords = new ArrayList<FullSurveyRecord>();
		
		try
		{
			con = getConnection();
			
			String sql = "select * from surveyee_info si " +
			             "JOIN surveys s " +
					     "on (si.SURVEYEE_ID = s.SURVEYEE_ID) " +
					     "order by 1";

			statement = con.prepareStatement(sql);

			rs = statement.executeQuery(sql);

			while (rs.next()) {
				int surveyeeId = rs.getInt("surveyee_id");
				String surveyeeName = rs.getString("surveyee_name");
				int companyId = rs.getInt("company_id");
				String deskNumber = rs.getString("desk_number");
				String phoneNumber = rs.getString("phone_number");

				int surveyDetailsId = rs.getInt("survey_details_id");
				String techCategory = rs.getString("tech_category");
				String solvedOrNot = rs.getString("solved_or_not");
				String solutionDegree = rs.getString("solution_degree");
				String willToHelpRating = rs.getString("will_to_help_rating");
				String courtesyRating = rs.getString("courtesy_rating");

				FullSurveyRecord fullSurveyRecord = new FullSurveyRecord(surveyeeId, surveyeeName,
						companyId, deskNumber, phoneNumber, surveyDetailsId, techCategory,
						solvedOrNot, solutionDegree, willToHelpRating, courtesyRating);

				fullSurveyRecords.add(fullSurveyRecord);
			}
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while selecting", ex);
		} finally {
			closeResources(rs, statement, con);
		}
		
		return fullSurveyRecords;
	}
	
	@Override
	public int createSurveyeeInfo(SurveyeeInfo surveyeeInfo) throws DAOException {
		
		Connection con = null;
		PreparedStatement statement = null;
		
		int surveyeeId = 0;
		
		try
		{
			con = getConnection();
			String sql = "insert into surveyee_info values (?,?,?,?,?)";
			
			statement = con.prepareStatement(sql);
			
			surveyeeId = getNextSequenceValue("surveyee_info_seq");
			
			statement.setInt(1, surveyeeId);
			statement.setString(2, surveyeeInfo.getSurveyeeName());
			statement.setInt(3, surveyeeInfo.getCompanyId());
			statement.setString(4, surveyeeInfo.getDeskNumber());
			statement.setString(5, surveyeeInfo.getPhoneNumber());
			
			int rowsInserted = statement.executeUpdate();
			
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while creating the surveyeeInfo", ex);
		} finally {
			closeResources(null, statement, con);
		}
		
		return surveyeeId;
	}

	@Override
	public int createSurveys(Surveys surveys) throws DAOException {
		
		Connection con = null;
		PreparedStatement statement = null;
		
		int surveyDetailsId = 0;
		
		try
		{
			con = getConnection();
			String sql = "insert into surveys values (?,?,?,?,?,?,?)";
			
			statement = con.prepareStatement(sql);
			
			surveyDetailsId = getNextSequenceValue("surveys_seq");
			
			statement.setInt(1, surveyDetailsId);
			statement.setInt(2, surveys.getSurveyeeId());
			statement.setString(3, surveys.getTechCategory());
			statement.setString(4, surveys.getSolvedOrNot());
			statement.setString(5, surveys.getSolutionDegree());
			statement.setString(6, surveys.getWillToHelpRating());
			statement.setString(7, surveys.getCourtesyRating());
			
			int rowsInserted = statement.executeUpdate();
			
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while creating the surveyeeInfo", ex);
		} finally {
			closeResources(null, statement, con);
		}
		
		return surveyDetailsId;
	}

	@Override
	public List<Integer> createFullSurvey(SurveyeeInfo surveyeeInfo, Surveys surveys) throws DAOException {
		
		int surveyeeId = 0;
		int surveyDetailsId = 0;
		List<Integer> Array1 = new ArrayList<Integer>();

		surveyeeId = createSurveyeeInfo(surveyeeInfo);
		

		
		surveys.setSurveyeeId(surveyeeId);
		surveyDetailsId = createSurveys(surveys);
		

		Array1.add(surveyeeId); Array1.add(surveyDetailsId);
		return Array1;
	}

	@Override
	public int updateSurveyeeInfo(SurveyeeInfo surveyeeInfo) throws DAOException {
		Connection con = null;
		PreparedStatement statement = null;
		int surveyeeInfoRowsUpdated = 0;
		
		try
		{
			con = getConnection();

			String sql = "update 	surveyee_info " +
					     "set		company_id = ?, " +
			             "			desk_number = ?, " +
					     "			phone_number = ? " +
			             "where 	surveyee_name = ?" + 
					     "or        surveyee_id = ?";

			statement = con.prepareStatement(sql);

			statement.setInt(1, surveyeeInfo.getCompanyId());
			statement.setString(2, surveyeeInfo.getDeskNumber());
			statement.setString(3, surveyeeInfo.getPhoneNumber());
			statement.setString(4, surveyeeInfo.getSurveyeeName());
			statement.setInt(5, surveyeeInfo.getSurveyeeId());
			
			surveyeeInfoRowsUpdated = statement.executeUpdate();
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while updating", ex);
		} finally {
			closeResources(null, statement, con);
		}
		
		return surveyeeInfoRowsUpdated;
	}

	@Override
	public int updateSurveys(Surveys surveys) throws DAOException {
		Connection con = null;
		PreparedStatement statement = null;
		int surveysRowsUpdated = 0;

		try
		{
			con = getConnection();

			String sql = "update 	surveys " +
					     "set		tech_category = ?, " +
			             "			solved_or_not = ?, " +
					     "			solution_degree = ?, " +
					     "			will_to_help_rating = ?, " +
					     "			courtesy_rating = ? " +
			             "where 	survey_details_id = ?" + 
					     "or        surveyee_id = ?";

			statement = con.prepareStatement(sql);

			statement.setString(1, surveys.getTechCategory());
			statement.setString(2, surveys.getSolvedOrNot());
			statement.setString(3, surveys.getSolutionDegree());
			statement.setString(4, surveys.getWillToHelpRating());
			statement.setString(5, surveys.getCourtesyRating());
			statement.setInt(6, surveys.getSurveyDetailsId());
			statement.setInt(7, surveys.getSurveyeeId());
						
			surveysRowsUpdated = statement.executeUpdate();
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while updating", ex);
		} finally {
			closeResources(null, statement, con);
		}
		
		return surveysRowsUpdated;
	}

	@Override
	public List<Integer> updateFullSurvey(SurveyeeInfo surveyeeInfo, Surveys surveys) throws DAOException {
		
		int surveyeeInfoRowsUpdated = 0;
		int surveysRowsUpdated = 0;
		List<Integer> Array1 = new ArrayList<Integer>();

		surveyeeInfoRowsUpdated = updateSurveyeeInfo(surveyeeInfo);
		surveysRowsUpdated = updateSurveys(surveys);

		
		Array1.add(surveyeeInfoRowsUpdated); Array1.add(surveysRowsUpdated);
		return Array1;
	}
	
	@Override
	public int deleteSurveyeeInfo(int surveyeeId, String surveyeeName) throws DAOException {
		Connection con = null;
		PreparedStatement statement = null;
		int surveyeeInfoRowsDeleted = 0;
		
		try
		{
			con = getConnection();
			statement = con.prepareStatement("delete from surveyee_info where surveyee_id = ? or surveyee_name = ?");
			
			statement.setInt(1, surveyeeId);
			statement.setString(2, surveyeeName);
			
			surveyeeInfoRowsDeleted = statement.executeUpdate();
			
		} catch(SQLException ex) {
			ex.printStackTrace();
			throw new DAOException("Error occured while deleting", ex);
		} finally {
			closeResources(null, statement, con);
		}
		return surveyeeInfoRowsDeleted;
	}
}
