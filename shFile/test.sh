ADDRESS=localhost:9200
# Delete the old index, swallow failures if it doesn't exist
curl -s -H "Content-Type: application/json; charset=utf-8" -X DELETE "$ADDRESS/get-together" > /dev/null

# Create the next index using mapping.json
echo "Creating 'get-together' index..."
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/get-together" -d @$(dirname $0)/mapping.json