# spring-boot-elastic
### Postman
### GET - http://localhost:8085/product/findAll
### POST - http://localhost:8085/product/insert

### kibana

GET /_cat/indices?v

GET /products/_doc/1

GET /products/_search
{
"query": {
"match_all": {}
}
}