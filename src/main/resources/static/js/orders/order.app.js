class OrderApp {
    constructor() {
        this.consumerApi = new ConsumerApi();
        this.productApi = new ProductApi();
        this.orderApi = new OrderApi();

        this.productForm = document.getElementById("product-form");
        this.products = [];
    }

    async init() {
        this.displayConsumer();
        this.displayProducts();
        this.productForm.querySelector("input#date")
            .value = new Date().toISOString().split("T")[0];

        this.onProductFormSubmit();
    }

    async onProductFormSubmit() {
        this.productForm.addEventListener("submit", async event => {
            event.preventDefault();
            const formData = new FormData(event.target);
            const orderDto = Object.fromEntries(formData);
            console.log(orderDto);

            const product = this.products.filter(p=>p.id==orderDto.productId)[0];
            console.log(product)

            this.productForm.querySelector("input#price").value = product.price;
        });
    }

    async displayConsumer() {
        const consumers = await this.consumerApi.findAll();
        const selectElement = this.productForm.querySelector("select#consumerId");
        consumers.forEach(consumer => {
            selectElement.innerHTML += `<option value="${consumer.id}">${consumer.name}</option>`;
        })
    }

    async displayProducts() {
        this.products  = await this.productApi.findAll();
        const selectElement = this.productForm.querySelector("select#productId");
        this.products .forEach(product => {
            selectElement.innerHTML += `<option value="${product.id}">${product.name}</option>`;
        })
    }
}

const orderApp = new OrderApp();
orderApp.init();









