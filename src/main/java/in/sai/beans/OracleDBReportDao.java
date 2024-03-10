package in.sai.beans;

import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleDBReportDao  implements ReportDao{

	public void getData() {
System.out.println("GETTING Data From oracle Db");		
	}

	

} 
