ADDRESS=localhost:9200
ID=$RANDOM
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book/_doc/$ID?pretty" -d'{
  "commodity_type": "图书",
  "commodity_name": "Go语言高级编程",
  "describe": "Go语言进阶实战，GO编程web编程树，云计算云存储区块链时代重要编程语言，满足Gopher好奇心的Go语言进阶读物",
  "book_type": "IT技术",
  "active": 2000,
  "author": "柴树衫",
  "price": 70.30,
  "preferential": "满100减50",
  "press": "人民邮电出版社",
  "courier": "京东配送",
  "shop_name": "人民邮电出版社（自营）",
  "storehouse_num": "1号仓库"
}'
ID=$RANDOM
echo
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book/_doc/$ID?pretty" -d'{
  "commodity_type": "图书",
  "commodity_name": "重构改善既有代码的设计",
  "describe": "生动阐述重构原理和具体做法，普通程序员进阶到变成高手的修炼秘籍，精装全彩印刷",
  "book_type": "IT技术",
  "active": 130000,
  "author": "马丁·福勒",
  "price": 168.00,
  "preferential": "5.0折",
  "press": "人民邮电出版社",
  "courier": "京东配送",
  "shop_name": "人民邮电出版社（自营）",
  "storehouse_num": "2号仓库"
}'
ID=$RANDOM
echo
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book/_doc/$ID?pretty" -d'{
  "commodity_type": "图书",
  "commodity_name": "深入理解Elasticsearch",
  "describe": "本书涵盖了Elasticsearch的许多种高级功能，并介绍了缓存、Apache Lucene库以及监控等模块的内部运作机制。其中还涉及一些实用案例，比如配置Elasticsearch参数、使用监控API",
  "book_type": "IT技术",
  "active": 8400,
  "author": "拉斐尔·酷奇",
  "price": 79.00,
  "preferential": "8.3折",
  "press": "机械工业出版社",
  "courier": "京东配送",
  "shop_name": "人民邮电出版社（自营）",
  "storehouse_num": "2号仓库"
}'
ID=$RANDOM
echo
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book/_doc/$ID?pretty" -d'{
  "commodity_type": "图书",
  "commodity_name": "Elasticsearch源码解析与优化实战",
  "describe": "由Elasticsearch内核开发工程师编写，从源码和设计角度分析Elasticsearch的内部原理，为合理、高效地使用Elasticsearch提供理论指导",
  "book_type": "IT技术",
  "active": 4800,
  "author": "张超",
  "price": 39.00,
  "preferential": "8.2折",
  "press": "电子工业出版社",
  "courier": "京东配送",
  "shop_name": "电子工业出版社（自营）",
  "storehouse_num": "1号仓库"
}'

