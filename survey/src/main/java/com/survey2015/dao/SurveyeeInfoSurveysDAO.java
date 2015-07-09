package com.survey2015.dao;

import java.util.List;

/* public interface SurveyeeInfoDAO {
 * Commented out original public interface and replaced with below non-public
 */
public interface SurveyeeInfoSurveysDAO {
	
	List<SurveyeeInfo> getAllSurveyeeInfos() throws DAOException;
	List<SurveyeeInfo> findSurveyeeInfoByPrimaryKey(int surveyeeId) throws DAOException;
	List<SurveyeeInfo> findSurveyeeInfoByName(String surveyeeName) throws DAOException;
	
	List<Surveys> getAllSurveys() throws DAOException;
	List<Surveys> findSurveysBySurveyeeId(int surveyeeId) throws DAOException;
	
	List<FullSurveyRecord> getAllFullSurvey() throws DAOException;
	
	int createSurveyeeInfo(SurveyeeInfo surveyeeInfo) throws DAOException;
	int createSurveys(Surveys surveys) throws DAOException;
	List<Integer> createFullSurvey(SurveyeeInfo surveyeeInfo, Surveys surveys) throws DAOException;
	
	int updateSurveyeeInfo(SurveyeeInfo surveyeeInfo) throws DAOException;
	int updateSurveys(Surveys surveys) throws DAOException;
	List<Integer> updateFullSurvey(SurveyeeInfo surveyeeInfo, Surveys surveys) throws DAOException;

	int deleteSurveyeeInfo(int surveyeeId, String surveyeeName) throws DAOException;
}
