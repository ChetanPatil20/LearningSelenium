package Listener.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IConfigurationAnnotation;

public class transformerDemo implements IAnnotationTransformer {


	public void transform(IConfigurationAnnotation annotation, Class testClass, Constructor testConstructor,
			Method testMethod) {
		
		String testcaseTodisable = "webclose";
		
		if(testMethod.getName().equalsIgnoreCase(testcaseTodisable)) {
			
			annotation.setEnabled(false);
		}
	}

}
