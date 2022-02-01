# Postman
### Facilitadores Postman:

#### -> [Link para importar Collection](https://www.getpostman.com/collections/XXXXXXXXXXXXXXXX) para o Postman (copiar e colar)
#### -> Download do [JSON](JSONs/Postman_endpoint.json) salvo.

JSON para utilização dos endPoint no Postman
```
{
	"info": {
		"_postman_id": "9e0d8f42-4a3f-4c5c-81b8-0d1f0606e871",
		"name": "Projeto Integrador W4-G9",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "CRUD Section",
			"item": [
				{
					"name": "Section - Cadastrar",
					"request": {
						"method": "POST",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "default"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"name\": \"Fresco-001\",\n    \"type\": \"Fresco\",\n    \"warehouse_code\": {\n        \"id\": 1,\n        \"name\": \"Melicidade\",\n        \"location\": \"Sao Paulo - Capital\"\n    },\n    \"stock_limit\": 100,\n    \"current_stock\": 69,\n    \"min_teperature\": 0.3,\n    \"max_teperature\": 0.15\n}"
						},
						"url": {
							"raw": "http://localhost:8080/section",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"section"
							]
						}
					},
					"response": []
				},
				{
					"name": "Section - Listar",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/section",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"section"
							]
						}
					},
					"response": []
				},
				{
					"name": "Section - Busca Um",
					"request": {
						"method": "GET",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/section/52",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"section",
								"52"
							]
						}
					},
					"response": []
				},
				{
					"name": "Section - Deletar",
					"request": {
						"method": "DELETE",
						"header": [],
						"url": {
							"raw": "http://localhost:8080/section/44",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"section",
								"44"
							]
						}
					},
					"response": []
				},
				{
					"name": "Section - Atualizar",
					"request": {
						"method": "PUT",
						"header": [
							{
								"key": "Content-Type",
								"value": "application/json",
								"type": "default"
							}
						],
						"body": {
							"mode": "raw",
							"raw": "{\n    \"id\": 56,\n    \"name\": \"Fresco-001\",\n    \"type\": \"Fresco\",\n    \"warehouse_code\": {\n        \"id\": 1,\n        \"name\": \"Melicidade\",\n        \"location\": \"Sao Paulo - Capital\"\n    },\n    \"stock_limit\": 100,\n    \"current_stock\": 23,\n    \"min_teperature\": 0.3,\n    \"max_teperature\": 0.333\n}"
						},
						"url": {
							"raw": "http://localhost:8080/section/53",
							"protocol": "http",
							"host": [
								"localhost"
							],
							"port": "8080",
							"path": [
								"section",
								"53"
							]
						}
					},
					"response": []
				}
			]
		}
	]
}
```