ADDRESS=localhost:9200
echo "delete 'user' index..."
curl -s -H "Content-Type: application/json; charset=utf-8" -X DELETE "$ADDRESS/user" > /dev/null
echo "update 'book' index..."
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/user?pretty" -d @$(dirname $0)/user_mappings.json
echo "update end."
