package pma.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import pma.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	public List<Project> findAll();

	public Project save(Project project);
	
//	@Query(nativeQuery=true, value="SELECT stage as label, COUNT(*) as value " + 
//			"FROM project " + 
//			"GROUP BY stage")
//	public List<ChartData> getProjectStatus(); 
	
//	@Query(nativeQuery=true, value="SELECT name as projectName, start_date as startDate, end_date as endDate"
//			+ " FROM project WHERE start_date is not null")
//	public List<TimeChartData> getTimeData();
}