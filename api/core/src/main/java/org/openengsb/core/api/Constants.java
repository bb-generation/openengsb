/**
 * Licensed to the Austrian Association for Software Tool Integration (AASTI)
 * under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright
 * ownership. The AASTI licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openengsb.core.api;

/**
 * Container for the internal OSGi constants used in the OpenEngSB. This is a lookup as well as when direct coding or
 * filter creating against those constants is required.
 */
public final class Constants {
    /**
     * ID used to identfy backend storages. Backend ID's are used in configuration files as well as on services
     * implementing the ConfigBackendService for a specific purpose.
     */
    public static final String BACKEND_ID = "backend.id";

    /**
     * The {@link #CONFIGURATION_ID} is used to map specific areas like RULES or CONNECTORS to {@link #BACKEND_ID}
     * backends. Retrieving a configuration service using this ID will provide the required persistence service.
     */
    public static final String CONFIGURATION_ID = "configuration.id";

    /**
     * The connector constants gives a connector a unique identification. The exacty semantic value is identified by the
     * conenctor itself. Possible values are git, trac, jira, ...
     */
    public static final String CONFIG_CONNECTOR = "CONNECTOR";

    /**
     * represents the id of the ConfigPersistenceService the RuleManager uses for GlobalDeclarations.
     */
    public static final String CONFIG_RULE_GLOBAL = "GLOBAL";

    /**
     * represents the id of the ConfigPersistenceService the RuleManager uses for ImportDeclarations.
     */
    public static final String CONFIG_RULE_IMPORT = "IMPORT";

    /**
     * represents the id of the ConfigPersistenceService the RuleManager uses for RuleBaseElements.
     */
    public static final String CONFIG_RULE_RULEBASE = "RULEBASE";
    /**
     * represents the property-key for type of connector in osgi-service-properties
     */
    public static final String CONNECTOR_KEY = "connector";

    /**
     * represents the property-key for type of domain in osgi-service-properties
     */
    public static final String DOMAIN_KEY = "domain";

    /**
     * Connector-attribute that makes sure setDomainType and setConnectorType are not called during creating.
     */
    public static final String SKIP_SET_DOMAIN_TYPE = "skipSetDomainType";

    /**
     * represents the property-key for a connector's instanceid in osgi-service-properties
     */
    public static final String CONNECTOR_PERSISTENT_ID = "id";

    /**
     * connectors of this type require special handling. They represent proxies to connector-services running outside
     * the OpenEngSB and can represent any domain.
     */
    public static final String EXTERNAL_CONNECTOR_PROXY = "external-connector-proxy";

    /**
     * delegation context under which all models should be provided by delegated classloading.
     */
    public static final String DELEGATION_CONTEXT_MODELS = "models";

    public static final String DELEGATION_CONTEXT_CREDENTIALS = "credentials";

    public static final String DELEGATION_CONTEXT_PERMISSIONS = "permissions";

    /**
     * Used in bundle MANIFEST.MF to specify the short name of a domain.
     *
     * Domain-Name: example
     */
    public static final String DOMAIN_NAME_HEADER = "Domain-Name";

    /**
     * Used in bundle MANIFEST.MF to specify the fully qualified classname of the domain-interface
     *
     * Domain-Interface: org.openengsb.domain.example.ExampleDomain
     */
    public static final String DOMAIN_INTERFACE_HEADER = "Domain-Interface";

    /**
     * Used in bundle MANIFEST.MF to specify the fully qualified classname of the domain-events-interface
     *
     * DomainEvents-Interface: org.openengsb.domain.example.ExampleDomainEvents
     */
    public static final String DOMAIN_EVENTS_INTERFACE_HEADER = "DomainEvents-Interface";
    
    /**
     * Used in bundle MANIFEST.MF to specify if the bundle provides models for the OpenEngSB
     */
    public static final String PROVIDE_MODELS_HEADER = "Provide-Models";

    private Constants() {
        // this class should not be instanciated.
    }

}
