package com.training.amazon.dao.FromServlet2_2015_03;

import java.util.List;

/* public interface SurveyeeInfoDAO {
 * Commented out original public interface and replaced with below non-public
 */
public interface SurveyeeInfoDAO {
	
	List<SurveyeeInfo> getAllSurveyeeInfos() throws DAOException;
	
/*
	SurveyeeInfo findByPrimaryKey(int id) throws DAOException;
	void createSurveyeeInfo(SurveyeeInfo surveyeeInfo) throws DAOException;
	void updateSurveyeeInfo(SurveyeeInfo surveyeeInfo) throws DAOException;
	void deleteSurveyeeInfo(String surveyeeName) throws DAOException;
*/
}
