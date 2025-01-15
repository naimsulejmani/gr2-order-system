class OrderApi extends BaseApi {
    constructor() {
        super("/api/v1/orders");
    }

    async cancelOrder(id){
        const response = await fetch(`${this.baseUrl}/${id}/cancel`, {
            method: 'PATCH'
        });
        return response.json();
    }
}
//
// const orderApi1 = new OrderApi();
// const orderApi2 = new BaseApi("/api/v1/orders");