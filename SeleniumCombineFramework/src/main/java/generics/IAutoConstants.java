package generics;

import java.time.LocalDateTime;

public interface IAutoConstants {
	
	String JDBC_URL="jdbc:mysql://lcalhost:3306/advanceselenium";
	String JDBC_UN="root";
	String JDBC_PWD="root";
	String PROPERTYFILEPATH="./src/test/resources/commondata.properties";
	String SSPATH="./errorshots/";
	String TIME=LocalDateTime.now().toString().replace(":","-");
	String DIRECTORY=System.getProperty("user.dir");
	String EXCELPATH="./src/test/resourcses/dataTest.xslx";

}
