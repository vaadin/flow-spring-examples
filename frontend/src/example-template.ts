import {html, LitElement} from "lit-element";


class ExampleTemplate extends LitElement {

    render() {
        return html`<span id="content"></span>`;
    }
};

customElements.define('example-template', ExampleTemplate);
