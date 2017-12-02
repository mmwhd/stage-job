package com.stage.job.admin.dao;

import com.stage.job.admin.core.model.XxlJobInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * job info
 * @author hayden 2016-1-12 18:03:45
 */
public interface XxlJobInfoDao {

	public List<XxlJobInfo> pageList(@Param("offset") int offset, @Param("pagesize") int pagesize, @Param("jobGroup") int jobGroup, @Param("executorHandler") String executorHandler);
	public int pageListCount(@Param("offset") int offset, @Param("pagesize") int pagesize, @Param("jobGroup") int jobGroup, @Param("executorHandler") String executorHandler);
	
	public int save(XxlJobInfo info);

	public XxlJobInfo loadById(@Param("id") int id);
	
	public int update(XxlJobInfo item);
	
	public int delete(@Param("id") int id);

	public List<XxlJobInfo> getJobsByGroup(@Param("jobGroup") int jobGroup);

	public int findAllCount();

}
