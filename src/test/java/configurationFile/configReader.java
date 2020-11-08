package configurationFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class configReader {

    private Properties properties;

    //region This constructor is used to read the config.properties file
    public configReader() {
        BufferedReader reader;
        String propertyFilePath = "configuration//config.properties";
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }
    //endregion

    // region This method is used to read the application URL from the config.properties file
    public String getApplicationURL() {
        String appURL = properties.getProperty("appURL");
        if (appURL != null) return appURL;
        else
            throw new RuntimeException(
                    "appURL not specified in the Configuration.properties file.");
    }
    //endregion
}