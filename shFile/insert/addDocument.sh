ADDRESS=localhost:9200
# Delete the old index, swallow failures if it doesn't exist
curl -s -H "Content-Type: application/json; charset=utf-8" -X DELETE "$ADDRESS/get-together" > /dev/null

# Create the next index using mapping.json
echo "Creating 'get-together' index..."
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/get-together" -d @$(dirname $0)/mapping.json

# Create the next index using mapping.json
echo "Creating 'get-together' index..."
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/get-together/group/1" -d'{
  "name": "Denver Clojure",
  "organizer": ["Daniel", "Lee"],
  "description": "Group of Clojure enthusiasts from Denver who want to hack on code together and learn more about Clojure",
  "created_on": "2012-06-15",
  "tags": ["clojure", "denver", "functional programming", "jvm", "java"],
  "members": ["Lee", "Daniel", "Mike"],
  "location_group": "Denver, Colorado, USA"
}'

echo
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/get-together/group/2" -d'{
  "name": "Elasticsearch Denver",
  "organizer": "Lee",
  "description": "Get together to learn more about using Elasticsearch, the applications and neat things you can do with ES!",
  "created_on": "2013-03-15",
  "tags": ["denver", "elasticsearch", "big data", "lucene", "solr"],
  "members": ["Lee", "Mike"],
  "location_group": "Denver, Colorado, USA"
}'

echo
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/get-together/group/3" -d'{
  "name": "Elasticsearch San Francisco",
  "organizer": "Mik",
  "description": "Elasticsearch group for ES users of all knowledge levels",
  "created_on": "2012-08-07",
  "tags": ["elasticsearch", "big data", "lucene", "open source"],
  "members": ["Lee", "Igor"],
  "location_group": "San Francisco, California, USA"
}'

echo
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/get-together/group/4" -d'{
  "name": "Boulder/Denver big data get-together",
  "organizer": "Andy",
  "description": "Come learn and share your experience with nosql & big data technologies, no experience required",
  "created_on": "2010-04-02",
  "tags": ["big data", "data visualization", "open source", "cloud computing", "hadoop"],
  "members": ["Greg", "Bill"],
  "location_group": "Boulder, Colorado, USA"
}'

echo
curl -s -H "Content-Type: application/json; charset=utf-8" -X PUT "$ADDRESS/get-together/group/5" -d'{
  "name": "Enterprise search London get-together",
  "organizer": "Tyler",
  "description": "Enterprise search get-togethers are an opportunity to get together with other people doing search.",
  "created_on": "2009-11-25",
  "tags": ["enterprise search", "apache lucene", "solr", "open source", "text analytics"],
  "members": ["Clint", "James"],
  "location_group": "London, England, UK"
}'

echo
echo "Done indexing groups."
