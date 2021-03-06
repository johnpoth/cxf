/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.cxf.resource;

import java.io.InputStream;

/**
 * Resolves resource.  A ResourceResolver is used to find references
 * to resources that are being injected into classes
 *
 */
public interface ResourceResolver {

    
    /**
     * Resolve a resource given its name and type.
     *
     * @param resourceName name of the resource to resolve.
     * @param resourceType type of the resource to resolve.
     * @return an instance of the resource or <code>null</code> if the
     * resource cannot be resolved.
     */
    <T> T resolve(String resourceName, Class<T> resourceType);


    /**
     * Resolve a resource given its name and return an InputStream to it.
     *
     * @param name name of the resource to resolve.
     * @return an InputStream for the resource or null if it could not be found.
     */
    InputStream getAsStream(String name);
}
