package com.skyeye.eve.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;

@Repository
@Mapper
public interface DwSurveyDirectoryDao {

	public List<Map<String, Object>> queryDwSurveyDirectoryList(Map<String, Object> map, PageBounds pageBounds) throws Exception;

	public int insertDwSurveyDirectoryMation(Map<String, Object> map) throws Exception;

	public List<Map<String, Object>> queryQuestionListByBelongId(Map<String, Object> map) throws Exception;

	public List<Map<String, Object>> queryQuestionLogicListByQuestionId(Map<String, Object> question) throws Exception;

	public List<Map<String, Object>> queryQuestionChenRowListByQuestionId(Map<String, Object> question) throws Exception;

	public List<Map<String, Object>> queryQuestionChenColumnListByQuestionId(Map<String, Object> question) throws Exception;

	public List<Map<String, Object>> queryQuestionMultiFillBlankListByQuestionId(Map<String, Object> question) throws Exception;

	public List<Map<String, Object>> queryQuestionRadioListByQuestionId(Map<String, Object> question) throws Exception;

	public List<Map<String, Object>> queryQuestionCheckBoxListByQuestionId(Map<String, Object> question) throws Exception;

	public List<Map<String, Object>> queryQuestionChenOptionListByQuestionId(Map<String, Object> question) throws Exception;

	public List<Map<String, Object>> queryQuestionScoreListByQuestionId(Map<String, Object> question) throws Exception;

	public List<Map<String, Object>> queryQuestionOrderByListByQuestionId(Map<String, Object> question) throws Exception;

	public List<Map<String, Object>> queryChildQuestionListByBelongId(Map<String, Object> question) throws Exception;

	public Map<String, Object> querySurveyMationById(Map<String, Object> map) throws Exception;

	public int editDwSurveyMationById(Map<String, Object> map) throws Exception;

	public int addQuestionMation(Map<String, Object> map) throws Exception;

	public int addQuestionLogicsMationList(List<Map<String, Object>> quLogics) throws Exception;

	public int addQuestionScoreMationList(List<Map<String, Object>> quScore) throws Exception;

	public int addQuestionOrderquMationList(List<Map<String, Object>> quOrderqu) throws Exception;
	
	public int addQuestionRadioMationList(List<Map<String, Object>> quRadio) throws Exception;

	public int addQuestionCheckBoxMationList(List<Map<String, Object>> quCheckBox) throws Exception;

	public int addQuestionMultiFillblankMationList(List<Map<String, Object>> quMultiFillblank) throws Exception;

	public int addQuestionColumnMationList(List<Map<String, Object>> quColumn) throws Exception;

	public int addQuestionRowMationList(List<Map<String, Object>> quRow) throws Exception;

}