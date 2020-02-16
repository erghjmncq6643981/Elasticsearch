ADDRESS=localhost:9200
echo "delete 'user' index..."
curl -s -H "Content-Type: application/json; charset=utf-8" -X DELETE "$ADDRESS/favourable_activity" > /dev/null
echo "update 'user' index..."
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/favourable_activity?pretty" -d @$(dirname $0)/user_mappings.json
echo "update end."
