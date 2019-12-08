ADDRESS=localhost:9200
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/commodity-info/_doc/xxx555?pretty" -d'{
  "type_num": "牛奶乳品",
  "name": "特仑苏",
  "category_type_num": "饮料",
  "storehouse_num": "1号仓库",
  "brand": "蒙牛",
  "manufacture_date": "2019-11-24",
  "status": "销售"
}'
