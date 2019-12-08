ADDRESS=localhost:9200
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/commodity-info/_doc/www778?pretty" -d'{
  "type_num": "碳酸饮料",
  "name": "可口可乐",
  "category_type_num": "饮料",
  "storehouse_num": "5号仓库",
  "brand": "可口可乐公司",
  "manufacture_date": "2019-11-23",
  "status": "销售"
}'
