/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.vaadin.spring.tutorial;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import com.vaadin.flow.server.BootstrapListener;
import com.vaadin.flow.server.BootstrapPageResponse;
import com.vaadin.flow.server.ServiceInitEvent;
import com.vaadin.flow.server.VaadinServiceInitListener;
import com.vaadin.flow.spring.annotation.SpringComponent;

/**
 * Appends {@code meta} tag to the bootstrap page.
 */
@SpringComponent
public class AddMetaServiceInitListener
        implements VaadinServiceInitListener, BootstrapListener {

    @Override
    public void serviceInit(ServiceInitEvent event) {
        event.addBootstrapListener(this);
    }

    @Override
    public void modifyBootstrapPage(BootstrapPageResponse response) {
        Document document = response.getDocument();
        Element head = document.head();
        Element meta = head.appendElement("meta");
        meta.attr("name", "keywords");
        meta.attr("content", "Flow, Spring, Polymer");
    }

}
