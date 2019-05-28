package com.mcl.utilities;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.security.InvalidParameterException;

public class XmlPropertyReaderTest {

    private String xmlFilePath = "src/main/resources/FindingApiParameters.xml";

    @Test
    public void testGetPropertyReturnsCorrectString() throws IOException {
        XmlPropertyReader reader = new XmlPropertyReader(xmlFilePath);
        String value = reader.getProperty("FINDING_API_VERSION");
        Assert.assertEquals("1.13.0", value);
    }

    @Test(expected = IOException.class)
    public void testXmlPropertyReaderThrowsExceptionForInvalidFilepath() throws IOException {
        XmlPropertyReader reader = new XmlPropertyReader("bogus/filepath");
    }

    @Test(expected = InvalidParameterException.class)
    public void testGetPropertyThrowsExceptionForNonexistentKey() throws IOException {
        XmlPropertyReader reader = new XmlPropertyReader(xmlFilePath);
        String value = reader.getProperty("bogus-property");
    }


}
