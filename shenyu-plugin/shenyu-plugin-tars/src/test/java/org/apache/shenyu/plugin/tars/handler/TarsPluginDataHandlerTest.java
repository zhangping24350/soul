/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shenyu.plugin.tars.handler;

import org.apache.shenyu.common.dto.PluginData;
import org.apache.shenyu.common.enums.PluginEnum;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

/**
 * Test case for {@link TarsPluginDataHandler}.
 */
@RunWith(MockitoJUnitRunner.class)
public final class TarsPluginDataHandlerTest {
    
    private TarsPluginDataHandler tarsPluginDataHandlerUnderTest;
    
    @Before
    public void setUp() {
        tarsPluginDataHandlerUnderTest = new TarsPluginDataHandler();
    }
    
    @Test
    public void testHandlerPlugin() {
        final PluginData pluginData = new PluginData("id", "name", "config", "0", false);
        tarsPluginDataHandlerUnderTest.handlerPlugin(pluginData);
        assertTrue(pluginData.getName().endsWith("tested"));
    }
    
    @Test
    public void testPluginNamed() {
        final String result = tarsPluginDataHandlerUnderTest.pluginNamed();
        assertEquals(PluginEnum.TARS.getName(), result);
    }
}
