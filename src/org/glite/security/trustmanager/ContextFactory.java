/*
Copyright (c) Members of the EGEE Collaboration. 2004. 
See http://www.eu-egee.org/partners/ for details on the copyright
holders.  

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

    http://www.apache.org/licenses/LICENSE-2.0 

Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License. 
*/

package org.glite.security.trustmanager;

import org.bouncycastle.openssl.PasswordFinder;

import java.util.Properties;


/**
 * @author Joni Hahkala joni.hahkala@cern.ch
 *
 * A factory class tha generates SSLContextWrappers and configures them.
 */
public class ContextFactory {
    /**
     * Creator method that is useful when interactive password asking is wanted.
     *
     * @param inputConfig A properties file that has all the necessary configuration values.
     * @param finder The password finder class that is invoked whe a password is needed.
     * @return returns the configured SSLContextWrapper class.
     * @throws Exception Thrown when SSLContextWrapper initialization fails.
     */
    public static SSLContextWrapper createContextWrapper(Properties inputConfig, PasswordFinder finder) throws Exception {
        return new ContextWrapper(inputConfig, finder);
    }

    /**
     * Generates a new contextfactory.
     * 
     * @param inputConfig the properties to use to setup the SSLContextWrapper.
     * @return the configured SSLContextWrapper class.
     * @throws Exception Thrown when SSLContextWrapper initialization fails.
     */
    public static SSLContextWrapper createContextWrapper(Properties inputConfig) throws Exception {
        return new ContextWrapper(inputConfig);
    }
}