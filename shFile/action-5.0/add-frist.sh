ADDRESS=localhost:9200
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book/_doc/2?pretty" -d'{
  "commodity_type": "图书",
  "commodity_name": "Elasticsearch实战",
  "describe": "Elasticsearch入门教程书籍 大数据时代的信息检索技术解析与实战 面对搜索半结构化",
  "book_type": "IT技术",
  "active": 4900,
  "author": "杜拉·乔戈",
  "price": 79,
  "preferential": "5折",
  "press": "人民邮电出版社",
  "courier": "京东发货",
  "shop_name": "京东自营",
  "storehouse_num": "2号"
}'
