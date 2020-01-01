ADDRESS=localhost:9200
ID=date+$RANDOM
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book/_doc/$ID?pretty" -d'{
  "commodity_type": "图书",
  "commodity_name": "Go语言高级编程",
  "describe": "Go语言进阶实战，CGO编程web编程树，云计算云存储区块链时代重要编程语言，满足Gopher好奇心的Go语言进阶读物",
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
ID=date+$RANDOM
echo
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book/_doc/$ID?pretty" -d'{
  "commodity_type": "图书",
  "commodity_name": "Go语言高级编程",
  "describe": "Go汇编语言工业环境Web系统设计技术Go语言在分布式领域的编程记录go语言程序设计教材书籍",
  "book_type": "IT技术",
  "active": 2000,
  "author": "柴树衫",
  "price": 70.30,
  "preferential": "领劵满99减2元",
  "press": "人民邮电出版社",
  "courier": "百世快递",
  "shop_name": "蓝墨水图书专营店",
  "storehouse_num": "无"
}'
ID=date+$RANDOM
echo
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book/_doc/$ID?pretty" -d'{
  "commodity_type": "图书",
  "commodity_name": "Go语言高级编程",
  "describe": "Go语言进阶实战，CGO编程web编程树，云计算云存储区块链时代重要编程语言，满足Gopher好奇心的Go语言进阶读物",
  "book_type": "IT技术",
  "active": 2000,
  "author": "柴树衫",
  "price": 70.30,
  "preferential": "满100减50",
  "press": "人民邮电出版社",
  "courier": "京东配送",
  "shop_name": "人民邮电出版社（自营）",
  "storehouse_num": "2号仓库"
}'
ID=date+$RANDOM
echo
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book/_doc/$ID?pretty" -d'{
  "commodity_type": "图书",
  "commodity_name": "区块链+大数据",
  "describe": "全面解析区块链与大数据融合的理论实践，业内大咖联合推荐",
  "book_type": "IT技术",
  "active": 300,
  "author": "柴树衫",
  "price": 39.80,
  "preferential": "8.2折",
  "press": "人民邮电出版社",
  "courier": "京东配送",
  "shop_name": "人民邮电出版社（自营）",
  "storehouse_num": "1号仓库"
}'

