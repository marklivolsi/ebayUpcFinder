package com.mcl.utilities;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class XmlPropertyReaderTest {

    private String xmlFilePath = "src/main/resources/FindingApiParameters.xml";

    @Test
    public void testGetPropertyReturnsCorrectString() {
        try {
            XmlPropertyReader reader = new XmlPropertyReader(xmlFilePath);
            String value = reader.getProperty("FINDING_API_VERSION");
            Assert.assertEquals("1.13.0", value);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
