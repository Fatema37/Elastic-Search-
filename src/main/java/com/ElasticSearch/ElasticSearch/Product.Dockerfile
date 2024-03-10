FROM docker.elastic.co/elasticsearch/elasticsearch:7.10.2

WORKDIR /usr/share/elasticsearch
COPY src/main/java/com/ElasticSearch/ElasticSearch/custom-index /usr/share/elasticsearch/custom-index
EXPOSE 9200
CMD ["bin/elasticsearch"]
