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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.vaadin.spring.tutorial.ExampleTemplate.ExampleModel;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Simple template example.
 */
@Tag("example-template")
/*
 * Pay attention!: the web resources are in the maven resources folder
 * META-INF/resources (one of the default web resources folder in Spring Boot).
 */
@HtmlImport("frontend://ExampleTemplate.html")
@SpringComponent
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ExampleTemplate extends PolymerTemplate<ExampleModel> {

    /**
     * Template model which defines the single "name" property.
     */
    public static interface ExampleModel extends TemplateModel {

        void setMessage(String message);
    }

    public ExampleTemplate(@Autowired Greeter bean) {
        // Set the initial value to the "message" property.
        getModel().setMessage(bean.sayHello());
    }
}
