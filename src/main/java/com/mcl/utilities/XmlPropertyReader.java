package com.mcl.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Properties;

public class XmlPropertyReader extends Properties {

    public XmlPropertyReader(String xmlFilePath) throws IOException {
        File file = new File(xmlFilePath);
        FileInputStream is = new FileInputStream(file);
        this.loadFromXML(is);
    }

    @Override
    public String getProperty(String key) {
        String value = super.getProperty(key);
        if (value == null) {
            throw new InvalidParameterException();
        }
        return value;
    }

}
