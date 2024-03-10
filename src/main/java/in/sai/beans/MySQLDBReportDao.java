package in.sai.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
@Primary
public class MySQLDBReportDao implements ReportDao {

	public void getData() {
		
		System.out.println("Getting Data from MySQL DB...");
	}
	 

}
