# Demography
This API is used to record demographic events (Births and Deaths).
## Data structure ##
To store the data, we chose to create two entities. Here is their organization

*Demography.java*
```java
private String id;
private String personName;
private int value;
private String eventDate;
private Ville ville;
```

*Ville.java*
```java
private double lat;
private double lng;
private String nomVille;
```
## API Queries ##
### Create ###
To add data, we make PUT type queries. One or more data can be inserted from an array 

- Add an event : 
[http://localhost:8080/Demography/save]
```json
{
      "id": 1,
      "eventDate":"2019-09-25",
      "personName": "chabi rodolpho",
      "value": 1,
      "ville" :{
        "lat" : 0.02,
        "lng" : 3.005,
        "nomVille" : "Paris"
      }
  }
```

- Add multiple events : 
[http://localhost:8080/Demography/saveAll]


```json
[
{
      "id": 1,
      "eventDate":"1994-05-22",
      "personName": "chabi rodolpho",
      "value": 1,
      "ville" :{
        "lat" : 0.02,
        "lng" : 3.005,
        "nomVille" : "Paris"
      }
  },
  {
      "id": 2,
      "eventDate":"2012-10-16",
      "personName": "babatounde rené",
      "value": 1,
      "ville" :{
        "lat" : 0.02,
        "lng" : 3.005,
        "nomVille" : "Paris"
      }
  },
  ]
```
