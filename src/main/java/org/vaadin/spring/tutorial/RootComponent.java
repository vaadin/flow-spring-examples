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

import com.vaadin.router.Route;
import com.vaadin.router.RouterLink;
import com.vaadin.ui.html.Div;
import com.vaadin.ui.html.Label;

@Route("")
public class RootComponent extends Div {

    public RootComponent(@Autowired Greeter greeter,
            @Autowired ExampleTemplate template) {
        Label greeting = new Label(greeter.sayHello());
        greeting.getElement().getStyle().set("display", "block");
        RouterLink link = new RouterLink("Navigate to another component",
                ViewComponent.class);
        add(greeting, link, template);
        add(template);
    }
}
