package com.survey2015.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.survey2015.dao.DAOException;
import com.survey2015.dao.SurveyeeInfo;
import com.survey2015.dao.SurveyeeInfoSurveysDAO;

@Service
public class SurveyeeInfoSurveysService {
	
	@Autowired
	private SurveyeeInfoSurveysDAO dao;
	
/*	public List<SurveyeeInfo> getAllSurveyeeInfos() throws DAOException {
		return dao.getAllSurveyeeInfos();
	}
	
	public List<SurveyeeInfo> findSurveyeeInfoByPrimaryKey(int surveyeeId) throws DAOException {
		return dao.findSurveyeeInfoByPrimaryKey(surveyeeId);
	}
*/
	
	public List<SurveyeeInfo> getAllSurveyeeInfos() {
			return dao.getAllSurveyeeInfos();
	}
	
	/*public void add(Customer customer) {
		dao.createCustomer(customer);
	}*/
}
