# Postman
### Facilitadores Postman:

#### -> [Link para importar Collection](https://www.getpostman.com/collections/a6ce42b0e323dfcbb5ed) para o Postman (copiar e colar)
#### -> Download do [JSON](JSONs/Postman_endpoint.json) salvo.

JSON para utilização dos endPoint no Postman
```
{
  "info": {
    "_postman_id": "ce0588ce-c53c-417c-92b3-dde6941a4bb2",
    "name": "Projeto Integrador",
    "schema": "https://schema.getpostman.com/json/collection/v2.0.0/collection.json"
  },
  "item": [
    {
      "name": "0. Login",
      "item": [
        {
          "name": "Login",
          "id": "ef66a596-5717-4f8a-828b-9ec9d658add5",
          "request": {
            "method": "POST",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"username\": \"kkk\",\n  \"pass\": \"151515\"\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/login"
          },
          "response": []
        }
      ],
      "id": "da40a0d5-71a8-4413-8cae-4fe26c20ba7f"
    },
    {
      "name": "1. Usuarios",
      "item": [
        {
          "name": "Comprador",
          "item": [
            {
              "name": "Lista Todos Compradores",
              "id": "b7768fc6-e983-47ad-8940-b39660fba634",
              "request": {
                "method": "GET",
                "header": [],
                "url": "http://localhost:8080/api/v1/fresh-products/buyer"
              },
              "response": []
            },
            {
              "name": "Consultar 1 Comprador",
              "id": "c7a59cca-6d61-45d8-ba9c-185f5c7dda20",
              "request": {
                "method": "GET",
                "header": [],
                "url": "http://localhost:8080/api/v1/fresh-products/buyer/{{id}}"
              },
              "response": []
            },
            {
              "name": "Cadastrar Comprador",
              "id": "126131d0-5520-49ae-85e4-45666e061d72",
              "request": {
                "method": "POST",
                "header": [],
                "body": {
                  "mode": "raw",
                  "raw": "{\n  \"username\": \"\",\n  \"name\": \"\",\n  \"email\": \"\",\n  \"pass\": \"\",\n  \"address\": \"\"\n}",
                  "options": {
                    "raw": {
                      "language": "json"
                    }
                  }
                },
                "url": "http://localhost:8080/api/v1/fresh-products/buyer"
              },
              "response": []
            },
            {
              "name": "Atualizar Comprador",
              "id": "ef450a96-59f7-4b66-bd22-06638ff2a00a",
              "request": {
                "method": "PUT",
                "header": [],
                "body": {
                  "mode": "raw",
                  "raw": "{\n  \"username\": \"\",\n  \"name\": \"\",\n  \"email\": \"\",\n  \"pass\": \"\",\n  \"address\": \"\"\n}",
                  "options": {
                    "raw": {
                      "language": "json"
                    }
                  }
                },
                "url": "http://localhost:8080/api/v1/fresh-products/buyer/{{id}}"
              },
              "response": []
            },
            {
              "name": "Deletar Comprador",
              "id": "da0510b6-785e-4004-814f-8ae62a279a90",
              "request": {
                "method": "DELETE",
                "header": [],
                "url": "http://localhost:8080/api/v1/fresh-products/buyer/{{id}}"
              },
              "response": []
            }
          ],
          "id": "959d5cb9-e9e1-4bfb-a180-dc9fe26715f4"
        },
        {
          "name": "Vendedor",
          "item": [
            {
              "name": "Listar Todos Vendedores",
              "id": "71b1ef10-6e84-4bd4-a4b4-1b5ca2855d41",
              "request": {
                "method": "GET",
                "header": [],
                "url": "http://localhost:8080/api/v1/fresh-products/seller"
              },
              "response": []
            },
            {
              "name": "Consultar 1 Vendedor",
              "id": "4477a635-2c27-44e6-9403-25cc2ad1002f",
              "request": {
                "method": "GET",
                "header": [],
                "url": "http://localhost:8080/api/v1/fresh-products/seller/{{id}}"
              },
              "response": []
            },
            {
              "name": "Cadastrar Vendedor",
              "id": "e64654bd-fa1e-4a4a-be03-0305ff4dc9ad",
              "request": {
                "method": "POST",
                "header": [],
                "body": {
                  "mode": "raw",
                  "raw": "{\n  \"username\": \"\",\n  \"name\": \"\",\n  \"email\": \"\",\n  \"pass\": \"\"\n}",
                  "options": {
                    "raw": {
                      "language": "json"
                    }
                  }
                },
                "url": "http://localhost:8080/api/v1/fresh-products/seller"
              },
              "response": []
            },
            {
              "name": "Atualizar Vendedor",
              "id": "2762648a-4d00-4d41-aecc-8b39fef74fc6",
              "request": {
                "method": "PUT",
                "header": [],
                "body": {
                  "mode": "raw",
                  "raw": "{\n  \"username\": \"\",\n  \"name\": \"\",\n  \"email\": \"\",\n  \"pass\": \"\"\n}",
                  "options": {
                    "raw": {
                      "language": "json"
                    }
                  }
                },
                "url": "http://localhost:8080/api/v1/fresh-products/seller/{{id}}"
              },
              "response": []
            },
            {
              "name": "Deletar Vendedo",
              "id": "af5c01a6-baec-430c-ac6e-a54e0232901c",
              "request": {
                "method": "DELETE",
                "header": [],
                "url": "http://localhost:8080/api/v1/fresh-products/seller/{{id}}"
              },
              "response": []
            }
          ],
          "id": "010b68b0-0b98-409a-81d1-c33efeda09af"
        },
        {
          "name": "Representante",
          "item": [
            {
              "name": "Lista Todos Representantes",
              "id": "1abf30a8-75ab-4c4b-881d-c0a4f04a734d",
              "request": {
                "method": "GET",
                "header": [],
                "url": "http://localhost:8080/api/v1/fresh-products/representative/"
              },
              "response": []
            },
            {
              "name": "Consulta 1 Representante",
              "id": "e9ace6ec-a2a5-4501-b8e7-f02082748e3c",
              "request": {
                "method": "GET",
                "header": [],
                "url": "http://localhost:8080/api/v1/fresh-products/representative/{{id}}"
              },
              "response": []
            },
            {
              "name": "Cadastra Representante",
              "id": "807293a5-2bbc-4052-929e-653330a8a185",
              "request": {
                "method": "POST",
                "header": [],
                "body": {
                  "mode": "raw",
                  "raw": "{\n  \"username\": \"\",\n  \"name\": \"\",\n  \"email\": \"\",\n  \"pass\": \"\",\n  \"job\": [\n    \"SUPERVISOR\",\n    \"LIDER\"\n  ]\n}",
                  "options": {
                    "raw": {
                      "language": "json"
                    }
                  }
                },
                "url": "http://localhost:8080/api/v1/fresh-products/representative/"
              },
              "response": []
            },
            {
              "name": "Altera Representante",
              "id": "ef5ffe61-1b92-42fd-8cf0-9df0013975ae",
              "request": {
                "method": "PUT",
                "header": [],
                "body": {
                  "mode": "raw",
                  "raw": "{\n  \"username\": \"\",\n  \"name\": \"\",\n  \"email\": \"\",\n  \"pass\": \"\",\n  \"job\": [\n    \"SUPERVISOR\",\n    \"LIDER\"\n  ]\n}",
                  "options": {
                    "raw": {
                      "language": "json"
                    }
                  }
                },
                "url": "http://localhost:8080/api/v1/fresh-products/representative/{{id}}"
              },
              "response": []
            },
            {
              "name": "Deleta Representante",
              "id": "bf75dcfc-8122-4677-adac-5cdf1b106da5",
              "request": {
                "method": "DELETE",
                "header": [],
                "url": "http://localhost:8080/api/v1/fresh-products/representative/{{id}}"
              },
              "response": []
            }
          ],
          "id": "c6db574c-7597-40e9-bc28-042647789919"
        },
        {
          "name": "Listar Todos Usuarios",
          "id": "b81566bc-4fdd-47f2-af6a-e35a94c87253",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/users"
          },
          "response": []
        }
      ],
      "id": "fff2e524-db55-4e33-9777-0f2a2e0a7b1a"
    },
    {
      "name": "2. Armazem",
      "item": [
        {
          "name": "Lista Todos Armazens",
          "id": "07038c32-5294-4504-afa4-31417911ec08",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/warehouse"
          },
          "response": []
        },
        {
          "name": "Consulta 1 Armazem",
          "id": "ca189c01-b596-4956-9f6a-73b76683ed65",
          "request": {
            "method": "GET",
            "header": [],
            "url": null
          },
          "response": []
        },
        {
          "name": "Cadastra Armazem",
          "id": "25a92e22-4af4-437b-b6ef-809aaaef9f45",
          "request": {
            "method": "POST",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"name\": \"\",\n  \"location\": \"\"\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/warehouse"
          },
          "response": []
        },
        {
          "name": "Altera Armazem",
          "id": "f1b31e5b-1bed-4c85-a707-f7b30708d521",
          "request": {
            "method": "PUT",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"name\": \"\",\n  \"location\": \"\"\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/warehouse/{{id}}"
          },
          "response": []
        },
        {
          "name": "Deleta Armazem",
          "id": "064f1058-f417-4962-a842-fab28feefe44",
          "request": {
            "method": "DELETE",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/warehouse/{{id}}"
          },
          "response": []
        },
        {
          "name": "Busc Armazens por Produto",
          "id": "11f3e4f3-b4da-4187-a36f-d1b5b175069d",
          "protocolProfileBehavior": {
            "disableBodyPruning": true
          },
          "request": {
            "method": "GET",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/warehouse/byProduct/{{id}}"
          },
          "response": []
        }
      ],
      "id": "d7dbaef5-e773-4a3c-92aa-8ee11f0ccd68"
    },
    {
      "name": "3. Setor",
      "item": [
        {
          "name": "Listar Todos Setores",
          "id": "f946c7d1-45e7-4849-88e9-6886c87e8232",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/section"
          },
          "response": []
        },
        {
          "name": "Consultar 1 Setor",
          "id": "19906cec-2fd2-4628-99e9-efadd9dd9540",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/section/{{id}}"
          },
          "response": []
        },
        {
          "name": "Cadastrar Setor",
          "id": "26065344-0b80-43ba-a721-3a9c224d1096",
          "request": {
            "method": "POST",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"name\": \"\",\n  \"type\": [\n    \"FROZEN\",\n    \"COLD\",\n    \"FRESH\"\n  ],\n  \"idWarehouse\": 0,\n  \"stockLimit\": 0,\n  \"currentStock\": 0,\n  \"minTeperature\": 0.0,\n  \"maxTeperature\": 0.0\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/section"
          },
          "response": []
        },
        {
          "name": "Atualizar Setor",
          "id": "2882869f-2003-4851-bbc5-be971eb8408b",
          "request": {
            "method": "PUT",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"name\": \"\",\n  \"type\": [\n    \"FROZEN\",\n    \"COLD\",\n    \"FRESH\"\n  ],\n  \"idWarehouse\": 0,\n  \"stockLimit\": 0,\n  \"currentStock\": 0,\n  \"minTeperature\": 0.0,\n  \"maxTeperature\": 0.0\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/section/{{id}}"
          },
          "response": []
        },
        {
          "name": "Deletar Setor",
          "id": "dde39754-c81f-4688-86d1-f672e0a1e52d",
          "request": {
            "method": "DELETE",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/section/{{id}}"
          },
          "response": []
        }
      ],
      "id": "3b581f5d-4c4d-4a67-a75d-da5d24da8435"
    },
    {
      "name": "4. Anuncio",
      "item": [
        {
          "name": "Listar Todos Annuncios",
          "id": "b2dfbfa6-f5f7-4b30-b955-662cb15127ca",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/advertise"
          },
          "response": []
        },
        {
          "name": "Consultar 1 Anuncio",
          "id": "582b1285-32de-4793-b716-16f04a785744",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/advertise/{{id}}"
          },
          "response": []
        },
        {
          "name": "Cadastrar Anuncio",
          "id": "16215cef-5aec-4846-8005-f13a2ac917d5",
          "request": {
            "method": "POST",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"description\": \"\",\n  \"product\": {\n    \"name\": \"\",\n    \"description\": \"\",\n    \"minTemperature\": 0.0,\n    \"maxTemperature\": 0.0,\n    \"categoryRefrigeration\": [\n      \"FROZEN\",\n      \"COLD\",\n      \"FRESH\"\n    ]\n  },\n  \"seller\": {\n    \"username\": \"\",\n    \"name\": \"\",\n    \"email\": \"\",\n    \"pass\": \"\"\n  },\n  \"price\": 0.0,\n  \"status\": [\n    \"ATIVO\",\n    \"INATIVO\",\n    \"PAUSADO\",\n    \"REMOVIDO\",\n    \"PENDENTE\",\n    \"FINALIZADO\"\n  ],\n  \"freeShipping\": false\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/advertise"
          },
          "response": []
        },
        {
          "name": "Atualizar Anuncio",
          "id": "35c7a096-ea96-4b63-a5ad-eb78d173488d",
          "request": {
            "method": "PUT",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"id\": 0,\n  \"name\": \"\",\n  \"type\": [\n    \"FROZEN\",\n    \"COLD\",\n    \"FRESH\"\n  ],\n  \"warehouse\": {\n    \"id\": 0,\n    \"nome\": \"\",\n    \"location\": \"\"\n  },\n  \"stockLimit\": 0,\n  \"currentStock\": 0,\n  \"minTeperature\": 0.0,\n  \"maxTeperature\": 0.0\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/advertise/{{id}}"
          },
          "response": []
        },
        {
          "name": "Deletar Anuncio",
          "id": "307e7c3c-9c71-4764-8107-c3a930d905bd",
          "request": {
            "method": "DELETE",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/advertise/{{id}}"
          },
          "response": []
        }
      ],
      "id": "d2912f1c-0368-4a04-98f4-cd411d740c00"
    },
    {
      "name": "5. Produto",
      "item": [
        {
          "name": "Listar Todos Produtos",
          "id": "2b6d3b8f-14c6-40ae-8f77-09c73bb16d37",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/product"
          },
          "response": []
        },
        {
          "name": "Consultar 1 Produto",
          "id": "f03a24c0-e316-48e2-85ed-c480bc87e047",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/product/{{id}}"
          },
          "response": []
        },
        {
          "name": "Lista Produtos Por Categoria (Refrigeração)",
          "id": "9d12c709-07c1-4c4d-8423-037d033423ba",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/product/listCategory/{{categoryProd}}"
          },
          "response": []
        },
        {
          "name": "Lista Lotes Pro Produto",
          "id": "a3691843-0314-4467-80c4-6494b887e329",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "http://localhost:8080/api/v1/fresh-products/product/listBatch/?id",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "v1",
                "fresh-products",
                "product",
                "listBatch",
                ""
              ],
              "query": [
                {
                  "key": "id",
                  "value": null
                }
              ]
            }
          },
          "response": []
        },
        {
          "name": "Lista Lotes Por Produtos - Ordenado",
          "id": "e00d4b8b-0924-4ebb-9698-ee13bb9bf997",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "http://localhost:8080/api/v1/fresh-products/product/listBatch/{{order}}?id",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "v1",
                "fresh-products",
                "product",
                "listBatch",
                "{{order}}"
              ],
              "query": [
                {
                  "key": "id",
                  "value": null
                }
              ]
            }
          },
          "response": []
        },
        {
          "name": "Cria Produto base para anuncio",
          "id": "61ed84b7-234a-435b-9e4f-b80929dfb48b",
          "request": {
            "method": "POST",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"name\": \"\",\n  \"description\": \"\",\n  \"min_temperature\": 0.0,\n  \"max_temperature\": 0.0,\n  \"category_refrigeration\": [\n    \"FROZEN\",\n    \"COLD\",\n    \"FRESH\"\n  ]\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/product"
          },
          "response": []
        },
        {
          "name": "Atualiza Produto",
          "id": "c8159a1f-3a4f-44fa-8687-febb2ecdced3",
          "request": {
            "method": "PUT",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"name\": \"\",\n  \"description\": \"\",\n  \"min_temperature\": 0.0,\n  \"max_temperature\": 0.0,\n  \"category_refrigeration\": [\n    \"FROZEN\",\n    \"COLD\",\n    \"FRESH\"\n  ]\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/product/{{id}}"
          },
          "response": []
        },
        {
          "name": "Deleta Produto",
          "id": "143fd3be-9932-48d2-ac3d-40614c048a48",
          "request": {
            "method": "DELETE",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/product/{{id}}"
          },
          "response": []
        }
      ],
      "id": "0a2e6c15-79e6-49af-840a-d206369079f8"
    },
    {
      "name": "6. Ordem de Entrada",
      "item": [
        {
          "name": "Inclui Ordem de Entrada",
          "id": "bd37d6fa-8b0c-450f-99f3-a67d6ad4b883",
          "request": {
            "method": "POST",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"orderNumber\": 0,\n  \"orderDate\": \"2022-02-02\",\n  \"section\": {\n    \"sectionCode\": \"\",\n    \"warehouseCode\": \"\"\n  },\n  \"batchStock\": [\n    {\n      \"batchNumber\": 0,\n      \"advertiseId\": 0,\n      \"currentTemperature\": 0.0,\n      \"minimumTemperature\": 0.0,\n      \"initialQuantity\": 0,\n      \"currentQuantity\": 0,\n      \"manufacturingDate\": \"2022-02-02\",\n      \"manufacturingTime\": \"2022-02-02T06:42:02.775022\",\n      \"dueDate\": \"2022-02-02\"\n    }\n  ]\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/inboundorder"
          },
          "response": []
        },
        {
          "name": "Altera Ordem de Entrada Copy",
          "id": "7052a26b-9578-4211-afbd-14ec248effce",
          "request": {
            "method": "PUT",
            "header": [],
            "body": {
              "mode": "raw",
              "raw": "{\n  \"orderNumber\": 0,\n  \"orderDate\": \"2022-02-02\",\n  \"section\": {\n    \"sectionCode\": \"\",\n    \"warehouseCode\": \"\"\n  },\n  \"batchStock\": [\n    {\n      \"batchNumber\": 0,\n      \"advertiseId\": 0,\n      \"currentTemperature\": 0.0,\n      \"minimumTemperature\": 0.0,\n      \"initialQuantity\": 0,\n      \"currentQuantity\": 0,\n      \"manufacturingDate\": \"2022-02-02\",\n      \"manufacturingTime\": \"2022-02-02T06:42:02.775022\",\n      \"dueDate\": \"2022-02-02\"\n    }\n  ]\n}",
              "options": {
                "raw": {
                  "language": "json"
                }
              }
            },
            "url": "http://localhost:8080/api/v1/fresh-products/inboundorder"
          },
          "response": []
        },
        {
          "name": "Lista Todas Ordens de Entrada",
          "id": "067baf40-5fc3-44f5-8ecf-bdb2f6430858",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/inboundorder"
          },
          "response": []
        },
        {
          "name": "Consulta 1 Ordem de Entrada",
          "id": "9d78ddba-da9a-4c07-9216-05aa412c582a",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/inboundorder/{{id}}"
          },
          "response": []
        }
      ],
      "id": "0f663d2e-910f-4d2f-97b5-d47b4a92b78c"
    },
    {
      "name": "7. Controle de Validade",
      "item": [
        {
          "name": "Produtos - Validade Por Setor",
          "id": "705ebb6a-8605-4e26-b2e4-2c234370574f",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "http://localhost:8080/api/v1/fresh-products/due-date/bySection/{{numberOfDays}}?sectionId",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "v1",
                "fresh-products",
                "due-date",
                "bySection",
                "{{numberOfDays}}"
              ],
              "query": [
                {
                  "key": "sectionId",
                  "value": null
                }
              ]
            }
          },
          "response": []
        },
        {
          "name": "Produtos - Validade Por Refrigeração - Ordenado",
          "id": "dda0523d-1df1-48c5-81c7-1ffa035388f2",
          "request": {
            "method": "GET",
            "header": [],
            "url": {
              "raw": "http://localhost:8080/api/v1/fresh-products/due-date/byRefrigeration/{{numberOfDays}}?refrigerationType&orderBy",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "v1",
                "fresh-products",
                "due-date",
                "byRefrigeration",
                "{{numberOfDays}}"
              ],
              "query": [
                {
                  "key": "refrigerationType",
                  "value": null
                },
                {
                  "key": "orderBy",
                  "value": null
                }
              ]
            }
          },
          "response": []
        }
      ],
      "id": "68a12ad4-c6df-4f89-8e33-197558b811f7"
    },
    {
      "name": "8. Carrinho de Compras",
      "item": [
        {
          "name": "Inclui Produtos do Anuncio no Carrinho",
          "id": "6875e084-5d53-492a-9a73-c5e46261e13f",
          "request": {
            "method": "POST",
            "header": [],
            "url": {
              "raw": "http://localhost:8080/api/v1/fresh-products/cart/addProduct/{{idBuyer}}?idAdvertise&qtdProduct",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "v1",
                "fresh-products",
                "cart",
                "addProduct",
                "{{idBuyer}}"
              ],
              "query": [
                {
                  "key": "idAdvertise",
                  "value": null
                },
                {
                  "key": "qtdProduct",
                  "value": null
                }
              ]
            }
          },
          "response": []
        },
        {
          "name": "Remove Produtos do Anuncio no Carrinho",
          "id": "b4f032b9-e04c-4885-88ce-ea85068dad1b",
          "request": {
            "method": "DELETE",
            "header": [],
            "url": {
              "raw": "http://localhost:8080/api/v1/fresh-products/cart/removeProduct/{{idBuyer}}?idAdvertise&qtdRemove",
              "protocol": "http",
              "host": [
                "localhost"
              ],
              "port": "8080",
              "path": [
                "api",
                "v1",
                "fresh-products",
                "cart",
                "removeProduct",
                "{{idBuyer}}"
              ],
              "query": [
                {
                  "key": "idAdvertise",
                  "value": null
                },
                {
                  "key": "qtdRemove",
                  "value": null
                }
              ]
            }
          },
          "response": []
        },
        {
          "name": "Esvazia o Carrinho",
          "id": "b986fcdf-458d-42e2-8e21-27cf9aaa7e65",
          "request": {
            "method": "DELETE",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/cart/emptyCart/{{idBuyer}}"
          },
          "response": []
        },
        {
          "name": "Mostra o Carrinho",
          "id": "b9df445a-40dd-4909-8428-aa1bae57fa5a",
          "request": {
            "method": "GET",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/cart/{{idBuyer}}"
          },
          "response": []
        },
        {
          "name": "Cria Ordem de Compra",
          "id": "72362d34-d193-49a7-9a43-867af978d66c",
          "request": {
            "method": "POST",
            "header": [],
            "url": "http://localhost:8080/api/v1/fresh-products/cart/createSellOrder/{{idBuyer}}"
          },
          "response": []
        }
      ],
      "id": "59da3e28-4c40-4046-9882-67feb22c47a5"
    }
  ]
}
```