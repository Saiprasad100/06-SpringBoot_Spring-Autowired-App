package in.sai.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
  
	
	private ReportDao dao; 
	
	@Autowired
	public void seetDao(ReportDao dao) {
		
		System.out.println("Setter Method Call");
		this.dao=dao;
	}
	
	public void generateReport() {
		dao.getData();
		System.out.println("Report Generated.......");
	}

}
