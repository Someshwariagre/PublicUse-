package institute.com.xworkz.dto;

import java.util.List;



import institute.com.xworkz.service.InstitueService;
import institute.com.xworkz.service.InstituteServiceIMPL;

public class InstituteRunner {
public static void main(String args[]) {
		
		InstitueService service=new InstituteServiceIMPL();
		
		InstituteDTO xworkZ=new InstituteDTO("XworkZ","BTM",5,20,"JavaDeveloping",4);
		InstituteDTO jspider=new InstituteDTO("Jspider","Rajajinagar",6,350,"JavaDeveloping",3);
		InstituteDTO kodnest=new InstituteDTO("Kodnest","BTM 2nd Stage",6,200,"Java Testing",3);
		InstituteDTO ethnus=new InstituteDTO("Ethnus","Jayanagar",6,50,"AWS",2);
		
		service.save(xworkZ);
		service.save(ethnus);
		service.save(kodnest);
		service.save(jspider);
		
		List<InstituteDTO> dto=service.read();
		for (InstituteDTO instituteDTO : dto) {
			System.out.println(instituteDTO);
		}
		
		service.findByNameandCourse("XworkZ", "JavaDeveloping");
	  
		service.findBylocationandrating("BTM 2nd Stage", 3);

		InstituteDTO update =service.updateLocationByIndex("RajajiNagar",0 );
     	for (InstituteDTO instituteDTO : dto) {
			System.out.println(instituteDTO);
		}
		
     	InstituteDTO update1 =service.updateCourseByName("Python", "Ethnus");
		for (InstituteDTO instituteDTO : dto) {
			System.out.println(instituteDTO);
		}

		
		InstituteDTO delete = service.deleteByrating(2);
		for (InstituteDTO instituteDTO : dto) {
			System.out.println(instituteDTO);
		}
		

		
		
		
	}

}
