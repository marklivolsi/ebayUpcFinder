package com.mcl.utilities;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

public class XmlPropertyReaderTest {

    private String xmlFilePath = "src/main/resources/Parameters.xml";

    @Test
    public void testGetPropertyReturnsCorrectString() {
        XmlPropertyReader reader = new XmlPropertyReader(xmlFilePath);
        String value = reader.getProperty("SERVICE-VERSION");
        Assert.assertEquals("1.13.0", value);
    }

//    @Test(expected = IOException.class)
//    public void testXmlPropertyReaderThrowsExceptionForInvalidFilepath() {
//        XmlPropertyReader reader = new XmlPropertyReader("bogus/filepath");
//    }

    @Test(expected = InvalidParameterException.class)
    public void testGetPropertyThrowsExceptionForNonexistentKey() {
        XmlPropertyReader reader = new XmlPropertyReader(xmlFilePath);
        String value = reader.getProperty("bogus-property");
    }


}
