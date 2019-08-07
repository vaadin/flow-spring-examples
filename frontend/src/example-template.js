import {PolymerElement,html} from '@polymer/polymer/polymer-element.js';

class ExampleTemplate extends PolymerElement {

    static get template() {
        return html`
            <span>[[message]]"</span>`;
    }

    static get is() {
          return 'example-template';
    }
};

customElements.define(ExampleTemplate.is, ExampleTemplate);
