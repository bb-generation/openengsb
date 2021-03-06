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
package org.openengsb.core.workflow.drools.model;

import java.util.Map;

import org.openengsb.core.api.model.ConfigItem;

/**
 * The ImportConfiguration is a wrapper class around the ImportDeclaration which gets used to save ImportDeclarations to
 * ConfigPersistence.
 * 
 */
public class ImportConfiguration extends ConfigItem<ImportDeclaration> {

    private static final long serialVersionUID = 197866060287739408L;

    public ImportConfiguration() {
        super();
    }

    public ImportConfiguration(Map<String, String> metaData, ImportDeclaration content) {
        super(metaData, content);
    }

    public ImportConfiguration(ImportDeclaration importDec) {
        super(importDec.toMetadata(), importDec);
    }

}
