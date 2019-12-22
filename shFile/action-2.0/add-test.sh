ADDRESS=localhost:9200
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book/_doc/2?pretty" -d'{
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
