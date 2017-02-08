package org.eclipse.acceleo.module.publicdocs.main;

import java.io.File;
import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;


public class GiveConfiguration {
	public String getConfig(String configuration) {
		   String ns = "";
		
		Parameters params = new Parameters();
		// Read data from this file
		File propertiesFile = new File("config.properties");
		FileBasedConfigurationBuilder<FileBasedConfiguration> builder = new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class).configure(params.fileBased().setFile(propertiesFile));

		
		try {
			
			Configuration config = builder.getConfiguration();
		    // config contains all properties read from the file
			// load a properties file
			
				ns=config.getString(configuration);
				System.out.println(ns);
			
		}  catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return ns;
		}
}
