package client;
import beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("configurations/configure.xml");
		BeanFactory bfactory = new XmlBeanFactory(resource);
		Test test = (Test)bfactory.getBean("test");
		test.displayFruits_Cricketers_CapitalCountries();
	}

}
