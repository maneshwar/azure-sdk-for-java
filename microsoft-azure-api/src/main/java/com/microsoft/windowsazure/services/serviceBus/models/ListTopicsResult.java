/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.microsoft.windowsazure.services.serviceBus.models;

import java.util.List;

/**
 * Represents the result of a <code>listTopics</code> operation.
 */
public class ListTopicsResult {

    private List<TopicInfo> items;

    /**
     * Returns the items in the result list.
     * 
     * @return A <code>List</code> of {@link TopicInfo} objects that represent the
     *         items in the result list.
     */
    public List<TopicInfo> getItems() {
        return items;
    }

    /**
     * Specfies the items in the result list.
     * 
     * @param value
     *            A <code>List</code> object that contains the {@link TopicInfo} objects assigned as the value of the
     *            result.
     */
    public void setItems(List<TopicInfo> items) {
        this.items = items;
    }
}
