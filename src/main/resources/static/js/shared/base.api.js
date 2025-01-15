class BaseApi {
    constructor(baseUrl) {
        this.baseUrl = baseUrl;
    }

    async findAll() {
        try {
            const response = await fetch(this.baseUrl);
            return response.json();
        } catch (err) {
            console.error(err);
            return [];
        }
    }

    async findById(id) {
        const response = await fetch(`${this.baseUrl}/${id}`); //back-tick
        return response.json();
    }

    async add(entity) {
        const response = await fetch(this.baseUrl, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(entity)
        });
        return response.json();
    }

    async modify(id, entity) {
        const response = await fetch(this.baseUrl + "/" + id, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(entity)
        });
        return response.json();
    }

    async removeById(id) {
        const response = await fetch(this.baseUrl + "/" + id, {
            method: 'DELETE'
        });
        return response.text();
    }


}


// const productApi = new BaseApi("/api/v1/products");
// const customerApi = new BaseApi("/api/v1/customers");





















