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
			System.out.println(dto);
		}
		
		service.findByNameandCourse("xworkz", "JavaDeveloping");
		System.out.println(dto);
		
		service.findBylocationandrating("BTM 2nd Stage", 3);
		System.out.println(dto);
		
		System.out.println(service.updateLocationByIndex("RajajiNagar",0 ));
		System.out.println(dto);
		
		System.out.println(service.updateCourseByName("Python", "Ethnus"));
		System.out.println(dto);
		
		service.deleteByrating(2);
		System.out.println(dto);
		

		
		
		
	}

}
