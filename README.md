# spring-boot-elastic
### Postman
### GET - http://localhost:8081/product/findAll
### POST - http://localhost:8081/product/insert

### kibana

GET /_cat/indices?v

GET /products/_doc/1

GET /productos/_search
{
"query": {
"match_all": {}
}
}