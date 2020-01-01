ADDRESS=localhost:9200
echo "delete 'book' index..."
curl -s -H "Content-Type: application/json; charset=utf-8" -X DELETE "$ADDRESS/book" > /dev/null
echo "update 'book' index..."
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/book" -d @$(dirname $0)/book_mappings.json
echo "update end."
