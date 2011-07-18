/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.transport.servlet.jetty.functional;

import org.mule.api.MuleMessage;
import org.mule.module.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;
import org.mule.transport.http.HttpConnector;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class JettyHttpStemTestCase extends FunctionalTestCase
{

    @Override
    protected String getConfigResources()
    {
        return "jetty-http-stem-test.xml";
    }

    @Test
    public void testStemMatchingHttp() throws Exception
    {
        MuleClient client = new MuleClient(muleContext);
        doTest(client, "http://localhost:60230/foo", "Hello World");
        doTest(client, "http://localhost:60230/foo/bar", "Hello World");
        doTest(client, "http://localhost:60230/foo/bestmatch", "Hello World Best Match");
    }

    protected void doTest(MuleClient client, String url, String value) throws Exception
    {
        MuleMessage result = client.send(url, "Hello", null);
        assertEquals(value, result.getPayloadAsString());
        final int status = result.getInboundProperty(HttpConnector.HTTP_STATUS_PROPERTY, 0);
        assertEquals(200, status);
    }
}
